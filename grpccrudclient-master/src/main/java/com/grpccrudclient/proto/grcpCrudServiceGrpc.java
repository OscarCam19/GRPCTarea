package com.grpccrudclient.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: Service.proto")
public final class grcpCrudServiceGrpc {

  private grcpCrudServiceGrpc() {}

  public static final String SERVICE_NAME = "grcpCrudService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<UserIdProto,
      UserRestProto> getReadUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "readUser",
      requestType = UserIdProto.class,
      responseType = UserRestProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserIdProto,
      UserRestProto> getReadUserMethod() {
    io.grpc.MethodDescriptor<UserIdProto, UserRestProto> getReadUserMethod;
    if ((getReadUserMethod = grcpCrudServiceGrpc.getReadUserMethod) == null) {
      synchronized (grcpCrudServiceGrpc.class) {
        if ((getReadUserMethod = grcpCrudServiceGrpc.getReadUserMethod) == null) {
          grcpCrudServiceGrpc.getReadUserMethod = getReadUserMethod = 
              io.grpc.MethodDescriptor.<UserIdProto, UserRestProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grcpCrudService", "readUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserIdProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserRestProto.getDefaultInstance()))
                  .setSchemaDescriptor(new grcpCrudServiceMethodDescriptorSupplier("readUser"))
                  .build();
          }
        }
     }
     return getReadUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserDetailsRequestProto,
      UserRestProto> getCreateUSerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createUSer",
      requestType = UserDetailsRequestProto.class,
      responseType = UserRestProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserDetailsRequestProto,
      UserRestProto> getCreateUSerMethod() {
    io.grpc.MethodDescriptor<UserDetailsRequestProto, UserRestProto> getCreateUSerMethod;
    if ((getCreateUSerMethod = grcpCrudServiceGrpc.getCreateUSerMethod) == null) {
      synchronized (grcpCrudServiceGrpc.class) {
        if ((getCreateUSerMethod = grcpCrudServiceGrpc.getCreateUSerMethod) == null) {
          grcpCrudServiceGrpc.getCreateUSerMethod = getCreateUSerMethod = 
              io.grpc.MethodDescriptor.<UserDetailsRequestProto, UserRestProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grcpCrudService", "createUSer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserDetailsRequestProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserRestProto.getDefaultInstance()))
                  .setSchemaDescriptor(new grcpCrudServiceMethodDescriptorSupplier("createUSer"))
                  .build();
          }
        }
     }
     return getCreateUSerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserUpdateProto,
      UserRestProto> getUpdateUSerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateUSer",
      requestType = UserUpdateProto.class,
      responseType = UserRestProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserUpdateProto,
      UserRestProto> getUpdateUSerMethod() {
    io.grpc.MethodDescriptor<UserUpdateProto, UserRestProto> getUpdateUSerMethod;
    if ((getUpdateUSerMethod = grcpCrudServiceGrpc.getUpdateUSerMethod) == null) {
      synchronized (grcpCrudServiceGrpc.class) {
        if ((getUpdateUSerMethod = grcpCrudServiceGrpc.getUpdateUSerMethod) == null) {
          grcpCrudServiceGrpc.getUpdateUSerMethod = getUpdateUSerMethod = 
              io.grpc.MethodDescriptor.<UserUpdateProto, UserRestProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grcpCrudService", "updateUSer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserUpdateProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserRestProto.getDefaultInstance()))
                  .setSchemaDescriptor(new grcpCrudServiceMethodDescriptorSupplier("updateUSer"))
                  .build();
          }
        }
     }
     return getUpdateUSerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserIdProto,
      OperationalStatusProto> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteUser",
      requestType = UserIdProto.class,
      responseType = OperationalStatusProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserIdProto,
      OperationalStatusProto> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<UserIdProto, OperationalStatusProto> getDeleteUserMethod;
    if ((getDeleteUserMethod = grcpCrudServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (grcpCrudServiceGrpc.class) {
        if ((getDeleteUserMethod = grcpCrudServiceGrpc.getDeleteUserMethod) == null) {
          grcpCrudServiceGrpc.getDeleteUserMethod = getDeleteUserMethod = 
              io.grpc.MethodDescriptor.<UserIdProto, OperationalStatusProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grcpCrudService", "deleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserIdProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OperationalStatusProto.getDefaultInstance()))
                  .setSchemaDescriptor(new grcpCrudServiceMethodDescriptorSupplier("deleteUser"))
                  .build();
          }
        }
     }
     return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserListLimit,
      UserRestProtoColl> getReadListUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "readListUser",
      requestType = UserListLimit.class,
      responseType = UserRestProtoColl.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserListLimit,
      UserRestProtoColl> getReadListUserMethod() {
    io.grpc.MethodDescriptor<UserListLimit, UserRestProtoColl> getReadListUserMethod;
    if ((getReadListUserMethod = grcpCrudServiceGrpc.getReadListUserMethod) == null) {
      synchronized (grcpCrudServiceGrpc.class) {
        if ((getReadListUserMethod = grcpCrudServiceGrpc.getReadListUserMethod) == null) {
          grcpCrudServiceGrpc.getReadListUserMethod = getReadListUserMethod = 
              io.grpc.MethodDescriptor.<UserListLimit, UserRestProtoColl>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grcpCrudService", "readListUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserListLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserRestProtoColl.getDefaultInstance()))
                  .setSchemaDescriptor(new grcpCrudServiceMethodDescriptorSupplier("readListUser"))
                  .build();
          }
        }
     }
     return getReadListUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static grcpCrudServiceStub newStub(io.grpc.Channel channel) {
    return new grcpCrudServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static grcpCrudServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new grcpCrudServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static grcpCrudServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new grcpCrudServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class grcpCrudServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void readUser(UserIdProto request,
                         io.grpc.stub.StreamObserver<UserRestProto> responseObserver) {
      asyncUnimplementedUnaryCall(getReadUserMethod(), responseObserver);
    }

    /**
     */
    public void createUSer(UserDetailsRequestProto request,
                           io.grpc.stub.StreamObserver<UserRestProto> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUSerMethod(), responseObserver);
    }

    /**
     */
    public void updateUSer(UserUpdateProto request,
                           io.grpc.stub.StreamObserver<UserRestProto> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUSerMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(UserIdProto request,
                           io.grpc.stub.StreamObserver<OperationalStatusProto> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    public void readListUser(UserListLimit request,
                             io.grpc.stub.StreamObserver<UserRestProtoColl> responseObserver) {
      asyncUnimplementedUnaryCall(getReadListUserMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                UserIdProto,
                UserRestProto>(
                  this, METHODID_READ_USER)))
          .addMethod(
            getCreateUSerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                UserDetailsRequestProto,
                UserRestProto>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getUpdateUSerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                UserUpdateProto,
                UserRestProto>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getDeleteUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                UserIdProto,
                OperationalStatusProto>(
                  this, METHODID_DELETE_USER)))
          .addMethod(
            getReadListUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                UserListLimit,
                UserRestProtoColl>(
                  this, METHODID_READ_LIST_USER)))
          .build();
    }
  }

  /**
   */
  public static final class grcpCrudServiceStub extends io.grpc.stub.AbstractStub<grcpCrudServiceStub> {
    private grcpCrudServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private grcpCrudServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected grcpCrudServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new grcpCrudServiceStub(channel, callOptions);
    }

    /**
     */
    public void readUser(UserIdProto request,
                         io.grpc.stub.StreamObserver<UserRestProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createUSer(UserDetailsRequestProto request,
                           io.grpc.stub.StreamObserver<UserRestProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUSerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUSer(UserUpdateProto request,
                           io.grpc.stub.StreamObserver<UserRestProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUSerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(UserIdProto request,
                           io.grpc.stub.StreamObserver<OperationalStatusProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readListUser(UserListLimit request,
                             io.grpc.stub.StreamObserver<UserRestProtoColl> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadListUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class grcpCrudServiceBlockingStub extends io.grpc.stub.AbstractStub<grcpCrudServiceBlockingStub> {
    private grcpCrudServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private grcpCrudServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected grcpCrudServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new grcpCrudServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public UserRestProto readUser(UserIdProto request) {
      return blockingUnaryCall(
          getChannel(), getReadUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public UserRestProto createUSer(UserDetailsRequestProto request) {
      return blockingUnaryCall(
          getChannel(), getCreateUSerMethod(), getCallOptions(), request);
    }

    /**
     */
    public UserRestProto updateUSer(UserUpdateProto request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUSerMethod(), getCallOptions(), request);
    }

    /**
     */
    public OperationalStatusProto deleteUser(UserIdProto request) {
      return blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public UserRestProtoColl readListUser(UserListLimit request) {
      return blockingUnaryCall(
          getChannel(), getReadListUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class grcpCrudServiceFutureStub extends io.grpc.stub.AbstractStub<grcpCrudServiceFutureStub> {
    private grcpCrudServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private grcpCrudServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected grcpCrudServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new grcpCrudServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<UserRestProto> readUser(
        UserIdProto request) {
      return futureUnaryCall(
          getChannel().newCall(getReadUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<UserRestProto> createUSer(
        UserDetailsRequestProto request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUSerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<UserRestProto> updateUSer(
        UserUpdateProto request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUSerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<OperationalStatusProto> deleteUser(
        UserIdProto request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<UserRestProtoColl> readListUser(
        UserListLimit request) {
      return futureUnaryCall(
          getChannel().newCall(getReadListUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ_USER = 0;
  private static final int METHODID_CREATE_USER = 1;
  private static final int METHODID_UPDATE_USER = 2;
  private static final int METHODID_DELETE_USER = 3;
  private static final int METHODID_READ_LIST_USER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final grcpCrudServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(grcpCrudServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ_USER:
          serviceImpl.readUser((UserIdProto) request,
              (io.grpc.stub.StreamObserver<UserRestProto>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUSer((UserDetailsRequestProto) request,
              (io.grpc.stub.StreamObserver<UserRestProto>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUSer((UserUpdateProto) request,
              (io.grpc.stub.StreamObserver<UserRestProto>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((UserIdProto) request,
              (io.grpc.stub.StreamObserver<OperationalStatusProto>) responseObserver);
          break;
        case METHODID_READ_LIST_USER:
          serviceImpl.readListUser((UserListLimit) request,
              (io.grpc.stub.StreamObserver<UserRestProtoColl>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class grcpCrudServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    grcpCrudServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Service.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("grcpCrudService");
    }
  }

  private static final class grcpCrudServiceFileDescriptorSupplier
      extends grcpCrudServiceBaseDescriptorSupplier {
    grcpCrudServiceFileDescriptorSupplier() {}
  }

  private static final class grcpCrudServiceMethodDescriptorSupplier
      extends grcpCrudServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    grcpCrudServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (grcpCrudServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new grcpCrudServiceFileDescriptorSupplier())
              .addMethod(getReadUserMethod())
              .addMethod(getCreateUSerMethod())
              .addMethod(getUpdateUSerMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getReadListUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
