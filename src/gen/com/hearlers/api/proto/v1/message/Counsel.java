// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/message/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.message;

public final class Counsel {
  private Counsel() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      Counsel.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_message_CounselCreatedPayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_message_CounselCreatedPayload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_message_CounselMessageCreatedPayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_message_CounselMessageCreatedPayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%com/hearlers/v1/message/counsel.proto\022" +
      "\027com.hearlers.v1.message\"\223\001\n\025CounselCrea" +
      "tedPayload\022\035\n\ncounsel_id\030\001 \001(\tR\tcounselI" +
      "d\022\027\n\007user_id\030\002 \001(\tR\006userId\022!\n\014counselor_" +
      "id\030\003 \001(\tR\013counselorId\022\037\n\013occurred_at\030\004 \001" +
      "(\tR\noccurredAt\"\347\001\n\034CounselMessageCreated" +
      "Payload\022,\n\022counsel_message_id\030\001 \001(\tR\020cou" +
      "nselMessageId\022\035\n\ncounsel_id\030\002 \001(\tR\tcouns" +
      "elId\022\027\n\007user_id\030\003 \001(\tR\006userId\022\030\n\007message" +
      "\030\004 \001(\tR\007message\022&\n\017is_user_message\030\005 \001(\010" +
      "R\risUserMessage\022\037\n\013occurred_at\030\006 \001(\tR\noc" +
      "curredAtB%\n!com.hearlers.api.proto.v1.me" +
      "ssageP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_hearlers_v1_message_CounselCreatedPayload_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_hearlers_v1_message_CounselCreatedPayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_message_CounselCreatedPayload_descriptor,
        new java.lang.String[] { "CounselId", "UserId", "CounselorId", "OccurredAt", });
    internal_static_com_hearlers_v1_message_CounselMessageCreatedPayload_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_hearlers_v1_message_CounselMessageCreatedPayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_message_CounselMessageCreatedPayload_descriptor,
        new java.lang.String[] { "CounselMessageId", "CounselId", "UserId", "Message", "IsUserMessage", "OccurredAt", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
