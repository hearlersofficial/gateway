// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/model/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.model;

public final class CounselOuterClass {
  private CounselOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      CounselOuterClass.class.getName());
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
    internal_static_com_hearlers_v1_model_Counsel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_Counsel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_CounselMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_CounselMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_CounselPrompt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_CounselPrompt_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_Counselor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_Counselor_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#com/hearlers/v1/model/counsel.proto\022\025c" +
      "om.hearlers.v1.model\"\373\001\n\007Counsel\022\016\n\002id\030\001" +
      " \001(\tR\002id\022!\n\014counselor_id\030\002 \001(\tR\013counselo" +
      "rId\022\027\n\007user_id\030\003 \001(\tR\006userId\022!\n\014last_mes" +
      "sage\030\004 \001(\tR\013lastMessage\022$\n\016last_chated_a" +
      "t\030\005 \001(\tR\014lastChatedAt\022\035\n\ncreated_at\030\006 \001(" +
      "\tR\tcreatedAt\022\035\n\nupdated_at\030\007 \001(\tR\tupdate" +
      "dAt\022\035\n\ndeleted_at\030\010 \001(\tR\tdeletedAt\"\310\002\n\016C" +
      "ounselMessage\022\016\n\002id\030\001 \001(\tR\002id\022\035\n\ncounsel" +
      "_id\030\002 \001(\tR\tcounselId\022\030\n\007message\030\003 \001(\tR\007m" +
      "essage\022&\n\017is_user_message\030\004 \001(\010R\risUserM" +
      "essage\022\035\n\nreacted_at\030\005 \001(\tR\treactedAt\022I\n" +
      "\010reaction\030\006 \001(\0162-.com.hearlers.v1.model." +
      "CounselMessageReactionR\010reaction\022\035\n\ncrea" +
      "ted_at\030\007 \001(\tR\tcreatedAt\022\035\n\nupdated_at\030\010 " +
      "\001(\tR\tupdatedAt\022\035\n\ndeleted_at\030\t \001(\tR\tdele" +
      "tedAt\"\232\003\n\rCounselPrompt\022\016\n\002id\030\001 \001(\tR\002id\022" +
      "\030\n\007persona\030\002 \001(\tR\007persona\022\030\n\007context\030\003 \001" +
      "(\tR\007context\022 \n\013instruction\030\004 \001(\tR\013instru" +
      "ction\022\022\n\004tone\030\005 \001(\tR\004tone\022+\n\021additional_" +
      "prompt\030\006 \001(\tR\020additionalPrompt\022I\n\013prompt" +
      "_type\030\007 \001(\0162(.com.hearlers.v1.model.Coun" +
      "selPromptTypeR\npromptType\022 \n\013description" +
      "\030\010 \001(\tR\013description\022\030\n\007version\030\t \001(\tR\007ve" +
      "rsion\022\035\n\ncreated_at\030\n \001(\tR\tcreatedAt\022\035\n\n" +
      "updated_at\030\013 \001(\tR\tupdatedAt\022\035\n\ndeleted_a" +
      "t\030\014 \001(\tR\tdeletedAt\"\202\003\n\tCounselor\022\016\n\002id\030\001" +
      " \001(\tR\002id\022\027\n\007tone_id\030\002 \001(\tR\006toneId\022\022\n\004nam" +
      "e\030\003 \001(\tR\004name\022 \n\013description\030\004 \001(\tR\013desc" +
      "ription\022>\n\006gender\030\005 \001(\0162&.com.hearlers.v" +
      "1.model.CounselorGenderR\006gender\022#\n\rintro" +
      "_message\030\006 \001(\tR\014introMessage\022)\n\020response" +
      "_option1\030\007 \001(\tR\017responseOption1\022)\n\020respo" +
      "nse_option2\030\010 \001(\tR\017responseOption2\022\035\n\ncr" +
      "eated_at\030\t \001(\tR\tcreatedAt\022\035\n\nupdated_at\030" +
      "\n \001(\tR\tupdatedAt\022\035\n\ndeleted_at\030\013 \001(\tR\tde" +
      "letedAt*\236\001\n\rCounselorType\022\036\n\032COUNSELOR_T" +
      "YPE_UNSPECIFIED\020\000\022\034\n\030COUNSELOR_TYPE_DEPR" +
      "ESSED\020\001\022\032\n\026COUNSELOR_TYPE_ANXIOUS\020\002\022\030\n\024C" +
      "OUNSELOR_TYPE_TIRED\020\003\022\031\n\025COUNSELOR_TYPE_" +
      "LONELY\020\004*\206\001\n\017CounselorGender\022 \n\034COUNSELO" +
      "R_GENDER_UNSPECIFIED\020\000\022\031\n\025COUNSELOR_GEND" +
      "ER_MALE\020\001\022\033\n\027COUNSELOR_GENDER_FEMALE\020\002\022\031" +
      "\n\025COUNSELOR_GENDER_NONE\020\003*\211\001\n\025CounselTec" +
      "hniqueStage\022\'\n#COUNSEL_TECHNIQUE_STAGE_U" +
      "NSPECIFIED\020\000\022#\n\037COUNSEL_TECHNIQUE_STAGE_" +
      "INITIAL\020\001\022\"\n\036COUNSEL_TECHNIQUE_STAGE_MID" +
      "DLE\020\002*\335\003\n\021CounselPromptType\022#\n\037COUNSEL_P" +
      "ROMPT_TYPE_UNSPECIFIED\020\000\022\"\n\036COUNSEL_PROM" +
      "PT_TYPE_SYSTEM_MSG\020\001\022$\n COUNSEL_PROMPT_T" +
      "YPE_POSITIVE_MSG\020\002\022,\n(COUNSEL_PROMPT_TYP" +
      "E_DEPRESSED_REASON_MSG\020\003\022/\n+COUNSEL_PROM" +
      "PT_TYPE_DEPRESSED_NO_REASON_MSG\020\004\022*\n&COU" +
      "NSEL_PROMPT_TYPE_ANXIOUS_REASON_MSG\020\005\022-\n" +
      ")COUNSEL_PROMPT_TYPE_ANXIOUS_NO_REASON_M" +
      "SG\020\006\022(\n$COUNSEL_PROMPT_TYPE_TIRED_REASON" +
      "_MSG\020\007\022+\n\'COUNSEL_PROMPT_TYPE_TIRED_NO_R" +
      "EASON_MSG\020\010\022$\n COUNSEL_PROMPT_TYPE_WHY_L" +
      "IVE_MSG\020\t\022\"\n\036COUNSEL_PROMPT_TYPE_BRANCH_" +
      "MSG\020\n*\213\001\n\026CounselMessageReaction\022(\n$COUN" +
      "SEL_MESSAGE_REACTION_UNSPECIFIED\020\000\022!\n\035CO" +
      "UNSEL_MESSAGE_REACTION_LIKE\020\001\022$\n COUNSEL" +
      "_MESSAGE_REACTION_DISLIKE\020\002B#\n\037com.hearl" +
      "ers.api.proto.v1.modelP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_hearlers_v1_model_Counsel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_hearlers_v1_model_Counsel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_Counsel_descriptor,
        new java.lang.String[] { "Id", "CounselorId", "UserId", "LastMessage", "LastChatedAt", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_CounselMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_hearlers_v1_model_CounselMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_CounselMessage_descriptor,
        new java.lang.String[] { "Id", "CounselId", "Message", "IsUserMessage", "ReactedAt", "Reaction", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_CounselPrompt_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_hearlers_v1_model_CounselPrompt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_CounselPrompt_descriptor,
        new java.lang.String[] { "Id", "Persona", "Context", "Instruction", "Tone", "AdditionalPrompt", "PromptType", "Description", "Version", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_Counselor_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_hearlers_v1_model_Counselor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_Counselor_descriptor,
        new java.lang.String[] { "Id", "ToneId", "Name", "Description", "Gender", "IntroMessage", "ResponseOption1", "ResponseOption2", "CreatedAt", "UpdatedAt", "DeletedAt", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
