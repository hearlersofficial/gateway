package com.hearlers.api.proto.v1.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: v1/service/counsel.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CounselServiceGrpc {

  private CounselServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.hearlers.v1.service.CounselService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateCounselRequest,
      com.hearlers.api.proto.v1.service.CreateCounselResult> getCreateCounselMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCounsel",
      requestType = com.hearlers.api.proto.v1.service.CreateCounselRequest.class,
      responseType = com.hearlers.api.proto.v1.service.CreateCounselResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateCounselRequest,
      com.hearlers.api.proto.v1.service.CreateCounselResult> getCreateCounselMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateCounselRequest, com.hearlers.api.proto.v1.service.CreateCounselResult> getCreateCounselMethod;
    if ((getCreateCounselMethod = CounselServiceGrpc.getCreateCounselMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getCreateCounselMethod = CounselServiceGrpc.getCreateCounselMethod) == null) {
          CounselServiceGrpc.getCreateCounselMethod = getCreateCounselMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreateCounselRequest, com.hearlers.api.proto.v1.service.CreateCounselResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCounsel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateCounselRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateCounselResult.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("CreateCounsel"))
              .build();
        }
      }
    }
    return getCreateCounselMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.GetCounselListRequest,
      com.hearlers.api.proto.v1.service.GetCounselListResult> getGetCounselListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCounselList",
      requestType = com.hearlers.api.proto.v1.service.GetCounselListRequest.class,
      responseType = com.hearlers.api.proto.v1.service.GetCounselListResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.GetCounselListRequest,
      com.hearlers.api.proto.v1.service.GetCounselListResult> getGetCounselListMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.GetCounselListRequest, com.hearlers.api.proto.v1.service.GetCounselListResult> getGetCounselListMethod;
    if ((getGetCounselListMethod = CounselServiceGrpc.getGetCounselListMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getGetCounselListMethod = CounselServiceGrpc.getGetCounselListMethod) == null) {
          CounselServiceGrpc.getGetCounselListMethod = getGetCounselListMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.GetCounselListRequest, com.hearlers.api.proto.v1.service.GetCounselListResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCounselList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.GetCounselListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.GetCounselListResult.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("GetCounselList"))
              .build();
        }
      }
    }
    return getGetCounselListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateMessageRequest,
      com.hearlers.api.proto.v1.service.CreateMessageResult> getCreateMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMessage",
      requestType = com.hearlers.api.proto.v1.service.CreateMessageRequest.class,
      responseType = com.hearlers.api.proto.v1.service.CreateMessageResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateMessageRequest,
      com.hearlers.api.proto.v1.service.CreateMessageResult> getCreateMessageMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateMessageRequest, com.hearlers.api.proto.v1.service.CreateMessageResult> getCreateMessageMethod;
    if ((getCreateMessageMethod = CounselServiceGrpc.getCreateMessageMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getCreateMessageMethod = CounselServiceGrpc.getCreateMessageMethod) == null) {
          CounselServiceGrpc.getCreateMessageMethod = getCreateMessageMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreateMessageRequest, com.hearlers.api.proto.v1.service.CreateMessageResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateMessageResult.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("CreateMessage"))
              .build();
        }
      }
    }
    return getCreateMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.GetMessageListRequest,
      com.hearlers.api.proto.v1.service.GetMessageListResult> getGetMessageListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMessageList",
      requestType = com.hearlers.api.proto.v1.service.GetMessageListRequest.class,
      responseType = com.hearlers.api.proto.v1.service.GetMessageListResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.GetMessageListRequest,
      com.hearlers.api.proto.v1.service.GetMessageListResult> getGetMessageListMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.GetMessageListRequest, com.hearlers.api.proto.v1.service.GetMessageListResult> getGetMessageListMethod;
    if ((getGetMessageListMethod = CounselServiceGrpc.getGetMessageListMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getGetMessageListMethod = CounselServiceGrpc.getGetMessageListMethod) == null) {
          CounselServiceGrpc.getGetMessageListMethod = getGetMessageListMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.GetMessageListRequest, com.hearlers.api.proto.v1.service.GetMessageListResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMessageList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.GetMessageListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.GetMessageListResult.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("GetMessageList"))
              .build();
        }
      }
    }
    return getGetMessageListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CounselServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounselServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounselServiceStub>() {
        @java.lang.Override
        public CounselServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounselServiceStub(channel, callOptions);
        }
      };
    return CounselServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CounselServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounselServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounselServiceBlockingStub>() {
        @java.lang.Override
        public CounselServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounselServiceBlockingStub(channel, callOptions);
        }
      };
    return CounselServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CounselServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounselServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounselServiceFutureStub>() {
        @java.lang.Override
        public CounselServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounselServiceFutureStub(channel, callOptions);
        }
      };
    return CounselServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createCounsel(com.hearlers.api.proto.v1.service.CreateCounselRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateCounselResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCounselMethod(), responseObserver);
    }

    /**
     */
    default void getCounselList(com.hearlers.api.proto.v1.service.GetCounselListRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.GetCounselListResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCounselListMethod(), responseObserver);
    }

    /**
     */
    default void createMessage(com.hearlers.api.proto.v1.service.CreateMessageRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateMessageResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMessageMethod(), responseObserver);
    }

    /**
     */
    default void getMessageList(com.hearlers.api.proto.v1.service.GetMessageListRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.GetMessageListResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMessageListMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CounselService.
   */
  public static abstract class CounselServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CounselServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CounselService.
   */
  public static final class CounselServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CounselServiceStub> {
    private CounselServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounselServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounselServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCounsel(com.hearlers.api.proto.v1.service.CreateCounselRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateCounselResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCounselMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCounselList(com.hearlers.api.proto.v1.service.GetCounselListRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.GetCounselListResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCounselListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createMessage(com.hearlers.api.proto.v1.service.CreateMessageRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateMessageResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMessageList(com.hearlers.api.proto.v1.service.GetMessageListRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.GetMessageListResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMessageListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CounselService.
   */
  public static final class CounselServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CounselServiceBlockingStub> {
    private CounselServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounselServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounselServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.CreateCounselResult createCounsel(com.hearlers.api.proto.v1.service.CreateCounselRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCounselMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.GetCounselListResult getCounselList(com.hearlers.api.proto.v1.service.GetCounselListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCounselListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.CreateMessageResult createMessage(com.hearlers.api.proto.v1.service.CreateMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.GetMessageListResult getMessageList(com.hearlers.api.proto.v1.service.GetMessageListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMessageListMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CounselService.
   */
  public static final class CounselServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CounselServiceFutureStub> {
    private CounselServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounselServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounselServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.CreateCounselResult> createCounsel(
        com.hearlers.api.proto.v1.service.CreateCounselRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCounselMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.GetCounselListResult> getCounselList(
        com.hearlers.api.proto.v1.service.GetCounselListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCounselListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.CreateMessageResult> createMessage(
        com.hearlers.api.proto.v1.service.CreateMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.GetMessageListResult> getMessageList(
        com.hearlers.api.proto.v1.service.GetMessageListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMessageListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_COUNSEL = 0;
  private static final int METHODID_GET_COUNSEL_LIST = 1;
  private static final int METHODID_CREATE_MESSAGE = 2;
  private static final int METHODID_GET_MESSAGE_LIST = 3;

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
        case METHODID_CREATE_COUNSEL:
          serviceImpl.createCounsel((com.hearlers.api.proto.v1.service.CreateCounselRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateCounselResult>) responseObserver);
          break;
        case METHODID_GET_COUNSEL_LIST:
          serviceImpl.getCounselList((com.hearlers.api.proto.v1.service.GetCounselListRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.GetCounselListResult>) responseObserver);
          break;
        case METHODID_CREATE_MESSAGE:
          serviceImpl.createMessage((com.hearlers.api.proto.v1.service.CreateMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateMessageResult>) responseObserver);
          break;
        case METHODID_GET_MESSAGE_LIST:
          serviceImpl.getMessageList((com.hearlers.api.proto.v1.service.GetMessageListRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.GetMessageListResult>) responseObserver);
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
          getCreateCounselMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.CreateCounselRequest,
              com.hearlers.api.proto.v1.service.CreateCounselResult>(
                service, METHODID_CREATE_COUNSEL)))
        .addMethod(
          getGetCounselListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.GetCounselListRequest,
              com.hearlers.api.proto.v1.service.GetCounselListResult>(
                service, METHODID_GET_COUNSEL_LIST)))
        .addMethod(
          getCreateMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.CreateMessageRequest,
              com.hearlers.api.proto.v1.service.CreateMessageResult>(
                service, METHODID_CREATE_MESSAGE)))
        .addMethod(
          getGetMessageListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.GetMessageListRequest,
              com.hearlers.api.proto.v1.service.GetMessageListResult>(
                service, METHODID_GET_MESSAGE_LIST)))
        .build();
  }

  private static abstract class CounselServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CounselServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hearlers.api.proto.v1.service.Counsel.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CounselService");
    }
  }

  private static final class CounselServiceFileDescriptorSupplier
      extends CounselServiceBaseDescriptorSupplier {
    CounselServiceFileDescriptorSupplier() {}
  }

  private static final class CounselServiceMethodDescriptorSupplier
      extends CounselServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CounselServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CounselServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CounselServiceFileDescriptorSupplier())
              .addMethod(getCreateCounselMethod())
              .addMethod(getGetCounselListMethod())
              .addMethod(getCreateMessageMethod())
              .addMethod(getGetMessageListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
