// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/service/user.proto
// Protobuf Java Version: 4.29.0

package com.com.hearlers.v1.service;

public final class UserProto {
  private UserProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      UserProto.class.getName());
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
    internal_static_com_hearlers_v1_service_InitializeUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_InitializeUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_InitializeUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_InitializeUserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_ConnectAuthChannelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_ConnectAuthChannelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_ConnectAuthChannelResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_ConnectAuthChannelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_SaveRefreshTokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_SaveRefreshTokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_SaveRefreshTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_SaveRefreshTokenResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_VerifyRefreshTokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_VerifyRefreshTokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_VerifyRefreshTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_VerifyRefreshTokenResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindOneUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindOneUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindOneUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindOneUserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindManyUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindManyUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindManyUserResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindManyUserResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindOneAuthUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindOneAuthUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindOneAuthUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindOneAuthUserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_UpdateUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_UpdateUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_UpdateUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_UpdateUserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_CreateActivityRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_CreateActivityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_CreateActivityResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_CreateActivityResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025v1/service/user.proto\022\027com.hearlers.v1" +
      ".service\032\023v1/model/user.proto\032\030v1/model/" +
      "auth_user.proto\032\037google/protobuf/timesta" +
      "mp.proto\032\032v1/common/pagination.proto\032\034go" +
      "ogle/protobuf/struct.proto\"\027\n\025Initialize" +
      "UserRequest\"\207\001\n\026InitializeUserResponse\022/" +
      "\n\004user\030\001 \001(\0132\033.com.hearlers.v1.model.Use" +
      "rR\004user\022<\n\tauth_user\030\002 \001(\0132\037.com.hearler" +
      "s.v1.model.AuthUserR\010authUser\"\230\001\n\031Connec" +
      "tAuthChannelRequest\022\027\n\007user_id\030\001 \001(\005R\006us" +
      "erId\022E\n\014auth_channel\030\002 \001(\0162\".com.hearler" +
      "s.v1.model.AuthChannelR\013authChannel\022\033\n\tu" +
      "nique_id\030\003 \001(\tR\010uniqueId\"Z\n\032ConnectAuthC" +
      "hannelResponse\022<\n\tauth_user\030\001 \001(\0132\037.com." +
      "hearlers.v1.model.AuthUserR\010authUser\"\203\001\n" +
      "\027SaveRefreshTokenRequest\022\027\n\007user_id\030\001 \001(" +
      "\005R\006userId\022\024\n\005token\030\002 \001(\tR\005token\0229\n\nexpir" +
      "es_at\030\003 \001(\0132\032.google.protobuf.TimestampR" +
      "\texpiresAt\"4\n\030SaveRefreshTokenResponse\022\030" +
      "\n\007success\030\001 \001(\010R\007success\"J\n\031VerifyRefres" +
      "hTokenRequest\022\027\n\007user_id\030\001 \001(\005R\006userId\022\024" +
      "\n\005token\030\002 \001(\tR\005token\"6\n\032VerifyRefreshTok" +
      "enResponse\022\030\n\007success\030\001 \001(\010R\007success\"l\n\022" +
      "FindOneUserRequest\022\034\n\007user_id\030\001 \001(\005H\000R\006u" +
      "serId\210\001\001\022\037\n\010nickname\030\002 \001(\tH\001R\010nickname\210\001" +
      "\001B\n\n\010_user_idB\013\n\t_nickname\"F\n\023FindOneUse" +
      "rResponse\022/\n\004user\030\001 \001(\0132\033.com.hearlers.v" +
      "1.model.UserR\004user\"Y\n\023FindManyUserReques" +
      "t\022B\n\npagination\030\001 \001(\0132\".com.hearlers.v1." +
      "common.PaginationR\npagination\"G\n\022FindMan" +
      "yUserResult\0221\n\005users\030\001 \003(\0132\033.com.hearler" +
      "s.v1.model.UserR\005users\"\207\002\n\026FindOneAuthUs" +
      "erRequest\022%\n\014auth_user_id\030\001 \001(\005H\000R\nauthU" +
      "serId\210\001\001\022\034\n\007user_id\030\002 \001(\005H\001R\006userId\210\001\001\022J" +
      "\n\014auth_channel\030\003 \001(\0162\".com.hearlers.v1.m" +
      "odel.AuthChannelH\002R\013authChannel\210\001\001\022 \n\tun" +
      "ique_id\030\004 \001(\tH\003R\010uniqueId\210\001\001B\017\n\r_auth_us" +
      "er_idB\n\n\010_user_idB\017\n\r_auth_channelB\014\n\n_u" +
      "nique_id\"W\n\027FindOneAuthUserResponse\022<\n\ta" +
      "uth_user\030\001 \001(\0132\037.com.hearlers.v1.model.A" +
      "uthUserR\010authUser\"\304\002\n\021UpdateUserRequest\022" +
      "\027\n\007user_id\030\001 \001(\005R\006userId\022\037\n\010nickname\030\002 \001" +
      "(\tH\000R\010nickname\210\001\001\022J\n\014auth_channel\030\003 \001(\0162" +
      "\".com.hearlers.v1.model.AuthChannelH\001R\013a" +
      "uthChannel\210\001\001\022 \n\tunique_id\030\004 \001(\tH\002R\010uniq" +
      "ueId\210\001\001\022J\n\014user_profile\030\005 \001(\0132\".com.hear" +
      "lers.v1.model.UserProfileH\003R\013userProfile" +
      "\210\001\001B\013\n\t_nicknameB\017\n\r_auth_channelB\014\n\n_un" +
      "ique_idB\017\n\r_user_profile\"E\n\022UpdateUserRe" +
      "sponse\022/\n\004user\030\001 \001(\0132\033.com.hearlers.v1.m" +
      "odel.UserR\004user\"\313\002\n\025CreateActivityReques" +
      "t\022H\n\ractivity_type\030\001 \001(\0162#.com.hearlers." +
      "v1.model.ActivityTypeR\014activityType\022<\n\ra" +
      "ctivity_data\030\002 \001(\0132\027.google.protobuf.Str" +
      "uctR\014activityData\022A\n\010platform\030\003 \001(\0162%.co" +
      "m.hearlers.v1.model.DevicePlatformR\010plat" +
      "form\022\035\n\nip_address\030\004 \001(\tR\tipAddress\022\035\n\nu" +
      "ser_agent\030\005 \001(\tR\tuserAgent\022)\n\020duration_s" +
      "econds\030\006 \001(\005R\017durationSeconds\"b\n\026CreateA" +
      "ctivityResponse\022H\n\ruser_activity\030\001 \001(\0132#" +
      ".com.hearlers.v1.model.UserActivityR\014use" +
      "rActivity2\261\007\n\013UserService\022q\n\016InitializeU" +
      "ser\022..com.hearlers.v1.service.Initialize" +
      "UserRequest\032/.com.hearlers.v1.service.In" +
      "itializeUserResponse\022}\n\022ConnectAuthChann" +
      "el\0222.com.hearlers.v1.service.ConnectAuth" +
      "ChannelRequest\0323.com.hearlers.v1.service" +
      ".ConnectAuthChannelResponse\022w\n\020SaveRefre" +
      "shToken\0220.com.hearlers.v1.service.SaveRe" +
      "freshTokenRequest\0321.com.hearlers.v1.serv" +
      "ice.SaveRefreshTokenResponse\022}\n\022VerifyRe" +
      "freshToken\0222.com.hearlers.v1.service.Ver" +
      "ifyRefreshTokenRequest\0323.com.hearlers.v1" +
      ".service.VerifyRefreshTokenResponse\022h\n\013F" +
      "indOneUser\022+.com.hearlers.v1.service.Fin" +
      "dOneUserRequest\032,.com.hearlers.v1.servic" +
      "e.FindOneUserResponse\022t\n\017FindOneAuthUser" +
      "\022/.com.hearlers.v1.service.FindOneAuthUs" +
      "erRequest\0320.com.hearlers.v1.service.Find" +
      "OneAuthUserResponse\022e\n\nUpdateUser\022*.com." +
      "hearlers.v1.service.UpdateUserRequest\032+." +
      "com.hearlers.v1.service.UpdateUserRespon" +
      "se\022q\n\016CreateActivity\022..com.hearlers.v1.s" +
      "ervice.CreateActivityRequest\032/.com.hearl" +
      "ers.v1.service.CreateActivityResponseB\250\001" +
      "\n\033com.com.hearlers.v1.serviceB\tUserProto" +
      "P\001\242\002\004CHVS\252\002\027Com.Hearlers.V1.Service\312\002\027Co" +
      "m\\Hearlers\\V1\\Service\342\002#Com\\Hearlers\\V1\\" +
      "Service\\GPBMetadata\352\002\032Com::Hearlers::V1:" +
      ":Serviceb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.com.hearlers.v1.model.UserProto.getDescriptor(),
          com.com.hearlers.v1.model.AuthUserProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.com.hearlers.v1.common.PaginationProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_com_hearlers_v1_service_InitializeUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_hearlers_v1_service_InitializeUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_InitializeUserRequest_descriptor,
        new java.lang.String[] { });
    internal_static_com_hearlers_v1_service_InitializeUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_hearlers_v1_service_InitializeUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_InitializeUserResponse_descriptor,
        new java.lang.String[] { "User", "AuthUser", });
    internal_static_com_hearlers_v1_service_ConnectAuthChannelRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_hearlers_v1_service_ConnectAuthChannelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_ConnectAuthChannelRequest_descriptor,
        new java.lang.String[] { "UserId", "AuthChannel", "UniqueId", });
    internal_static_com_hearlers_v1_service_ConnectAuthChannelResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_hearlers_v1_service_ConnectAuthChannelResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_ConnectAuthChannelResponse_descriptor,
        new java.lang.String[] { "AuthUser", });
    internal_static_com_hearlers_v1_service_SaveRefreshTokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_hearlers_v1_service_SaveRefreshTokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_SaveRefreshTokenRequest_descriptor,
        new java.lang.String[] { "UserId", "Token", "ExpiresAt", });
    internal_static_com_hearlers_v1_service_SaveRefreshTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_hearlers_v1_service_SaveRefreshTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_SaveRefreshTokenResponse_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_com_hearlers_v1_service_VerifyRefreshTokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_hearlers_v1_service_VerifyRefreshTokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_VerifyRefreshTokenRequest_descriptor,
        new java.lang.String[] { "UserId", "Token", });
    internal_static_com_hearlers_v1_service_VerifyRefreshTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_hearlers_v1_service_VerifyRefreshTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_VerifyRefreshTokenResponse_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_com_hearlers_v1_service_FindOneUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_hearlers_v1_service_FindOneUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindOneUserRequest_descriptor,
        new java.lang.String[] { "UserId", "Nickname", });
    internal_static_com_hearlers_v1_service_FindOneUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_com_hearlers_v1_service_FindOneUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindOneUserResponse_descriptor,
        new java.lang.String[] { "User", });
    internal_static_com_hearlers_v1_service_FindManyUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_com_hearlers_v1_service_FindManyUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindManyUserRequest_descriptor,
        new java.lang.String[] { "Pagination", });
    internal_static_com_hearlers_v1_service_FindManyUserResult_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_com_hearlers_v1_service_FindManyUserResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindManyUserResult_descriptor,
        new java.lang.String[] { "Users", });
    internal_static_com_hearlers_v1_service_FindOneAuthUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_com_hearlers_v1_service_FindOneAuthUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindOneAuthUserRequest_descriptor,
        new java.lang.String[] { "AuthUserId", "UserId", "AuthChannel", "UniqueId", });
    internal_static_com_hearlers_v1_service_FindOneAuthUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_com_hearlers_v1_service_FindOneAuthUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindOneAuthUserResponse_descriptor,
        new java.lang.String[] { "AuthUser", });
    internal_static_com_hearlers_v1_service_UpdateUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_com_hearlers_v1_service_UpdateUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_UpdateUserRequest_descriptor,
        new java.lang.String[] { "UserId", "Nickname", "AuthChannel", "UniqueId", "UserProfile", });
    internal_static_com_hearlers_v1_service_UpdateUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_com_hearlers_v1_service_UpdateUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_UpdateUserResponse_descriptor,
        new java.lang.String[] { "User", });
    internal_static_com_hearlers_v1_service_CreateActivityRequest_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_com_hearlers_v1_service_CreateActivityRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_CreateActivityRequest_descriptor,
        new java.lang.String[] { "ActivityType", "ActivityData", "Platform", "IpAddress", "UserAgent", "DurationSeconds", });
    internal_static_com_hearlers_v1_service_CreateActivityResponse_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_com_hearlers_v1_service_CreateActivityResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_CreateActivityResponse_descriptor,
        new java.lang.String[] { "UserActivity", });
    descriptor.resolveAllFeaturesImmutable();
    com.com.hearlers.v1.model.UserProto.getDescriptor();
    com.com.hearlers.v1.model.AuthUserProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.com.hearlers.v1.common.PaginationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
