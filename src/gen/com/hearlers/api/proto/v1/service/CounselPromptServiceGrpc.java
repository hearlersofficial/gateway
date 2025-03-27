package com.hearlers.api.proto.v1.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: com/hearlers/v1/service/counsel_prompt.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CounselPromptServiceGrpc {

  private CounselPromptServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.hearlers.v1.service.CounselPromptService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateToneRequest,
      com.hearlers.api.proto.v1.service.CreateToneResponse> getCreateToneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTone",
      requestType = com.hearlers.api.proto.v1.service.CreateToneRequest.class,
      responseType = com.hearlers.api.proto.v1.service.CreateToneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateToneRequest,
      com.hearlers.api.proto.v1.service.CreateToneResponse> getCreateToneMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateToneRequest, com.hearlers.api.proto.v1.service.CreateToneResponse> getCreateToneMethod;
    if ((getCreateToneMethod = CounselPromptServiceGrpc.getCreateToneMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getCreateToneMethod = CounselPromptServiceGrpc.getCreateToneMethod) == null) {
          CounselPromptServiceGrpc.getCreateToneMethod = getCreateToneMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreateToneRequest, com.hearlers.api.proto.v1.service.CreateToneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateToneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateToneResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("CreateTone"))
              .build();
        }
      }
    }
    return getCreateToneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindTonesRequest,
      com.hearlers.api.proto.v1.service.FindTonesResponse> getFindTonesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindTones",
      requestType = com.hearlers.api.proto.v1.service.FindTonesRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindTonesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindTonesRequest,
      com.hearlers.api.proto.v1.service.FindTonesResponse> getFindTonesMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindTonesRequest, com.hearlers.api.proto.v1.service.FindTonesResponse> getFindTonesMethod;
    if ((getFindTonesMethod = CounselPromptServiceGrpc.getFindTonesMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getFindTonesMethod = CounselPromptServiceGrpc.getFindTonesMethod) == null) {
          CounselPromptServiceGrpc.getFindTonesMethod = getFindTonesMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindTonesRequest, com.hearlers.api.proto.v1.service.FindTonesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindTones"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindTonesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindTonesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("FindTones"))
              .build();
        }
      }
    }
    return getFindTonesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindToneByIdRequest,
      com.hearlers.api.proto.v1.service.FindToneByIdResponse> getFindToneByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindToneById",
      requestType = com.hearlers.api.proto.v1.service.FindToneByIdRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindToneByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindToneByIdRequest,
      com.hearlers.api.proto.v1.service.FindToneByIdResponse> getFindToneByIdMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindToneByIdRequest, com.hearlers.api.proto.v1.service.FindToneByIdResponse> getFindToneByIdMethod;
    if ((getFindToneByIdMethod = CounselPromptServiceGrpc.getFindToneByIdMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getFindToneByIdMethod = CounselPromptServiceGrpc.getFindToneByIdMethod) == null) {
          CounselPromptServiceGrpc.getFindToneByIdMethod = getFindToneByIdMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindToneByIdRequest, com.hearlers.api.proto.v1.service.FindToneByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindToneById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindToneByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindToneByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("FindToneById"))
              .build();
        }
      }
    }
    return getFindToneByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateToneRequest,
      com.hearlers.api.proto.v1.service.UpdateToneResponse> getUpdateToneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTone",
      requestType = com.hearlers.api.proto.v1.service.UpdateToneRequest.class,
      responseType = com.hearlers.api.proto.v1.service.UpdateToneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateToneRequest,
      com.hearlers.api.proto.v1.service.UpdateToneResponse> getUpdateToneMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateToneRequest, com.hearlers.api.proto.v1.service.UpdateToneResponse> getUpdateToneMethod;
    if ((getUpdateToneMethod = CounselPromptServiceGrpc.getUpdateToneMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getUpdateToneMethod = CounselPromptServiceGrpc.getUpdateToneMethod) == null) {
          CounselPromptServiceGrpc.getUpdateToneMethod = getUpdateToneMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.UpdateToneRequest, com.hearlers.api.proto.v1.service.UpdateToneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateToneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateToneResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("UpdateTone"))
              .build();
        }
      }
    }
    return getUpdateToneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest,
      com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse> getCreateCounselTechniqueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCounselTechnique",
      requestType = com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest.class,
      responseType = com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest,
      com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse> getCreateCounselTechniqueMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest, com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse> getCreateCounselTechniqueMethod;
    if ((getCreateCounselTechniqueMethod = CounselPromptServiceGrpc.getCreateCounselTechniqueMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getCreateCounselTechniqueMethod = CounselPromptServiceGrpc.getCreateCounselTechniqueMethod) == null) {
          CounselPromptServiceGrpc.getCreateCounselTechniqueMethod = getCreateCounselTechniqueMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest, com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCounselTechnique"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("CreateCounselTechnique"))
              .build();
        }
      }
    }
    return getCreateCounselTechniqueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest,
      com.hearlers.api.proto.v1.service.FindCounselTechniquesResponse> getFindCounselTechniquesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindCounselTechniques",
      requestType = com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindCounselTechniquesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest,
      com.hearlers.api.proto.v1.service.FindCounselTechniquesResponse> getFindCounselTechniquesMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest, com.hearlers.api.proto.v1.service.FindCounselTechniquesResponse> getFindCounselTechniquesMethod;
    if ((getFindCounselTechniquesMethod = CounselPromptServiceGrpc.getFindCounselTechniquesMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getFindCounselTechniquesMethod = CounselPromptServiceGrpc.getFindCounselTechniquesMethod) == null) {
          CounselPromptServiceGrpc.getFindCounselTechniquesMethod = getFindCounselTechniquesMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest, com.hearlers.api.proto.v1.service.FindCounselTechniquesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindCounselTechniques"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselTechniquesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("FindCounselTechniques"))
              .build();
        }
      }
    }
    return getFindCounselTechniquesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest,
      com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdResponse> getFindCounselTechniqueByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindCounselTechniqueById",
      requestType = com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest,
      com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdResponse> getFindCounselTechniqueByIdMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest, com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdResponse> getFindCounselTechniqueByIdMethod;
    if ((getFindCounselTechniqueByIdMethod = CounselPromptServiceGrpc.getFindCounselTechniqueByIdMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getFindCounselTechniqueByIdMethod = CounselPromptServiceGrpc.getFindCounselTechniqueByIdMethod) == null) {
          CounselPromptServiceGrpc.getFindCounselTechniqueByIdMethod = getFindCounselTechniqueByIdMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest, com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindCounselTechniqueById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("FindCounselTechniqueById"))
              .build();
        }
      }
    }
    return getFindCounselTechniqueByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest,
      com.hearlers.api.proto.v1.service.UpdateCounselTechniqueResponse> getUpdateCounselTechniqueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCounselTechnique",
      requestType = com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest.class,
      responseType = com.hearlers.api.proto.v1.service.UpdateCounselTechniqueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest,
      com.hearlers.api.proto.v1.service.UpdateCounselTechniqueResponse> getUpdateCounselTechniqueMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest, com.hearlers.api.proto.v1.service.UpdateCounselTechniqueResponse> getUpdateCounselTechniqueMethod;
    if ((getUpdateCounselTechniqueMethod = CounselPromptServiceGrpc.getUpdateCounselTechniqueMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getUpdateCounselTechniqueMethod = CounselPromptServiceGrpc.getUpdateCounselTechniqueMethod) == null) {
          CounselPromptServiceGrpc.getUpdateCounselTechniqueMethod = getUpdateCounselTechniqueMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest, com.hearlers.api.proto.v1.service.UpdateCounselTechniqueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCounselTechnique"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateCounselTechniqueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("UpdateCounselTechnique"))
              .build();
        }
      }
    }
    return getUpdateCounselTechniqueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest,
      com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse> getSaveCounselTechniqueSequenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveCounselTechniqueSequence",
      requestType = com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest.class,
      responseType = com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest,
      com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse> getSaveCounselTechniqueSequenceMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest, com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse> getSaveCounselTechniqueSequenceMethod;
    if ((getSaveCounselTechniqueSequenceMethod = CounselPromptServiceGrpc.getSaveCounselTechniqueSequenceMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getSaveCounselTechniqueSequenceMethod = CounselPromptServiceGrpc.getSaveCounselTechniqueSequenceMethod) == null) {
          CounselPromptServiceGrpc.getSaveCounselTechniqueSequenceMethod = getSaveCounselTechniqueSequenceMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest, com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveCounselTechniqueSequence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("SaveCounselTechniqueSequence"))
              .build();
        }
      }
    }
    return getSaveCounselTechniqueSequenceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CounselPromptServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounselPromptServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounselPromptServiceStub>() {
        @java.lang.Override
        public CounselPromptServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounselPromptServiceStub(channel, callOptions);
        }
      };
    return CounselPromptServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CounselPromptServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounselPromptServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounselPromptServiceBlockingV2Stub>() {
        @java.lang.Override
        public CounselPromptServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounselPromptServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CounselPromptServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CounselPromptServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounselPromptServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounselPromptServiceBlockingStub>() {
        @java.lang.Override
        public CounselPromptServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounselPromptServiceBlockingStub(channel, callOptions);
        }
      };
    return CounselPromptServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CounselPromptServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounselPromptServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounselPromptServiceFutureStub>() {
        @java.lang.Override
        public CounselPromptServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounselPromptServiceFutureStub(channel, callOptions);
        }
      };
    return CounselPromptServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Tone
     * </pre>
     */
    default void createTone(com.hearlers.api.proto.v1.service.CreateToneRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateToneResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateToneMethod(), responseObserver);
    }

    /**
     */
    default void findTones(com.hearlers.api.proto.v1.service.FindTonesRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindTonesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindTonesMethod(), responseObserver);
    }

    /**
     */
    default void findToneById(com.hearlers.api.proto.v1.service.FindToneByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindToneByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindToneByIdMethod(), responseObserver);
    }

    /**
     */
    default void updateTone(com.hearlers.api.proto.v1.service.UpdateToneRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateToneResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateToneMethod(), responseObserver);
    }

    /**
     * <pre>
     * 상담 기법
     * </pre>
     */
    default void createCounselTechnique(com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCounselTechniqueMethod(), responseObserver);
    }

    /**
     */
    default void findCounselTechniques(com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselTechniquesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindCounselTechniquesMethod(), responseObserver);
    }

    /**
     */
    default void findCounselTechniqueById(com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindCounselTechniqueByIdMethod(), responseObserver);
    }

    /**
     */
    default void updateCounselTechnique(com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateCounselTechniqueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCounselTechniqueMethod(), responseObserver);
    }

    /**
     */
    default void saveCounselTechniqueSequence(com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveCounselTechniqueSequenceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CounselPromptService.
   */
  public static abstract class CounselPromptServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CounselPromptServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CounselPromptService.
   */
  public static final class CounselPromptServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CounselPromptServiceStub> {
    private CounselPromptServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounselPromptServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounselPromptServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Tone
     * </pre>
     */
    public void createTone(com.hearlers.api.proto.v1.service.CreateToneRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateToneResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateToneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findTones(com.hearlers.api.proto.v1.service.FindTonesRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindTonesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindTonesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findToneById(com.hearlers.api.proto.v1.service.FindToneByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindToneByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindToneByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTone(com.hearlers.api.proto.v1.service.UpdateToneRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateToneResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateToneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 상담 기법
     * </pre>
     */
    public void createCounselTechnique(com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCounselTechniqueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findCounselTechniques(com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselTechniquesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindCounselTechniquesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findCounselTechniqueById(com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindCounselTechniqueByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCounselTechnique(com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateCounselTechniqueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCounselTechniqueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveCounselTechniqueSequence(com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveCounselTechniqueSequenceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CounselPromptService.
   */
  public static final class CounselPromptServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CounselPromptServiceBlockingV2Stub> {
    private CounselPromptServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounselPromptServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounselPromptServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Tone
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateToneResponse createTone(com.hearlers.api.proto.v1.service.CreateToneRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateToneMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindTonesResponse findTones(com.hearlers.api.proto.v1.service.FindTonesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindTonesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindToneByIdResponse findToneById(com.hearlers.api.proto.v1.service.FindToneByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindToneByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdateToneResponse updateTone(com.hearlers.api.proto.v1.service.UpdateToneRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateToneMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 상담 기법
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse createCounselTechnique(com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCounselTechniqueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindCounselTechniquesResponse findCounselTechniques(com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindCounselTechniquesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdResponse findCounselTechniqueById(com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindCounselTechniqueByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdateCounselTechniqueResponse updateCounselTechnique(com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCounselTechniqueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse saveCounselTechniqueSequence(com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveCounselTechniqueSequenceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CounselPromptService.
   */
  public static final class CounselPromptServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CounselPromptServiceBlockingStub> {
    private CounselPromptServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounselPromptServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounselPromptServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Tone
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateToneResponse createTone(com.hearlers.api.proto.v1.service.CreateToneRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateToneMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindTonesResponse findTones(com.hearlers.api.proto.v1.service.FindTonesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindTonesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindToneByIdResponse findToneById(com.hearlers.api.proto.v1.service.FindToneByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindToneByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdateToneResponse updateTone(com.hearlers.api.proto.v1.service.UpdateToneRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateToneMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 상담 기법
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse createCounselTechnique(com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCounselTechniqueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindCounselTechniquesResponse findCounselTechniques(com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindCounselTechniquesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdResponse findCounselTechniqueById(com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindCounselTechniqueByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdateCounselTechniqueResponse updateCounselTechnique(com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCounselTechniqueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse saveCounselTechniqueSequence(com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveCounselTechniqueSequenceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CounselPromptService.
   */
  public static final class CounselPromptServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CounselPromptServiceFutureStub> {
    private CounselPromptServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounselPromptServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounselPromptServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Tone
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.CreateToneResponse> createTone(
        com.hearlers.api.proto.v1.service.CreateToneRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateToneMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindTonesResponse> findTones(
        com.hearlers.api.proto.v1.service.FindTonesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindTonesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindToneByIdResponse> findToneById(
        com.hearlers.api.proto.v1.service.FindToneByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindToneByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.UpdateToneResponse> updateTone(
        com.hearlers.api.proto.v1.service.UpdateToneRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateToneMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 상담 기법
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse> createCounselTechnique(
        com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCounselTechniqueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindCounselTechniquesResponse> findCounselTechniques(
        com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindCounselTechniquesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdResponse> findCounselTechniqueById(
        com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindCounselTechniqueByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.UpdateCounselTechniqueResponse> updateCounselTechnique(
        com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCounselTechniqueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse> saveCounselTechniqueSequence(
        com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveCounselTechniqueSequenceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TONE = 0;
  private static final int METHODID_FIND_TONES = 1;
  private static final int METHODID_FIND_TONE_BY_ID = 2;
  private static final int METHODID_UPDATE_TONE = 3;
  private static final int METHODID_CREATE_COUNSEL_TECHNIQUE = 4;
  private static final int METHODID_FIND_COUNSEL_TECHNIQUES = 5;
  private static final int METHODID_FIND_COUNSEL_TECHNIQUE_BY_ID = 6;
  private static final int METHODID_UPDATE_COUNSEL_TECHNIQUE = 7;
  private static final int METHODID_SAVE_COUNSEL_TECHNIQUE_SEQUENCE = 8;

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
        case METHODID_CREATE_TONE:
          serviceImpl.createTone((com.hearlers.api.proto.v1.service.CreateToneRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateToneResponse>) responseObserver);
          break;
        case METHODID_FIND_TONES:
          serviceImpl.findTones((com.hearlers.api.proto.v1.service.FindTonesRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindTonesResponse>) responseObserver);
          break;
        case METHODID_FIND_TONE_BY_ID:
          serviceImpl.findToneById((com.hearlers.api.proto.v1.service.FindToneByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindToneByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TONE:
          serviceImpl.updateTone((com.hearlers.api.proto.v1.service.UpdateToneRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateToneResponse>) responseObserver);
          break;
        case METHODID_CREATE_COUNSEL_TECHNIQUE:
          serviceImpl.createCounselTechnique((com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse>) responseObserver);
          break;
        case METHODID_FIND_COUNSEL_TECHNIQUES:
          serviceImpl.findCounselTechniques((com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselTechniquesResponse>) responseObserver);
          break;
        case METHODID_FIND_COUNSEL_TECHNIQUE_BY_ID:
          serviceImpl.findCounselTechniqueById((com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COUNSEL_TECHNIQUE:
          serviceImpl.updateCounselTechnique((com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateCounselTechniqueResponse>) responseObserver);
          break;
        case METHODID_SAVE_COUNSEL_TECHNIQUE_SEQUENCE:
          serviceImpl.saveCounselTechniqueSequence((com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse>) responseObserver);
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
          getCreateToneMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.CreateToneRequest,
              com.hearlers.api.proto.v1.service.CreateToneResponse>(
                service, METHODID_CREATE_TONE)))
        .addMethod(
          getFindTonesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindTonesRequest,
              com.hearlers.api.proto.v1.service.FindTonesResponse>(
                service, METHODID_FIND_TONES)))
        .addMethod(
          getFindToneByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindToneByIdRequest,
              com.hearlers.api.proto.v1.service.FindToneByIdResponse>(
                service, METHODID_FIND_TONE_BY_ID)))
        .addMethod(
          getUpdateToneMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.UpdateToneRequest,
              com.hearlers.api.proto.v1.service.UpdateToneResponse>(
                service, METHODID_UPDATE_TONE)))
        .addMethod(
          getCreateCounselTechniqueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest,
              com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse>(
                service, METHODID_CREATE_COUNSEL_TECHNIQUE)))
        .addMethod(
          getFindCounselTechniquesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest,
              com.hearlers.api.proto.v1.service.FindCounselTechniquesResponse>(
                service, METHODID_FIND_COUNSEL_TECHNIQUES)))
        .addMethod(
          getFindCounselTechniqueByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest,
              com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdResponse>(
                service, METHODID_FIND_COUNSEL_TECHNIQUE_BY_ID)))
        .addMethod(
          getUpdateCounselTechniqueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest,
              com.hearlers.api.proto.v1.service.UpdateCounselTechniqueResponse>(
                service, METHODID_UPDATE_COUNSEL_TECHNIQUE)))
        .addMethod(
          getSaveCounselTechniqueSequenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest,
              com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse>(
                service, METHODID_SAVE_COUNSEL_TECHNIQUE_SEQUENCE)))
        .build();
  }

  private static abstract class CounselPromptServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CounselPromptServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hearlers.api.proto.v1.service.CounselPrompt.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CounselPromptService");
    }
  }

  private static final class CounselPromptServiceFileDescriptorSupplier
      extends CounselPromptServiceBaseDescriptorSupplier {
    CounselPromptServiceFileDescriptorSupplier() {}
  }

  private static final class CounselPromptServiceMethodDescriptorSupplier
      extends CounselPromptServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CounselPromptServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CounselPromptServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CounselPromptServiceFileDescriptorSupplier())
              .addMethod(getCreateToneMethod())
              .addMethod(getFindTonesMethod())
              .addMethod(getFindToneByIdMethod())
              .addMethod(getUpdateToneMethod())
              .addMethod(getCreateCounselTechniqueMethod())
              .addMethod(getFindCounselTechniquesMethod())
              .addMethod(getFindCounselTechniqueByIdMethod())
              .addMethod(getUpdateCounselTechniqueMethod())
              .addMethod(getSaveCounselTechniqueSequenceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
