// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/user.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * <pre>
 * updateAuthority
 * </pre>
 *
 * Protobuf type {@code com.hearlers.v1.service.UpdateAuthorityRequest}
 */
public final class UpdateAuthorityRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.UpdateAuthorityRequest)
    UpdateAuthorityRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      UpdateAuthorityRequest.class.getName());
  }
  // Use UpdateAuthorityRequest.newBuilder() to construct.
  private UpdateAuthorityRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateAuthorityRequest() {
    authUserId_ = "";
    authority_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.User.internal_static_com_hearlers_v1_service_UpdateAuthorityRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.User.internal_static_com_hearlers_v1_service_UpdateAuthorityRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.UpdateAuthorityRequest.class, com.hearlers.api.proto.v1.service.UpdateAuthorityRequest.Builder.class);
  }

  public static final int AUTH_USER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object authUserId_ = "";
  /**
   * <code>string auth_user_id = 1 [json_name = "authUserId"];</code>
   * @return The authUserId.
   */
  @java.lang.Override
  public java.lang.String getAuthUserId() {
    java.lang.Object ref = authUserId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      authUserId_ = s;
      return s;
    }
  }
  /**
   * <code>string auth_user_id = 1 [json_name = "authUserId"];</code>
   * @return The bytes for authUserId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAuthUserIdBytes() {
    java.lang.Object ref = authUserId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      authUserId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUTHORITY_FIELD_NUMBER = 2;
  private int authority_ = 0;
  /**
   * <code>.com.hearlers.v1.model.Authority authority = 2 [json_name = "authority"];</code>
   * @return The enum numeric value on the wire for authority.
   */
  @java.lang.Override public int getAuthorityValue() {
    return authority_;
  }
  /**
   * <code>.com.hearlers.v1.model.Authority authority = 2 [json_name = "authority"];</code>
   * @return The authority.
   */
  @java.lang.Override public com.hearlers.api.proto.v1.model.Authority getAuthority() {
    com.hearlers.api.proto.v1.model.Authority result = com.hearlers.api.proto.v1.model.Authority.forNumber(authority_);
    return result == null ? com.hearlers.api.proto.v1.model.Authority.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(authUserId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, authUserId_);
    }
    if (authority_ != com.hearlers.api.proto.v1.model.Authority.AUTHORITY_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, authority_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(authUserId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, authUserId_);
    }
    if (authority_ != com.hearlers.api.proto.v1.model.Authority.AUTHORITY_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, authority_);
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.UpdateAuthorityRequest)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.UpdateAuthorityRequest other = (com.hearlers.api.proto.v1.service.UpdateAuthorityRequest) obj;

    if (!getAuthUserId()
        .equals(other.getAuthUserId())) return false;
    if (authority_ != other.authority_) return false;
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
    hash = (37 * hash) + AUTH_USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAuthUserId().hashCode();
    hash = (37 * hash) + AUTHORITY_FIELD_NUMBER;
    hash = (53 * hash) + authority_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.UpdateAuthorityRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.UpdateAuthorityRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.UpdateAuthorityRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.UpdateAuthorityRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.UpdateAuthorityRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.UpdateAuthorityRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.UpdateAuthorityRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.UpdateAuthorityRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.UpdateAuthorityRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.UpdateAuthorityRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.UpdateAuthorityRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.UpdateAuthorityRequest parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.UpdateAuthorityRequest prototype) {
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
   * updateAuthority
   * </pre>
   *
   * Protobuf type {@code com.hearlers.v1.service.UpdateAuthorityRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.UpdateAuthorityRequest)
      com.hearlers.api.proto.v1.service.UpdateAuthorityRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.User.internal_static_com_hearlers_v1_service_UpdateAuthorityRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.User.internal_static_com_hearlers_v1_service_UpdateAuthorityRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.UpdateAuthorityRequest.class, com.hearlers.api.proto.v1.service.UpdateAuthorityRequest.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.UpdateAuthorityRequest.newBuilder()
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
      authUserId_ = "";
      authority_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.User.internal_static_com_hearlers_v1_service_UpdateAuthorityRequest_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.UpdateAuthorityRequest getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.UpdateAuthorityRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.UpdateAuthorityRequest build() {
      com.hearlers.api.proto.v1.service.UpdateAuthorityRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.UpdateAuthorityRequest buildPartial() {
      com.hearlers.api.proto.v1.service.UpdateAuthorityRequest result = new com.hearlers.api.proto.v1.service.UpdateAuthorityRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.UpdateAuthorityRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.authUserId_ = authUserId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.authority_ = authority_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.UpdateAuthorityRequest) {
        return mergeFrom((com.hearlers.api.proto.v1.service.UpdateAuthorityRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.UpdateAuthorityRequest other) {
      if (other == com.hearlers.api.proto.v1.service.UpdateAuthorityRequest.getDefaultInstance()) return this;
      if (!other.getAuthUserId().isEmpty()) {
        authUserId_ = other.authUserId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.authority_ != 0) {
        setAuthorityValue(other.getAuthorityValue());
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
              authUserId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              authority_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.lang.Object authUserId_ = "";
    /**
     * <code>string auth_user_id = 1 [json_name = "authUserId"];</code>
     * @return The authUserId.
     */
    public java.lang.String getAuthUserId() {
      java.lang.Object ref = authUserId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authUserId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string auth_user_id = 1 [json_name = "authUserId"];</code>
     * @return The bytes for authUserId.
     */
    public com.google.protobuf.ByteString
        getAuthUserIdBytes() {
      java.lang.Object ref = authUserId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authUserId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string auth_user_id = 1 [json_name = "authUserId"];</code>
     * @param value The authUserId to set.
     * @return This builder for chaining.
     */
    public Builder setAuthUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      authUserId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string auth_user_id = 1 [json_name = "authUserId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthUserId() {
      authUserId_ = getDefaultInstance().getAuthUserId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string auth_user_id = 1 [json_name = "authUserId"];</code>
     * @param value The bytes for authUserId to set.
     * @return This builder for chaining.
     */
    public Builder setAuthUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      authUserId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int authority_ = 0;
    /**
     * <code>.com.hearlers.v1.model.Authority authority = 2 [json_name = "authority"];</code>
     * @return The enum numeric value on the wire for authority.
     */
    @java.lang.Override public int getAuthorityValue() {
      return authority_;
    }
    /**
     * <code>.com.hearlers.v1.model.Authority authority = 2 [json_name = "authority"];</code>
     * @param value The enum numeric value on the wire for authority to set.
     * @return This builder for chaining.
     */
    public Builder setAuthorityValue(int value) {
      authority_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.Authority authority = 2 [json_name = "authority"];</code>
     * @return The authority.
     */
    @java.lang.Override
    public com.hearlers.api.proto.v1.model.Authority getAuthority() {
      com.hearlers.api.proto.v1.model.Authority result = com.hearlers.api.proto.v1.model.Authority.forNumber(authority_);
      return result == null ? com.hearlers.api.proto.v1.model.Authority.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.hearlers.v1.model.Authority authority = 2 [json_name = "authority"];</code>
     * @param value The authority to set.
     * @return This builder for chaining.
     */
    public Builder setAuthority(com.hearlers.api.proto.v1.model.Authority value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      authority_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.Authority authority = 2 [json_name = "authority"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthority() {
      bitField0_ = (bitField0_ & ~0x00000002);
      authority_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.UpdateAuthorityRequest)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.UpdateAuthorityRequest)
  private static final com.hearlers.api.proto.v1.service.UpdateAuthorityRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.UpdateAuthorityRequest();
  }

  public static com.hearlers.api.proto.v1.service.UpdateAuthorityRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAuthorityRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateAuthorityRequest>() {
    @java.lang.Override
    public UpdateAuthorityRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateAuthorityRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAuthorityRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.UpdateAuthorityRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

