package com.hearlers.api.proto.v1.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: com/hearlers/v1/service/counselor.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CounselorServiceGrpc {

  private CounselorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.hearlers.v1.service.CounselorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateCounselorRequest,
      com.hearlers.api.proto.v1.service.CreateCounselorResponse> getCreateCounselorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCounselor",
      requestType = com.hearlers.api.proto.v1.service.CreateCounselorRequest.class,
      responseType = com.hearlers.api.proto.v1.service.CreateCounselorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateCounselorRequest,
      com.hearlers.api.proto.v1.service.CreateCounselorResponse> getCreateCounselorMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateCounselorRequest, com.hearlers.api.proto.v1.service.CreateCounselorResponse> getCreateCounselorMethod;
    if ((getCreateCounselorMethod = CounselorServiceGrpc.getCreateCounselorMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getCreateCounselorMethod = CounselorServiceGrpc.getCreateCounselorMethod) == null) {
          CounselorServiceGrpc.getCreateCounselorMethod = getCreateCounselorMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreateCounselorRequest, com.hearlers.api.proto.v1.service.CreateCounselorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCounselor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateCounselorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateCounselorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("CreateCounselor"))
              .build();
        }
      }
    }
    return getCreateCounselorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselorsRequest,
      com.hearlers.api.proto.v1.service.FindCounselorsResponse> getFindCounselorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindCounselors",
      requestType = com.hearlers.api.proto.v1.service.FindCounselorsRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindCounselorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselorsRequest,
      com.hearlers.api.proto.v1.service.FindCounselorsResponse> getFindCounselorsMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselorsRequest, com.hearlers.api.proto.v1.service.FindCounselorsResponse> getFindCounselorsMethod;
    if ((getFindCounselorsMethod = CounselorServiceGrpc.getFindCounselorsMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getFindCounselorsMethod = CounselorServiceGrpc.getFindCounselorsMethod) == null) {
          CounselorServiceGrpc.getFindCounselorsMethod = getFindCounselorsMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindCounselorsRequest, com.hearlers.api.proto.v1.service.FindCounselorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindCounselors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("FindCounselors"))
              .build();
        }
      }
    }
    return getFindCounselorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselorByIdRequest,
      com.hearlers.api.proto.v1.service.FindCounselorByIdResponse> getFindCounselorByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindCounselorById",
      requestType = com.hearlers.api.proto.v1.service.FindCounselorByIdRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindCounselorByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselorByIdRequest,
      com.hearlers.api.proto.v1.service.FindCounselorByIdResponse> getFindCounselorByIdMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselorByIdRequest, com.hearlers.api.proto.v1.service.FindCounselorByIdResponse> getFindCounselorByIdMethod;
    if ((getFindCounselorByIdMethod = CounselorServiceGrpc.getFindCounselorByIdMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getFindCounselorByIdMethod = CounselorServiceGrpc.getFindCounselorByIdMethod) == null) {
          CounselorServiceGrpc.getFindCounselorByIdMethod = getFindCounselorByIdMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindCounselorByIdRequest, com.hearlers.api.proto.v1.service.FindCounselorByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindCounselorById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselorByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselorByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("FindCounselorById"))
              .build();
        }
      }
    }
    return getFindCounselorByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateCounselorRequest,
      com.hearlers.api.proto.v1.service.UpdateCounselorResponse> getUpdateCounselorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCounselor",
      requestType = com.hearlers.api.proto.v1.service.UpdateCounselorRequest.class,
      responseType = com.hearlers.api.proto.v1.service.UpdateCounselorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateCounselorRequest,
      com.hearlers.api.proto.v1.service.UpdateCounselorResponse> getUpdateCounselorMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateCounselorRequest, com.hearlers.api.proto.v1.service.UpdateCounselorResponse> getUpdateCounselorMethod;
    if ((getUpdateCounselorMethod = CounselorServiceGrpc.getUpdateCounselorMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getUpdateCounselorMethod = CounselorServiceGrpc.getUpdateCounselorMethod) == null) {
          CounselorServiceGrpc.getUpdateCounselorMethod = getUpdateCounselorMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.UpdateCounselorRequest, com.hearlers.api.proto.v1.service.UpdateCounselorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCounselor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateCounselorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateCounselorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("UpdateCounselor"))
              .build();
        }
      }
    }
    return getUpdateCounselorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CounselorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounselorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounselorServiceStub>() {
        @java.lang.Override
        public CounselorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounselorServiceStub(channel, callOptions);
        }
      };
    return CounselorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CounselorServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounselorServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounselorServiceBlockingV2Stub>() {
        @java.lang.Override
        public CounselorServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounselorServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CounselorServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CounselorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounselorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounselorServiceBlockingStub>() {
        @java.lang.Override
        public CounselorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounselorServiceBlockingStub(channel, callOptions);
        }
      };
    return CounselorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CounselorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounselorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounselorServiceFutureStub>() {
        @java.lang.Override
        public CounselorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounselorServiceFutureStub(channel, callOptions);
        }
      };
    return CounselorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 상담사
     * </pre>
     */
    default void createCounselor(com.hearlers.api.proto.v1.service.CreateCounselorRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateCounselorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCounselorMethod(), responseObserver);
    }

    /**
     */
    default void findCounselors(com.hearlers.api.proto.v1.service.FindCounselorsRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindCounselorsMethod(), responseObserver);
    }

    /**
     */
    default void findCounselorById(com.hearlers.api.proto.v1.service.FindCounselorByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselorByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindCounselorByIdMethod(), responseObserver);
    }

    /**
     */
    default void updateCounselor(com.hearlers.api.proto.v1.service.UpdateCounselorRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateCounselorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCounselorMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CounselorService.
   */
  public static abstract class CounselorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CounselorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CounselorService.
   */
  public static final class CounselorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CounselorServiceStub> {
    private CounselorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounselorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounselorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 상담사
     * </pre>
     */
    public void createCounselor(com.hearlers.api.proto.v1.service.CreateCounselorRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateCounselorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCounselorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findCounselors(com.hearlers.api.proto.v1.service.FindCounselorsRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindCounselorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findCounselorById(com.hearlers.api.proto.v1.service.FindCounselorByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselorByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindCounselorByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCounselor(com.hearlers.api.proto.v1.service.UpdateCounselorRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateCounselorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCounselorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CounselorService.
   */
  public static final class CounselorServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CounselorServiceBlockingV2Stub> {
    private CounselorServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounselorServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounselorServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 상담사
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateCounselorResponse createCounselor(com.hearlers.api.proto.v1.service.CreateCounselorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCounselorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindCounselorsResponse findCounselors(com.hearlers.api.proto.v1.service.FindCounselorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindCounselorsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindCounselorByIdResponse findCounselorById(com.hearlers.api.proto.v1.service.FindCounselorByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindCounselorByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdateCounselorResponse updateCounselor(com.hearlers.api.proto.v1.service.UpdateCounselorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCounselorMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CounselorService.
   */
  public static final class CounselorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CounselorServiceBlockingStub> {
    private CounselorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounselorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounselorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 상담사
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateCounselorResponse createCounselor(com.hearlers.api.proto.v1.service.CreateCounselorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCounselorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindCounselorsResponse findCounselors(com.hearlers.api.proto.v1.service.FindCounselorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindCounselorsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindCounselorByIdResponse findCounselorById(com.hearlers.api.proto.v1.service.FindCounselorByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindCounselorByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdateCounselorResponse updateCounselor(com.hearlers.api.proto.v1.service.UpdateCounselorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCounselorMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CounselorService.
   */
  public static final class CounselorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CounselorServiceFutureStub> {
    private CounselorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounselorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounselorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 상담사
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.CreateCounselorResponse> createCounselor(
        com.hearlers.api.proto.v1.service.CreateCounselorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCounselorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindCounselorsResponse> findCounselors(
        com.hearlers.api.proto.v1.service.FindCounselorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindCounselorsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindCounselorByIdResponse> findCounselorById(
        com.hearlers.api.proto.v1.service.FindCounselorByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindCounselorByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.UpdateCounselorResponse> updateCounselor(
        com.hearlers.api.proto.v1.service.UpdateCounselorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCounselorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_COUNSELOR = 0;
  private static final int METHODID_FIND_COUNSELORS = 1;
  private static final int METHODID_FIND_COUNSELOR_BY_ID = 2;
  private static final int METHODID_UPDATE_COUNSELOR = 3;

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
        case METHODID_CREATE_COUNSELOR:
          serviceImpl.createCounselor((com.hearlers.api.proto.v1.service.CreateCounselorRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateCounselorResponse>) responseObserver);
          break;
        case METHODID_FIND_COUNSELORS:
          serviceImpl.findCounselors((com.hearlers.api.proto.v1.service.FindCounselorsRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselorsResponse>) responseObserver);
          break;
        case METHODID_FIND_COUNSELOR_BY_ID:
          serviceImpl.findCounselorById((com.hearlers.api.proto.v1.service.FindCounselorByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselorByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COUNSELOR:
          serviceImpl.updateCounselor((com.hearlers.api.proto.v1.service.UpdateCounselorRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateCounselorResponse>) responseObserver);
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
          getCreateCounselorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.CreateCounselorRequest,
              com.hearlers.api.proto.v1.service.CreateCounselorResponse>(
                service, METHODID_CREATE_COUNSELOR)))
        .addMethod(
          getFindCounselorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindCounselorsRequest,
              com.hearlers.api.proto.v1.service.FindCounselorsResponse>(
                service, METHODID_FIND_COUNSELORS)))
        .addMethod(
          getFindCounselorByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindCounselorByIdRequest,
              com.hearlers.api.proto.v1.service.FindCounselorByIdResponse>(
                service, METHODID_FIND_COUNSELOR_BY_ID)))
        .addMethod(
          getUpdateCounselorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.UpdateCounselorRequest,
              com.hearlers.api.proto.v1.service.UpdateCounselorResponse>(
                service, METHODID_UPDATE_COUNSELOR)))
        .build();
  }

  private static abstract class CounselorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CounselorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hearlers.api.proto.v1.service.Counselor.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CounselorService");
    }
  }

  private static final class CounselorServiceFileDescriptorSupplier
      extends CounselorServiceBaseDescriptorSupplier {
    CounselorServiceFileDescriptorSupplier() {}
  }

  private static final class CounselorServiceMethodDescriptorSupplier
      extends CounselorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CounselorServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CounselorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CounselorServiceFileDescriptorSupplier())
              .addMethod(getCreateCounselorMethod())
              .addMethod(getFindCounselorsMethod())
              .addMethod(getFindCounselorByIdMethod())
              .addMethod(getUpdateCounselorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
