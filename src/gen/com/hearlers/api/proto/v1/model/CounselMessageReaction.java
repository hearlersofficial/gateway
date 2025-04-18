// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/model/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.model;

/**
 * Protobuf enum {@code com.hearlers.v1.model.CounselMessageReaction}
 */
public enum CounselMessageReaction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>COUNSEL_MESSAGE_REACTION_UNSPECIFIED = 0;</code>
   */
  COUNSEL_MESSAGE_REACTION_UNSPECIFIED(0),
  /**
   * <code>COUNSEL_MESSAGE_REACTION_LIKE = 1;</code>
   */
  COUNSEL_MESSAGE_REACTION_LIKE(1),
  /**
   * <code>COUNSEL_MESSAGE_REACTION_DISLIKE = 2;</code>
   */
  COUNSEL_MESSAGE_REACTION_DISLIKE(2),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      CounselMessageReaction.class.getName());
  }
  /**
   * <code>COUNSEL_MESSAGE_REACTION_UNSPECIFIED = 0;</code>
   */
  public static final int COUNSEL_MESSAGE_REACTION_UNSPECIFIED_VALUE = 0;
  /**
   * <code>COUNSEL_MESSAGE_REACTION_LIKE = 1;</code>
   */
  public static final int COUNSEL_MESSAGE_REACTION_LIKE_VALUE = 1;
  /**
   * <code>COUNSEL_MESSAGE_REACTION_DISLIKE = 2;</code>
   */
  public static final int COUNSEL_MESSAGE_REACTION_DISLIKE_VALUE = 2;


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
  public static CounselMessageReaction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CounselMessageReaction forNumber(int value) {
    switch (value) {
      case 0: return COUNSEL_MESSAGE_REACTION_UNSPECIFIED;
      case 1: return COUNSEL_MESSAGE_REACTION_LIKE;
      case 2: return COUNSEL_MESSAGE_REACTION_DISLIKE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CounselMessageReaction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CounselMessageReaction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CounselMessageReaction>() {
          public CounselMessageReaction findValueByNumber(int number) {
            return CounselMessageReaction.forNumber(number);
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
    return com.hearlers.api.proto.v1.model.CounselOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final CounselMessageReaction[] VALUES = values();

  public static CounselMessageReaction valueOf(
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

  private CounselMessageReaction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.hearlers.v1.model.CounselMessageReaction)
}

