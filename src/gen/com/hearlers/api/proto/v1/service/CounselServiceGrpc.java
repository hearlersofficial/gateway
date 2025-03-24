package com.hearlers.api.proto.v1.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: com/hearlers/v1/service/counsel.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CounselServiceGrpc {

  private CounselServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.hearlers.v1.service.CounselService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateCounselRequest,
      com.hearlers.api.proto.v1.service.CreateCounselResponse> getCreateCounselMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCounsel",
      requestType = com.hearlers.api.proto.v1.service.CreateCounselRequest.class,
      responseType = com.hearlers.api.proto.v1.service.CreateCounselResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateCounselRequest,
      com.hearlers.api.proto.v1.service.CreateCounselResponse> getCreateCounselMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateCounselRequest, com.hearlers.api.proto.v1.service.CreateCounselResponse> getCreateCounselMethod;
    if ((getCreateCounselMethod = CounselServiceGrpc.getCreateCounselMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getCreateCounselMethod = CounselServiceGrpc.getCreateCounselMethod) == null) {
          CounselServiceGrpc.getCreateCounselMethod = getCreateCounselMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreateCounselRequest, com.hearlers.api.proto.v1.service.CreateCounselResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCounsel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateCounselRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateCounselResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("CreateCounsel"))
              .build();
        }
      }
    }
    return getCreateCounselMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselsRequest,
      com.hearlers.api.proto.v1.service.FindCounselsResponse> getFindCounselsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindCounsels",
      requestType = com.hearlers.api.proto.v1.service.FindCounselsRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindCounselsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselsRequest,
      com.hearlers.api.proto.v1.service.FindCounselsResponse> getFindCounselsMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselsRequest, com.hearlers.api.proto.v1.service.FindCounselsResponse> getFindCounselsMethod;
    if ((getFindCounselsMethod = CounselServiceGrpc.getFindCounselsMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getFindCounselsMethod = CounselServiceGrpc.getFindCounselsMethod) == null) {
          CounselServiceGrpc.getFindCounselsMethod = getFindCounselsMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindCounselsRequest, com.hearlers.api.proto.v1.service.FindCounselsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindCounsels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("FindCounsels"))
              .build();
        }
      }
    }
    return getFindCounselsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselByIdRequest,
      com.hearlers.api.proto.v1.service.FindCounselByIdResponse> getFindCounselByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindCounselById",
      requestType = com.hearlers.api.proto.v1.service.FindCounselByIdRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindCounselByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselByIdRequest,
      com.hearlers.api.proto.v1.service.FindCounselByIdResponse> getFindCounselByIdMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselByIdRequest, com.hearlers.api.proto.v1.service.FindCounselByIdResponse> getFindCounselByIdMethod;
    if ((getFindCounselByIdMethod = CounselServiceGrpc.getFindCounselByIdMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getFindCounselByIdMethod = CounselServiceGrpc.getFindCounselByIdMethod) == null) {
          CounselServiceGrpc.getFindCounselByIdMethod = getFindCounselByIdMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindCounselByIdRequest, com.hearlers.api.proto.v1.service.FindCounselByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindCounselById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("FindCounselById"))
              .build();
        }
      }
    }
    return getFindCounselByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateMessageRequest,
      com.hearlers.api.proto.v1.service.CreateMessageResponse> getCreateMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMessage",
      requestType = com.hearlers.api.proto.v1.service.CreateMessageRequest.class,
      responseType = com.hearlers.api.proto.v1.service.CreateMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateMessageRequest,
      com.hearlers.api.proto.v1.service.CreateMessageResponse> getCreateMessageMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateMessageRequest, com.hearlers.api.proto.v1.service.CreateMessageResponse> getCreateMessageMethod;
    if ((getCreateMessageMethod = CounselServiceGrpc.getCreateMessageMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getCreateMessageMethod = CounselServiceGrpc.getCreateMessageMethod) == null) {
          CounselServiceGrpc.getCreateMessageMethod = getCreateMessageMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreateMessageRequest, com.hearlers.api.proto.v1.service.CreateMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("CreateMessage"))
              .build();
        }
      }
    }
    return getCreateMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindMessagesRequest,
      com.hearlers.api.proto.v1.service.FindMessagesResponse> getFindMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindMessages",
      requestType = com.hearlers.api.proto.v1.service.FindMessagesRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindMessagesRequest,
      com.hearlers.api.proto.v1.service.FindMessagesResponse> getFindMessagesMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindMessagesRequest, com.hearlers.api.proto.v1.service.FindMessagesResponse> getFindMessagesMethod;
    if ((getFindMessagesMethod = CounselServiceGrpc.getFindMessagesMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getFindMessagesMethod = CounselServiceGrpc.getFindMessagesMethod) == null) {
          CounselServiceGrpc.getFindMessagesMethod = getFindMessagesMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindMessagesRequest, com.hearlers.api.proto.v1.service.FindMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindMessagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("FindMessages"))
              .build();
        }
      }
    }
    return getFindMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.ReactMessageRequest,
      com.hearlers.api.proto.v1.service.ReactMessageResponse> getReactMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReactMessage",
      requestType = com.hearlers.api.proto.v1.service.ReactMessageRequest.class,
      responseType = com.hearlers.api.proto.v1.service.ReactMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.ReactMessageRequest,
      com.hearlers.api.proto.v1.service.ReactMessageResponse> getReactMessageMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.ReactMessageRequest, com.hearlers.api.proto.v1.service.ReactMessageResponse> getReactMessageMethod;
    if ((getReactMessageMethod = CounselServiceGrpc.getReactMessageMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getReactMessageMethod = CounselServiceGrpc.getReactMessageMethod) == null) {
          CounselServiceGrpc.getReactMessageMethod = getReactMessageMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.ReactMessageRequest, com.hearlers.api.proto.v1.service.ReactMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReactMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.ReactMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.ReactMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("ReactMessage"))
              .build();
        }
      }
    }
    return getReactMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest,
      com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsResponse> getFindCounselorUserRelationshipsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindCounselorUserRelationships",
      requestType = com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest,
      com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsResponse> getFindCounselorUserRelationshipsMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest, com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsResponse> getFindCounselorUserRelationshipsMethod;
    if ((getFindCounselorUserRelationshipsMethod = CounselServiceGrpc.getFindCounselorUserRelationshipsMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getFindCounselorUserRelationshipsMethod = CounselServiceGrpc.getFindCounselorUserRelationshipsMethod) == null) {
          CounselServiceGrpc.getFindCounselorUserRelationshipsMethod = getFindCounselorUserRelationshipsMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest, com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindCounselorUserRelationships"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("FindCounselorUserRelationships"))
              .build();
        }
      }
    }
    return getFindCounselorUserRelationshipsMethod;
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
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CounselServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounselServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounselServiceBlockingV2Stub>() {
        @java.lang.Override
        public CounselServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounselServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CounselServiceBlockingV2Stub.newStub(factory, channel);
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
     * <pre>
     * 상담 (한 사이클)
     * TODO: 한 사이클의 끝을 어떻게 지정할 지 결정
     * </pre>
     */
    default void createCounsel(com.hearlers.api.proto.v1.service.CreateCounselRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateCounselResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCounselMethod(), responseObserver);
    }

    /**
     */
    default void findCounsels(com.hearlers.api.proto.v1.service.FindCounselsRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindCounselsMethod(), responseObserver);
    }

    /**
     */
    default void findCounselById(com.hearlers.api.proto.v1.service.FindCounselByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindCounselByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * 상담 메시지 (상담 중 하나의 채팅)
     * </pre>
     */
    default void createMessage(com.hearlers.api.proto.v1.service.CreateMessageRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMessageMethod(), responseObserver);
    }

    /**
     */
    default void findMessages(com.hearlers.api.proto.v1.service.FindMessagesRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindMessagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindMessagesMethod(), responseObserver);
    }

    /**
     */
    default void reactMessage(com.hearlers.api.proto.v1.service.ReactMessageRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.ReactMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReactMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * 상담사와 유저의 관계
     * TODO: CQRS 패턴으로 뷰 테이블을 만들어 놓고 그냥 꺼내서 준다.
     * Relationship은 읽을 시 싱딤시와, 상담사의 모든 Counsels를 다 가지고 오는게 의미있는 단위
     * Relationship 뷰 테이블에 이미 상담사와 모든 유저의 대화 내용을 미리 조인해둔 뷰 테이블을 만들어 놓고 그냥 꺼내서 준다.
     * DDD를 안함
     * 별도의 모듈
     * </pre>
     */
    default void findCounselorUserRelationships(com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindCounselorUserRelationshipsMethod(), responseObserver);
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
     * <pre>
     * 상담 (한 사이클)
     * TODO: 한 사이클의 끝을 어떻게 지정할 지 결정
     * </pre>
     */
    public void createCounsel(com.hearlers.api.proto.v1.service.CreateCounselRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateCounselResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCounselMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findCounsels(com.hearlers.api.proto.v1.service.FindCounselsRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindCounselsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findCounselById(com.hearlers.api.proto.v1.service.FindCounselByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindCounselByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 상담 메시지 (상담 중 하나의 채팅)
     * </pre>
     */
    public void createMessage(com.hearlers.api.proto.v1.service.CreateMessageRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findMessages(com.hearlers.api.proto.v1.service.FindMessagesRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindMessagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reactMessage(com.hearlers.api.proto.v1.service.ReactMessageRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.ReactMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReactMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 상담사와 유저의 관계
     * TODO: CQRS 패턴으로 뷰 테이블을 만들어 놓고 그냥 꺼내서 준다.
     * Relationship은 읽을 시 싱딤시와, 상담사의 모든 Counsels를 다 가지고 오는게 의미있는 단위
     * Relationship 뷰 테이블에 이미 상담사와 모든 유저의 대화 내용을 미리 조인해둔 뷰 테이블을 만들어 놓고 그냥 꺼내서 준다.
     * DDD를 안함
     * 별도의 모듈
     * </pre>
     */
    public void findCounselorUserRelationships(com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindCounselorUserRelationshipsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CounselService.
   */
  public static final class CounselServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CounselServiceBlockingV2Stub> {
    private CounselServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounselServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounselServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 상담 (한 사이클)
     * TODO: 한 사이클의 끝을 어떻게 지정할 지 결정
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateCounselResponse createCounsel(com.hearlers.api.proto.v1.service.CreateCounselRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCounselMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindCounselsResponse findCounsels(com.hearlers.api.proto.v1.service.FindCounselsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindCounselsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindCounselByIdResponse findCounselById(com.hearlers.api.proto.v1.service.FindCounselByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindCounselByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 상담 메시지 (상담 중 하나의 채팅)
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateMessageResponse createMessage(com.hearlers.api.proto.v1.service.CreateMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindMessagesResponse findMessages(com.hearlers.api.proto.v1.service.FindMessagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindMessagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.ReactMessageResponse reactMessage(com.hearlers.api.proto.v1.service.ReactMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReactMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 상담사와 유저의 관계
     * TODO: CQRS 패턴으로 뷰 테이블을 만들어 놓고 그냥 꺼내서 준다.
     * Relationship은 읽을 시 싱딤시와, 상담사의 모든 Counsels를 다 가지고 오는게 의미있는 단위
     * Relationship 뷰 테이블에 이미 상담사와 모든 유저의 대화 내용을 미리 조인해둔 뷰 테이블을 만들어 놓고 그냥 꺼내서 준다.
     * DDD를 안함
     * 별도의 모듈
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsResponse findCounselorUserRelationships(com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindCounselorUserRelationshipsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CounselService.
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
     * <pre>
     * 상담 (한 사이클)
     * TODO: 한 사이클의 끝을 어떻게 지정할 지 결정
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateCounselResponse createCounsel(com.hearlers.api.proto.v1.service.CreateCounselRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCounselMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindCounselsResponse findCounsels(com.hearlers.api.proto.v1.service.FindCounselsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindCounselsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindCounselByIdResponse findCounselById(com.hearlers.api.proto.v1.service.FindCounselByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindCounselByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 상담 메시지 (상담 중 하나의 채팅)
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateMessageResponse createMessage(com.hearlers.api.proto.v1.service.CreateMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindMessagesResponse findMessages(com.hearlers.api.proto.v1.service.FindMessagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindMessagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.ReactMessageResponse reactMessage(com.hearlers.api.proto.v1.service.ReactMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReactMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 상담사와 유저의 관계
     * TODO: CQRS 패턴으로 뷰 테이블을 만들어 놓고 그냥 꺼내서 준다.
     * Relationship은 읽을 시 싱딤시와, 상담사의 모든 Counsels를 다 가지고 오는게 의미있는 단위
     * Relationship 뷰 테이블에 이미 상담사와 모든 유저의 대화 내용을 미리 조인해둔 뷰 테이블을 만들어 놓고 그냥 꺼내서 준다.
     * DDD를 안함
     * 별도의 모듈
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsResponse findCounselorUserRelationships(com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindCounselorUserRelationshipsMethod(), getCallOptions(), request);
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
     * <pre>
     * 상담 (한 사이클)
     * TODO: 한 사이클의 끝을 어떻게 지정할 지 결정
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.CreateCounselResponse> createCounsel(
        com.hearlers.api.proto.v1.service.CreateCounselRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCounselMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindCounselsResponse> findCounsels(
        com.hearlers.api.proto.v1.service.FindCounselsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindCounselsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindCounselByIdResponse> findCounselById(
        com.hearlers.api.proto.v1.service.FindCounselByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindCounselByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 상담 메시지 (상담 중 하나의 채팅)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.CreateMessageResponse> createMessage(
        com.hearlers.api.proto.v1.service.CreateMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindMessagesResponse> findMessages(
        com.hearlers.api.proto.v1.service.FindMessagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindMessagesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.ReactMessageResponse> reactMessage(
        com.hearlers.api.proto.v1.service.ReactMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReactMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 상담사와 유저의 관계
     * TODO: CQRS 패턴으로 뷰 테이블을 만들어 놓고 그냥 꺼내서 준다.
     * Relationship은 읽을 시 싱딤시와, 상담사의 모든 Counsels를 다 가지고 오는게 의미있는 단위
     * Relationship 뷰 테이블에 이미 상담사와 모든 유저의 대화 내용을 미리 조인해둔 뷰 테이블을 만들어 놓고 그냥 꺼내서 준다.
     * DDD를 안함
     * 별도의 모듈
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsResponse> findCounselorUserRelationships(
        com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindCounselorUserRelationshipsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_COUNSEL = 0;
  private static final int METHODID_FIND_COUNSELS = 1;
  private static final int METHODID_FIND_COUNSEL_BY_ID = 2;
  private static final int METHODID_CREATE_MESSAGE = 3;
  private static final int METHODID_FIND_MESSAGES = 4;
  private static final int METHODID_REACT_MESSAGE = 5;
  private static final int METHODID_FIND_COUNSELOR_USER_RELATIONSHIPS = 6;

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
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateCounselResponse>) responseObserver);
          break;
        case METHODID_FIND_COUNSELS:
          serviceImpl.findCounsels((com.hearlers.api.proto.v1.service.FindCounselsRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselsResponse>) responseObserver);
          break;
        case METHODID_FIND_COUNSEL_BY_ID:
          serviceImpl.findCounselById((com.hearlers.api.proto.v1.service.FindCounselByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselByIdResponse>) responseObserver);
          break;
        case METHODID_CREATE_MESSAGE:
          serviceImpl.createMessage((com.hearlers.api.proto.v1.service.CreateMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateMessageResponse>) responseObserver);
          break;
        case METHODID_FIND_MESSAGES:
          serviceImpl.findMessages((com.hearlers.api.proto.v1.service.FindMessagesRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindMessagesResponse>) responseObserver);
          break;
        case METHODID_REACT_MESSAGE:
          serviceImpl.reactMessage((com.hearlers.api.proto.v1.service.ReactMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.ReactMessageResponse>) responseObserver);
          break;
        case METHODID_FIND_COUNSELOR_USER_RELATIONSHIPS:
          serviceImpl.findCounselorUserRelationships((com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsResponse>) responseObserver);
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
              com.hearlers.api.proto.v1.service.CreateCounselResponse>(
                service, METHODID_CREATE_COUNSEL)))
        .addMethod(
          getFindCounselsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindCounselsRequest,
              com.hearlers.api.proto.v1.service.FindCounselsResponse>(
                service, METHODID_FIND_COUNSELS)))
        .addMethod(
          getFindCounselByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindCounselByIdRequest,
              com.hearlers.api.proto.v1.service.FindCounselByIdResponse>(
                service, METHODID_FIND_COUNSEL_BY_ID)))
        .addMethod(
          getCreateMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.CreateMessageRequest,
              com.hearlers.api.proto.v1.service.CreateMessageResponse>(
                service, METHODID_CREATE_MESSAGE)))
        .addMethod(
          getFindMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindMessagesRequest,
              com.hearlers.api.proto.v1.service.FindMessagesResponse>(
                service, METHODID_FIND_MESSAGES)))
        .addMethod(
          getReactMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.ReactMessageRequest,
              com.hearlers.api.proto.v1.service.ReactMessageResponse>(
                service, METHODID_REACT_MESSAGE)))
        .addMethod(
          getFindCounselorUserRelationshipsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest,
              com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsResponse>(
                service, METHODID_FIND_COUNSELOR_USER_RELATIONSHIPS)))
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
              .addMethod(getFindCounselsMethod())
              .addMethod(getFindCounselByIdMethod())
              .addMethod(getCreateMessageMethod())
              .addMethod(getFindMessagesMethod())
              .addMethod(getReactMessageMethod())
              .addMethod(getFindCounselorUserRelationshipsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
