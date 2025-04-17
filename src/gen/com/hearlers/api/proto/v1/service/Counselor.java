// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counselor.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public final class Counselor {
  private Counselor() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      Counselor.class.getName());
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
    internal_static_com_hearlers_v1_service_CreateCounselorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_CreateCounselorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_CreateCounselorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_CreateCounselorResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindCounselorsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindCounselorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindCounselorsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindCounselorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindCounselorByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindCounselorByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindCounselorByIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindCounselorByIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_UpdateCounselorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_UpdateCounselorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_UpdateCounselorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_UpdateCounselorResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_CreateToneRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_CreateToneRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_CreateToneResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_CreateToneResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindTonesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindTonesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindTonesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindTonesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindToneByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindToneByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindToneByIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindToneByIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_UpdateToneRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_UpdateToneRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_UpdateToneResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_UpdateToneResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'com/hearlers/v1/service/counselor.prot" +
      "o\022\027com.hearlers.v1.service\032%com/hearlers" +
      "/v1/model/counselor.proto\"\272\001\n\026CreateCoun" +
      "selorRequest\022\027\n\007tone_id\030\001 \001(\tR\006toneId\022\022\n" +
      "\004name\030\002 \001(\tR\004name\022 \n\013description\030\003 \001(\tR\013" +
      "description\022Q\n\020counselor_gender\030\004 \001(\0162&." +
      "com.hearlers.v1.model.CounselorGenderR\017c" +
      "ounselorGender\"Y\n\027CreateCounselorRespons" +
      "e\022>\n\tcounselor\030\001 \001(\0132 .com.hearlers.v1.m" +
      "odel.CounselorR\tcounselor\"A\n\025FindCounsel" +
      "orsRequest\022\034\n\007tone_id\030\001 \001(\tH\000R\006toneId\210\001\001" +
      "B\n\n\010_tone_id\"Z\n\026FindCounselorsResponse\022@" +
      "\n\ncounselors\030\001 \003(\0132 .com.hearlers.v1.mod" +
      "el.CounselorR\ncounselors\"=\n\030FindCounselo" +
      "rByIdRequest\022!\n\014counselor_id\030\001 \001(\tR\013coun" +
      "selorId\"n\n\031FindCounselorByIdResponse\022C\n\t" +
      "counselor\030\001 \001(\0132 .com.hearlers.v1.model." +
      "CounselorH\000R\tcounselor\210\001\001B\014\n\n_counselor\"" +
      "\253\002\n\026UpdateCounselorRequest\022!\n\014counselor_" +
      "id\030\001 \001(\tR\013counselorId\022\034\n\007tone_id\030\002 \001(\tH\000" +
      "R\006toneId\210\001\001\022\027\n\004name\030\003 \001(\tH\001R\004name\210\001\001\022%\n\013" +
      "description\030\004 \001(\tH\002R\013description\210\001\001\022V\n\020c" +
      "ounselor_gender\030\005 \001(\0162&.com.hearlers.v1." +
      "model.CounselorGenderH\003R\017counselorGender" +
      "\210\001\001B\n\n\010_tone_idB\007\n\005_nameB\016\n\014_description" +
      "B\023\n\021_counselor_gender\"Y\n\027UpdateCounselor" +
      "Response\022>\n\tcounselor\030\001 \001(\0132 .com.hearle" +
      "rs.v1.model.CounselorR\tcounselor\"I\n\021Crea" +
      "teToneRequest\022\022\n\004name\030\001 \001(\tR\004name\022 \n\013des" +
      "cription\030\002 \001(\tR\013description\"E\n\022CreateTon" +
      "eResponse\022/\n\004tone\030\001 \001(\0132\033.com.hearlers.v" +
      "1.model.ToneR\004tone\"4\n\020FindTonesRequest\022\027" +
      "\n\004name\030\001 \001(\tH\000R\004name\210\001\001B\007\n\005_name\"F\n\021Find" +
      "TonesResponse\0221\n\005tones\030\001 \003(\0132\033.com.hearl" +
      "ers.v1.model.ToneR\005tones\".\n\023FindToneById" +
      "Request\022\027\n\007tone_id\030\001 \001(\tR\006toneId\"U\n\024Find" +
      "ToneByIdResponse\0224\n\004tone\030\001 \001(\0132\033.com.hea" +
      "rlers.v1.model.ToneH\000R\004tone\210\001\001B\007\n\005_tone\"" +
      "\205\001\n\021UpdateToneRequest\022\027\n\007tone_id\030\001 \001(\tR\006" +
      "toneId\022\027\n\004name\030\002 \001(\tH\000R\004name\210\001\001\022%\n\013descr" +
      "iption\030\003 \001(\tH\001R\013description\210\001\001B\007\n\005_nameB" +
      "\016\n\014_description\"E\n\022UpdateToneResponse\022/\n" +
      "\004tone\030\001 \001(\0132\033.com.hearlers.v1.model.Tone" +
      "R\004tone2\214\007\n\020CounselorService\022t\n\017CreateCou" +
      "nselor\022/.com.hearlers.v1.service.CreateC" +
      "ounselorRequest\0320.com.hearlers.v1.servic" +
      "e.CreateCounselorResponse\022q\n\016FindCounsel" +
      "ors\022..com.hearlers.v1.service.FindCounse" +
      "lorsRequest\032/.com.hearlers.v1.service.Fi" +
      "ndCounselorsResponse\022z\n\021FindCounselorByI" +
      "d\0221.com.hearlers.v1.service.FindCounselo" +
      "rByIdRequest\0322.com.hearlers.v1.service.F" +
      "indCounselorByIdResponse\022t\n\017UpdateCounse" +
      "lor\022/.com.hearlers.v1.service.UpdateCoun" +
      "selorRequest\0320.com.hearlers.v1.service.U" +
      "pdateCounselorResponse\022e\n\nCreateTone\022*.c" +
      "om.hearlers.v1.service.CreateToneRequest" +
      "\032+.com.hearlers.v1.service.CreateToneRes" +
      "ponse\022b\n\tFindTones\022).com.hearlers.v1.ser" +
      "vice.FindTonesRequest\032*.com.hearlers.v1." +
      "service.FindTonesResponse\022k\n\014FindToneByI" +
      "d\022,.com.hearlers.v1.service.FindToneById" +
      "Request\032-.com.hearlers.v1.service.FindTo" +
      "neByIdResponse\022e\n\nUpdateTone\022*.com.hearl" +
      "ers.v1.service.UpdateToneRequest\032+.com.h" +
      "earlers.v1.service.UpdateToneResponseB%\n" +
      "!com.hearlers.api.proto.v1.serviceP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.hearlers.api.proto.v1.model.CounselorOuterClass.getDescriptor(),
        });
    internal_static_com_hearlers_v1_service_CreateCounselorRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_hearlers_v1_service_CreateCounselorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_CreateCounselorRequest_descriptor,
        new java.lang.String[] { "ToneId", "Name", "Description", "CounselorGender", });
    internal_static_com_hearlers_v1_service_CreateCounselorResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_hearlers_v1_service_CreateCounselorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_CreateCounselorResponse_descriptor,
        new java.lang.String[] { "Counselor", });
    internal_static_com_hearlers_v1_service_FindCounselorsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_hearlers_v1_service_FindCounselorsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindCounselorsRequest_descriptor,
        new java.lang.String[] { "ToneId", });
    internal_static_com_hearlers_v1_service_FindCounselorsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_hearlers_v1_service_FindCounselorsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindCounselorsResponse_descriptor,
        new java.lang.String[] { "Counselors", });
    internal_static_com_hearlers_v1_service_FindCounselorByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_hearlers_v1_service_FindCounselorByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindCounselorByIdRequest_descriptor,
        new java.lang.String[] { "CounselorId", });
    internal_static_com_hearlers_v1_service_FindCounselorByIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_hearlers_v1_service_FindCounselorByIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindCounselorByIdResponse_descriptor,
        new java.lang.String[] { "Counselor", });
    internal_static_com_hearlers_v1_service_UpdateCounselorRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_hearlers_v1_service_UpdateCounselorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_UpdateCounselorRequest_descriptor,
        new java.lang.String[] { "CounselorId", "ToneId", "Name", "Description", "CounselorGender", });
    internal_static_com_hearlers_v1_service_UpdateCounselorResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_hearlers_v1_service_UpdateCounselorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_UpdateCounselorResponse_descriptor,
        new java.lang.String[] { "Counselor", });
    internal_static_com_hearlers_v1_service_CreateToneRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_hearlers_v1_service_CreateToneRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_CreateToneRequest_descriptor,
        new java.lang.String[] { "Name", "Description", });
    internal_static_com_hearlers_v1_service_CreateToneResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_com_hearlers_v1_service_CreateToneResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_CreateToneResponse_descriptor,
        new java.lang.String[] { "Tone", });
    internal_static_com_hearlers_v1_service_FindTonesRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_com_hearlers_v1_service_FindTonesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindTonesRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_com_hearlers_v1_service_FindTonesResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_com_hearlers_v1_service_FindTonesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindTonesResponse_descriptor,
        new java.lang.String[] { "Tones", });
    internal_static_com_hearlers_v1_service_FindToneByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_com_hearlers_v1_service_FindToneByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindToneByIdRequest_descriptor,
        new java.lang.String[] { "ToneId", });
    internal_static_com_hearlers_v1_service_FindToneByIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_com_hearlers_v1_service_FindToneByIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindToneByIdResponse_descriptor,
        new java.lang.String[] { "Tone", });
    internal_static_com_hearlers_v1_service_UpdateToneRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_com_hearlers_v1_service_UpdateToneRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_UpdateToneRequest_descriptor,
        new java.lang.String[] { "ToneId", "Name", "Description", });
    internal_static_com_hearlers_v1_service_UpdateToneResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_com_hearlers_v1_service_UpdateToneResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_UpdateToneResponse_descriptor,
        new java.lang.String[] { "Tone", });
    descriptor.resolveAllFeaturesImmutable();
    com.hearlers.api.proto.v1.model.CounselorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
