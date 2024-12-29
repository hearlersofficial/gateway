package com.hearlers.api.proto.v1.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: com/hearlers/v1/service/counsel.proto")
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

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.GetPromptListRequest,
      com.hearlers.api.proto.v1.service.GetPromptListResult> getGetPromptListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPromptList",
      requestType = com.hearlers.api.proto.v1.service.GetPromptListRequest.class,
      responseType = com.hearlers.api.proto.v1.service.GetPromptListResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.GetPromptListRequest,
      com.hearlers.api.proto.v1.service.GetPromptListResult> getGetPromptListMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.GetPromptListRequest, com.hearlers.api.proto.v1.service.GetPromptListResult> getGetPromptListMethod;
    if ((getGetPromptListMethod = CounselServiceGrpc.getGetPromptListMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getGetPromptListMethod = CounselServiceGrpc.getGetPromptListMethod) == null) {
          CounselServiceGrpc.getGetPromptListMethod = getGetPromptListMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.GetPromptListRequest, com.hearlers.api.proto.v1.service.GetPromptListResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPromptList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.GetPromptListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.GetPromptListResult.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("GetPromptList"))
              .build();
        }
      }
    }
    return getGetPromptListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreatePromptRequest,
      com.hearlers.api.proto.v1.service.CreatePromptResult> getCreatePromptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePrompt",
      requestType = com.hearlers.api.proto.v1.service.CreatePromptRequest.class,
      responseType = com.hearlers.api.proto.v1.service.CreatePromptResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreatePromptRequest,
      com.hearlers.api.proto.v1.service.CreatePromptResult> getCreatePromptMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreatePromptRequest, com.hearlers.api.proto.v1.service.CreatePromptResult> getCreatePromptMethod;
    if ((getCreatePromptMethod = CounselServiceGrpc.getCreatePromptMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getCreatePromptMethod = CounselServiceGrpc.getCreatePromptMethod) == null) {
          CounselServiceGrpc.getCreatePromptMethod = getCreatePromptMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreatePromptRequest, com.hearlers.api.proto.v1.service.CreatePromptResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePrompt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreatePromptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreatePromptResult.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("CreatePrompt"))
              .build();
        }
      }
    }
    return getCreatePromptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdatePromptRequest,
      com.hearlers.api.proto.v1.service.UpdatePromptResult> getUpdatePromptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePrompt",
      requestType = com.hearlers.api.proto.v1.service.UpdatePromptRequest.class,
      responseType = com.hearlers.api.proto.v1.service.UpdatePromptResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdatePromptRequest,
      com.hearlers.api.proto.v1.service.UpdatePromptResult> getUpdatePromptMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdatePromptRequest, com.hearlers.api.proto.v1.service.UpdatePromptResult> getUpdatePromptMethod;
    if ((getUpdatePromptMethod = CounselServiceGrpc.getUpdatePromptMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getUpdatePromptMethod = CounselServiceGrpc.getUpdatePromptMethod) == null) {
          CounselServiceGrpc.getUpdatePromptMethod = getUpdatePromptMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.UpdatePromptRequest, com.hearlers.api.proto.v1.service.UpdatePromptResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePrompt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdatePromptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdatePromptResult.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("UpdatePrompt"))
              .build();
        }
      }
    }
    return getUpdatePromptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateCounselorRequest,
      com.hearlers.api.proto.v1.service.CreateCounselorResult> getCreateCounselorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCounselor",
      requestType = com.hearlers.api.proto.v1.service.CreateCounselorRequest.class,
      responseType = com.hearlers.api.proto.v1.service.CreateCounselorResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateCounselorRequest,
      com.hearlers.api.proto.v1.service.CreateCounselorResult> getCreateCounselorMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateCounselorRequest, com.hearlers.api.proto.v1.service.CreateCounselorResult> getCreateCounselorMethod;
    if ((getCreateCounselorMethod = CounselServiceGrpc.getCreateCounselorMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getCreateCounselorMethod = CounselServiceGrpc.getCreateCounselorMethod) == null) {
          CounselServiceGrpc.getCreateCounselorMethod = getCreateCounselorMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreateCounselorRequest, com.hearlers.api.proto.v1.service.CreateCounselorResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCounselor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateCounselorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateCounselorResult.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("CreateCounselor"))
              .build();
        }
      }
    }
    return getCreateCounselorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.GetCounselorListRequest,
      com.hearlers.api.proto.v1.service.GetCounselorListResult> getGetCounselorListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCounselorList",
      requestType = com.hearlers.api.proto.v1.service.GetCounselorListRequest.class,
      responseType = com.hearlers.api.proto.v1.service.GetCounselorListResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.GetCounselorListRequest,
      com.hearlers.api.proto.v1.service.GetCounselorListResult> getGetCounselorListMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.GetCounselorListRequest, com.hearlers.api.proto.v1.service.GetCounselorListResult> getGetCounselorListMethod;
    if ((getGetCounselorListMethod = CounselServiceGrpc.getGetCounselorListMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getGetCounselorListMethod = CounselServiceGrpc.getGetCounselorListMethod) == null) {
          CounselServiceGrpc.getGetCounselorListMethod = getGetCounselorListMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.GetCounselorListRequest, com.hearlers.api.proto.v1.service.GetCounselorListResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCounselorList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.GetCounselorListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.GetCounselorListResult.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("GetCounselorList"))
              .build();
        }
      }
    }
    return getGetCounselorListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateCounselorRequest,
      com.hearlers.api.proto.v1.service.UpdateCounselorResult> getUpdateCounselorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCounselor",
      requestType = com.hearlers.api.proto.v1.service.UpdateCounselorRequest.class,
      responseType = com.hearlers.api.proto.v1.service.UpdateCounselorResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateCounselorRequest,
      com.hearlers.api.proto.v1.service.UpdateCounselorResult> getUpdateCounselorMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateCounselorRequest, com.hearlers.api.proto.v1.service.UpdateCounselorResult> getUpdateCounselorMethod;
    if ((getUpdateCounselorMethod = CounselServiceGrpc.getUpdateCounselorMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getUpdateCounselorMethod = CounselServiceGrpc.getUpdateCounselorMethod) == null) {
          CounselServiceGrpc.getUpdateCounselorMethod = getUpdateCounselorMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.UpdateCounselorRequest, com.hearlers.api.proto.v1.service.UpdateCounselorResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCounselor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateCounselorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateCounselorResult.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("UpdateCounselor"))
              .build();
        }
      }
    }
    return getUpdateCounselorMethod;
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

    /**
     */
    default void getPromptList(com.hearlers.api.proto.v1.service.GetPromptListRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.GetPromptListResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPromptListMethod(), responseObserver);
    }

    /**
     */
    default void createPrompt(com.hearlers.api.proto.v1.service.CreatePromptRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreatePromptResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePromptMethod(), responseObserver);
    }

    /**
     */
    default void updatePrompt(com.hearlers.api.proto.v1.service.UpdatePromptRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdatePromptResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePromptMethod(), responseObserver);
    }

    /**
     */
    default void createCounselor(com.hearlers.api.proto.v1.service.CreateCounselorRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateCounselorResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCounselorMethod(), responseObserver);
    }

    /**
     */
    default void getCounselorList(com.hearlers.api.proto.v1.service.GetCounselorListRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.GetCounselorListResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCounselorListMethod(), responseObserver);
    }

    /**
     */
    default void updateCounselor(com.hearlers.api.proto.v1.service.UpdateCounselorRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateCounselorResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCounselorMethod(), responseObserver);
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

    /**
     */
    public void getPromptList(com.hearlers.api.proto.v1.service.GetPromptListRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.GetPromptListResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPromptListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPrompt(com.hearlers.api.proto.v1.service.CreatePromptRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreatePromptResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePromptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePrompt(com.hearlers.api.proto.v1.service.UpdatePromptRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdatePromptResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePromptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCounselor(com.hearlers.api.proto.v1.service.CreateCounselorRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateCounselorResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCounselorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCounselorList(com.hearlers.api.proto.v1.service.GetCounselorListRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.GetCounselorListResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCounselorListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCounselor(com.hearlers.api.proto.v1.service.UpdateCounselorRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateCounselorResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCounselorMethod(), getCallOptions()), request, responseObserver);
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

    /**
     */
    public com.hearlers.api.proto.v1.service.GetPromptListResult getPromptList(com.hearlers.api.proto.v1.service.GetPromptListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPromptListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.CreatePromptResult createPrompt(com.hearlers.api.proto.v1.service.CreatePromptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePromptMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdatePromptResult updatePrompt(com.hearlers.api.proto.v1.service.UpdatePromptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePromptMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.CreateCounselorResult createCounselor(com.hearlers.api.proto.v1.service.CreateCounselorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCounselorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.GetCounselorListResult getCounselorList(com.hearlers.api.proto.v1.service.GetCounselorListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCounselorListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdateCounselorResult updateCounselor(com.hearlers.api.proto.v1.service.UpdateCounselorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCounselorMethod(), getCallOptions(), request);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.GetPromptListResult> getPromptList(
        com.hearlers.api.proto.v1.service.GetPromptListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPromptListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.CreatePromptResult> createPrompt(
        com.hearlers.api.proto.v1.service.CreatePromptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePromptMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.UpdatePromptResult> updatePrompt(
        com.hearlers.api.proto.v1.service.UpdatePromptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePromptMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.CreateCounselorResult> createCounselor(
        com.hearlers.api.proto.v1.service.CreateCounselorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCounselorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.GetCounselorListResult> getCounselorList(
        com.hearlers.api.proto.v1.service.GetCounselorListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCounselorListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.UpdateCounselorResult> updateCounselor(
        com.hearlers.api.proto.v1.service.UpdateCounselorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCounselorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_COUNSEL = 0;
  private static final int METHODID_GET_COUNSEL_LIST = 1;
  private static final int METHODID_CREATE_MESSAGE = 2;
  private static final int METHODID_GET_MESSAGE_LIST = 3;
  private static final int METHODID_GET_PROMPT_LIST = 4;
  private static final int METHODID_CREATE_PROMPT = 5;
  private static final int METHODID_UPDATE_PROMPT = 6;
  private static final int METHODID_CREATE_COUNSELOR = 7;
  private static final int METHODID_GET_COUNSELOR_LIST = 8;
  private static final int METHODID_UPDATE_COUNSELOR = 9;

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
        case METHODID_GET_PROMPT_LIST:
          serviceImpl.getPromptList((com.hearlers.api.proto.v1.service.GetPromptListRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.GetPromptListResult>) responseObserver);
          break;
        case METHODID_CREATE_PROMPT:
          serviceImpl.createPrompt((com.hearlers.api.proto.v1.service.CreatePromptRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreatePromptResult>) responseObserver);
          break;
        case METHODID_UPDATE_PROMPT:
          serviceImpl.updatePrompt((com.hearlers.api.proto.v1.service.UpdatePromptRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdatePromptResult>) responseObserver);
          break;
        case METHODID_CREATE_COUNSELOR:
          serviceImpl.createCounselor((com.hearlers.api.proto.v1.service.CreateCounselorRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateCounselorResult>) responseObserver);
          break;
        case METHODID_GET_COUNSELOR_LIST:
          serviceImpl.getCounselorList((com.hearlers.api.proto.v1.service.GetCounselorListRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.GetCounselorListResult>) responseObserver);
          break;
        case METHODID_UPDATE_COUNSELOR:
          serviceImpl.updateCounselor((com.hearlers.api.proto.v1.service.UpdateCounselorRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateCounselorResult>) responseObserver);
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
        .addMethod(
          getGetPromptListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.GetPromptListRequest,
              com.hearlers.api.proto.v1.service.GetPromptListResult>(
                service, METHODID_GET_PROMPT_LIST)))
        .addMethod(
          getCreatePromptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.CreatePromptRequest,
              com.hearlers.api.proto.v1.service.CreatePromptResult>(
                service, METHODID_CREATE_PROMPT)))
        .addMethod(
          getUpdatePromptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.UpdatePromptRequest,
              com.hearlers.api.proto.v1.service.UpdatePromptResult>(
                service, METHODID_UPDATE_PROMPT)))
        .addMethod(
          getCreateCounselorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.CreateCounselorRequest,
              com.hearlers.api.proto.v1.service.CreateCounselorResult>(
                service, METHODID_CREATE_COUNSELOR)))
        .addMethod(
          getGetCounselorListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.GetCounselorListRequest,
              com.hearlers.api.proto.v1.service.GetCounselorListResult>(
                service, METHODID_GET_COUNSELOR_LIST)))
        .addMethod(
          getUpdateCounselorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.UpdateCounselorRequest,
              com.hearlers.api.proto.v1.service.UpdateCounselorResult>(
                service, METHODID_UPDATE_COUNSELOR)))
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
              .addMethod(getGetPromptListMethod())
              .addMethod(getCreatePromptMethod())
              .addMethod(getUpdatePromptMethod())
              .addMethod(getCreateCounselorMethod())
              .addMethod(getGetCounselorListMethod())
              .addMethod(getUpdateCounselorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
