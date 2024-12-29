package com.hearlers.api.proto.v1.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: com/hearlers/v1/service/user.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.hearlers.v1.service.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.InitializeUserRequest,
      com.hearlers.api.proto.v1.service.InitializeUserResponse> getInitializeUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitializeUser",
      requestType = com.hearlers.api.proto.v1.service.InitializeUserRequest.class,
      responseType = com.hearlers.api.proto.v1.service.InitializeUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.InitializeUserRequest,
      com.hearlers.api.proto.v1.service.InitializeUserResponse> getInitializeUserMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.InitializeUserRequest, com.hearlers.api.proto.v1.service.InitializeUserResponse> getInitializeUserMethod;
    if ((getInitializeUserMethod = UserServiceGrpc.getInitializeUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getInitializeUserMethod = UserServiceGrpc.getInitializeUserMethod) == null) {
          UserServiceGrpc.getInitializeUserMethod = getInitializeUserMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.InitializeUserRequest, com.hearlers.api.proto.v1.service.InitializeUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitializeUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.InitializeUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.InitializeUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("InitializeUser"))
              .build();
        }
      }
    }
    return getInitializeUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.ConnectAuthChannelRequest,
      com.hearlers.api.proto.v1.service.ConnectAuthChannelResponse> getConnectAuthChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConnectAuthChannel",
      requestType = com.hearlers.api.proto.v1.service.ConnectAuthChannelRequest.class,
      responseType = com.hearlers.api.proto.v1.service.ConnectAuthChannelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.ConnectAuthChannelRequest,
      com.hearlers.api.proto.v1.service.ConnectAuthChannelResponse> getConnectAuthChannelMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.ConnectAuthChannelRequest, com.hearlers.api.proto.v1.service.ConnectAuthChannelResponse> getConnectAuthChannelMethod;
    if ((getConnectAuthChannelMethod = UserServiceGrpc.getConnectAuthChannelMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getConnectAuthChannelMethod = UserServiceGrpc.getConnectAuthChannelMethod) == null) {
          UserServiceGrpc.getConnectAuthChannelMethod = getConnectAuthChannelMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.ConnectAuthChannelRequest, com.hearlers.api.proto.v1.service.ConnectAuthChannelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConnectAuthChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.ConnectAuthChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.ConnectAuthChannelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ConnectAuthChannel"))
              .build();
        }
      }
    }
    return getConnectAuthChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest,
      com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse> getSaveRefreshTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveRefreshToken",
      requestType = com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest.class,
      responseType = com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest,
      com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse> getSaveRefreshTokenMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest, com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse> getSaveRefreshTokenMethod;
    if ((getSaveRefreshTokenMethod = UserServiceGrpc.getSaveRefreshTokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSaveRefreshTokenMethod = UserServiceGrpc.getSaveRefreshTokenMethod) == null) {
          UserServiceGrpc.getSaveRefreshTokenMethod = getSaveRefreshTokenMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest, com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveRefreshToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("SaveRefreshToken"))
              .build();
        }
      }
    }
    return getSaveRefreshTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest,
      com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse> getVerifyRefreshTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyRefreshToken",
      requestType = com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest.class,
      responseType = com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest,
      com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse> getVerifyRefreshTokenMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest, com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse> getVerifyRefreshTokenMethod;
    if ((getVerifyRefreshTokenMethod = UserServiceGrpc.getVerifyRefreshTokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getVerifyRefreshTokenMethod = UserServiceGrpc.getVerifyRefreshTokenMethod) == null) {
          UserServiceGrpc.getVerifyRefreshTokenMethod = getVerifyRefreshTokenMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest, com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyRefreshToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("VerifyRefreshToken"))
              .build();
        }
      }
    }
    return getVerifyRefreshTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindOneUserRequest,
      com.hearlers.api.proto.v1.service.FindOneUserResponse> getFindOneUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindOneUser",
      requestType = com.hearlers.api.proto.v1.service.FindOneUserRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindOneUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindOneUserRequest,
      com.hearlers.api.proto.v1.service.FindOneUserResponse> getFindOneUserMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindOneUserRequest, com.hearlers.api.proto.v1.service.FindOneUserResponse> getFindOneUserMethod;
    if ((getFindOneUserMethod = UserServiceGrpc.getFindOneUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFindOneUserMethod = UserServiceGrpc.getFindOneUserMethod) == null) {
          UserServiceGrpc.getFindOneUserMethod = getFindOneUserMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindOneUserRequest, com.hearlers.api.proto.v1.service.FindOneUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindOneUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindOneUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindOneUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("FindOneUser"))
              .build();
        }
      }
    }
    return getFindOneUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindOneAuthUserRequest,
      com.hearlers.api.proto.v1.service.FindOneAuthUserResponse> getFindOneAuthUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindOneAuthUser",
      requestType = com.hearlers.api.proto.v1.service.FindOneAuthUserRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindOneAuthUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindOneAuthUserRequest,
      com.hearlers.api.proto.v1.service.FindOneAuthUserResponse> getFindOneAuthUserMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindOneAuthUserRequest, com.hearlers.api.proto.v1.service.FindOneAuthUserResponse> getFindOneAuthUserMethod;
    if ((getFindOneAuthUserMethod = UserServiceGrpc.getFindOneAuthUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFindOneAuthUserMethod = UserServiceGrpc.getFindOneAuthUserMethod) == null) {
          UserServiceGrpc.getFindOneAuthUserMethod = getFindOneAuthUserMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindOneAuthUserRequest, com.hearlers.api.proto.v1.service.FindOneAuthUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindOneAuthUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindOneAuthUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindOneAuthUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("FindOneAuthUser"))
              .build();
        }
      }
    }
    return getFindOneAuthUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CheckRemainingTokensRequest,
      com.hearlers.api.proto.v1.service.CheckRemainingTokensResponse> getCheckRemainingTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckRemainingTokens",
      requestType = com.hearlers.api.proto.v1.service.CheckRemainingTokensRequest.class,
      responseType = com.hearlers.api.proto.v1.service.CheckRemainingTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CheckRemainingTokensRequest,
      com.hearlers.api.proto.v1.service.CheckRemainingTokensResponse> getCheckRemainingTokensMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CheckRemainingTokensRequest, com.hearlers.api.proto.v1.service.CheckRemainingTokensResponse> getCheckRemainingTokensMethod;
    if ((getCheckRemainingTokensMethod = UserServiceGrpc.getCheckRemainingTokensMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCheckRemainingTokensMethod = UserServiceGrpc.getCheckRemainingTokensMethod) == null) {
          UserServiceGrpc.getCheckRemainingTokensMethod = getCheckRemainingTokensMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CheckRemainingTokensRequest, com.hearlers.api.proto.v1.service.CheckRemainingTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckRemainingTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CheckRemainingTokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CheckRemainingTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CheckRemainingTokens"))
              .build();
        }
      }
    }
    return getCheckRemainingTokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.ReserveTokensRequest,
      com.hearlers.api.proto.v1.service.ReserveTokensResponse> getReserveTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReserveTokens",
      requestType = com.hearlers.api.proto.v1.service.ReserveTokensRequest.class,
      responseType = com.hearlers.api.proto.v1.service.ReserveTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.ReserveTokensRequest,
      com.hearlers.api.proto.v1.service.ReserveTokensResponse> getReserveTokensMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.ReserveTokensRequest, com.hearlers.api.proto.v1.service.ReserveTokensResponse> getReserveTokensMethod;
    if ((getReserveTokensMethod = UserServiceGrpc.getReserveTokensMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getReserveTokensMethod = UserServiceGrpc.getReserveTokensMethod) == null) {
          UserServiceGrpc.getReserveTokensMethod = getReserveTokensMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.ReserveTokensRequest, com.hearlers.api.proto.v1.service.ReserveTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReserveTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.ReserveTokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.ReserveTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ReserveTokens"))
              .build();
        }
      }
    }
    return getReserveTokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateUserRequest,
      com.hearlers.api.proto.v1.service.UpdateUserResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.hearlers.api.proto.v1.service.UpdateUserRequest.class,
      responseType = com.hearlers.api.proto.v1.service.UpdateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateUserRequest,
      com.hearlers.api.proto.v1.service.UpdateUserResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateUserRequest, com.hearlers.api.proto.v1.service.UpdateUserResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
          UserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.UpdateUserRequest, com.hearlers.api.proto.v1.service.UpdateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateActivityRequest,
      com.hearlers.api.proto.v1.service.CreateActivityResponse> getCreateActivityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateActivity",
      requestType = com.hearlers.api.proto.v1.service.CreateActivityRequest.class,
      responseType = com.hearlers.api.proto.v1.service.CreateActivityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateActivityRequest,
      com.hearlers.api.proto.v1.service.CreateActivityResponse> getCreateActivityMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateActivityRequest, com.hearlers.api.proto.v1.service.CreateActivityResponse> getCreateActivityMethod;
    if ((getCreateActivityMethod = UserServiceGrpc.getCreateActivityMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateActivityMethod = UserServiceGrpc.getCreateActivityMethod) == null) {
          UserServiceGrpc.getCreateActivityMethod = getCreateActivityMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreateActivityRequest, com.hearlers.api.proto.v1.service.CreateActivityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateActivity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateActivityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateActivityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateActivity"))
              .build();
        }
      }
    }
    return getCreateActivityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 최초 접속 시 user &amp; authUser 생성
     * </pre>
     */
    default void initializeUser(com.hearlers.api.proto.v1.service.InitializeUserRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.InitializeUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitializeUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * 인증 채널 연결
     * </pre>
     */
    default void connectAuthChannel(com.hearlers.api.proto.v1.service.ConnectAuthChannelRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.ConnectAuthChannelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConnectAuthChannelMethod(), responseObserver);
    }

    /**
     * <pre>
     * 리프레시 토큰 저장
     * </pre>
     */
    default void saveRefreshToken(com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveRefreshTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * 리프레시 토큰 인증
     * </pre>
     */
    default void verifyRefreshToken(com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyRefreshTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * 유저 조회
     * </pre>
     */
    default void findOneUser(com.hearlers.api.proto.v1.service.FindOneUserRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindOneUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindOneUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * 유저 목록 조회
     * rpc FindManyUser (FindManyUserRequest) returns (FindManyUserResult);
     * 인증 유저 조회
     * </pre>
     */
    default void findOneAuthUser(com.hearlers.api.proto.v1.service.FindOneAuthUserRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindOneAuthUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindOneAuthUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * 잔여 토큰 체크
     * </pre>
     */
    default void checkRemainingTokens(com.hearlers.api.proto.v1.service.CheckRemainingTokensRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CheckRemainingTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckRemainingTokensMethod(), responseObserver);
    }

    /**
     * <pre>
     * 토큰 예약 (잔여 토큰 없을 시 에러)
     * </pre>
     */
    default void reserveTokens(com.hearlers.api.proto.v1.service.ReserveTokensRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.ReserveTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReserveTokensMethod(), responseObserver);
    }

    /**
     * <pre>
     * 유저 업데이트
     * </pre>
     */
    default void updateUser(com.hearlers.api.proto.v1.service.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * 활동 생성
     * </pre>
     */
    default void createActivity(com.hearlers.api.proto.v1.service.CreateActivityRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateActivityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateActivityMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserService.
   */
  public static abstract class UserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserService.
   */
  public static final class UserServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 최초 접속 시 user &amp; authUser 생성
     * </pre>
     */
    public void initializeUser(com.hearlers.api.proto.v1.service.InitializeUserRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.InitializeUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitializeUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 인증 채널 연결
     * </pre>
     */
    public void connectAuthChannel(com.hearlers.api.proto.v1.service.ConnectAuthChannelRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.ConnectAuthChannelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConnectAuthChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 리프레시 토큰 저장
     * </pre>
     */
    public void saveRefreshToken(com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveRefreshTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 리프레시 토큰 인증
     * </pre>
     */
    public void verifyRefreshToken(com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyRefreshTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 유저 조회
     * </pre>
     */
    public void findOneUser(com.hearlers.api.proto.v1.service.FindOneUserRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindOneUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindOneUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 유저 목록 조회
     * rpc FindManyUser (FindManyUserRequest) returns (FindManyUserResult);
     * 인증 유저 조회
     * </pre>
     */
    public void findOneAuthUser(com.hearlers.api.proto.v1.service.FindOneAuthUserRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindOneAuthUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindOneAuthUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 잔여 토큰 체크
     * </pre>
     */
    public void checkRemainingTokens(com.hearlers.api.proto.v1.service.CheckRemainingTokensRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CheckRemainingTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckRemainingTokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 토큰 예약 (잔여 토큰 없을 시 에러)
     * </pre>
     */
    public void reserveTokens(com.hearlers.api.proto.v1.service.ReserveTokensRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.ReserveTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReserveTokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 유저 업데이트
     * </pre>
     */
    public void updateUser(com.hearlers.api.proto.v1.service.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 활동 생성
     * </pre>
     */
    public void createActivity(com.hearlers.api.proto.v1.service.CreateActivityRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateActivityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateActivityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserService.
   */
  public static final class UserServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 최초 접속 시 user &amp; authUser 생성
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.InitializeUserResponse initializeUser(com.hearlers.api.proto.v1.service.InitializeUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitializeUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 인증 채널 연결
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.ConnectAuthChannelResponse connectAuthChannel(com.hearlers.api.proto.v1.service.ConnectAuthChannelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConnectAuthChannelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 리프레시 토큰 저장
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse saveRefreshToken(com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveRefreshTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 리프레시 토큰 인증
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse verifyRefreshToken(com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyRefreshTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 유저 조회
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.FindOneUserResponse findOneUser(com.hearlers.api.proto.v1.service.FindOneUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindOneUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 유저 목록 조회
     * rpc FindManyUser (FindManyUserRequest) returns (FindManyUserResult);
     * 인증 유저 조회
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.FindOneAuthUserResponse findOneAuthUser(com.hearlers.api.proto.v1.service.FindOneAuthUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindOneAuthUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 잔여 토큰 체크
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CheckRemainingTokensResponse checkRemainingTokens(com.hearlers.api.proto.v1.service.CheckRemainingTokensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckRemainingTokensMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 토큰 예약 (잔여 토큰 없을 시 에러)
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.ReserveTokensResponse reserveTokens(com.hearlers.api.proto.v1.service.ReserveTokensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReserveTokensMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 유저 업데이트
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.UpdateUserResponse updateUser(com.hearlers.api.proto.v1.service.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 활동 생성
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateActivityResponse createActivity(com.hearlers.api.proto.v1.service.CreateActivityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateActivityMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserService.
   */
  public static final class UserServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 최초 접속 시 user &amp; authUser 생성
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.InitializeUserResponse> initializeUser(
        com.hearlers.api.proto.v1.service.InitializeUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitializeUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 인증 채널 연결
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.ConnectAuthChannelResponse> connectAuthChannel(
        com.hearlers.api.proto.v1.service.ConnectAuthChannelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConnectAuthChannelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 리프레시 토큰 저장
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse> saveRefreshToken(
        com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveRefreshTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 리프레시 토큰 인증
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse> verifyRefreshToken(
        com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyRefreshTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 유저 조회
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindOneUserResponse> findOneUser(
        com.hearlers.api.proto.v1.service.FindOneUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindOneUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 유저 목록 조회
     * rpc FindManyUser (FindManyUserRequest) returns (FindManyUserResult);
     * 인증 유저 조회
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindOneAuthUserResponse> findOneAuthUser(
        com.hearlers.api.proto.v1.service.FindOneAuthUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindOneAuthUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 잔여 토큰 체크
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.CheckRemainingTokensResponse> checkRemainingTokens(
        com.hearlers.api.proto.v1.service.CheckRemainingTokensRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckRemainingTokensMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 토큰 예약 (잔여 토큰 없을 시 에러)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.ReserveTokensResponse> reserveTokens(
        com.hearlers.api.proto.v1.service.ReserveTokensRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReserveTokensMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 유저 업데이트
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.UpdateUserResponse> updateUser(
        com.hearlers.api.proto.v1.service.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 활동 생성
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.CreateActivityResponse> createActivity(
        com.hearlers.api.proto.v1.service.CreateActivityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateActivityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIALIZE_USER = 0;
  private static final int METHODID_CONNECT_AUTH_CHANNEL = 1;
  private static final int METHODID_SAVE_REFRESH_TOKEN = 2;
  private static final int METHODID_VERIFY_REFRESH_TOKEN = 3;
  private static final int METHODID_FIND_ONE_USER = 4;
  private static final int METHODID_FIND_ONE_AUTH_USER = 5;
  private static final int METHODID_CHECK_REMAINING_TOKENS = 6;
  private static final int METHODID_RESERVE_TOKENS = 7;
  private static final int METHODID_UPDATE_USER = 8;
  private static final int METHODID_CREATE_ACTIVITY = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIALIZE_USER:
          serviceImpl.initializeUser((com.hearlers.api.proto.v1.service.InitializeUserRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.InitializeUserResponse>) responseObserver);
          break;
        case METHODID_CONNECT_AUTH_CHANNEL:
          serviceImpl.connectAuthChannel((com.hearlers.api.proto.v1.service.ConnectAuthChannelRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.ConnectAuthChannelResponse>) responseObserver);
          break;
        case METHODID_SAVE_REFRESH_TOKEN:
          serviceImpl.saveRefreshToken((com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse>) responseObserver);
          break;
        case METHODID_VERIFY_REFRESH_TOKEN:
          serviceImpl.verifyRefreshToken((com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse>) responseObserver);
          break;
        case METHODID_FIND_ONE_USER:
          serviceImpl.findOneUser((com.hearlers.api.proto.v1.service.FindOneUserRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindOneUserResponse>) responseObserver);
          break;
        case METHODID_FIND_ONE_AUTH_USER:
          serviceImpl.findOneAuthUser((com.hearlers.api.proto.v1.service.FindOneAuthUserRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindOneAuthUserResponse>) responseObserver);
          break;
        case METHODID_CHECK_REMAINING_TOKENS:
          serviceImpl.checkRemainingTokens((com.hearlers.api.proto.v1.service.CheckRemainingTokensRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CheckRemainingTokensResponse>) responseObserver);
          break;
        case METHODID_RESERVE_TOKENS:
          serviceImpl.reserveTokens((com.hearlers.api.proto.v1.service.ReserveTokensRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.ReserveTokensResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.hearlers.api.proto.v1.service.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateUserResponse>) responseObserver);
          break;
        case METHODID_CREATE_ACTIVITY:
          serviceImpl.createActivity((com.hearlers.api.proto.v1.service.CreateActivityRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateActivityResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getInitializeUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.InitializeUserRequest,
              com.hearlers.api.proto.v1.service.InitializeUserResponse>(
                service, METHODID_INITIALIZE_USER)))
        .addMethod(
          getConnectAuthChannelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.ConnectAuthChannelRequest,
              com.hearlers.api.proto.v1.service.ConnectAuthChannelResponse>(
                service, METHODID_CONNECT_AUTH_CHANNEL)))
        .addMethod(
          getSaveRefreshTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest,
              com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse>(
                service, METHODID_SAVE_REFRESH_TOKEN)))
        .addMethod(
          getVerifyRefreshTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.VerifyRefreshTokenRequest,
              com.hearlers.api.proto.v1.service.VerifyRefreshTokenResponse>(
                service, METHODID_VERIFY_REFRESH_TOKEN)))
        .addMethod(
          getFindOneUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindOneUserRequest,
              com.hearlers.api.proto.v1.service.FindOneUserResponse>(
                service, METHODID_FIND_ONE_USER)))
        .addMethod(
          getFindOneAuthUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindOneAuthUserRequest,
              com.hearlers.api.proto.v1.service.FindOneAuthUserResponse>(
                service, METHODID_FIND_ONE_AUTH_USER)))
        .addMethod(
          getCheckRemainingTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.CheckRemainingTokensRequest,
              com.hearlers.api.proto.v1.service.CheckRemainingTokensResponse>(
                service, METHODID_CHECK_REMAINING_TOKENS)))
        .addMethod(
          getReserveTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.ReserveTokensRequest,
              com.hearlers.api.proto.v1.service.ReserveTokensResponse>(
                service, METHODID_RESERVE_TOKENS)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.UpdateUserRequest,
              com.hearlers.api.proto.v1.service.UpdateUserResponse>(
                service, METHODID_UPDATE_USER)))
        .addMethod(
          getCreateActivityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.CreateActivityRequest,
              com.hearlers.api.proto.v1.service.CreateActivityResponse>(
                service, METHODID_CREATE_ACTIVITY)))
        .build();
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hearlers.api.proto.v1.service.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getInitializeUserMethod())
              .addMethod(getConnectAuthChannelMethod())
              .addMethod(getSaveRefreshTokenMethod())
              .addMethod(getVerifyRefreshTokenMethod())
              .addMethod(getFindOneUserMethod())
              .addMethod(getFindOneAuthUserMethod())
              .addMethod(getCheckRemainingTokensMethod())
              .addMethod(getReserveTokensMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getCreateActivityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
