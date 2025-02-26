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
    if ((getCreateCounselorMethod = CounselServiceGrpc.getCreateCounselorMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getCreateCounselorMethod = CounselServiceGrpc.getCreateCounselorMethod) == null) {
          CounselServiceGrpc.getCreateCounselorMethod = getCreateCounselorMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreateCounselorRequest, com.hearlers.api.proto.v1.service.CreateCounselorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCounselor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateCounselorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateCounselorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("CreateCounselor"))
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
    if ((getFindCounselorsMethod = CounselServiceGrpc.getFindCounselorsMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getFindCounselorsMethod = CounselServiceGrpc.getFindCounselorsMethod) == null) {
          CounselServiceGrpc.getFindCounselorsMethod = getFindCounselorsMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindCounselorsRequest, com.hearlers.api.proto.v1.service.FindCounselorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindCounselors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("FindCounselors"))
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
    if ((getFindCounselorByIdMethod = CounselServiceGrpc.getFindCounselorByIdMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getFindCounselorByIdMethod = CounselServiceGrpc.getFindCounselorByIdMethod) == null) {
          CounselServiceGrpc.getFindCounselorByIdMethod = getFindCounselorByIdMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindCounselorByIdRequest, com.hearlers.api.proto.v1.service.FindCounselorByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindCounselorById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselorByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselorByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("FindCounselorById"))
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
    if ((getUpdateCounselorMethod = CounselServiceGrpc.getUpdateCounselorMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getUpdateCounselorMethod = CounselServiceGrpc.getUpdateCounselorMethod) == null) {
          CounselServiceGrpc.getUpdateCounselorMethod = getUpdateCounselorMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.UpdateCounselorRequest, com.hearlers.api.proto.v1.service.UpdateCounselorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCounselor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateCounselorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateCounselorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("UpdateCounselor"))
              .build();
        }
      }
    }
    return getUpdateCounselorMethod;
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
    if ((getCreateCounselTechniqueMethod = CounselServiceGrpc.getCreateCounselTechniqueMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getCreateCounselTechniqueMethod = CounselServiceGrpc.getCreateCounselTechniqueMethod) == null) {
          CounselServiceGrpc.getCreateCounselTechniqueMethod = getCreateCounselTechniqueMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest, com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCounselTechnique"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("CreateCounselTechnique"))
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
    if ((getFindCounselTechniquesMethod = CounselServiceGrpc.getFindCounselTechniquesMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getFindCounselTechniquesMethod = CounselServiceGrpc.getFindCounselTechniquesMethod) == null) {
          CounselServiceGrpc.getFindCounselTechniquesMethod = getFindCounselTechniquesMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest, com.hearlers.api.proto.v1.service.FindCounselTechniquesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindCounselTechniques"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselTechniquesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselTechniquesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("FindCounselTechniques"))
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
    if ((getFindCounselTechniqueByIdMethod = CounselServiceGrpc.getFindCounselTechniqueByIdMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getFindCounselTechniqueByIdMethod = CounselServiceGrpc.getFindCounselTechniqueByIdMethod) == null) {
          CounselServiceGrpc.getFindCounselTechniqueByIdMethod = getFindCounselTechniqueByIdMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest, com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindCounselTechniqueById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindCounselTechniqueByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("FindCounselTechniqueById"))
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
    if ((getUpdateCounselTechniqueMethod = CounselServiceGrpc.getUpdateCounselTechniqueMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getUpdateCounselTechniqueMethod = CounselServiceGrpc.getUpdateCounselTechniqueMethod) == null) {
          CounselServiceGrpc.getUpdateCounselTechniqueMethod = getUpdateCounselTechniqueMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest, com.hearlers.api.proto.v1.service.UpdateCounselTechniqueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCounselTechnique"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateCounselTechniqueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateCounselTechniqueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("UpdateCounselTechnique"))
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
    if ((getSaveCounselTechniqueSequenceMethod = CounselServiceGrpc.getSaveCounselTechniqueSequenceMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getSaveCounselTechniqueSequenceMethod = CounselServiceGrpc.getSaveCounselTechniqueSequenceMethod) == null) {
          CounselServiceGrpc.getSaveCounselTechniqueSequenceMethod = getSaveCounselTechniqueSequenceMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest, com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveCounselTechniqueSequence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("SaveCounselTechniqueSequence"))
              .build();
        }
      }
    }
    return getSaveCounselTechniqueSequenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreatePersonaRequest,
      com.hearlers.api.proto.v1.service.CreatePersonaResponse> getCreatePersonaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePersona",
      requestType = com.hearlers.api.proto.v1.service.CreatePersonaRequest.class,
      responseType = com.hearlers.api.proto.v1.service.CreatePersonaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreatePersonaRequest,
      com.hearlers.api.proto.v1.service.CreatePersonaResponse> getCreatePersonaMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreatePersonaRequest, com.hearlers.api.proto.v1.service.CreatePersonaResponse> getCreatePersonaMethod;
    if ((getCreatePersonaMethod = CounselServiceGrpc.getCreatePersonaMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getCreatePersonaMethod = CounselServiceGrpc.getCreatePersonaMethod) == null) {
          CounselServiceGrpc.getCreatePersonaMethod = getCreatePersonaMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreatePersonaRequest, com.hearlers.api.proto.v1.service.CreatePersonaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePersona"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreatePersonaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreatePersonaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("CreatePersona"))
              .build();
        }
      }
    }
    return getCreatePersonaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindPersonasRequest,
      com.hearlers.api.proto.v1.service.FindPersonasResponse> getFindPersonasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindPersonas",
      requestType = com.hearlers.api.proto.v1.service.FindPersonasRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindPersonasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindPersonasRequest,
      com.hearlers.api.proto.v1.service.FindPersonasResponse> getFindPersonasMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindPersonasRequest, com.hearlers.api.proto.v1.service.FindPersonasResponse> getFindPersonasMethod;
    if ((getFindPersonasMethod = CounselServiceGrpc.getFindPersonasMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getFindPersonasMethod = CounselServiceGrpc.getFindPersonasMethod) == null) {
          CounselServiceGrpc.getFindPersonasMethod = getFindPersonasMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindPersonasRequest, com.hearlers.api.proto.v1.service.FindPersonasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindPersonas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindPersonasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindPersonasResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("FindPersonas"))
              .build();
        }
      }
    }
    return getFindPersonasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindPersonaByIdRequest,
      com.hearlers.api.proto.v1.service.FindPersonaByIdResponse> getFindPersonaByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindPersonaById",
      requestType = com.hearlers.api.proto.v1.service.FindPersonaByIdRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindPersonaByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindPersonaByIdRequest,
      com.hearlers.api.proto.v1.service.FindPersonaByIdResponse> getFindPersonaByIdMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindPersonaByIdRequest, com.hearlers.api.proto.v1.service.FindPersonaByIdResponse> getFindPersonaByIdMethod;
    if ((getFindPersonaByIdMethod = CounselServiceGrpc.getFindPersonaByIdMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getFindPersonaByIdMethod = CounselServiceGrpc.getFindPersonaByIdMethod) == null) {
          CounselServiceGrpc.getFindPersonaByIdMethod = getFindPersonaByIdMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindPersonaByIdRequest, com.hearlers.api.proto.v1.service.FindPersonaByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindPersonaById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindPersonaByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindPersonaByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("FindPersonaById"))
              .build();
        }
      }
    }
    return getFindPersonaByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdatePersonaRequest,
      com.hearlers.api.proto.v1.service.UpdatePersonaResponse> getUpdatePersonaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePersona",
      requestType = com.hearlers.api.proto.v1.service.UpdatePersonaRequest.class,
      responseType = com.hearlers.api.proto.v1.service.UpdatePersonaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdatePersonaRequest,
      com.hearlers.api.proto.v1.service.UpdatePersonaResponse> getUpdatePersonaMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdatePersonaRequest, com.hearlers.api.proto.v1.service.UpdatePersonaResponse> getUpdatePersonaMethod;
    if ((getUpdatePersonaMethod = CounselServiceGrpc.getUpdatePersonaMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getUpdatePersonaMethod = CounselServiceGrpc.getUpdatePersonaMethod) == null) {
          CounselServiceGrpc.getUpdatePersonaMethod = getUpdatePersonaMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.UpdatePersonaRequest, com.hearlers.api.proto.v1.service.UpdatePersonaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePersona"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdatePersonaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdatePersonaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("UpdatePersona"))
              .build();
        }
      }
    }
    return getUpdatePersonaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateContextRequest,
      com.hearlers.api.proto.v1.service.CreateContextResponse> getCreateContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateContext",
      requestType = com.hearlers.api.proto.v1.service.CreateContextRequest.class,
      responseType = com.hearlers.api.proto.v1.service.CreateContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateContextRequest,
      com.hearlers.api.proto.v1.service.CreateContextResponse> getCreateContextMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateContextRequest, com.hearlers.api.proto.v1.service.CreateContextResponse> getCreateContextMethod;
    if ((getCreateContextMethod = CounselServiceGrpc.getCreateContextMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getCreateContextMethod = CounselServiceGrpc.getCreateContextMethod) == null) {
          CounselServiceGrpc.getCreateContextMethod = getCreateContextMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreateContextRequest, com.hearlers.api.proto.v1.service.CreateContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateContextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateContextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("CreateContext"))
              .build();
        }
      }
    }
    return getCreateContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindContextsRequest,
      com.hearlers.api.proto.v1.service.FindContextsResponse> getFindContextsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindContexts",
      requestType = com.hearlers.api.proto.v1.service.FindContextsRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindContextsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindContextsRequest,
      com.hearlers.api.proto.v1.service.FindContextsResponse> getFindContextsMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindContextsRequest, com.hearlers.api.proto.v1.service.FindContextsResponse> getFindContextsMethod;
    if ((getFindContextsMethod = CounselServiceGrpc.getFindContextsMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getFindContextsMethod = CounselServiceGrpc.getFindContextsMethod) == null) {
          CounselServiceGrpc.getFindContextsMethod = getFindContextsMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindContextsRequest, com.hearlers.api.proto.v1.service.FindContextsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindContexts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindContextsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindContextsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("FindContexts"))
              .build();
        }
      }
    }
    return getFindContextsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindContextByIdRequest,
      com.hearlers.api.proto.v1.service.FindContextByIdResponse> getFindContextByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindContextById",
      requestType = com.hearlers.api.proto.v1.service.FindContextByIdRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindContextByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindContextByIdRequest,
      com.hearlers.api.proto.v1.service.FindContextByIdResponse> getFindContextByIdMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindContextByIdRequest, com.hearlers.api.proto.v1.service.FindContextByIdResponse> getFindContextByIdMethod;
    if ((getFindContextByIdMethod = CounselServiceGrpc.getFindContextByIdMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getFindContextByIdMethod = CounselServiceGrpc.getFindContextByIdMethod) == null) {
          CounselServiceGrpc.getFindContextByIdMethod = getFindContextByIdMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindContextByIdRequest, com.hearlers.api.proto.v1.service.FindContextByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindContextById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindContextByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindContextByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("FindContextById"))
              .build();
        }
      }
    }
    return getFindContextByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateContextRequest,
      com.hearlers.api.proto.v1.service.UpdateContextResponse> getUpdateContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateContext",
      requestType = com.hearlers.api.proto.v1.service.UpdateContextRequest.class,
      responseType = com.hearlers.api.proto.v1.service.UpdateContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateContextRequest,
      com.hearlers.api.proto.v1.service.UpdateContextResponse> getUpdateContextMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateContextRequest, com.hearlers.api.proto.v1.service.UpdateContextResponse> getUpdateContextMethod;
    if ((getUpdateContextMethod = CounselServiceGrpc.getUpdateContextMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getUpdateContextMethod = CounselServiceGrpc.getUpdateContextMethod) == null) {
          CounselServiceGrpc.getUpdateContextMethod = getUpdateContextMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.UpdateContextRequest, com.hearlers.api.proto.v1.service.UpdateContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateContextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateContextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("UpdateContext"))
              .build();
        }
      }
    }
    return getUpdateContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateInstructionRequest,
      com.hearlers.api.proto.v1.service.CreateInstructionResponse> getCreateInstructionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateInstruction",
      requestType = com.hearlers.api.proto.v1.service.CreateInstructionRequest.class,
      responseType = com.hearlers.api.proto.v1.service.CreateInstructionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateInstructionRequest,
      com.hearlers.api.proto.v1.service.CreateInstructionResponse> getCreateInstructionMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateInstructionRequest, com.hearlers.api.proto.v1.service.CreateInstructionResponse> getCreateInstructionMethod;
    if ((getCreateInstructionMethod = CounselServiceGrpc.getCreateInstructionMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getCreateInstructionMethod = CounselServiceGrpc.getCreateInstructionMethod) == null) {
          CounselServiceGrpc.getCreateInstructionMethod = getCreateInstructionMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreateInstructionRequest, com.hearlers.api.proto.v1.service.CreateInstructionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateInstruction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateInstructionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateInstructionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("CreateInstruction"))
              .build();
        }
      }
    }
    return getCreateInstructionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindInstructionsRequest,
      com.hearlers.api.proto.v1.service.FindInstructionsResponse> getFindInstructionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindInstructions",
      requestType = com.hearlers.api.proto.v1.service.FindInstructionsRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindInstructionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindInstructionsRequest,
      com.hearlers.api.proto.v1.service.FindInstructionsResponse> getFindInstructionsMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindInstructionsRequest, com.hearlers.api.proto.v1.service.FindInstructionsResponse> getFindInstructionsMethod;
    if ((getFindInstructionsMethod = CounselServiceGrpc.getFindInstructionsMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getFindInstructionsMethod = CounselServiceGrpc.getFindInstructionsMethod) == null) {
          CounselServiceGrpc.getFindInstructionsMethod = getFindInstructionsMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindInstructionsRequest, com.hearlers.api.proto.v1.service.FindInstructionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindInstructions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindInstructionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindInstructionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("FindInstructions"))
              .build();
        }
      }
    }
    return getFindInstructionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindInstructionByIdRequest,
      com.hearlers.api.proto.v1.service.FindInstructionByIdResponse> getFindInstructionByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindInstructionById",
      requestType = com.hearlers.api.proto.v1.service.FindInstructionByIdRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindInstructionByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindInstructionByIdRequest,
      com.hearlers.api.proto.v1.service.FindInstructionByIdResponse> getFindInstructionByIdMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindInstructionByIdRequest, com.hearlers.api.proto.v1.service.FindInstructionByIdResponse> getFindInstructionByIdMethod;
    if ((getFindInstructionByIdMethod = CounselServiceGrpc.getFindInstructionByIdMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getFindInstructionByIdMethod = CounselServiceGrpc.getFindInstructionByIdMethod) == null) {
          CounselServiceGrpc.getFindInstructionByIdMethod = getFindInstructionByIdMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindInstructionByIdRequest, com.hearlers.api.proto.v1.service.FindInstructionByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindInstructionById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindInstructionByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindInstructionByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("FindInstructionById"))
              .build();
        }
      }
    }
    return getFindInstructionByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateInstructionRequest,
      com.hearlers.api.proto.v1.service.UpdateInstructionResponse> getUpdateInstructionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInstruction",
      requestType = com.hearlers.api.proto.v1.service.UpdateInstructionRequest.class,
      responseType = com.hearlers.api.proto.v1.service.UpdateInstructionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateInstructionRequest,
      com.hearlers.api.proto.v1.service.UpdateInstructionResponse> getUpdateInstructionMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateInstructionRequest, com.hearlers.api.proto.v1.service.UpdateInstructionResponse> getUpdateInstructionMethod;
    if ((getUpdateInstructionMethod = CounselServiceGrpc.getUpdateInstructionMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getUpdateInstructionMethod = CounselServiceGrpc.getUpdateInstructionMethod) == null) {
          CounselServiceGrpc.getUpdateInstructionMethod = getUpdateInstructionMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.UpdateInstructionRequest, com.hearlers.api.proto.v1.service.UpdateInstructionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInstruction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateInstructionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateInstructionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("UpdateInstruction"))
              .build();
        }
      }
    }
    return getUpdateInstructionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateInstructionItemRequest,
      com.hearlers.api.proto.v1.service.CreateInstructionItemResponse> getCreateInstructionItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateInstructionItem",
      requestType = com.hearlers.api.proto.v1.service.CreateInstructionItemRequest.class,
      responseType = com.hearlers.api.proto.v1.service.CreateInstructionItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateInstructionItemRequest,
      com.hearlers.api.proto.v1.service.CreateInstructionItemResponse> getCreateInstructionItemMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateInstructionItemRequest, com.hearlers.api.proto.v1.service.CreateInstructionItemResponse> getCreateInstructionItemMethod;
    if ((getCreateInstructionItemMethod = CounselServiceGrpc.getCreateInstructionItemMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getCreateInstructionItemMethod = CounselServiceGrpc.getCreateInstructionItemMethod) == null) {
          CounselServiceGrpc.getCreateInstructionItemMethod = getCreateInstructionItemMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreateInstructionItemRequest, com.hearlers.api.proto.v1.service.CreateInstructionItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateInstructionItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateInstructionItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateInstructionItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("CreateInstructionItem"))
              .build();
        }
      }
    }
    return getCreateInstructionItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindInstructionItemsRequest,
      com.hearlers.api.proto.v1.service.FindInstructionItemsResponse> getFindInstructionItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindInstructionItems",
      requestType = com.hearlers.api.proto.v1.service.FindInstructionItemsRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindInstructionItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindInstructionItemsRequest,
      com.hearlers.api.proto.v1.service.FindInstructionItemsResponse> getFindInstructionItemsMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindInstructionItemsRequest, com.hearlers.api.proto.v1.service.FindInstructionItemsResponse> getFindInstructionItemsMethod;
    if ((getFindInstructionItemsMethod = CounselServiceGrpc.getFindInstructionItemsMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getFindInstructionItemsMethod = CounselServiceGrpc.getFindInstructionItemsMethod) == null) {
          CounselServiceGrpc.getFindInstructionItemsMethod = getFindInstructionItemsMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindInstructionItemsRequest, com.hearlers.api.proto.v1.service.FindInstructionItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindInstructionItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindInstructionItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindInstructionItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("FindInstructionItems"))
              .build();
        }
      }
    }
    return getFindInstructionItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindInstructionItemByIdRequest,
      com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse> getFindInstructionItemByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindInstructionItemById",
      requestType = com.hearlers.api.proto.v1.service.FindInstructionItemByIdRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindInstructionItemByIdRequest,
      com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse> getFindInstructionItemByIdMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindInstructionItemByIdRequest, com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse> getFindInstructionItemByIdMethod;
    if ((getFindInstructionItemByIdMethod = CounselServiceGrpc.getFindInstructionItemByIdMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getFindInstructionItemByIdMethod = CounselServiceGrpc.getFindInstructionItemByIdMethod) == null) {
          CounselServiceGrpc.getFindInstructionItemByIdMethod = getFindInstructionItemByIdMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindInstructionItemByIdRequest, com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindInstructionItemById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindInstructionItemByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("FindInstructionItemById"))
              .build();
        }
      }
    }
    return getFindInstructionItemByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateInstructionItemRequest,
      com.hearlers.api.proto.v1.service.UpdateInstructionItemResponse> getUpdateInstructionItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInstructionItem",
      requestType = com.hearlers.api.proto.v1.service.UpdateInstructionItemRequest.class,
      responseType = com.hearlers.api.proto.v1.service.UpdateInstructionItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateInstructionItemRequest,
      com.hearlers.api.proto.v1.service.UpdateInstructionItemResponse> getUpdateInstructionItemMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateInstructionItemRequest, com.hearlers.api.proto.v1.service.UpdateInstructionItemResponse> getUpdateInstructionItemMethod;
    if ((getUpdateInstructionItemMethod = CounselServiceGrpc.getUpdateInstructionItemMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getUpdateInstructionItemMethod = CounselServiceGrpc.getUpdateInstructionItemMethod) == null) {
          CounselServiceGrpc.getUpdateInstructionItemMethod = getUpdateInstructionItemMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.UpdateInstructionItemRequest, com.hearlers.api.proto.v1.service.UpdateInstructionItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInstructionItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateInstructionItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateInstructionItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("UpdateInstructionItem"))
              .build();
        }
      }
    }
    return getUpdateInstructionItemMethod;
  }

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
    if ((getCreateToneMethod = CounselServiceGrpc.getCreateToneMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getCreateToneMethod = CounselServiceGrpc.getCreateToneMethod) == null) {
          CounselServiceGrpc.getCreateToneMethod = getCreateToneMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreateToneRequest, com.hearlers.api.proto.v1.service.CreateToneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateToneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateToneResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("CreateTone"))
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
    if ((getFindTonesMethod = CounselServiceGrpc.getFindTonesMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getFindTonesMethod = CounselServiceGrpc.getFindTonesMethod) == null) {
          CounselServiceGrpc.getFindTonesMethod = getFindTonesMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindTonesRequest, com.hearlers.api.proto.v1.service.FindTonesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindTones"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindTonesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindTonesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("FindTones"))
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
    if ((getFindToneByIdMethod = CounselServiceGrpc.getFindToneByIdMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getFindToneByIdMethod = CounselServiceGrpc.getFindToneByIdMethod) == null) {
          CounselServiceGrpc.getFindToneByIdMethod = getFindToneByIdMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindToneByIdRequest, com.hearlers.api.proto.v1.service.FindToneByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindToneById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindToneByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindToneByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("FindToneById"))
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
    if ((getUpdateToneMethod = CounselServiceGrpc.getUpdateToneMethod) == null) {
      synchronized (CounselServiceGrpc.class) {
        if ((getUpdateToneMethod = CounselServiceGrpc.getUpdateToneMethod) == null) {
          CounselServiceGrpc.getUpdateToneMethod = getUpdateToneMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.UpdateToneRequest, com.hearlers.api.proto.v1.service.UpdateToneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateToneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateToneResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselServiceMethodDescriptorSupplier("UpdateTone"))
              .build();
        }
      }
    }
    return getUpdateToneMethod;
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
     * <pre>
     * TODO: 상담사 별로 조회
     * </pre>
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
     * 상담 메시지 (상담 중 하나의 채팅팅)
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

    /**
     * <pre>
     * Persona
     * </pre>
     */
    default void createPersona(com.hearlers.api.proto.v1.service.CreatePersonaRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreatePersonaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePersonaMethod(), responseObserver);
    }

    /**
     */
    default void findPersonas(com.hearlers.api.proto.v1.service.FindPersonasRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindPersonasResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindPersonasMethod(), responseObserver);
    }

    /**
     */
    default void findPersonaById(com.hearlers.api.proto.v1.service.FindPersonaByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindPersonaByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindPersonaByIdMethod(), responseObserver);
    }

    /**
     */
    default void updatePersona(com.hearlers.api.proto.v1.service.UpdatePersonaRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdatePersonaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePersonaMethod(), responseObserver);
    }

    /**
     * <pre>
     * Context
     * </pre>
     */
    default void createContext(com.hearlers.api.proto.v1.service.CreateContextRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateContextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateContextMethod(), responseObserver);
    }

    /**
     */
    default void findContexts(com.hearlers.api.proto.v1.service.FindContextsRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindContextsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindContextsMethod(), responseObserver);
    }

    /**
     */
    default void findContextById(com.hearlers.api.proto.v1.service.FindContextByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindContextByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindContextByIdMethod(), responseObserver);
    }

    /**
     */
    default void updateContext(com.hearlers.api.proto.v1.service.UpdateContextRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateContextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateContextMethod(), responseObserver);
    }

    /**
     * <pre>
     * Instruction
     * </pre>
     */
    default void createInstruction(com.hearlers.api.proto.v1.service.CreateInstructionRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateInstructionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateInstructionMethod(), responseObserver);
    }

    /**
     */
    default void findInstructions(com.hearlers.api.proto.v1.service.FindInstructionsRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindInstructionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindInstructionsMethod(), responseObserver);
    }

    /**
     */
    default void findInstructionById(com.hearlers.api.proto.v1.service.FindInstructionByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindInstructionByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindInstructionByIdMethod(), responseObserver);
    }

    /**
     */
    default void updateInstruction(com.hearlers.api.proto.v1.service.UpdateInstructionRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateInstructionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateInstructionMethod(), responseObserver);
    }

    /**
     * <pre>
     * InstructionItem
     * </pre>
     */
    default void createInstructionItem(com.hearlers.api.proto.v1.service.CreateInstructionItemRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateInstructionItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateInstructionItemMethod(), responseObserver);
    }

    /**
     */
    default void findInstructionItems(com.hearlers.api.proto.v1.service.FindInstructionItemsRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindInstructionItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindInstructionItemsMethod(), responseObserver);
    }

    /**
     */
    default void findInstructionItemById(com.hearlers.api.proto.v1.service.FindInstructionItemByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindInstructionItemByIdMethod(), responseObserver);
    }

    /**
     */
    default void updateInstructionItem(com.hearlers.api.proto.v1.service.UpdateInstructionItemRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateInstructionItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateInstructionItemMethod(), responseObserver);
    }

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
     * <pre>
     * TODO: 상담사 별로 조회
     * </pre>
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
     * 상담 메시지 (상담 중 하나의 채팅팅)
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

    /**
     * <pre>
     * Persona
     * </pre>
     */
    public void createPersona(com.hearlers.api.proto.v1.service.CreatePersonaRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreatePersonaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePersonaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findPersonas(com.hearlers.api.proto.v1.service.FindPersonasRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindPersonasResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindPersonasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findPersonaById(com.hearlers.api.proto.v1.service.FindPersonaByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindPersonaByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindPersonaByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePersona(com.hearlers.api.proto.v1.service.UpdatePersonaRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdatePersonaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePersonaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Context
     * </pre>
     */
    public void createContext(com.hearlers.api.proto.v1.service.CreateContextRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateContextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findContexts(com.hearlers.api.proto.v1.service.FindContextsRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindContextsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindContextsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findContextById(com.hearlers.api.proto.v1.service.FindContextByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindContextByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindContextByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateContext(com.hearlers.api.proto.v1.service.UpdateContextRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateContextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Instruction
     * </pre>
     */
    public void createInstruction(com.hearlers.api.proto.v1.service.CreateInstructionRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateInstructionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateInstructionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findInstructions(com.hearlers.api.proto.v1.service.FindInstructionsRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindInstructionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindInstructionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findInstructionById(com.hearlers.api.proto.v1.service.FindInstructionByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindInstructionByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindInstructionByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateInstruction(com.hearlers.api.proto.v1.service.UpdateInstructionRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateInstructionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateInstructionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * InstructionItem
     * </pre>
     */
    public void createInstructionItem(com.hearlers.api.proto.v1.service.CreateInstructionItemRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateInstructionItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateInstructionItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findInstructionItems(com.hearlers.api.proto.v1.service.FindInstructionItemsRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindInstructionItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindInstructionItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findInstructionItemById(com.hearlers.api.proto.v1.service.FindInstructionItemByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindInstructionItemByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateInstructionItem(com.hearlers.api.proto.v1.service.UpdateInstructionItemRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateInstructionItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateInstructionItemMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * TODO: 상담사 별로 조회
     * </pre>
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
     * 상담 메시지 (상담 중 하나의 채팅팅)
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

    /**
     * <pre>
     * Persona
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreatePersonaResponse createPersona(com.hearlers.api.proto.v1.service.CreatePersonaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePersonaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindPersonasResponse findPersonas(com.hearlers.api.proto.v1.service.FindPersonasRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindPersonasMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindPersonaByIdResponse findPersonaById(com.hearlers.api.proto.v1.service.FindPersonaByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindPersonaByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdatePersonaResponse updatePersona(com.hearlers.api.proto.v1.service.UpdatePersonaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePersonaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Context
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateContextResponse createContext(com.hearlers.api.proto.v1.service.CreateContextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateContextMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindContextsResponse findContexts(com.hearlers.api.proto.v1.service.FindContextsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindContextsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindContextByIdResponse findContextById(com.hearlers.api.proto.v1.service.FindContextByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindContextByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdateContextResponse updateContext(com.hearlers.api.proto.v1.service.UpdateContextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateContextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Instruction
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateInstructionResponse createInstruction(com.hearlers.api.proto.v1.service.CreateInstructionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateInstructionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindInstructionsResponse findInstructions(com.hearlers.api.proto.v1.service.FindInstructionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindInstructionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindInstructionByIdResponse findInstructionById(com.hearlers.api.proto.v1.service.FindInstructionByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindInstructionByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdateInstructionResponse updateInstruction(com.hearlers.api.proto.v1.service.UpdateInstructionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateInstructionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * InstructionItem
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateInstructionItemResponse createInstructionItem(com.hearlers.api.proto.v1.service.CreateInstructionItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateInstructionItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindInstructionItemsResponse findInstructionItems(com.hearlers.api.proto.v1.service.FindInstructionItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindInstructionItemsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse findInstructionItemById(com.hearlers.api.proto.v1.service.FindInstructionItemByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindInstructionItemByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdateInstructionItemResponse updateInstructionItem(com.hearlers.api.proto.v1.service.UpdateInstructionItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateInstructionItemMethod(), getCallOptions(), request);
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
     * <pre>
     * TODO: 상담사 별로 조회
     * </pre>
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
     * 상담 메시지 (상담 중 하나의 채팅팅)
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

    /**
     * <pre>
     * Persona
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.CreatePersonaResponse> createPersona(
        com.hearlers.api.proto.v1.service.CreatePersonaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePersonaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindPersonasResponse> findPersonas(
        com.hearlers.api.proto.v1.service.FindPersonasRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindPersonasMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindPersonaByIdResponse> findPersonaById(
        com.hearlers.api.proto.v1.service.FindPersonaByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindPersonaByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.UpdatePersonaResponse> updatePersona(
        com.hearlers.api.proto.v1.service.UpdatePersonaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePersonaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Context
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.CreateContextResponse> createContext(
        com.hearlers.api.proto.v1.service.CreateContextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateContextMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindContextsResponse> findContexts(
        com.hearlers.api.proto.v1.service.FindContextsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindContextsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindContextByIdResponse> findContextById(
        com.hearlers.api.proto.v1.service.FindContextByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindContextByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.UpdateContextResponse> updateContext(
        com.hearlers.api.proto.v1.service.UpdateContextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateContextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Instruction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.CreateInstructionResponse> createInstruction(
        com.hearlers.api.proto.v1.service.CreateInstructionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateInstructionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindInstructionsResponse> findInstructions(
        com.hearlers.api.proto.v1.service.FindInstructionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindInstructionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindInstructionByIdResponse> findInstructionById(
        com.hearlers.api.proto.v1.service.FindInstructionByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindInstructionByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.UpdateInstructionResponse> updateInstruction(
        com.hearlers.api.proto.v1.service.UpdateInstructionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateInstructionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * InstructionItem
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.CreateInstructionItemResponse> createInstructionItem(
        com.hearlers.api.proto.v1.service.CreateInstructionItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateInstructionItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindInstructionItemsResponse> findInstructionItems(
        com.hearlers.api.proto.v1.service.FindInstructionItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindInstructionItemsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse> findInstructionItemById(
        com.hearlers.api.proto.v1.service.FindInstructionItemByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindInstructionItemByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.UpdateInstructionItemResponse> updateInstructionItem(
        com.hearlers.api.proto.v1.service.UpdateInstructionItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateInstructionItemMethod(), getCallOptions()), request);
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
  }

  private static final int METHODID_CREATE_COUNSEL = 0;
  private static final int METHODID_FIND_COUNSELS = 1;
  private static final int METHODID_FIND_COUNSEL_BY_ID = 2;
  private static final int METHODID_CREATE_MESSAGE = 3;
  private static final int METHODID_FIND_MESSAGES = 4;
  private static final int METHODID_REACT_MESSAGE = 5;
  private static final int METHODID_CREATE_COUNSELOR = 6;
  private static final int METHODID_FIND_COUNSELORS = 7;
  private static final int METHODID_FIND_COUNSELOR_BY_ID = 8;
  private static final int METHODID_UPDATE_COUNSELOR = 9;
  private static final int METHODID_FIND_COUNSELOR_USER_RELATIONSHIPS = 10;
  private static final int METHODID_CREATE_COUNSEL_TECHNIQUE = 11;
  private static final int METHODID_FIND_COUNSEL_TECHNIQUES = 12;
  private static final int METHODID_FIND_COUNSEL_TECHNIQUE_BY_ID = 13;
  private static final int METHODID_UPDATE_COUNSEL_TECHNIQUE = 14;
  private static final int METHODID_SAVE_COUNSEL_TECHNIQUE_SEQUENCE = 15;
  private static final int METHODID_CREATE_PERSONA = 16;
  private static final int METHODID_FIND_PERSONAS = 17;
  private static final int METHODID_FIND_PERSONA_BY_ID = 18;
  private static final int METHODID_UPDATE_PERSONA = 19;
  private static final int METHODID_CREATE_CONTEXT = 20;
  private static final int METHODID_FIND_CONTEXTS = 21;
  private static final int METHODID_FIND_CONTEXT_BY_ID = 22;
  private static final int METHODID_UPDATE_CONTEXT = 23;
  private static final int METHODID_CREATE_INSTRUCTION = 24;
  private static final int METHODID_FIND_INSTRUCTIONS = 25;
  private static final int METHODID_FIND_INSTRUCTION_BY_ID = 26;
  private static final int METHODID_UPDATE_INSTRUCTION = 27;
  private static final int METHODID_CREATE_INSTRUCTION_ITEM = 28;
  private static final int METHODID_FIND_INSTRUCTION_ITEMS = 29;
  private static final int METHODID_FIND_INSTRUCTION_ITEM_BY_ID = 30;
  private static final int METHODID_UPDATE_INSTRUCTION_ITEM = 31;
  private static final int METHODID_CREATE_TONE = 32;
  private static final int METHODID_FIND_TONES = 33;
  private static final int METHODID_FIND_TONE_BY_ID = 34;
  private static final int METHODID_UPDATE_TONE = 35;

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
        case METHODID_FIND_COUNSELOR_USER_RELATIONSHIPS:
          serviceImpl.findCounselorUserRelationships((com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsResponse>) responseObserver);
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
        case METHODID_CREATE_PERSONA:
          serviceImpl.createPersona((com.hearlers.api.proto.v1.service.CreatePersonaRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreatePersonaResponse>) responseObserver);
          break;
        case METHODID_FIND_PERSONAS:
          serviceImpl.findPersonas((com.hearlers.api.proto.v1.service.FindPersonasRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindPersonasResponse>) responseObserver);
          break;
        case METHODID_FIND_PERSONA_BY_ID:
          serviceImpl.findPersonaById((com.hearlers.api.proto.v1.service.FindPersonaByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindPersonaByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PERSONA:
          serviceImpl.updatePersona((com.hearlers.api.proto.v1.service.UpdatePersonaRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdatePersonaResponse>) responseObserver);
          break;
        case METHODID_CREATE_CONTEXT:
          serviceImpl.createContext((com.hearlers.api.proto.v1.service.CreateContextRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateContextResponse>) responseObserver);
          break;
        case METHODID_FIND_CONTEXTS:
          serviceImpl.findContexts((com.hearlers.api.proto.v1.service.FindContextsRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindContextsResponse>) responseObserver);
          break;
        case METHODID_FIND_CONTEXT_BY_ID:
          serviceImpl.findContextById((com.hearlers.api.proto.v1.service.FindContextByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindContextByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CONTEXT:
          serviceImpl.updateContext((com.hearlers.api.proto.v1.service.UpdateContextRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateContextResponse>) responseObserver);
          break;
        case METHODID_CREATE_INSTRUCTION:
          serviceImpl.createInstruction((com.hearlers.api.proto.v1.service.CreateInstructionRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateInstructionResponse>) responseObserver);
          break;
        case METHODID_FIND_INSTRUCTIONS:
          serviceImpl.findInstructions((com.hearlers.api.proto.v1.service.FindInstructionsRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindInstructionsResponse>) responseObserver);
          break;
        case METHODID_FIND_INSTRUCTION_BY_ID:
          serviceImpl.findInstructionById((com.hearlers.api.proto.v1.service.FindInstructionByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindInstructionByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_INSTRUCTION:
          serviceImpl.updateInstruction((com.hearlers.api.proto.v1.service.UpdateInstructionRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateInstructionResponse>) responseObserver);
          break;
        case METHODID_CREATE_INSTRUCTION_ITEM:
          serviceImpl.createInstructionItem((com.hearlers.api.proto.v1.service.CreateInstructionItemRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateInstructionItemResponse>) responseObserver);
          break;
        case METHODID_FIND_INSTRUCTION_ITEMS:
          serviceImpl.findInstructionItems((com.hearlers.api.proto.v1.service.FindInstructionItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindInstructionItemsResponse>) responseObserver);
          break;
        case METHODID_FIND_INSTRUCTION_ITEM_BY_ID:
          serviceImpl.findInstructionItemById((com.hearlers.api.proto.v1.service.FindInstructionItemByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_INSTRUCTION_ITEM:
          serviceImpl.updateInstructionItem((com.hearlers.api.proto.v1.service.UpdateInstructionItemRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateInstructionItemResponse>) responseObserver);
          break;
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
        .addMethod(
          getFindCounselorUserRelationshipsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest,
              com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsResponse>(
                service, METHODID_FIND_COUNSELOR_USER_RELATIONSHIPS)))
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
        .addMethod(
          getCreatePersonaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.CreatePersonaRequest,
              com.hearlers.api.proto.v1.service.CreatePersonaResponse>(
                service, METHODID_CREATE_PERSONA)))
        .addMethod(
          getFindPersonasMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindPersonasRequest,
              com.hearlers.api.proto.v1.service.FindPersonasResponse>(
                service, METHODID_FIND_PERSONAS)))
        .addMethod(
          getFindPersonaByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindPersonaByIdRequest,
              com.hearlers.api.proto.v1.service.FindPersonaByIdResponse>(
                service, METHODID_FIND_PERSONA_BY_ID)))
        .addMethod(
          getUpdatePersonaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.UpdatePersonaRequest,
              com.hearlers.api.proto.v1.service.UpdatePersonaResponse>(
                service, METHODID_UPDATE_PERSONA)))
        .addMethod(
          getCreateContextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.CreateContextRequest,
              com.hearlers.api.proto.v1.service.CreateContextResponse>(
                service, METHODID_CREATE_CONTEXT)))
        .addMethod(
          getFindContextsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindContextsRequest,
              com.hearlers.api.proto.v1.service.FindContextsResponse>(
                service, METHODID_FIND_CONTEXTS)))
        .addMethod(
          getFindContextByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindContextByIdRequest,
              com.hearlers.api.proto.v1.service.FindContextByIdResponse>(
                service, METHODID_FIND_CONTEXT_BY_ID)))
        .addMethod(
          getUpdateContextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.UpdateContextRequest,
              com.hearlers.api.proto.v1.service.UpdateContextResponse>(
                service, METHODID_UPDATE_CONTEXT)))
        .addMethod(
          getCreateInstructionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.CreateInstructionRequest,
              com.hearlers.api.proto.v1.service.CreateInstructionResponse>(
                service, METHODID_CREATE_INSTRUCTION)))
        .addMethod(
          getFindInstructionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindInstructionsRequest,
              com.hearlers.api.proto.v1.service.FindInstructionsResponse>(
                service, METHODID_FIND_INSTRUCTIONS)))
        .addMethod(
          getFindInstructionByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindInstructionByIdRequest,
              com.hearlers.api.proto.v1.service.FindInstructionByIdResponse>(
                service, METHODID_FIND_INSTRUCTION_BY_ID)))
        .addMethod(
          getUpdateInstructionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.UpdateInstructionRequest,
              com.hearlers.api.proto.v1.service.UpdateInstructionResponse>(
                service, METHODID_UPDATE_INSTRUCTION)))
        .addMethod(
          getCreateInstructionItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.CreateInstructionItemRequest,
              com.hearlers.api.proto.v1.service.CreateInstructionItemResponse>(
                service, METHODID_CREATE_INSTRUCTION_ITEM)))
        .addMethod(
          getFindInstructionItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindInstructionItemsRequest,
              com.hearlers.api.proto.v1.service.FindInstructionItemsResponse>(
                service, METHODID_FIND_INSTRUCTION_ITEMS)))
        .addMethod(
          getFindInstructionItemByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindInstructionItemByIdRequest,
              com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse>(
                service, METHODID_FIND_INSTRUCTION_ITEM_BY_ID)))
        .addMethod(
          getUpdateInstructionItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.UpdateInstructionItemRequest,
              com.hearlers.api.proto.v1.service.UpdateInstructionItemResponse>(
                service, METHODID_UPDATE_INSTRUCTION_ITEM)))
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
              .addMethod(getCreateCounselorMethod())
              .addMethod(getFindCounselorsMethod())
              .addMethod(getFindCounselorByIdMethod())
              .addMethod(getUpdateCounselorMethod())
              .addMethod(getFindCounselorUserRelationshipsMethod())
              .addMethod(getCreateCounselTechniqueMethod())
              .addMethod(getFindCounselTechniquesMethod())
              .addMethod(getFindCounselTechniqueByIdMethod())
              .addMethod(getUpdateCounselTechniqueMethod())
              .addMethod(getSaveCounselTechniqueSequenceMethod())
              .addMethod(getCreatePersonaMethod())
              .addMethod(getFindPersonasMethod())
              .addMethod(getFindPersonaByIdMethod())
              .addMethod(getUpdatePersonaMethod())
              .addMethod(getCreateContextMethod())
              .addMethod(getFindContextsMethod())
              .addMethod(getFindContextByIdMethod())
              .addMethod(getUpdateContextMethod())
              .addMethod(getCreateInstructionMethod())
              .addMethod(getFindInstructionsMethod())
              .addMethod(getFindInstructionByIdMethod())
              .addMethod(getUpdateInstructionMethod())
              .addMethod(getCreateInstructionItemMethod())
              .addMethod(getFindInstructionItemsMethod())
              .addMethod(getFindInstructionItemByIdMethod())
              .addMethod(getUpdateInstructionItemMethod())
              .addMethod(getCreateToneMethod())
              .addMethod(getFindTonesMethod())
              .addMethod(getFindToneByIdMethod())
              .addMethod(getUpdateToneMethod())
              .build();
        }
      }
    }
    return result;
  }
}
