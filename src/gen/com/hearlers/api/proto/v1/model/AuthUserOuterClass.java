// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/model/auth_user.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.model;

public final class AuthUserOuterClass {
  private AuthUserOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      AuthUserOuterClass.class.getName());
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
    internal_static_com_hearlers_v1_model_AuthUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_AuthUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_OAuthChannelInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_OAuthChannelInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_RefreshToken_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_RefreshToken_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%com/hearlers/v1/model/auth_user.proto\022" +
      "\025com.hearlers.v1.model\"\236\003\n\010AuthUser\022\016\n\002i" +
      "d\030\001 \001(\005R\002id\022\027\n\007user_id\030\002 \001(\005R\006userId\022E\n\014" +
      "auth_channel\030\003 \001(\0162\".com.hearlers.v1.mod" +
      "el.AuthChannelR\013authChannel\022U\n\022oauth_cha" +
      "nnel_info\030\004 \001(\0132\'.com.hearlers.v1.model." +
      "OAuthChannelInfoR\020oauthChannelInfo\022J\n\016re" +
      "fresh_tokens\030\005 \003(\0132#.com.hearlers.v1.mod" +
      "el.RefreshTokenR\rrefreshTokens\022\"\n\rlast_l" +
      "ogin_at\030\006 \001(\tR\013lastLoginAt\022\035\n\ncreated_at" +
      "\030\007 \001(\tR\tcreatedAt\022\035\n\nupdated_at\030\010 \001(\tR\tu" +
      "pdatedAt\022\035\n\ndeleted_at\030\t \001(\tR\tdeletedAt\"" +
      "\343\001\n\020OAuthChannelInfo\022\016\n\002id\030\001 \001(\005R\002id\022E\n\014" +
      "auth_channel\030\002 \001(\0162\".com.hearlers.v1.mod" +
      "el.AuthChannelR\013authChannel\022\033\n\tunique_id" +
      "\030\003 \001(\tR\010uniqueId\022\035\n\ncreated_at\030\004 \001(\tR\tcr" +
      "eatedAt\022\035\n\nupdated_at\030\005 \001(\tR\tupdatedAt\022\035" +
      "\n\ndeleted_at\030\006 \001(\tR\tdeletedAt\"\201\001\n\014Refres" +
      "hToken\022\024\n\005token\030\001 \001(\tR\005token\022\035\n\nexpires_" +
      "at\030\002 \001(\tR\texpiresAt\022\035\n\ncreated_at\030\003 \001(\tR" +
      "\tcreatedAt\022\035\n\nupdated_at\030\004 \001(\tR\tupdatedA" +
      "t*v\n\013AuthChannel\022\034\n\030AUTH_CHANNEL_UNSPECI" +
      "FIED\020\000\022\031\n\025AUTH_CHANNEL_UNLINKED\020\001\022\026\n\022AUT" +
      "H_CHANNEL_KAKAO\020\002\022\026\n\022AUTH_CHANNEL_NAVER\020" +
      "\003B#\n\037com.hearlers.api.proto.v1.modelP\001b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_hearlers_v1_model_AuthUser_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_hearlers_v1_model_AuthUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_AuthUser_descriptor,
        new java.lang.String[] { "Id", "UserId", "AuthChannel", "OauthChannelInfo", "RefreshTokens", "LastLoginAt", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_OAuthChannelInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_hearlers_v1_model_OAuthChannelInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_OAuthChannelInfo_descriptor,
        new java.lang.String[] { "Id", "AuthChannel", "UniqueId", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_RefreshToken_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_hearlers_v1_model_RefreshToken_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_RefreshToken_descriptor,
        new java.lang.String[] { "Token", "ExpiresAt", "CreatedAt", "UpdatedAt", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
