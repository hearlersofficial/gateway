// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/model/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.model;

/**
 * Protobuf enum {@code com.hearlers.v1.model.CounselPromptType}
 */
public enum CounselPromptType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>COUNSEL_PROMPT_TYPE_UNSPECIFIED = 0;</code>
   */
  COUNSEL_PROMPT_TYPE_UNSPECIFIED(0),
  /**
   * <code>COUNSEL_PROMPT_TYPE_SYSTEM_MSG = 1;</code>
   */
  COUNSEL_PROMPT_TYPE_SYSTEM_MSG(1),
  /**
   * <code>COUNSEL_PROMPT_TYPE_POSITIVE_MSG = 2;</code>
   */
  COUNSEL_PROMPT_TYPE_POSITIVE_MSG(2),
  /**
   * <code>COUNSEL_PROMPT_TYPE_DEPRESSED_REASON_MSG = 3;</code>
   */
  COUNSEL_PROMPT_TYPE_DEPRESSED_REASON_MSG(3),
  /**
   * <code>COUNSEL_PROMPT_TYPE_DEPRESSED_NO_REASON_MSG = 4;</code>
   */
  COUNSEL_PROMPT_TYPE_DEPRESSED_NO_REASON_MSG(4),
  /**
   * <code>COUNSEL_PROMPT_TYPE_ANXIOUS_REASON_MSG = 5;</code>
   */
  COUNSEL_PROMPT_TYPE_ANXIOUS_REASON_MSG(5),
  /**
   * <code>COUNSEL_PROMPT_TYPE_ANXIOUS_NO_REASON_MSG = 6;</code>
   */
  COUNSEL_PROMPT_TYPE_ANXIOUS_NO_REASON_MSG(6),
  /**
   * <code>COUNSEL_PROMPT_TYPE_TIRED_REASON_MSG = 7;</code>
   */
  COUNSEL_PROMPT_TYPE_TIRED_REASON_MSG(7),
  /**
   * <code>COUNSEL_PROMPT_TYPE_TIRED_NO_REASON_MSG = 8;</code>
   */
  COUNSEL_PROMPT_TYPE_TIRED_NO_REASON_MSG(8),
  /**
   * <code>COUNSEL_PROMPT_TYPE_WHY_LIVE_MSG = 9;</code>
   */
  COUNSEL_PROMPT_TYPE_WHY_LIVE_MSG(9),
  /**
   * <code>COUNSEL_PROMPT_TYPE_BRANCH_MSG = 10;</code>
   */
  COUNSEL_PROMPT_TYPE_BRANCH_MSG(10),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      CounselPromptType.class.getName());
  }
  /**
   * <code>COUNSEL_PROMPT_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int COUNSEL_PROMPT_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>COUNSEL_PROMPT_TYPE_SYSTEM_MSG = 1;</code>
   */
  public static final int COUNSEL_PROMPT_TYPE_SYSTEM_MSG_VALUE = 1;
  /**
   * <code>COUNSEL_PROMPT_TYPE_POSITIVE_MSG = 2;</code>
   */
  public static final int COUNSEL_PROMPT_TYPE_POSITIVE_MSG_VALUE = 2;
  /**
   * <code>COUNSEL_PROMPT_TYPE_DEPRESSED_REASON_MSG = 3;</code>
   */
  public static final int COUNSEL_PROMPT_TYPE_DEPRESSED_REASON_MSG_VALUE = 3;
  /**
   * <code>COUNSEL_PROMPT_TYPE_DEPRESSED_NO_REASON_MSG = 4;</code>
   */
  public static final int COUNSEL_PROMPT_TYPE_DEPRESSED_NO_REASON_MSG_VALUE = 4;
  /**
   * <code>COUNSEL_PROMPT_TYPE_ANXIOUS_REASON_MSG = 5;</code>
   */
  public static final int COUNSEL_PROMPT_TYPE_ANXIOUS_REASON_MSG_VALUE = 5;
  /**
   * <code>COUNSEL_PROMPT_TYPE_ANXIOUS_NO_REASON_MSG = 6;</code>
   */
  public static final int COUNSEL_PROMPT_TYPE_ANXIOUS_NO_REASON_MSG_VALUE = 6;
  /**
   * <code>COUNSEL_PROMPT_TYPE_TIRED_REASON_MSG = 7;</code>
   */
  public static final int COUNSEL_PROMPT_TYPE_TIRED_REASON_MSG_VALUE = 7;
  /**
   * <code>COUNSEL_PROMPT_TYPE_TIRED_NO_REASON_MSG = 8;</code>
   */
  public static final int COUNSEL_PROMPT_TYPE_TIRED_NO_REASON_MSG_VALUE = 8;
  /**
   * <code>COUNSEL_PROMPT_TYPE_WHY_LIVE_MSG = 9;</code>
   */
  public static final int COUNSEL_PROMPT_TYPE_WHY_LIVE_MSG_VALUE = 9;
  /**
   * <code>COUNSEL_PROMPT_TYPE_BRANCH_MSG = 10;</code>
   */
  public static final int COUNSEL_PROMPT_TYPE_BRANCH_MSG_VALUE = 10;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static CounselPromptType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CounselPromptType forNumber(int value) {
    switch (value) {
      case 0: return COUNSEL_PROMPT_TYPE_UNSPECIFIED;
      case 1: return COUNSEL_PROMPT_TYPE_SYSTEM_MSG;
      case 2: return COUNSEL_PROMPT_TYPE_POSITIVE_MSG;
      case 3: return COUNSEL_PROMPT_TYPE_DEPRESSED_REASON_MSG;
      case 4: return COUNSEL_PROMPT_TYPE_DEPRESSED_NO_REASON_MSG;
      case 5: return COUNSEL_PROMPT_TYPE_ANXIOUS_REASON_MSG;
      case 6: return COUNSEL_PROMPT_TYPE_ANXIOUS_NO_REASON_MSG;
      case 7: return COUNSEL_PROMPT_TYPE_TIRED_REASON_MSG;
      case 8: return COUNSEL_PROMPT_TYPE_TIRED_NO_REASON_MSG;
      case 9: return COUNSEL_PROMPT_TYPE_WHY_LIVE_MSG;
      case 10: return COUNSEL_PROMPT_TYPE_BRANCH_MSG;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CounselPromptType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CounselPromptType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CounselPromptType>() {
          public CounselPromptType findValueByNumber(int number) {
            return CounselPromptType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.model.CounselOuterClass.getDescriptor().getEnumTypes().get(2);
  }

  private static final CounselPromptType[] VALUES = values();

  public static CounselPromptType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private CounselPromptType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.hearlers.v1.model.CounselPromptType)
}

