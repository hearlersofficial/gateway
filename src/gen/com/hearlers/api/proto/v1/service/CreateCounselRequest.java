// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * <pre>
 * 상담
 * 현재 활성화된 프롬프트 버전 적용
 * </pre>
 *
 * Protobuf type {@code com.hearlers.v1.service.CreateCounselRequest}
 */
public final class CreateCounselRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.CreateCounselRequest)
    CreateCounselRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      CreateCounselRequest.class.getName());
  }
  // Use CreateCounselRequest.newBuilder() to construct.
  private CreateCounselRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CreateCounselRequest() {
    userId_ = "";
    counselorId_ = "";
    bubbleId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreateCounselRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreateCounselRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.CreateCounselRequest.class, com.hearlers.api.proto.v1.service.CreateCounselRequest.Builder.class);
  }

  private int bitField0_;
  public static final int USER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userId_ = "";
  /**
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNSELOR_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object counselorId_ = "";
  /**
   * <code>string counselor_id = 2 [json_name = "counselorId"];</code>
   * @return The counselorId.
   */
  @java.lang.Override
  public java.lang.String getCounselorId() {
    java.lang.Object ref = counselorId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      counselorId_ = s;
      return s;
    }
  }
  /**
   * <code>string counselor_id = 2 [json_name = "counselorId"];</code>
   * @return The bytes for counselorId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCounselorIdBytes() {
    java.lang.Object ref = counselorId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      counselorId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BUBBLEID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bubbleId_ = "";
  /**
   * <code>optional string bubbleId = 3 [json_name = "bubbleId"];</code>
   * @return Whether the bubbleId field is set.
   */
  @java.lang.Override
  public boolean hasBubbleId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string bubbleId = 3 [json_name = "bubbleId"];</code>
   * @return The bubbleId.
   */
  @java.lang.Override
  public java.lang.String getBubbleId() {
    java.lang.Object ref = bubbleId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bubbleId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string bubbleId = 3 [json_name = "bubbleId"];</code>
   * @return The bytes for bubbleId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBubbleIdBytes() {
    java.lang.Object ref = bubbleId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bubbleId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESPONSEOPTIONNO_FIELD_NUMBER = 4;
  private int responseOptionNo_ = 0;
  /**
   * <code>optional int32 responseOptionNo = 4 [json_name = "responseOptionNo"];</code>
   * @return Whether the responseOptionNo field is set.
   */
  @java.lang.Override
  public boolean hasResponseOptionNo() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 responseOptionNo = 4 [json_name = "responseOptionNo"];</code>
   * @return The responseOptionNo.
   */
  @java.lang.Override
  public int getResponseOptionNo() {
    return responseOptionNo_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, userId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(counselorId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, counselorId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, bubbleId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(4, responseOptionNo_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, userId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(counselorId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, counselorId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, bubbleId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, responseOptionNo_);
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.CreateCounselRequest)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.CreateCounselRequest other = (com.hearlers.api.proto.v1.service.CreateCounselRequest) obj;

    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (!getCounselorId()
        .equals(other.getCounselorId())) return false;
    if (hasBubbleId() != other.hasBubbleId()) return false;
    if (hasBubbleId()) {
      if (!getBubbleId()
          .equals(other.getBubbleId())) return false;
    }
    if (hasResponseOptionNo() != other.hasResponseOptionNo()) return false;
    if (hasResponseOptionNo()) {
      if (getResponseOptionNo()
          != other.getResponseOptionNo()) return false;
    }
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + COUNSELOR_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCounselorId().hashCode();
    if (hasBubbleId()) {
      hash = (37 * hash) + BUBBLEID_FIELD_NUMBER;
      hash = (53 * hash) + getBubbleId().hashCode();
    }
    if (hasResponseOptionNo()) {
      hash = (37 * hash) + RESPONSEOPTIONNO_FIELD_NUMBER;
      hash = (53 * hash) + getResponseOptionNo();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.CreateCounselRequest prototype) {
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
   * <pre>
   * 상담
   * 현재 활성화된 프롬프트 버전 적용
   * </pre>
   *
   * Protobuf type {@code com.hearlers.v1.service.CreateCounselRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.CreateCounselRequest)
      com.hearlers.api.proto.v1.service.CreateCounselRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreateCounselRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreateCounselRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.CreateCounselRequest.class, com.hearlers.api.proto.v1.service.CreateCounselRequest.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.CreateCounselRequest.newBuilder()
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
      userId_ = "";
      counselorId_ = "";
      bubbleId_ = "";
      responseOptionNo_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreateCounselRequest_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.CreateCounselRequest getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.CreateCounselRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.CreateCounselRequest build() {
      com.hearlers.api.proto.v1.service.CreateCounselRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.CreateCounselRequest buildPartial() {
      com.hearlers.api.proto.v1.service.CreateCounselRequest result = new com.hearlers.api.proto.v1.service.CreateCounselRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.CreateCounselRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userId_ = userId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.counselorId_ = counselorId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.bubbleId_ = bubbleId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.responseOptionNo_ = responseOptionNo_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.CreateCounselRequest) {
        return mergeFrom((com.hearlers.api.proto.v1.service.CreateCounselRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.CreateCounselRequest other) {
      if (other == com.hearlers.api.proto.v1.service.CreateCounselRequest.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCounselorId().isEmpty()) {
        counselorId_ = other.counselorId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasBubbleId()) {
        bubbleId_ = other.bubbleId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasResponseOptionNo()) {
        setResponseOptionNo(other.getResponseOptionNo());
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
            case 10: {
              userId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              counselorId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              bubbleId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              responseOptionNo_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object userId_ = "";
    /**
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      userId_ = getDefaultInstance().getUserId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object counselorId_ = "";
    /**
     * <code>string counselor_id = 2 [json_name = "counselorId"];</code>
     * @return The counselorId.
     */
    public java.lang.String getCounselorId() {
      java.lang.Object ref = counselorId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        counselorId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string counselor_id = 2 [json_name = "counselorId"];</code>
     * @return The bytes for counselorId.
     */
    public com.google.protobuf.ByteString
        getCounselorIdBytes() {
      java.lang.Object ref = counselorId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        counselorId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string counselor_id = 2 [json_name = "counselorId"];</code>
     * @param value The counselorId to set.
     * @return This builder for chaining.
     */
    public Builder setCounselorId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      counselorId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string counselor_id = 2 [json_name = "counselorId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCounselorId() {
      counselorId_ = getDefaultInstance().getCounselorId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string counselor_id = 2 [json_name = "counselorId"];</code>
     * @param value The bytes for counselorId to set.
     * @return This builder for chaining.
     */
    public Builder setCounselorIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      counselorId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object bubbleId_ = "";
    /**
     * <code>optional string bubbleId = 3 [json_name = "bubbleId"];</code>
     * @return Whether the bubbleId field is set.
     */
    public boolean hasBubbleId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string bubbleId = 3 [json_name = "bubbleId"];</code>
     * @return The bubbleId.
     */
    public java.lang.String getBubbleId() {
      java.lang.Object ref = bubbleId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bubbleId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string bubbleId = 3 [json_name = "bubbleId"];</code>
     * @return The bytes for bubbleId.
     */
    public com.google.protobuf.ByteString
        getBubbleIdBytes() {
      java.lang.Object ref = bubbleId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bubbleId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string bubbleId = 3 [json_name = "bubbleId"];</code>
     * @param value The bubbleId to set.
     * @return This builder for chaining.
     */
    public Builder setBubbleId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bubbleId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional string bubbleId = 3 [json_name = "bubbleId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBubbleId() {
      bubbleId_ = getDefaultInstance().getBubbleId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>optional string bubbleId = 3 [json_name = "bubbleId"];</code>
     * @param value The bytes for bubbleId to set.
     * @return This builder for chaining.
     */
    public Builder setBubbleIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bubbleId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int responseOptionNo_ ;
    /**
     * <code>optional int32 responseOptionNo = 4 [json_name = "responseOptionNo"];</code>
     * @return Whether the responseOptionNo field is set.
     */
    @java.lang.Override
    public boolean hasResponseOptionNo() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional int32 responseOptionNo = 4 [json_name = "responseOptionNo"];</code>
     * @return The responseOptionNo.
     */
    @java.lang.Override
    public int getResponseOptionNo() {
      return responseOptionNo_;
    }
    /**
     * <code>optional int32 responseOptionNo = 4 [json_name = "responseOptionNo"];</code>
     * @param value The responseOptionNo to set.
     * @return This builder for chaining.
     */
    public Builder setResponseOptionNo(int value) {

      responseOptionNo_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 responseOptionNo = 4 [json_name = "responseOptionNo"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResponseOptionNo() {
      bitField0_ = (bitField0_ & ~0x00000008);
      responseOptionNo_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.CreateCounselRequest)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.CreateCounselRequest)
  private static final com.hearlers.api.proto.v1.service.CreateCounselRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.CreateCounselRequest();
  }

  public static com.hearlers.api.proto.v1.service.CreateCounselRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCounselRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateCounselRequest>() {
    @java.lang.Override
    public CreateCounselRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCounselRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCounselRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.CreateCounselRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

