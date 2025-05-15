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

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlRequest,
      com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlResponse> getGenerateCounselorImageUrlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateCounselorImageUrl",
      requestType = com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlRequest.class,
      responseType = com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlRequest,
      com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlResponse> getGenerateCounselorImageUrlMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlRequest, com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlResponse> getGenerateCounselorImageUrlMethod;
    if ((getGenerateCounselorImageUrlMethod = CounselorServiceGrpc.getGenerateCounselorImageUrlMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getGenerateCounselorImageUrlMethod = CounselorServiceGrpc.getGenerateCounselorImageUrlMethod) == null) {
          CounselorServiceGrpc.getGenerateCounselorImageUrlMethod = getGenerateCounselorImageUrlMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlRequest, com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateCounselorImageUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("GenerateCounselorImageUrl"))
              .build();
        }
      }
    }
    return getGenerateCounselorImageUrlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateBubbleRequest,
      com.hearlers.api.proto.v1.service.CreateBubbleResponse> getCreateBubbleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBubble",
      requestType = com.hearlers.api.proto.v1.service.CreateBubbleRequest.class,
      responseType = com.hearlers.api.proto.v1.service.CreateBubbleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateBubbleRequest,
      com.hearlers.api.proto.v1.service.CreateBubbleResponse> getCreateBubbleMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateBubbleRequest, com.hearlers.api.proto.v1.service.CreateBubbleResponse> getCreateBubbleMethod;
    if ((getCreateBubbleMethod = CounselorServiceGrpc.getCreateBubbleMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getCreateBubbleMethod = CounselorServiceGrpc.getCreateBubbleMethod) == null) {
          CounselorServiceGrpc.getCreateBubbleMethod = getCreateBubbleMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreateBubbleRequest, com.hearlers.api.proto.v1.service.CreateBubbleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBubble"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateBubbleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateBubbleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("CreateBubble"))
              .build();
        }
      }
    }
    return getCreateBubbleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindBubblesRequest,
      com.hearlers.api.proto.v1.service.FindBubblesResponse> getFindBubblesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindBubbles",
      requestType = com.hearlers.api.proto.v1.service.FindBubblesRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindBubblesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindBubblesRequest,
      com.hearlers.api.proto.v1.service.FindBubblesResponse> getFindBubblesMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindBubblesRequest, com.hearlers.api.proto.v1.service.FindBubblesResponse> getFindBubblesMethod;
    if ((getFindBubblesMethod = CounselorServiceGrpc.getFindBubblesMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getFindBubblesMethod = CounselorServiceGrpc.getFindBubblesMethod) == null) {
          CounselorServiceGrpc.getFindBubblesMethod = getFindBubblesMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindBubblesRequest, com.hearlers.api.proto.v1.service.FindBubblesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindBubbles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindBubblesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindBubblesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("FindBubbles"))
              .build();
        }
      }
    }
    return getFindBubblesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindBubbleByIdRequest,
      com.hearlers.api.proto.v1.service.FindBubbleByIdResponse> getFindBubbleByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindBubbleById",
      requestType = com.hearlers.api.proto.v1.service.FindBubbleByIdRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindBubbleByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindBubbleByIdRequest,
      com.hearlers.api.proto.v1.service.FindBubbleByIdResponse> getFindBubbleByIdMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindBubbleByIdRequest, com.hearlers.api.proto.v1.service.FindBubbleByIdResponse> getFindBubbleByIdMethod;
    if ((getFindBubbleByIdMethod = CounselorServiceGrpc.getFindBubbleByIdMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getFindBubbleByIdMethod = CounselorServiceGrpc.getFindBubbleByIdMethod) == null) {
          CounselorServiceGrpc.getFindBubbleByIdMethod = getFindBubbleByIdMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindBubbleByIdRequest, com.hearlers.api.proto.v1.service.FindBubbleByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindBubbleById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindBubbleByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindBubbleByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("FindBubbleById"))
              .build();
        }
      }
    }
    return getFindBubbleByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindRandomBubbleRequest,
      com.hearlers.api.proto.v1.service.FindRandomBubbleResponse> getFindRandomBubbleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindRandomBubble",
      requestType = com.hearlers.api.proto.v1.service.FindRandomBubbleRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindRandomBubbleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindRandomBubbleRequest,
      com.hearlers.api.proto.v1.service.FindRandomBubbleResponse> getFindRandomBubbleMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindRandomBubbleRequest, com.hearlers.api.proto.v1.service.FindRandomBubbleResponse> getFindRandomBubbleMethod;
    if ((getFindRandomBubbleMethod = CounselorServiceGrpc.getFindRandomBubbleMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getFindRandomBubbleMethod = CounselorServiceGrpc.getFindRandomBubbleMethod) == null) {
          CounselorServiceGrpc.getFindRandomBubbleMethod = getFindRandomBubbleMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindRandomBubbleRequest, com.hearlers.api.proto.v1.service.FindRandomBubbleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindRandomBubble"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindRandomBubbleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindRandomBubbleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("FindRandomBubble"))
              .build();
        }
      }
    }
    return getFindRandomBubbleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateBubbleRequest,
      com.hearlers.api.proto.v1.service.UpdateBubbleResponse> getUpdateBubbleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBubble",
      requestType = com.hearlers.api.proto.v1.service.UpdateBubbleRequest.class,
      responseType = com.hearlers.api.proto.v1.service.UpdateBubbleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateBubbleRequest,
      com.hearlers.api.proto.v1.service.UpdateBubbleResponse> getUpdateBubbleMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateBubbleRequest, com.hearlers.api.proto.v1.service.UpdateBubbleResponse> getUpdateBubbleMethod;
    if ((getUpdateBubbleMethod = CounselorServiceGrpc.getUpdateBubbleMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getUpdateBubbleMethod = CounselorServiceGrpc.getUpdateBubbleMethod) == null) {
          CounselorServiceGrpc.getUpdateBubbleMethod = getUpdateBubbleMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.UpdateBubbleRequest, com.hearlers.api.proto.v1.service.UpdateBubbleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBubble"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateBubbleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateBubbleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("UpdateBubble"))
              .build();
        }
      }
    }
    return getUpdateBubbleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.DeleteBubbleRequest,
      com.hearlers.api.proto.v1.service.DeleteBubbleResponse> getDeleteBubbleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBubble",
      requestType = com.hearlers.api.proto.v1.service.DeleteBubbleRequest.class,
      responseType = com.hearlers.api.proto.v1.service.DeleteBubbleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.DeleteBubbleRequest,
      com.hearlers.api.proto.v1.service.DeleteBubbleResponse> getDeleteBubbleMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.DeleteBubbleRequest, com.hearlers.api.proto.v1.service.DeleteBubbleResponse> getDeleteBubbleMethod;
    if ((getDeleteBubbleMethod = CounselorServiceGrpc.getDeleteBubbleMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getDeleteBubbleMethod = CounselorServiceGrpc.getDeleteBubbleMethod) == null) {
          CounselorServiceGrpc.getDeleteBubbleMethod = getDeleteBubbleMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.DeleteBubbleRequest, com.hearlers.api.proto.v1.service.DeleteBubbleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBubble"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.DeleteBubbleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.DeleteBubbleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("DeleteBubble"))
              .build();
        }
      }
    }
    return getDeleteBubbleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateEpisodeRequest,
      com.hearlers.api.proto.v1.service.CreateEpisodeResponse> getCreateEpisodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEpisode",
      requestType = com.hearlers.api.proto.v1.service.CreateEpisodeRequest.class,
      responseType = com.hearlers.api.proto.v1.service.CreateEpisodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateEpisodeRequest,
      com.hearlers.api.proto.v1.service.CreateEpisodeResponse> getCreateEpisodeMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.CreateEpisodeRequest, com.hearlers.api.proto.v1.service.CreateEpisodeResponse> getCreateEpisodeMethod;
    if ((getCreateEpisodeMethod = CounselorServiceGrpc.getCreateEpisodeMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getCreateEpisodeMethod = CounselorServiceGrpc.getCreateEpisodeMethod) == null) {
          CounselorServiceGrpc.getCreateEpisodeMethod = getCreateEpisodeMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreateEpisodeRequest, com.hearlers.api.proto.v1.service.CreateEpisodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEpisode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateEpisodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateEpisodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("CreateEpisode"))
              .build();
        }
      }
    }
    return getCreateEpisodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindEpisodesRequest,
      com.hearlers.api.proto.v1.service.FindEpisodesResponse> getFindEpisodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindEpisodes",
      requestType = com.hearlers.api.proto.v1.service.FindEpisodesRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindEpisodesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindEpisodesRequest,
      com.hearlers.api.proto.v1.service.FindEpisodesResponse> getFindEpisodesMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindEpisodesRequest, com.hearlers.api.proto.v1.service.FindEpisodesResponse> getFindEpisodesMethod;
    if ((getFindEpisodesMethod = CounselorServiceGrpc.getFindEpisodesMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getFindEpisodesMethod = CounselorServiceGrpc.getFindEpisodesMethod) == null) {
          CounselorServiceGrpc.getFindEpisodesMethod = getFindEpisodesMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindEpisodesRequest, com.hearlers.api.proto.v1.service.FindEpisodesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindEpisodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindEpisodesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindEpisodesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("FindEpisodes"))
              .build();
        }
      }
    }
    return getFindEpisodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest,
      com.hearlers.api.proto.v1.service.FindEpisodeByIdResponse> getFindEpisodeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindEpisodeById",
      requestType = com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest.class,
      responseType = com.hearlers.api.proto.v1.service.FindEpisodeByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest,
      com.hearlers.api.proto.v1.service.FindEpisodeByIdResponse> getFindEpisodeByIdMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest, com.hearlers.api.proto.v1.service.FindEpisodeByIdResponse> getFindEpisodeByIdMethod;
    if ((getFindEpisodeByIdMethod = CounselorServiceGrpc.getFindEpisodeByIdMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getFindEpisodeByIdMethod = CounselorServiceGrpc.getFindEpisodeByIdMethod) == null) {
          CounselorServiceGrpc.getFindEpisodeByIdMethod = getFindEpisodeByIdMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest, com.hearlers.api.proto.v1.service.FindEpisodeByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindEpisodeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindEpisodeByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("FindEpisodeById"))
              .build();
        }
      }
    }
    return getFindEpisodeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateEpisodeRequest,
      com.hearlers.api.proto.v1.service.UpdateEpisodeResponse> getUpdateEpisodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEpisode",
      requestType = com.hearlers.api.proto.v1.service.UpdateEpisodeRequest.class,
      responseType = com.hearlers.api.proto.v1.service.UpdateEpisodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateEpisodeRequest,
      com.hearlers.api.proto.v1.service.UpdateEpisodeResponse> getUpdateEpisodeMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.UpdateEpisodeRequest, com.hearlers.api.proto.v1.service.UpdateEpisodeResponse> getUpdateEpisodeMethod;
    if ((getUpdateEpisodeMethod = CounselorServiceGrpc.getUpdateEpisodeMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getUpdateEpisodeMethod = CounselorServiceGrpc.getUpdateEpisodeMethod) == null) {
          CounselorServiceGrpc.getUpdateEpisodeMethod = getUpdateEpisodeMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.UpdateEpisodeRequest, com.hearlers.api.proto.v1.service.UpdateEpisodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEpisode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateEpisodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateEpisodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("UpdateEpisode"))
              .build();
        }
      }
    }
    return getUpdateEpisodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlRequest,
      com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlResponse> getGenerateCutSceneImageUrlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateCutSceneImageUrl",
      requestType = com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlRequest.class,
      responseType = com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlRequest,
      com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlResponse> getGenerateCutSceneImageUrlMethod() {
    io.grpc.MethodDescriptor<com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlRequest, com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlResponse> getGenerateCutSceneImageUrlMethod;
    if ((getGenerateCutSceneImageUrlMethod = CounselorServiceGrpc.getGenerateCutSceneImageUrlMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getGenerateCutSceneImageUrlMethod = CounselorServiceGrpc.getGenerateCutSceneImageUrlMethod) == null) {
          CounselorServiceGrpc.getGenerateCutSceneImageUrlMethod = getGenerateCutSceneImageUrlMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlRequest, com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateCutSceneImageUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("GenerateCutSceneImageUrl"))
              .build();
        }
      }
    }
    return getGenerateCutSceneImageUrlMethod;
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
    if ((getCreateToneMethod = CounselorServiceGrpc.getCreateToneMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getCreateToneMethod = CounselorServiceGrpc.getCreateToneMethod) == null) {
          CounselorServiceGrpc.getCreateToneMethod = getCreateToneMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.CreateToneRequest, com.hearlers.api.proto.v1.service.CreateToneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateToneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.CreateToneResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("CreateTone"))
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
    if ((getFindTonesMethod = CounselorServiceGrpc.getFindTonesMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getFindTonesMethod = CounselorServiceGrpc.getFindTonesMethod) == null) {
          CounselorServiceGrpc.getFindTonesMethod = getFindTonesMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindTonesRequest, com.hearlers.api.proto.v1.service.FindTonesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindTones"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindTonesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindTonesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("FindTones"))
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
    if ((getFindToneByIdMethod = CounselorServiceGrpc.getFindToneByIdMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getFindToneByIdMethod = CounselorServiceGrpc.getFindToneByIdMethod) == null) {
          CounselorServiceGrpc.getFindToneByIdMethod = getFindToneByIdMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.FindToneByIdRequest, com.hearlers.api.proto.v1.service.FindToneByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindToneById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindToneByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.FindToneByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("FindToneById"))
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
    if ((getUpdateToneMethod = CounselorServiceGrpc.getUpdateToneMethod) == null) {
      synchronized (CounselorServiceGrpc.class) {
        if ((getUpdateToneMethod = CounselorServiceGrpc.getUpdateToneMethod) == null) {
          CounselorServiceGrpc.getUpdateToneMethod = getUpdateToneMethod =
              io.grpc.MethodDescriptor.<com.hearlers.api.proto.v1.service.UpdateToneRequest, com.hearlers.api.proto.v1.service.UpdateToneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateToneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hearlers.api.proto.v1.service.UpdateToneResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounselorServiceMethodDescriptorSupplier("UpdateTone"))
              .build();
        }
      }
    }
    return getUpdateToneMethod;
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

    /**
     */
    default void generateCounselorImageUrl(com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateCounselorImageUrlMethod(), responseObserver);
    }

    /**
     * <pre>
     * 버블
     * </pre>
     */
    default void createBubble(com.hearlers.api.proto.v1.service.CreateBubbleRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateBubbleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBubbleMethod(), responseObserver);
    }

    /**
     */
    default void findBubbles(com.hearlers.api.proto.v1.service.FindBubblesRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindBubblesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindBubblesMethod(), responseObserver);
    }

    /**
     */
    default void findBubbleById(com.hearlers.api.proto.v1.service.FindBubbleByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindBubbleByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindBubbleByIdMethod(), responseObserver);
    }

    /**
     */
    default void findRandomBubble(com.hearlers.api.proto.v1.service.FindRandomBubbleRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindRandomBubbleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindRandomBubbleMethod(), responseObserver);
    }

    /**
     */
    default void updateBubble(com.hearlers.api.proto.v1.service.UpdateBubbleRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateBubbleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBubbleMethod(), responseObserver);
    }

    /**
     */
    default void deleteBubble(com.hearlers.api.proto.v1.service.DeleteBubbleRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.DeleteBubbleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBubbleMethod(), responseObserver);
    }

    /**
     * <pre>
     * 에피소드
     * </pre>
     */
    default void createEpisode(com.hearlers.api.proto.v1.service.CreateEpisodeRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateEpisodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEpisodeMethod(), responseObserver);
    }

    /**
     */
    default void findEpisodes(com.hearlers.api.proto.v1.service.FindEpisodesRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindEpisodesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindEpisodesMethod(), responseObserver);
    }

    /**
     */
    default void findEpisodeById(com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindEpisodeByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindEpisodeByIdMethod(), responseObserver);
    }

    /**
     */
    default void updateEpisode(com.hearlers.api.proto.v1.service.UpdateEpisodeRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateEpisodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEpisodeMethod(), responseObserver);
    }

    /**
     */
    default void generateCutSceneImageUrl(com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateCutSceneImageUrlMethod(), responseObserver);
    }

    /**
     * <pre>
     * 톤
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

    /**
     */
    public void generateCounselorImageUrl(com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateCounselorImageUrlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 버블
     * </pre>
     */
    public void createBubble(com.hearlers.api.proto.v1.service.CreateBubbleRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateBubbleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBubbleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findBubbles(com.hearlers.api.proto.v1.service.FindBubblesRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindBubblesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindBubblesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findBubbleById(com.hearlers.api.proto.v1.service.FindBubbleByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindBubbleByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindBubbleByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findRandomBubble(com.hearlers.api.proto.v1.service.FindRandomBubbleRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindRandomBubbleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindRandomBubbleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBubble(com.hearlers.api.proto.v1.service.UpdateBubbleRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateBubbleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBubbleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBubble(com.hearlers.api.proto.v1.service.DeleteBubbleRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.DeleteBubbleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBubbleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 에피소드
     * </pre>
     */
    public void createEpisode(com.hearlers.api.proto.v1.service.CreateEpisodeRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateEpisodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEpisodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findEpisodes(com.hearlers.api.proto.v1.service.FindEpisodesRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindEpisodesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindEpisodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findEpisodeById(com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindEpisodeByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindEpisodeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEpisode(com.hearlers.api.proto.v1.service.UpdateEpisodeRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateEpisodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEpisodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateCutSceneImageUrl(com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlRequest request,
        io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateCutSceneImageUrlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 톤
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

    /**
     */
    public com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlResponse generateCounselorImageUrl(com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateCounselorImageUrlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 버블
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateBubbleResponse createBubble(com.hearlers.api.proto.v1.service.CreateBubbleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBubbleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindBubblesResponse findBubbles(com.hearlers.api.proto.v1.service.FindBubblesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindBubblesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindBubbleByIdResponse findBubbleById(com.hearlers.api.proto.v1.service.FindBubbleByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindBubbleByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindRandomBubbleResponse findRandomBubble(com.hearlers.api.proto.v1.service.FindRandomBubbleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindRandomBubbleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdateBubbleResponse updateBubble(com.hearlers.api.proto.v1.service.UpdateBubbleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBubbleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.DeleteBubbleResponse deleteBubble(com.hearlers.api.proto.v1.service.DeleteBubbleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBubbleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 에피소드
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateEpisodeResponse createEpisode(com.hearlers.api.proto.v1.service.CreateEpisodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEpisodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindEpisodesResponse findEpisodes(com.hearlers.api.proto.v1.service.FindEpisodesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindEpisodesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindEpisodeByIdResponse findEpisodeById(com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindEpisodeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdateEpisodeResponse updateEpisode(com.hearlers.api.proto.v1.service.UpdateEpisodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEpisodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlResponse generateCutSceneImageUrl(com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateCutSceneImageUrlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 톤
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

    /**
     */
    public com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlResponse generateCounselorImageUrl(com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateCounselorImageUrlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 버블
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateBubbleResponse createBubble(com.hearlers.api.proto.v1.service.CreateBubbleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBubbleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindBubblesResponse findBubbles(com.hearlers.api.proto.v1.service.FindBubblesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindBubblesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindBubbleByIdResponse findBubbleById(com.hearlers.api.proto.v1.service.FindBubbleByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindBubbleByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindRandomBubbleResponse findRandomBubble(com.hearlers.api.proto.v1.service.FindRandomBubbleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindRandomBubbleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdateBubbleResponse updateBubble(com.hearlers.api.proto.v1.service.UpdateBubbleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBubbleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.DeleteBubbleResponse deleteBubble(com.hearlers.api.proto.v1.service.DeleteBubbleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBubbleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 에피소드
     * </pre>
     */
    public com.hearlers.api.proto.v1.service.CreateEpisodeResponse createEpisode(com.hearlers.api.proto.v1.service.CreateEpisodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEpisodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindEpisodesResponse findEpisodes(com.hearlers.api.proto.v1.service.FindEpisodesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindEpisodesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.FindEpisodeByIdResponse findEpisodeById(com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindEpisodeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.UpdateEpisodeResponse updateEpisode(com.hearlers.api.proto.v1.service.UpdateEpisodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEpisodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlResponse generateCutSceneImageUrl(com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateCutSceneImageUrlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 톤
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlResponse> generateCounselorImageUrl(
        com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateCounselorImageUrlMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 버블
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.CreateBubbleResponse> createBubble(
        com.hearlers.api.proto.v1.service.CreateBubbleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBubbleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindBubblesResponse> findBubbles(
        com.hearlers.api.proto.v1.service.FindBubblesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindBubblesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindBubbleByIdResponse> findBubbleById(
        com.hearlers.api.proto.v1.service.FindBubbleByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindBubbleByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindRandomBubbleResponse> findRandomBubble(
        com.hearlers.api.proto.v1.service.FindRandomBubbleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindRandomBubbleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.UpdateBubbleResponse> updateBubble(
        com.hearlers.api.proto.v1.service.UpdateBubbleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBubbleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.DeleteBubbleResponse> deleteBubble(
        com.hearlers.api.proto.v1.service.DeleteBubbleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBubbleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 에피소드
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.CreateEpisodeResponse> createEpisode(
        com.hearlers.api.proto.v1.service.CreateEpisodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEpisodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindEpisodesResponse> findEpisodes(
        com.hearlers.api.proto.v1.service.FindEpisodesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindEpisodesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.FindEpisodeByIdResponse> findEpisodeById(
        com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindEpisodeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.UpdateEpisodeResponse> updateEpisode(
        com.hearlers.api.proto.v1.service.UpdateEpisodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEpisodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlResponse> generateCutSceneImageUrl(
        com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateCutSceneImageUrlMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 톤
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

  private static final int METHODID_CREATE_COUNSELOR = 0;
  private static final int METHODID_FIND_COUNSELORS = 1;
  private static final int METHODID_FIND_COUNSELOR_BY_ID = 2;
  private static final int METHODID_UPDATE_COUNSELOR = 3;
  private static final int METHODID_GENERATE_COUNSELOR_IMAGE_URL = 4;
  private static final int METHODID_CREATE_BUBBLE = 5;
  private static final int METHODID_FIND_BUBBLES = 6;
  private static final int METHODID_FIND_BUBBLE_BY_ID = 7;
  private static final int METHODID_FIND_RANDOM_BUBBLE = 8;
  private static final int METHODID_UPDATE_BUBBLE = 9;
  private static final int METHODID_DELETE_BUBBLE = 10;
  private static final int METHODID_CREATE_EPISODE = 11;
  private static final int METHODID_FIND_EPISODES = 12;
  private static final int METHODID_FIND_EPISODE_BY_ID = 13;
  private static final int METHODID_UPDATE_EPISODE = 14;
  private static final int METHODID_GENERATE_CUT_SCENE_IMAGE_URL = 15;
  private static final int METHODID_CREATE_TONE = 16;
  private static final int METHODID_FIND_TONES = 17;
  private static final int METHODID_FIND_TONE_BY_ID = 18;
  private static final int METHODID_UPDATE_TONE = 19;

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
        case METHODID_GENERATE_COUNSELOR_IMAGE_URL:
          serviceImpl.generateCounselorImageUrl((com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlResponse>) responseObserver);
          break;
        case METHODID_CREATE_BUBBLE:
          serviceImpl.createBubble((com.hearlers.api.proto.v1.service.CreateBubbleRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateBubbleResponse>) responseObserver);
          break;
        case METHODID_FIND_BUBBLES:
          serviceImpl.findBubbles((com.hearlers.api.proto.v1.service.FindBubblesRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindBubblesResponse>) responseObserver);
          break;
        case METHODID_FIND_BUBBLE_BY_ID:
          serviceImpl.findBubbleById((com.hearlers.api.proto.v1.service.FindBubbleByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindBubbleByIdResponse>) responseObserver);
          break;
        case METHODID_FIND_RANDOM_BUBBLE:
          serviceImpl.findRandomBubble((com.hearlers.api.proto.v1.service.FindRandomBubbleRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindRandomBubbleResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BUBBLE:
          serviceImpl.updateBubble((com.hearlers.api.proto.v1.service.UpdateBubbleRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateBubbleResponse>) responseObserver);
          break;
        case METHODID_DELETE_BUBBLE:
          serviceImpl.deleteBubble((com.hearlers.api.proto.v1.service.DeleteBubbleRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.DeleteBubbleResponse>) responseObserver);
          break;
        case METHODID_CREATE_EPISODE:
          serviceImpl.createEpisode((com.hearlers.api.proto.v1.service.CreateEpisodeRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.CreateEpisodeResponse>) responseObserver);
          break;
        case METHODID_FIND_EPISODES:
          serviceImpl.findEpisodes((com.hearlers.api.proto.v1.service.FindEpisodesRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindEpisodesResponse>) responseObserver);
          break;
        case METHODID_FIND_EPISODE_BY_ID:
          serviceImpl.findEpisodeById((com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.FindEpisodeByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EPISODE:
          serviceImpl.updateEpisode((com.hearlers.api.proto.v1.service.UpdateEpisodeRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.UpdateEpisodeResponse>) responseObserver);
          break;
        case METHODID_GENERATE_CUT_SCENE_IMAGE_URL:
          serviceImpl.generateCutSceneImageUrl((com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlRequest) request,
              (io.grpc.stub.StreamObserver<com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlResponse>) responseObserver);
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
          getGenerateCounselorImageUrlMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlRequest,
              com.hearlers.api.proto.v1.service.GenerateCounselorImageUrlResponse>(
                service, METHODID_GENERATE_COUNSELOR_IMAGE_URL)))
        .addMethod(
          getCreateBubbleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.CreateBubbleRequest,
              com.hearlers.api.proto.v1.service.CreateBubbleResponse>(
                service, METHODID_CREATE_BUBBLE)))
        .addMethod(
          getFindBubblesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindBubblesRequest,
              com.hearlers.api.proto.v1.service.FindBubblesResponse>(
                service, METHODID_FIND_BUBBLES)))
        .addMethod(
          getFindBubbleByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindBubbleByIdRequest,
              com.hearlers.api.proto.v1.service.FindBubbleByIdResponse>(
                service, METHODID_FIND_BUBBLE_BY_ID)))
        .addMethod(
          getFindRandomBubbleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindRandomBubbleRequest,
              com.hearlers.api.proto.v1.service.FindRandomBubbleResponse>(
                service, METHODID_FIND_RANDOM_BUBBLE)))
        .addMethod(
          getUpdateBubbleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.UpdateBubbleRequest,
              com.hearlers.api.proto.v1.service.UpdateBubbleResponse>(
                service, METHODID_UPDATE_BUBBLE)))
        .addMethod(
          getDeleteBubbleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.DeleteBubbleRequest,
              com.hearlers.api.proto.v1.service.DeleteBubbleResponse>(
                service, METHODID_DELETE_BUBBLE)))
        .addMethod(
          getCreateEpisodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.CreateEpisodeRequest,
              com.hearlers.api.proto.v1.service.CreateEpisodeResponse>(
                service, METHODID_CREATE_EPISODE)))
        .addMethod(
          getFindEpisodesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindEpisodesRequest,
              com.hearlers.api.proto.v1.service.FindEpisodesResponse>(
                service, METHODID_FIND_EPISODES)))
        .addMethod(
          getFindEpisodeByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest,
              com.hearlers.api.proto.v1.service.FindEpisodeByIdResponse>(
                service, METHODID_FIND_EPISODE_BY_ID)))
        .addMethod(
          getUpdateEpisodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.UpdateEpisodeRequest,
              com.hearlers.api.proto.v1.service.UpdateEpisodeResponse>(
                service, METHODID_UPDATE_EPISODE)))
        .addMethod(
          getGenerateCutSceneImageUrlMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlRequest,
              com.hearlers.api.proto.v1.service.GenerateCutSceneImageUrlResponse>(
                service, METHODID_GENERATE_CUT_SCENE_IMAGE_URL)))
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
              .addMethod(getGenerateCounselorImageUrlMethod())
              .addMethod(getCreateBubbleMethod())
              .addMethod(getFindBubblesMethod())
              .addMethod(getFindBubbleByIdMethod())
              .addMethod(getFindRandomBubbleMethod())
              .addMethod(getUpdateBubbleMethod())
              .addMethod(getDeleteBubbleMethod())
              .addMethod(getCreateEpisodeMethod())
              .addMethod(getFindEpisodesMethod())
              .addMethod(getFindEpisodeByIdMethod())
              .addMethod(getUpdateEpisodeMethod())
              .addMethod(getGenerateCutSceneImageUrlMethod())
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
