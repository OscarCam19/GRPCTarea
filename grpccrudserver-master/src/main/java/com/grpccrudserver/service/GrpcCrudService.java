package com.grpccrudserver.service;

import com.grpccrudserver.io.entity.UserEntity;
import com.grpccrudserver.io.repository.UserRepository;
import com.grpccrudserver.proto.*;
import com.grpccrudserver.share.dto.UserDto;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

@GrpcService
public class GrpcCrudService extends grcpCrudServiceGrpc.grcpCrudServiceImplBase{

    @Autowired
    UserRepository userRepository;

    @Override
    public void readListUser(UserListLimit request, StreamObserver<UserRestProtoColl> responseObserver) {
        int page;
        int limit;
        List<UserRestProto> userRestProtoList = new ArrayList<>();
        page = request.getPage();
        limit = request.getLimit();

        if(page>0) page = page-1;

        Pageable pageableRequest = PageRequest.of(page, limit);
        Page<UserEntity> usersPage = userRepository.findAll(pageableRequest);
        List<UserEntity> users = usersPage.getContent();

        for (UserEntity userEntity : users){
            UserRestProto userRestProto = UserRestProto.newBuilder()
                    .setUserId(userEntity.getUserId())
                    .setFirstName(userEntity.getFirstName())
                    .setLastName(userEntity.getLastName())
                    .setEmail(userEntity.getEmail())
                    .build();
            userRestProtoList.add(userRestProto);
        }
        UserRestProtoColl userRestProtoColl = UserRestProtoColl.newBuilder()
                .addAllUserRestProtos(userRestProtoList)
                .build();
        responseObserver.onNext(userRestProtoColl);
        responseObserver.onCompleted();
    }

    @Override
    public void createUSer(UserDetailsRequestProto request, StreamObserver<UserRestProto> responseObserver) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(request, userEntity);

        //String publicUserId = utils.generateAddressId(5);
        String publicUserId = request.getFirstName();

        userEntity.setEncryptedPassword(request.getPassword());
        userEntity.setUserId(publicUserId);

        UserEntity storedUserDetails = userRepository.save(userEntity);

        UserRestProto userRestProto = UserRestProto.newBuilder()
                .setFirstName(storedUserDetails.getFirstName())
                .setUserId(storedUserDetails.getUserId())
                .setLastName(storedUserDetails.getLastName())
                .setEmail(storedUserDetails.getEmail())
                .build();

        responseObserver.onNext(userRestProto);
        responseObserver.onCompleted();
    }

    @Override
    public void readUser(UserIdProto request, StreamObserver<UserRestProto> responseObserver) {
        UserEntity userEntity = userRepository.findByUserId(request.getUserId());
        if(userEntity == null)
            throw new RuntimeException("User with ID: " + request.getUserId() + " Not Found");
        UserRestProto userRestProto = UserRestProto.newBuilder()
                .setFirstName(userEntity.getFirstName())
                .setLastName(userEntity.getLastName())
                .setUserId(userEntity.getUserId())
                .setEmail(userEntity.getEmail())
                .build();

        responseObserver.onNext(userRestProto);
        responseObserver.onCompleted();
    }

    @Override
    public void updateUSer(UserUpdateProto request, StreamObserver<UserRestProto> responseObserver) {
        UserDto returnValue = new UserDto();
        UserEntity userEntity = userRepository.findByUserId(request.getUserId());
        if(userEntity == null) throw new RuntimeException("User with ID: " + request.getUserId() + " Not Found");

        userEntity.setFirstName(request.getUserDetailsRequestProto().getFirstName());
        userEntity.setLastName(request.getUserDetailsRequestProto().getLastName());

        UserEntity updatedUserDetails = userRepository.save(userEntity);

        UserRestProto userRestProto = UserRestProto.newBuilder()
                .setUserId(updatedUserDetails.getUserId())
                .setFirstName(updatedUserDetails.getFirstName())
                .setLastName(updatedUserDetails.getLastName())
                .setEmail(updatedUserDetails.getEmail())
                .build();

        responseObserver.onNext(userRestProto);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteUser(UserIdProto request, StreamObserver<OperationalStatusProto> responseObserver) {
        UserEntity userEntity = userRepository.findByUserId(request.getUserId());

        if(userEntity == null) {
            responseObserver.onError(new RuntimeException("User with ID: " + request.getUserId() + " Not Found"));
        }else{
            userRepository.delete(userEntity);

            OperationalStatusProto operationalStatusProto = OperationalStatusProto.newBuilder()
                    .setOperationName("DELETE")
                    .setOperationResult("SUCCES")
                    .build();
            responseObserver.onNext(operationalStatusProto);
            responseObserver.onCompleted();
        }
    }
}
