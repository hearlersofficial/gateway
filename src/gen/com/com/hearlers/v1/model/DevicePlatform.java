// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/model/user.proto
// Protobuf Java Version: 4.29.0

package com.com.hearlers.v1.model;

/**
 * Protobuf enum {@code com.hearlers.v1.model.DevicePlatform}
 */
public enum DevicePlatform
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DEVICE_PLATFORM_UNSPECIFIED = 0;</code>
   */
  DEVICE_PLATFORM_UNSPECIFIED(0),
  /**
   * <code>DEVICE_PLATFORM_WEB = 1;</code>
   */
  DEVICE_PLATFORM_WEB(1),
  /**
   * <code>DEVICE_PLATFORM_IOS = 2;</code>
   */
  DEVICE_PLATFORM_IOS(2),
  /**
   * <code>DEVICE_PLATFORM_ANDROID = 3;</code>
   */
  DEVICE_PLATFORM_ANDROID(3),
  /**
   * <code>DEVICE_PLATFORM_DESKTOP = 4;</code>
   */
  DEVICE_PLATFORM_DESKTOP(4),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      DevicePlatform.class.getName());
  }
  /**
   * <code>DEVICE_PLATFORM_UNSPECIFIED = 0;</code>
   */
  public static final int DEVICE_PLATFORM_UNSPECIFIED_VALUE = 0;
  /**
   * <code>DEVICE_PLATFORM_WEB = 1;</code>
   */
  public static final int DEVICE_PLATFORM_WEB_VALUE = 1;
  /**
   * <code>DEVICE_PLATFORM_IOS = 2;</code>
   */
  public static final int DEVICE_PLATFORM_IOS_VALUE = 2;
  /**
   * <code>DEVICE_PLATFORM_ANDROID = 3;</code>
   */
  public static final int DEVICE_PLATFORM_ANDROID_VALUE = 3;
  /**
   * <code>DEVICE_PLATFORM_DESKTOP = 4;</code>
   */
  public static final int DEVICE_PLATFORM_DESKTOP_VALUE = 4;


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
  public static DevicePlatform valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DevicePlatform forNumber(int value) {
    switch (value) {
      case 0: return DEVICE_PLATFORM_UNSPECIFIED;
      case 1: return DEVICE_PLATFORM_WEB;
      case 2: return DEVICE_PLATFORM_IOS;
      case 3: return DEVICE_PLATFORM_ANDROID;
      case 4: return DEVICE_PLATFORM_DESKTOP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DevicePlatform>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DevicePlatform> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DevicePlatform>() {
          public DevicePlatform findValueByNumber(int number) {
            return DevicePlatform.forNumber(number);
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
    return com.com.hearlers.v1.model.UserProto.getDescriptor().getEnumTypes().get(4);
  }

  private static final DevicePlatform[] VALUES = values();

  public static DevicePlatform valueOf(
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

  private DevicePlatform(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.hearlers.v1.model.DevicePlatform)
}

