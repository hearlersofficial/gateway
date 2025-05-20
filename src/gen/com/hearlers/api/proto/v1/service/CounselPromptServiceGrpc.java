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
  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindPromptVersionsRequest,
      com.hearlers.api.proto.v1.service.FindPromptVersionsResponse> getFindPromptVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindPromptVersions",
      requestType = com.hearlers.api.proto.v1.service.FindPromptVersionsRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindPromptVersionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindPromptVersionsRequest,
      com.hearlers.api.proto.v1.service.FindPromptVersionsResponse> getFindPromptVersionsMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindPromptVersionsRequest, com.hearlers.api.proto.v1.service.FindPromptVersionsResponse> getFindPromptVersionsMethod;
    if ((getFindPromptVersionsMethod = CounselPromptServiceGrpc.getFindPromptVersionsMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getFindPromptVersionsMethod = CounselPromptServiceGrpc.getFindPromptVersionsMethod) == null) {
          CounselPromptServiceGrpc.getFindPromptVersionsMethod = getFindPromptVersionsMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindPromptVersionsRequest, com.hearlers.api.proto.v1.service.FindPromptVersionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindPromptVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindPromptVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindPromptVersionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("FindPromptVersions"))
              .build();
        }
      }
    }
    return getFindPromptVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindPromptVersionByIdRequest,
      com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse> getFindPromptVersionByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindPromptVersionById",
      requestType = com.hearlers.api.proto.v1.service.FindPromptVersionByIdRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindPromptVersionByIdRequest,
      com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse> getFindPromptVersionByIdMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindPromptVersionByIdRequest, com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse> getFindPromptVersionByIdMethod;
    if ((getFindPromptVersionByIdMethod = CounselPromptServiceGrpc.getFindPromptVersionByIdMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getFindPromptVersionByIdMethod = CounselPromptServiceGrpc.getFindPromptVersionByIdMethod) == null) {
          CounselPromptServiceGrpc.getFindPromptVersionByIdMethod = getFindPromptVersionByIdMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindPromptVersionByIdRequest, com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindPromptVersionById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindPromptVersionByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("FindPromptVersionById"))
              .build();
        }
      }
    }
    return getFindPromptVersionByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindTemporaryVersionRequest,
      com.hearlers.api.proto.v1.service.FindTemporaryVersionResponse> getFindTemporaryVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindTemporaryVersion",
      requestType = com.hearlers.api.proto.v1.service.FindTemporaryVersionRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindTemporaryVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindTemporaryVersionRequest,
      com.hearlers.api.proto.v1.service.FindTemporaryVersionResponse> getFindTemporaryVersionMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindTemporaryVersionRequest, com.hearlers.api.proto.v1.service.FindTemporaryVersionResponse> getFindTemporaryVersionMethod;
    if ((getFindTemporaryVersionMethod = CounselPromptServiceGrpc.getFindTemporaryVersionMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getFindTemporaryVersionMethod = CounselPromptServiceGrpc.getFindTemporaryVersionMethod) == null) {
          CounselPromptServiceGrpc.getFindTemporaryVersionMethod = getFindTemporaryVersionMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindTemporaryVersionRequest, com.hearlers.api.proto.v1.service.FindTemporaryVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindTemporaryVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindTemporaryVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindTemporaryVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("FindTemporaryVersion"))
              .build();
        }
      }
    }
    return getFindTemporaryVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindActiveVersionRequest,
      com.hearlers.api.proto.v1.service.FindActiveVersionResponse> getFindActiveVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindActiveVersion",
      requestType = com.hearlers.api.proto.v1.service.FindActiveVersionRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindActiveVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindActiveVersionRequest,
      com.hearlers.api.proto.v1.service.FindActiveVersionResponse> getFindActiveVersionMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindActiveVersionRequest, com.hearlers.api.proto.v1.service.FindActiveVersionResponse> getFindActiveVersionMethod;
    if ((getFindActiveVersionMethod = CounselPromptServiceGrpc.getFindActiveVersionMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getFindActiveVersionMethod = CounselPromptServiceGrpc.getFindActiveVersionMethod) == null) {
          CounselPromptServiceGrpc.getFindActiveVersionMethod = getFindActiveVersionMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindActiveVersionRequest, com.hearlers.api.proto.v1.service.FindActiveVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindActiveVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindActiveVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindActiveVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("FindActiveVersion"))
              .build();
        }
      }
    }
    return getFindActiveVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.LoadExistingPromptVersionRequest,
      com.hearlers.api.proto.v1.service.LoadExistingPromptVersionResponse> getLoadExistingPromptVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoadExistingPromptVersion",
      requestType = com.hearlers.api.proto.v1.service.LoadExistingPromptVersionRequest.class,
      responseType = com.hearlers.api.proto.v1.service.LoadExistingPromptVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.LoadExistingPromptVersionRequest,
      com.hearlers.api.proto.v1.service.LoadExistingPromptVersionResponse> getLoadExistingPromptVersionMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.LoadExistingPromptVersionRequest, com.hearlers.api.proto.v1.service.LoadExistingPromptVersionResponse> getLoadExistingPromptVersionMethod;
    if ((getLoadExistingPromptVersionMethod = CounselPromptServiceGrpc.getLoadExistingPromptVersionMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getLoadExistingPromptVersionMethod = CounselPromptServiceGrpc.getLoadExistingPromptVersionMethod) == null) {
          CounselPromptServiceGrpc.getLoadExistingPromptVersionMethod = getLoadExistingPromptVersionMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.LoadExistingPromptVersionRequest, com.hearlers.api.proto.v1.service.LoadExistingPromptVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoadExistingPromptVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.LoadExistingPromptVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.LoadExistingPromptVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("LoadExistingPromptVersion"))
              .build();
        }
      }
    }
    return getLoadExistingPromptVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.SaveTemporaryVersionRequest,
      com.hearlers.api.proto.v1.service.SaveTemporaryVersionResponse> getSaveTemporaryVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveTemporaryVersion",
      requestType = com.hearlers.api.proto.v1.service.SaveTemporaryVersionRequest.class,
      responseType = com.hearlers.api.proto.v1.service.SaveTemporaryVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.SaveTemporaryVersionRequest,
      com.hearlers.api.proto.v1.service.SaveTemporaryVersionResponse> getSaveTemporaryVersionMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.SaveTemporaryVersionRequest, com.hearlers.api.proto.v1.service.SaveTemporaryVersionResponse> getSaveTemporaryVersionMethod;
    if ((getSaveTemporaryVersionMethod = CounselPromptServiceGrpc.getSaveTemporaryVersionMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getSaveTemporaryVersionMethod = CounselPromptServiceGrpc.getSaveTemporaryVersionMethod) == null) {
          CounselPromptServiceGrpc.getSaveTemporaryVersionMethod = getSaveTemporaryVersionMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.SaveTemporaryVersionRequest, com.hearlers.api.proto.v1.service.SaveTemporaryVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveTemporaryVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.SaveTemporaryVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.SaveTemporaryVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("SaveTemporaryVersion"))
              .build();
        }
      }
    }
    return getSaveTemporaryVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdatePromptVersionRequest,
      com.hearlers.api.proto.v1.service.UpdatePromptVersionResponse> getUpdatePromptVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePromptVersion",
      requestType = com.hearlers.api.proto.v1.service.UpdatePromptVersionRequest.class,
      responseType = com.hearlers.api.proto.v1.service.UpdatePromptVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdatePromptVersionRequest,
      com.hearlers.api.proto.v1.service.UpdatePromptVersionResponse> getUpdatePromptVersionMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdatePromptVersionRequest, com.hearlers.api.proto.v1.service.UpdatePromptVersionResponse> getUpdatePromptVersionMethod;
    if ((getUpdatePromptVersionMethod = CounselPromptServiceGrpc.getUpdatePromptVersionMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getUpdatePromptVersionMethod = CounselPromptServiceGrpc.getUpdatePromptVersionMethod) == null) {
          CounselPromptServiceGrpc.getUpdatePromptVersionMethod = getUpdatePromptVersionMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.UpdatePromptVersionRequest, com.hearlers.api.proto.v1.service.UpdatePromptVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePromptVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdatePromptVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdatePromptVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("UpdatePromptVersion"))
              .build();
        }
      }
    }
    return getUpdatePromptVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.ActivatePromptVersionRequest,
      com.hearlers.api.proto.v1.service.ActivatePromptVersionResponse> getActivatePromptVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivatePromptVersion",
      requestType = com.hearlers.api.proto.v1.service.ActivatePromptVersionRequest.class,
      responseType = com.hearlers.api.proto.v1.service.ActivatePromptVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.ActivatePromptVersionRequest,
      com.hearlers.api.proto.v1.service.ActivatePromptVersionResponse> getActivatePromptVersionMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.ActivatePromptVersionRequest, com.hearlers.api.proto.v1.service.ActivatePromptVersionResponse> getActivatePromptVersionMethod;
    if ((getActivatePromptVersionMethod = CounselPromptServiceGrpc.getActivatePromptVersionMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getActivatePromptVersionMethod = CounselPromptServiceGrpc.getActivatePromptVersionMethod) == null) {
          CounselPromptServiceGrpc.getActivatePromptVersionMethod = getActivatePromptVersionMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.ActivatePromptVersionRequest, com.hearlers.api.proto.v1.service.ActivatePromptVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActivatePromptVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.ActivatePromptVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.ActivatePromptVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("ActivatePromptVersion"))
              .build();
        }
      }
    }
    return getActivatePromptVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.DeletePromptVersionsRequest,
      com.hearlers.api.proto.v1.service.DeletePromptVersionsResponse> getDeletePromptVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePromptVersions",
      requestType = com.hearlers.api.proto.v1.service.DeletePromptVersionsRequest.class,
      responseType = com.hearlers.api.proto.v1.service.DeletePromptVersionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.DeletePromptVersionsRequest,
      com.hearlers.api.proto.v1.service.DeletePromptVersionsResponse> getDeletePromptVersionsMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.DeletePromptVersionsRequest, com.hearlers.api.proto.v1.service.DeletePromptVersionsResponse> getDeletePromptVersionsMethod;
    if ((getDeletePromptVersionsMethod = CounselPromptServiceGrpc.getDeletePromptVersionsMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getDeletePromptVersionsMethod = CounselPromptServiceGrpc.getDeletePromptVersionsMethod) == null) {
          CounselPromptServiceGrpc.getDeletePromptVersionsMethod = getDeletePromptVersionsMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.DeletePromptVersionsRequest, com.hearlers.api.proto.v1.service.DeletePromptVersionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePromptVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.DeletePromptVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.DeletePromptVersionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("DeletePromptVersions"))
              .build();
        }
      }
    }
    return getDeletePromptVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindPersonaPromptByIdRequest,
      com.hearlers.api.proto.v1.service.FindPersonaPromptByIdResponse> getFindPersonaPromptByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindPersonaPromptById",
      requestType = com.hearlers.api.proto.v1.service.FindPersonaPromptByIdRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindPersonaPromptByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindPersonaPromptByIdRequest,
      com.hearlers.api.proto.v1.service.FindPersonaPromptByIdResponse> getFindPersonaPromptByIdMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindPersonaPromptByIdRequest, com.hearlers.api.proto.v1.service.FindPersonaPromptByIdResponse> getFindPersonaPromptByIdMethod;
    if ((getFindPersonaPromptByIdMethod = CounselPromptServiceGrpc.getFindPersonaPromptByIdMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getFindPersonaPromptByIdMethod = CounselPromptServiceGrpc.getFindPersonaPromptByIdMethod) == null) {
          CounselPromptServiceGrpc.getFindPersonaPromptByIdMethod = getFindPersonaPromptByIdMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindPersonaPromptByIdRequest, com.hearlers.api.proto.v1.service.FindPersonaPromptByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindPersonaPromptById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindPersonaPromptByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindPersonaPromptByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("FindPersonaPromptById"))
              .build();
        }
      }
    }
    return getFindPersonaPromptByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdatePersonaPromptRequest,
      com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse> getUpdatePersonaPromptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePersonaPrompt",
      requestType = com.hearlers.api.proto.v1.service.UpdatePersonaPromptRequest.class,
      responseType = com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdatePersonaPromptRequest,
      com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse> getUpdatePersonaPromptMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdatePersonaPromptRequest, com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse> getUpdatePersonaPromptMethod;
    if ((getUpdatePersonaPromptMethod = CounselPromptServiceGrpc.getUpdatePersonaPromptMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getUpdatePersonaPromptMethod = CounselPromptServiceGrpc.getUpdatePersonaPromptMethod) == null) {
          CounselPromptServiceGrpc.getUpdatePersonaPromptMethod = getUpdatePersonaPromptMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.UpdatePersonaPromptRequest, com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePersonaPrompt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdatePersonaPromptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("UpdatePersonaPrompt"))
              .build();
        }
      }
    }
    return getUpdatePersonaPromptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindTonePromptByIdRequest,
      com.hearlers.api.proto.v1.service.FindTonePromptByIdResponse> getFindTonePromptByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindTonePromptById",
      requestType = com.hearlers.api.proto.v1.service.FindTonePromptByIdRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindTonePromptByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindTonePromptByIdRequest,
      com.hearlers.api.proto.v1.service.FindTonePromptByIdResponse> getFindTonePromptByIdMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindTonePromptByIdRequest, com.hearlers.api.proto.v1.service.FindTonePromptByIdResponse> getFindTonePromptByIdMethod;
    if ((getFindTonePromptByIdMethod = CounselPromptServiceGrpc.getFindTonePromptByIdMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getFindTonePromptByIdMethod = CounselPromptServiceGrpc.getFindTonePromptByIdMethod) == null) {
          CounselPromptServiceGrpc.getFindTonePromptByIdMethod = getFindTonePromptByIdMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindTonePromptByIdRequest, com.hearlers.api.proto.v1.service.FindTonePromptByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindTonePromptById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindTonePromptByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindTonePromptByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("FindTonePromptById"))
              .build();
        }
      }
    }
    return getFindTonePromptByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateTonePromptRequest,
      com.hearlers.api.proto.v1.service.UpdateTonePromptResponse> getUpdateTonePromptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTonePrompt",
      requestType = com.hearlers.api.proto.v1.service.UpdateTonePromptRequest.class,
      responseType = com.hearlers.api.proto.v1.service.UpdateTonePromptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateTonePromptRequest,
      com.hearlers.api.proto.v1.service.UpdateTonePromptResponse> getUpdateTonePromptMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateTonePromptRequest, com.hearlers.api.proto.v1.service.UpdateTonePromptResponse> getUpdateTonePromptMethod;
    if ((getUpdateTonePromptMethod = CounselPromptServiceGrpc.getUpdateTonePromptMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getUpdateTonePromptMethod = CounselPromptServiceGrpc.getUpdateTonePromptMethod) == null) {
          CounselPromptServiceGrpc.getUpdateTonePromptMethod = getUpdateTonePromptMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.UpdateTonePromptRequest, com.hearlers.api.proto.v1.service.UpdateTonePromptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTonePrompt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateTonePromptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateTonePromptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("UpdateTonePrompt"))
              .build();
        }
      }
    }
    return getUpdateTonePromptMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesRequest,
      com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesResponse> getFindOrderedCounselTechniquesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindOrderedCounselTechniques",
      requestType = com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesRequest,
      com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesResponse> getFindOrderedCounselTechniquesMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesRequest, com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesResponse> getFindOrderedCounselTechniquesMethod;
    if ((getFindOrderedCounselTechniquesMethod = CounselPromptServiceGrpc.getFindOrderedCounselTechniquesMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getFindOrderedCounselTechniquesMethod = CounselPromptServiceGrpc.getFindOrderedCounselTechniquesMethod) == null) {
          CounselPromptServiceGrpc.getFindOrderedCounselTechniquesMethod = getFindOrderedCounselTechniquesMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesRequest, com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindOrderedCounselTechniques"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("FindOrderedCounselTechniques"))
              .build();
        }
      }
    }
    return getFindOrderedCounselTechniquesMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesRequest,
      com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesResponse> getFindPromptActivateHistoriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindPromptActivateHistories",
      requestType = com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesRequest,
      com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesResponse> getFindPromptActivateHistoriesMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesRequest, com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesResponse> getFindPromptActivateHistoriesMethod;
    if ((getFindPromptActivateHistoriesMethod = CounselPromptServiceGrpc.getFindPromptActivateHistoriesMethod) == null) {
      synchronized (CounselPromptServiceGrpc.class) {
        if ((getFindPromptActivateHistoriesMethod = CounselPromptServiceGrpc.getFindPromptActivateHistoriesMethod) == null) {
          CounselPromptServiceGrpc.getFindPromptActivateHistoriesMethod = getFindPromptActivateHistoriesMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesRequest, com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindPromptActivateHistories"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselPromptServiceMethodDescriptorSupplier("FindPromptActivateHistories"))
              .build();
        }
      }
    }
    return getFindPromptActivateHistoriesMethod;
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
     * prompt version
     * </pre>
     */
    default void findPromptVersions(com.hearlers.api.proto.v1.service.FindPromptVersionsRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindPromptVersionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindPromptVersionsMethod(), responseObserver);
    }

    /**
     */
    default void findPromptVersionById(com.hearlers.api.proto.v1.service.FindPromptVersionByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindPromptVersionByIdMethod(), responseObserver);
    }

    /**
     */
    default void findTemporaryVersion(com.hearlers.api.proto.v1.service.FindTemporaryVersionRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindTemporaryVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindTemporaryVersionMethod(), responseObserver);
    }

    /**
     */
    default void findActiveVersion(com.hearlers.api.proto.v1.service.FindActiveVersionRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindActiveVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindActiveVersionMethod(), responseObserver);
    }

    /**
     */
    default void loadExistingPromptVersion(com.hearlers.api.proto.v1.service.LoadExistingPromptVersionRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.LoadExistingPromptVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoadExistingPromptVersionMethod(), responseObserver);
    }

    /**
     */
    default void saveTemporaryVersion(com.hearlers.api.proto.v1.service.SaveTemporaryVersionRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.SaveTemporaryVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveTemporaryVersionMethod(), responseObserver);
    }

    /**
     */
    default void updatePromptVersion(com.hearlers.api.proto.v1.service.UpdatePromptVersionRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdatePromptVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePromptVersionMethod(), responseObserver);
    }

    /**
     */
    default void activatePromptVersion(com.hearlers.api.proto.v1.service.ActivatePromptVersionRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.ActivatePromptVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivatePromptVersionMethod(), responseObserver);
    }

    /**
     */
    default void deletePromptVersions(com.hearlers.api.proto.v1.service.DeletePromptVersionsRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.DeletePromptVersionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePromptVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * persona prompt
     * </pre>
     */
    default void findPersonaPromptById(com.hearlers.api.proto.v1.service.FindPersonaPromptByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindPersonaPromptByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindPersonaPromptByIdMethod(), responseObserver);
    }

    /**
     */
    default void updatePersonaPrompt(com.hearlers.api.proto.v1.service.UpdatePersonaPromptRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePersonaPromptMethod(), responseObserver);
    }

    /**
     * <pre>
     * tone prompt
     * </pre>
     */
    default void findTonePromptById(com.hearlers.api.proto.v1.service.FindTonePromptByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindTonePromptByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindTonePromptByIdMethod(), responseObserver);
    }

    /**
     */
    default void updateTonePrompt(com.hearlers.api.proto.v1.service.UpdateTonePromptRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateTonePromptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTonePromptMethod(), responseObserver);
    }

    /**
     * <pre>
     * counsel technique
     * </pre>
     */
    default void createCounselTechnique(com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCounselTechniqueMethod(), responseObserver);
    }

    /**
     */
    default void findOrderedCounselTechniques(com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindOrderedCounselTechniquesMethod(), responseObserver);
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
     * prompt activate history
     * </pre>
     */
    default void findPromptActivateHistories(com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindPromptActivateHistoriesMethod(), responseObserver);
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
     * prompt version
     * </pre>
     */
    public void findPromptVersions(com.hearlers.api.proto.v1.service.FindPromptVersionsRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindPromptVersionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindPromptVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findPromptVersionById(com.hearlers.api.proto.v1.service.FindPromptVersionByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindPromptVersionByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findTemporaryVersion(com.hearlers.api.proto.v1.service.FindTemporaryVersionRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindTemporaryVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindTemporaryVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findActiveVersion(com.hearlers.api.proto.v1.service.FindActiveVersionRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindActiveVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindActiveVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loadExistingPromptVersion(com.hearlers.api.proto.v1.service.LoadExistingPromptVersionRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.LoadExistingPromptVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoadExistingPromptVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveTemporaryVersion(com.hearlers.api.proto.v1.service.SaveTemporaryVersionRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.SaveTemporaryVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveTemporaryVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePromptVersion(com.hearlers.api.proto.v1.service.UpdatePromptVersionRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdatePromptVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePromptVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void activatePromptVersion(com.hearlers.api.proto.v1.service.ActivatePromptVersionRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.ActivatePromptVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivatePromptVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePromptVersions(com.hearlers.api.proto.v1.service.DeletePromptVersionsRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.DeletePromptVersionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePromptVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * persona prompt
     * </pre>
     */
    public void findPersonaPromptById(com.hearlers.api.proto.v1.service.FindPersonaPromptByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindPersonaPromptByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindPersonaPromptByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePersonaPrompt(com.hearlers.api.proto.v1.service.UpdatePersonaPromptRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePersonaPromptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * tone prompt
     * </pre>
     */
    public void findTonePromptById(com.hearlers.api.proto.v1.service.FindTonePromptByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindTonePromptByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindTonePromptByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTonePrompt(com.hearlers.api.proto.v1.service.UpdateTonePromptRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateTonePromptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTonePromptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * counsel technique
     * </pre>
     */
    public void createCounselTechnique(com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCounselTechniqueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findOrderedCounselTechniques(com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindOrderedCounselTechniquesMethod(), getCallOptions()), request, responseObserver);
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
     * prompt activate history
     * </pre>
     */
    public void findPromptActivateHistories(com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindPromptActivateHistoriesMethod(), getCallOptions()), request, responseObserver);
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
     * prompt version
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.FindPromptVersionsResponse findPromptVersions(com.hearlers.api.proto.v1.service.FindPromptVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindPromptVersionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse findPromptVersionById(com.hearlers.api.proto.v1.service.FindPromptVersionByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindPromptVersionByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindTemporaryVersionResponse findTemporaryVersion(com.hearlers.api.proto.v1.service.FindTemporaryVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindTemporaryVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindActiveVersionResponse findActiveVersion(com.hearlers.api.proto.v1.service.FindActiveVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindActiveVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.LoadExistingPromptVersionResponse loadExistingPromptVersion(com.hearlers.api.proto.v1.service.LoadExistingPromptVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoadExistingPromptVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.SaveTemporaryVersionResponse saveTemporaryVersion(com.hearlers.api.proto.v1.service.SaveTemporaryVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveTemporaryVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdatePromptVersionResponse updatePromptVersion(com.hearlers.api.proto.v1.service.UpdatePromptVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePromptVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.ActivatePromptVersionResponse activatePromptVersion(com.hearlers.api.proto.v1.service.ActivatePromptVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivatePromptVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.DeletePromptVersionsResponse deletePromptVersions(com.hearlers.api.proto.v1.service.DeletePromptVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePromptVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * persona prompt
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.FindPersonaPromptByIdResponse findPersonaPromptById(com.hearlers.api.proto.v1.service.FindPersonaPromptByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindPersonaPromptByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse updatePersonaPrompt(com.hearlers.api.proto.v1.service.UpdatePersonaPromptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePersonaPromptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * tone prompt
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.FindTonePromptByIdResponse findTonePromptById(com.hearlers.api.proto.v1.service.FindTonePromptByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindTonePromptByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdateTonePromptResponse updateTonePrompt(com.hearlers.api.proto.v1.service.UpdateTonePromptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTonePromptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * counsel technique
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse createCounselTechnique(com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCounselTechniqueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesResponse findOrderedCounselTechniques(com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindOrderedCounselTechniquesMethod(), getCallOptions(), request);
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
     * prompt activate history
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesResponse findPromptActivateHistories(com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindPromptActivateHistoriesMethod(), getCallOptions(), request);
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
     * prompt version
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.FindPromptVersionsResponse findPromptVersions(com.hearlers.api.proto.v1.service.FindPromptVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindPromptVersionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse findPromptVersionById(com.hearlers.api.proto.v1.service.FindPromptVersionByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindPromptVersionByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindTemporaryVersionResponse findTemporaryVersion(com.hearlers.api.proto.v1.service.FindTemporaryVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindTemporaryVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindActiveVersionResponse findActiveVersion(com.hearlers.api.proto.v1.service.FindActiveVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindActiveVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.LoadExistingPromptVersionResponse loadExistingPromptVersion(com.hearlers.api.proto.v1.service.LoadExistingPromptVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoadExistingPromptVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.SaveTemporaryVersionResponse saveTemporaryVersion(com.hearlers.api.proto.v1.service.SaveTemporaryVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveTemporaryVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdatePromptVersionResponse updatePromptVersion(com.hearlers.api.proto.v1.service.UpdatePromptVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePromptVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.ActivatePromptVersionResponse activatePromptVersion(com.hearlers.api.proto.v1.service.ActivatePromptVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivatePromptVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.DeletePromptVersionsResponse deletePromptVersions(com.hearlers.api.proto.v1.service.DeletePromptVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePromptVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * persona prompt
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.FindPersonaPromptByIdResponse findPersonaPromptById(com.hearlers.api.proto.v1.service.FindPersonaPromptByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindPersonaPromptByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse updatePersonaPrompt(com.hearlers.api.proto.v1.service.UpdatePersonaPromptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePersonaPromptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * tone prompt
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.FindTonePromptByIdResponse findTonePromptById(com.hearlers.api.proto.v1.service.FindTonePromptByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindTonePromptByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdateTonePromptResponse updateTonePrompt(com.hearlers.api.proto.v1.service.UpdateTonePromptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTonePromptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * counsel technique
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse createCounselTechnique(com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCounselTechniqueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesResponse findOrderedCounselTechniques(com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindOrderedCounselTechniquesMethod(), getCallOptions(), request);
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
     * prompt activate history
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesResponse findPromptActivateHistories(com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindPromptActivateHistoriesMethod(), getCallOptions(), request);
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
     * prompt version
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindPromptVersionsResponse> findPromptVersions(
        com.hearlers.api.proto.v1.service.FindPromptVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindPromptVersionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse> findPromptVersionById(
        com.hearlers.api.proto.v1.service.FindPromptVersionByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindPromptVersionByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindTemporaryVersionResponse> findTemporaryVersion(
        com.hearlers.api.proto.v1.service.FindTemporaryVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindTemporaryVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindActiveVersionResponse> findActiveVersion(
        com.hearlers.api.proto.v1.service.FindActiveVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindActiveVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.LoadExistingPromptVersionResponse> loadExistingPromptVersion(
        com.hearlers.api.proto.v1.service.LoadExistingPromptVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoadExistingPromptVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.SaveTemporaryVersionResponse> saveTemporaryVersion(
        com.hearlers.api.proto.v1.service.SaveTemporaryVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveTemporaryVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.UpdatePromptVersionResponse> updatePromptVersion(
        com.hearlers.api.proto.v1.service.UpdatePromptVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePromptVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.ActivatePromptVersionResponse> activatePromptVersion(
        com.hearlers.api.proto.v1.service.ActivatePromptVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivatePromptVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.DeletePromptVersionsResponse> deletePromptVersions(
        com.hearlers.api.proto.v1.service.DeletePromptVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePromptVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * persona prompt
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindPersonaPromptByIdResponse> findPersonaPromptById(
        com.hearlers.api.proto.v1.service.FindPersonaPromptByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindPersonaPromptByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse> updatePersonaPrompt(
        com.hearlers.api.proto.v1.service.UpdatePersonaPromptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePersonaPromptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * tone prompt
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindTonePromptByIdResponse> findTonePromptById(
        com.hearlers.api.proto.v1.service.FindTonePromptByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindTonePromptByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.UpdateTonePromptResponse> updateTonePrompt(
        com.hearlers.api.proto.v1.service.UpdateTonePromptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTonePromptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * counsel technique
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse> createCounselTechnique(
        com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCounselTechniqueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesResponse> findOrderedCounselTechniques(
        com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindOrderedCounselTechniquesMethod(), getCallOptions()), request);
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
     * prompt activate history
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesResponse> findPromptActivateHistories(
        com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindPromptActivateHistoriesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_PROMPT_VERSIONS = 0;
  private static final int METHODID_FIND_PROMPT_VERSION_BY_ID = 1;
  private static final int METHODID_FIND_TEMPORARY_VERSION = 2;
  private static final int METHODID_FIND_ACTIVE_VERSION = 3;
  private static final int METHODID_LOAD_EXISTING_PROMPT_VERSION = 4;
  private static final int METHODID_SAVE_TEMPORARY_VERSION = 5;
  private static final int METHODID_UPDATE_PROMPT_VERSION = 6;
  private static final int METHODID_ACTIVATE_PROMPT_VERSION = 7;
  private static final int METHODID_DELETE_PROMPT_VERSIONS = 8;
  private static final int METHODID_FIND_PERSONA_PROMPT_BY_ID = 9;
  private static final int METHODID_UPDATE_PERSONA_PROMPT = 10;
  private static final int METHODID_FIND_TONE_PROMPT_BY_ID = 11;
  private static final int METHODID_UPDATE_TONE_PROMPT = 12;
  private static final int METHODID_CREATE_COUNSEL_TECHNIQUE = 13;
  private static final int METHODID_FIND_ORDERED_COUNSEL_TECHNIQUES = 14;
  private static final int METHODID_FIND_COUNSEL_TECHNIQUE_BY_ID = 15;
  private static final int METHODID_UPDATE_COUNSEL_TECHNIQUE = 16;
  private static final int METHODID_SAVE_COUNSEL_TECHNIQUE_SEQUENCE = 17;
  private static final int METHODID_FIND_PROMPT_ACTIVATE_HISTORIES = 18;

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
        case METHODID_FIND_PROMPT_VERSIONS:
          serviceImpl.findPromptVersions((com.hearlers.api.proto.v1.service.FindPromptVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindPromptVersionsResponse>) responseObserver);
          break;
        case METHODID_FIND_PROMPT_VERSION_BY_ID:
          serviceImpl.findPromptVersionById((com.hearlers.api.proto.v1.service.FindPromptVersionByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse>) responseObserver);
          break;
        case METHODID_FIND_TEMPORARY_VERSION:
          serviceImpl.findTemporaryVersion((com.hearlers.api.proto.v1.service.FindTemporaryVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindTemporaryVersionResponse>) responseObserver);
          break;
        case METHODID_FIND_ACTIVE_VERSION:
          serviceImpl.findActiveVersion((com.hearlers.api.proto.v1.service.FindActiveVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindActiveVersionResponse>) responseObserver);
          break;
        case METHODID_LOAD_EXISTING_PROMPT_VERSION:
          serviceImpl.loadExistingPromptVersion((com.hearlers.api.proto.v1.service.LoadExistingPromptVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.LoadExistingPromptVersionResponse>) responseObserver);
          break;
        case METHODID_SAVE_TEMPORARY_VERSION:
          serviceImpl.saveTemporaryVersion((com.hearlers.api.proto.v1.service.SaveTemporaryVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.SaveTemporaryVersionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROMPT_VERSION:
          serviceImpl.updatePromptVersion((com.hearlers.api.proto.v1.service.UpdatePromptVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdatePromptVersionResponse>) responseObserver);
          break;
        case METHODID_ACTIVATE_PROMPT_VERSION:
          serviceImpl.activatePromptVersion((com.hearlers.api.proto.v1.service.ActivatePromptVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.ActivatePromptVersionResponse>) responseObserver);
          break;
        case METHODID_DELETE_PROMPT_VERSIONS:
          serviceImpl.deletePromptVersions((com.hearlers.api.proto.v1.service.DeletePromptVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.DeletePromptVersionsResponse>) responseObserver);
          break;
        case METHODID_FIND_PERSONA_PROMPT_BY_ID:
          serviceImpl.findPersonaPromptById((com.hearlers.api.proto.v1.service.FindPersonaPromptByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindPersonaPromptByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PERSONA_PROMPT:
          serviceImpl.updatePersonaPrompt((com.hearlers.api.proto.v1.service.UpdatePersonaPromptRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse>) responseObserver);
          break;
        case METHODID_FIND_TONE_PROMPT_BY_ID:
          serviceImpl.findTonePromptById((com.hearlers.api.proto.v1.service.FindTonePromptByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindTonePromptByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TONE_PROMPT:
          serviceImpl.updateTonePrompt((com.hearlers.api.proto.v1.service.UpdateTonePromptRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateTonePromptResponse>) responseObserver);
          break;
        case METHODID_CREATE_COUNSEL_TECHNIQUE:
          serviceImpl.createCounselTechnique((com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse>) responseObserver);
          break;
        case METHODID_FIND_ORDERED_COUNSEL_TECHNIQUES:
          serviceImpl.findOrderedCounselTechniques((com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesResponse>) responseObserver);
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
        case METHODID_FIND_PROMPT_ACTIVATE_HISTORIES:
          serviceImpl.findPromptActivateHistories((com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesResponse>) responseObserver);
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
          getFindPromptVersionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindPromptVersionsRequest,
              com.hearlers.api.proto.v1.service.FindPromptVersionsResponse>(
                service, METHODID_FIND_PROMPT_VERSIONS)))
        .addMethod(
          getFindPromptVersionByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindPromptVersionByIdRequest,
              com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse>(
                service, METHODID_FIND_PROMPT_VERSION_BY_ID)))
        .addMethod(
          getFindTemporaryVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindTemporaryVersionRequest,
              com.hearlers.api.proto.v1.service.FindTemporaryVersionResponse>(
                service, METHODID_FIND_TEMPORARY_VERSION)))
        .addMethod(
          getFindActiveVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindActiveVersionRequest,
              com.hearlers.api.proto.v1.service.FindActiveVersionResponse>(
                service, METHODID_FIND_ACTIVE_VERSION)))
        .addMethod(
          getLoadExistingPromptVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.LoadExistingPromptVersionRequest,
              com.hearlers.api.proto.v1.service.LoadExistingPromptVersionResponse>(
                service, METHODID_LOAD_EXISTING_PROMPT_VERSION)))
        .addMethod(
          getSaveTemporaryVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.SaveTemporaryVersionRequest,
              com.hearlers.api.proto.v1.service.SaveTemporaryVersionResponse>(
                service, METHODID_SAVE_TEMPORARY_VERSION)))
        .addMethod(
          getUpdatePromptVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.UpdatePromptVersionRequest,
              com.hearlers.api.proto.v1.service.UpdatePromptVersionResponse>(
                service, METHODID_UPDATE_PROMPT_VERSION)))
        .addMethod(
          getActivatePromptVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.ActivatePromptVersionRequest,
              com.hearlers.api.proto.v1.service.ActivatePromptVersionResponse>(
                service, METHODID_ACTIVATE_PROMPT_VERSION)))
        .addMethod(
          getDeletePromptVersionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.DeletePromptVersionsRequest,
              com.hearlers.api.proto.v1.service.DeletePromptVersionsResponse>(
                service, METHODID_DELETE_PROMPT_VERSIONS)))
        .addMethod(
          getFindPersonaPromptByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindPersonaPromptByIdRequest,
              com.hearlers.api.proto.v1.service.FindPersonaPromptByIdResponse>(
                service, METHODID_FIND_PERSONA_PROMPT_BY_ID)))
        .addMethod(
          getUpdatePersonaPromptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.UpdatePersonaPromptRequest,
              com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse>(
                service, METHODID_UPDATE_PERSONA_PROMPT)))
        .addMethod(
          getFindTonePromptByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindTonePromptByIdRequest,
              com.hearlers.api.proto.v1.service.FindTonePromptByIdResponse>(
                service, METHODID_FIND_TONE_PROMPT_BY_ID)))
        .addMethod(
          getUpdateTonePromptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.UpdateTonePromptRequest,
              com.hearlers.api.proto.v1.service.UpdateTonePromptResponse>(
                service, METHODID_UPDATE_TONE_PROMPT)))
        .addMethod(
          getCreateCounselTechniqueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.CreateCounselTechniqueRequest,
              com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse>(
                service, METHODID_CREATE_COUNSEL_TECHNIQUE)))
        .addMethod(
          getFindOrderedCounselTechniquesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesRequest,
              com.hearlers.api.proto.v1.service.FindOrderedCounselTechniquesResponse>(
                service, METHODID_FIND_ORDERED_COUNSEL_TECHNIQUES)))
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
          getFindPromptActivateHistoriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesRequest,
              com.hearlers.api.proto.v1.service.FindPromptActivateHistoriesResponse>(
                service, METHODID_FIND_PROMPT_ACTIVATE_HISTORIES)))
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
              .addMethod(getFindPromptVersionsMethod())
              .addMethod(getFindPromptVersionByIdMethod())
              .addMethod(getFindTemporaryVersionMethod())
              .addMethod(getFindActiveVersionMethod())
              .addMethod(getLoadExistingPromptVersionMethod())
              .addMethod(getSaveTemporaryVersionMethod())
              .addMethod(getUpdatePromptVersionMethod())
              .addMethod(getActivatePromptVersionMethod())
              .addMethod(getDeletePromptVersionsMethod())
              .addMethod(getFindPersonaPromptByIdMethod())
              .addMethod(getUpdatePersonaPromptMethod())
              .addMethod(getFindTonePromptByIdMethod())
              .addMethod(getUpdateTonePromptMethod())
              .addMethod(getCreateCounselTechniqueMethod())
              .addMethod(getFindOrderedCounselTechniquesMethod())
              .addMethod(getFindCounselTechniqueByIdMethod())
              .addMethod(getUpdateCounselTechniqueMethod())
              .addMethod(getSaveCounselTechniqueSequenceMethod())
              .addMethod(getFindPromptActivateHistoriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
