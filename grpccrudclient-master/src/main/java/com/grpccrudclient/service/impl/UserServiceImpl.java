package com.grpccrudclient.service.impl;

import com.grpccrudclient.Dto.UserDto;
import com.grpccrudclient.proto.*;
import com.grpccrudclient.service.UserService;
import com.grpccrudclient.ui.Models.request.UserDetailsRequestModel;
import com.grpccrudclient.ui.Models.response.UserRest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final static String serverIp = "192.168.1.111";

    @Override
    public List<UserRest> getUsers(int page, int limit) {
        List<UserRest> returnValue = new ArrayList<>();

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(serverIp,6565)
                .usePlaintext()
                .build();

        grcpCrudServiceGrpc.grcpCrudServiceBlockingStub stub = grcpCrudServiceGrpc.newBlockingStub(channel);
        UserRestProtoColl userRestProtoColl = stub.readListUser(
                UserListLimit.newBuilder()
                .setPage(page)
                .setLimit(limit)
                .build()
        );

        List<UserRestProto> userRestProtoColls  = userRestProtoColl.getUserRestProtosList();

        for(UserRestProto userRestP : userRestProtoColls){
            UserRest userRest = new UserRest();
            BeanUtils.copyProperties(userRestP, userRest);
            returnValue.add(userRest);
        }
        channel.shutdown();
        return returnValue;
    }

    @Override
    public UserRest guardarUsuario(UserDetailsRequestModel userDetails) {
        UserRest returnValue = new UserRest();
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(serverIp,6565)
                .usePlaintext()
                .build();
        grcpCrudServiceGrpc.grcpCrudServiceBlockingStub stub = grcpCrudServiceGrpc.newBlockingStub(channel);

        UserRestProto userRestProto = stub.createUSer(
                UserDetailsRequestProto.newBuilder()
                .setFirstName(userDetails.getFirstName())
                .setLastName(userDetails.getLastName())
                .setEmail(userDetails.getEmail())
                .setPassword(userDetails.getPassword())
                .build()
        );
        BeanUtils.copyProperties(userRestProto,returnValue);
        channel.shutdown();

        return returnValue;
    }

    @Override
    public UserRest actualizarUsuario(UserRest userRest) {
        UserRest returnValue = new UserRest();

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(serverIp,6565)
                .usePlaintext()
                .build();

        grcpCrudServiceGrpc.grcpCrudServiceBlockingStub stub = grcpCrudServiceGrpc.newBlockingStub(channel);

        UserDetailsRequestProto userDetailsRequestProto = UserDetailsRequestProto.newBuilder()
                .setFirstName(userRest.getFirstName())
                .setLastName(userRest.getLastName())
                .setEmail("aa")
                .setPassword("aa")
                .build();

        UserRestProto userRestProto = stub.updateUSer(
                UserUpdateProto.newBuilder()
                .setUserId(userRest.getUserId())
                .setUserDetailsRequestProto(userDetailsRequestProto)
                .build()
        );

        channel.shutdown();

        BeanUtils.copyProperties(userRestProto, returnValue);

        return returnValue;
    }

    @Override
    public UserRest getUserByUserId(String userId) {
        UserRest returnValue = new UserRest();
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(serverIp,6565)
                .usePlaintext()
                .build();
        grcpCrudServiceGrpc.grcpCrudServiceBlockingStub stub = grcpCrudServiceGrpc.newBlockingStub(channel);

        UserRestProto userRestProto = stub.readUser(
                UserIdProto.newBuilder()
                .setUserId(userId)
                .build()
        );

        BeanUtils.copyProperties(userRestProto, returnValue);
        channel.shutdown();
        return returnValue;
    }

    @Override
    public String eliminarUsuario(String userId) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(serverIp,6565)
                .usePlaintext()
                .build();
        grcpCrudServiceGrpc.grcpCrudServiceBlockingStub stub = grcpCrudServiceGrpc.newBlockingStub(channel);

        OperationalStatusProto operationalStatusProto = stub.deleteUser(
                UserIdProto.newBuilder()
                .setUserId(userId)
                .build()
        );
        channel.shutdown();

        return operationalStatusProto.getOperationResult();
    }
}
