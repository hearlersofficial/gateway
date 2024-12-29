// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.UpdateCounselorRequest}
 */
public final class UpdateCounselorRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.UpdateCounselorRequest)
    UpdateCounselorRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      UpdateCounselorRequest.class.getName());
  }
  // Use UpdateCounselorRequest.newBuilder() to construct.
  private UpdateCounselorRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateCounselorRequest() {
    counselorType_ = 0;
    name_ = "";
    description_ = "";
    counselorGender_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_UpdateCounselorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_UpdateCounselorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.UpdateCounselorRequest.class, com.hearlers.api.proto.v1.service.UpdateCounselorRequest.Builder.class);
  }

  public static final int COUNSELOR_ID_FIELD_NUMBER = 1;
  private int counselorId_ = 0;
  /**
   * <code>int32 counselor_id = 1 [json_name = "counselorId"];</code>
   * @return The counselorId.
   */
  @java.lang.Override
  public int getCounselorId() {
    return counselorId_;
  }

  public static final int COUNSELOR_TYPE_FIELD_NUMBER = 2;
  private int counselorType_ = 0;
  /**
   * <code>.com.hearlers.v1.model.CounselorType counselor_type = 2 [json_name = "counselorType"];</code>
   * @return The enum numeric value on the wire for counselorType.
   */
  @java.lang.Override public int getCounselorTypeValue() {
    return counselorType_;
  }
  /**
   * <code>.com.hearlers.v1.model.CounselorType counselor_type = 2 [json_name = "counselorType"];</code>
   * @return The counselorType.
   */
  @java.lang.Override public com.hearlers.api.proto.v1.model.CounselorType getCounselorType() {
    com.hearlers.api.proto.v1.model.CounselorType result = com.hearlers.api.proto.v1.model.CounselorType.forNumber(counselorType_);
    return result == null ? com.hearlers.api.proto.v1.model.CounselorType.UNRECOGNIZED : result;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNSELOR_GENDER_FIELD_NUMBER = 5;
  private int counselorGender_ = 0;
  /**
   * <code>.com.hearlers.v1.model.CounselorGender counselor_gender = 5 [json_name = "counselorGender"];</code>
   * @return The enum numeric value on the wire for counselorGender.
   */
  @java.lang.Override public int getCounselorGenderValue() {
    return counselorGender_;
  }
  /**
   * <code>.com.hearlers.v1.model.CounselorGender counselor_gender = 5 [json_name = "counselorGender"];</code>
   * @return The counselorGender.
   */
  @java.lang.Override public com.hearlers.api.proto.v1.model.CounselorGender getCounselorGender() {
    com.hearlers.api.proto.v1.model.CounselorGender result = com.hearlers.api.proto.v1.model.CounselorGender.forNumber(counselorGender_);
    return result == null ? com.hearlers.api.proto.v1.model.CounselorGender.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (counselorId_ != 0) {
      output.writeInt32(1, counselorId_);
    }
    if (counselorType_ != com.hearlers.api.proto.v1.model.CounselorType.COUNSELOR_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, counselorType_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, name_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, description_);
    }
    if (counselorGender_ != com.hearlers.api.proto.v1.model.CounselorGender.COUNSELOR_GENDER_UNSPECIFIED.getNumber()) {
      output.writeEnum(5, counselorGender_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (counselorId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, counselorId_);
    }
    if (counselorType_ != com.hearlers.api.proto.v1.model.CounselorType.COUNSELOR_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, counselorType_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, name_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, description_);
    }
    if (counselorGender_ != com.hearlers.api.proto.v1.model.CounselorGender.COUNSELOR_GENDER_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, counselorGender_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.hearlers.api.proto.v1.service.UpdateCounselorRequest)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.UpdateCounselorRequest other = (com.hearlers.api.proto.v1.service.UpdateCounselorRequest) obj;

    if (getCounselorId()
        != other.getCounselorId()) return false;
    if (counselorType_ != other.counselorType_) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (counselorGender_ != other.counselorGender_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + COUNSELOR_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCounselorId();
    hash = (37 * hash) + COUNSELOR_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + counselorType_;
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + COUNSELOR_GENDER_FIELD_NUMBER;
    hash = (53 * hash) + counselorGender_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.UpdateCounselorRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.UpdateCounselorRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.UpdateCounselorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.UpdateCounselorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.UpdateCounselorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.UpdateCounselorRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.UpdateCounselorRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.UpdateCounselorRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.UpdateCounselorRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.UpdateCounselorRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.UpdateCounselorRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.UpdateCounselorRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.UpdateCounselorRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.hearlers.v1.service.UpdateCounselorRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.UpdateCounselorRequest)
      com.hearlers.api.proto.v1.service.UpdateCounselorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_UpdateCounselorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_UpdateCounselorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.UpdateCounselorRequest.class, com.hearlers.api.proto.v1.service.UpdateCounselorRequest.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.UpdateCounselorRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      counselorId_ = 0;
      counselorType_ = 0;
      name_ = "";
      description_ = "";
      counselorGender_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_UpdateCounselorRequest_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.UpdateCounselorRequest getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.UpdateCounselorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.UpdateCounselorRequest build() {
      com.hearlers.api.proto.v1.service.UpdateCounselorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.UpdateCounselorRequest buildPartial() {
      com.hearlers.api.proto.v1.service.UpdateCounselorRequest result = new com.hearlers.api.proto.v1.service.UpdateCounselorRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.UpdateCounselorRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.counselorId_ = counselorId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.counselorType_ = counselorType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.counselorGender_ = counselorGender_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.UpdateCounselorRequest) {
        return mergeFrom((com.hearlers.api.proto.v1.service.UpdateCounselorRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.UpdateCounselorRequest other) {
      if (other == com.hearlers.api.proto.v1.service.UpdateCounselorRequest.getDefaultInstance()) return this;
      if (other.getCounselorId() != 0) {
        setCounselorId(other.getCounselorId());
      }
      if (other.counselorType_ != 0) {
        setCounselorTypeValue(other.getCounselorTypeValue());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.counselorGender_ != 0) {
        setCounselorGenderValue(other.getCounselorGenderValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              counselorId_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              counselorType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              counselorGender_ = input.readEnum();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int counselorId_ ;
    /**
     * <code>int32 counselor_id = 1 [json_name = "counselorId"];</code>
     * @return The counselorId.
     */
    @java.lang.Override
    public int getCounselorId() {
      return counselorId_;
    }
    /**
     * <code>int32 counselor_id = 1 [json_name = "counselorId"];</code>
     * @param value The counselorId to set.
     * @return This builder for chaining.
     */
    public Builder setCounselorId(int value) {

      counselorId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 counselor_id = 1 [json_name = "counselorId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCounselorId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      counselorId_ = 0;
      onChanged();
      return this;
    }

    private int counselorType_ = 0;
    /**
     * <code>.com.hearlers.v1.model.CounselorType counselor_type = 2 [json_name = "counselorType"];</code>
     * @return The enum numeric value on the wire for counselorType.
     */
    @java.lang.Override public int getCounselorTypeValue() {
      return counselorType_;
    }
    /**
     * <code>.com.hearlers.v1.model.CounselorType counselor_type = 2 [json_name = "counselorType"];</code>
     * @param value The enum numeric value on the wire for counselorType to set.
     * @return This builder for chaining.
     */
    public Builder setCounselorTypeValue(int value) {
      counselorType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.CounselorType counselor_type = 2 [json_name = "counselorType"];</code>
     * @return The counselorType.
     */
    @java.lang.Override
    public com.hearlers.api.proto.v1.model.CounselorType getCounselorType() {
      com.hearlers.api.proto.v1.model.CounselorType result = com.hearlers.api.proto.v1.model.CounselorType.forNumber(counselorType_);
      return result == null ? com.hearlers.api.proto.v1.model.CounselorType.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.hearlers.v1.model.CounselorType counselor_type = 2 [json_name = "counselorType"];</code>
     * @param value The counselorType to set.
     * @return This builder for chaining.
     */
    public Builder setCounselorType(com.hearlers.api.proto.v1.model.CounselorType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      counselorType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.CounselorType counselor_type = 2 [json_name = "counselorType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCounselorType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      counselorType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 3 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 3 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 3 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 4 [json_name = "description"];</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 4 [json_name = "description"];</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 4 [json_name = "description"];</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 4 [json_name = "description"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string description = 4 [json_name = "description"];</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private int counselorGender_ = 0;
    /**
     * <code>.com.hearlers.v1.model.CounselorGender counselor_gender = 5 [json_name = "counselorGender"];</code>
     * @return The enum numeric value on the wire for counselorGender.
     */
    @java.lang.Override public int getCounselorGenderValue() {
      return counselorGender_;
    }
    /**
     * <code>.com.hearlers.v1.model.CounselorGender counselor_gender = 5 [json_name = "counselorGender"];</code>
     * @param value The enum numeric value on the wire for counselorGender to set.
     * @return This builder for chaining.
     */
    public Builder setCounselorGenderValue(int value) {
      counselorGender_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.CounselorGender counselor_gender = 5 [json_name = "counselorGender"];</code>
     * @return The counselorGender.
     */
    @java.lang.Override
    public com.hearlers.api.proto.v1.model.CounselorGender getCounselorGender() {
      com.hearlers.api.proto.v1.model.CounselorGender result = com.hearlers.api.proto.v1.model.CounselorGender.forNumber(counselorGender_);
      return result == null ? com.hearlers.api.proto.v1.model.CounselorGender.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.hearlers.v1.model.CounselorGender counselor_gender = 5 [json_name = "counselorGender"];</code>
     * @param value The counselorGender to set.
     * @return This builder for chaining.
     */
    public Builder setCounselorGender(com.hearlers.api.proto.v1.model.CounselorGender value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      counselorGender_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.CounselorGender counselor_gender = 5 [json_name = "counselorGender"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCounselorGender() {
      bitField0_ = (bitField0_ & ~0x00000010);
      counselorGender_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.UpdateCounselorRequest)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.UpdateCounselorRequest)
  private static final com.hearlers.api.proto.v1.service.UpdateCounselorRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.UpdateCounselorRequest();
  }

  public static com.hearlers.api.proto.v1.service.UpdateCounselorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCounselorRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateCounselorRequest>() {
    @java.lang.Override
    public UpdateCounselorRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<UpdateCounselorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCounselorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.UpdateCounselorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

