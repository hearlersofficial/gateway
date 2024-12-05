// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/service/user.proto
// Protobuf Java Version: 4.29.0

package com.com.hearlers.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.FindOneAuthUserResponse}
 */
public final class FindOneAuthUserResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.FindOneAuthUserResponse)
    FindOneAuthUserResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      FindOneAuthUserResponse.class.getName());
  }
  // Use FindOneAuthUserResponse.newBuilder() to construct.
  private FindOneAuthUserResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FindOneAuthUserResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.com.hearlers.v1.service.UserProto.internal_static_com_hearlers_v1_service_FindOneAuthUserResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.com.hearlers.v1.service.UserProto.internal_static_com_hearlers_v1_service_FindOneAuthUserResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.com.hearlers.v1.service.FindOneAuthUserResponse.class, com.com.hearlers.v1.service.FindOneAuthUserResponse.Builder.class);
  }

  private int bitField0_;
  public static final int AUTH_USER_FIELD_NUMBER = 1;
  private com.com.hearlers.v1.model.AuthUser authUser_;
  /**
   * <code>.com.hearlers.v1.model.AuthUser auth_user = 1 [json_name = "authUser"];</code>
   * @return Whether the authUser field is set.
   */
  @java.lang.Override
  public boolean hasAuthUser() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.com.hearlers.v1.model.AuthUser auth_user = 1 [json_name = "authUser"];</code>
   * @return The authUser.
   */
  @java.lang.Override
  public com.com.hearlers.v1.model.AuthUser getAuthUser() {
    return authUser_ == null ? com.com.hearlers.v1.model.AuthUser.getDefaultInstance() : authUser_;
  }
  /**
   * <code>.com.hearlers.v1.model.AuthUser auth_user = 1 [json_name = "authUser"];</code>
   */
  @java.lang.Override
  public com.com.hearlers.v1.model.AuthUserOrBuilder getAuthUserOrBuilder() {
    return authUser_ == null ? com.com.hearlers.v1.model.AuthUser.getDefaultInstance() : authUser_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getAuthUser());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAuthUser());
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
    if (!(obj instanceof com.com.hearlers.v1.service.FindOneAuthUserResponse)) {
      return super.equals(obj);
    }
    com.com.hearlers.v1.service.FindOneAuthUserResponse other = (com.com.hearlers.v1.service.FindOneAuthUserResponse) obj;

    if (hasAuthUser() != other.hasAuthUser()) return false;
    if (hasAuthUser()) {
      if (!getAuthUser()
          .equals(other.getAuthUser())) return false;
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
    if (hasAuthUser()) {
      hash = (37 * hash) + AUTH_USER_FIELD_NUMBER;
      hash = (53 * hash) + getAuthUser().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.com.hearlers.v1.service.FindOneAuthUserResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.com.hearlers.v1.service.FindOneAuthUserResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.com.hearlers.v1.service.FindOneAuthUserResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.com.hearlers.v1.service.FindOneAuthUserResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.com.hearlers.v1.service.FindOneAuthUserResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.com.hearlers.v1.service.FindOneAuthUserResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.com.hearlers.v1.service.FindOneAuthUserResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.com.hearlers.v1.service.FindOneAuthUserResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.com.hearlers.v1.service.FindOneAuthUserResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.com.hearlers.v1.service.FindOneAuthUserResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.com.hearlers.v1.service.FindOneAuthUserResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.com.hearlers.v1.service.FindOneAuthUserResponse parseFrom(
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
  public static Builder newBuilder(com.com.hearlers.v1.service.FindOneAuthUserResponse prototype) {
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
   * Protobuf type {@code com.hearlers.v1.service.FindOneAuthUserResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.FindOneAuthUserResponse)
      com.com.hearlers.v1.service.FindOneAuthUserResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.com.hearlers.v1.service.UserProto.internal_static_com_hearlers_v1_service_FindOneAuthUserResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.com.hearlers.v1.service.UserProto.internal_static_com_hearlers_v1_service_FindOneAuthUserResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.com.hearlers.v1.service.FindOneAuthUserResponse.class, com.com.hearlers.v1.service.FindOneAuthUserResponse.Builder.class);
    }

    // Construct using com.com.hearlers.v1.service.FindOneAuthUserResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getAuthUserFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      authUser_ = null;
      if (authUserBuilder_ != null) {
        authUserBuilder_.dispose();
        authUserBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.com.hearlers.v1.service.UserProto.internal_static_com_hearlers_v1_service_FindOneAuthUserResponse_descriptor;
    }

    @java.lang.Override
    public com.com.hearlers.v1.service.FindOneAuthUserResponse getDefaultInstanceForType() {
      return com.com.hearlers.v1.service.FindOneAuthUserResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.com.hearlers.v1.service.FindOneAuthUserResponse build() {
      com.com.hearlers.v1.service.FindOneAuthUserResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.com.hearlers.v1.service.FindOneAuthUserResponse buildPartial() {
      com.com.hearlers.v1.service.FindOneAuthUserResponse result = new com.com.hearlers.v1.service.FindOneAuthUserResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.com.hearlers.v1.service.FindOneAuthUserResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.authUser_ = authUserBuilder_ == null
            ? authUser_
            : authUserBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.com.hearlers.v1.service.FindOneAuthUserResponse) {
        return mergeFrom((com.com.hearlers.v1.service.FindOneAuthUserResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.com.hearlers.v1.service.FindOneAuthUserResponse other) {
      if (other == com.com.hearlers.v1.service.FindOneAuthUserResponse.getDefaultInstance()) return this;
      if (other.hasAuthUser()) {
        mergeAuthUser(other.getAuthUser());
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
              input.readMessage(
                  getAuthUserFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.com.hearlers.v1.model.AuthUser authUser_;
    private com.google.protobuf.SingleFieldBuilder<
        com.com.hearlers.v1.model.AuthUser, com.com.hearlers.v1.model.AuthUser.Builder, com.com.hearlers.v1.model.AuthUserOrBuilder> authUserBuilder_;
    /**
     * <code>.com.hearlers.v1.model.AuthUser auth_user = 1 [json_name = "authUser"];</code>
     * @return Whether the authUser field is set.
     */
    public boolean hasAuthUser() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.com.hearlers.v1.model.AuthUser auth_user = 1 [json_name = "authUser"];</code>
     * @return The authUser.
     */
    public com.com.hearlers.v1.model.AuthUser getAuthUser() {
      if (authUserBuilder_ == null) {
        return authUser_ == null ? com.com.hearlers.v1.model.AuthUser.getDefaultInstance() : authUser_;
      } else {
        return authUserBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.hearlers.v1.model.AuthUser auth_user = 1 [json_name = "authUser"];</code>
     */
    public Builder setAuthUser(com.com.hearlers.v1.model.AuthUser value) {
      if (authUserBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        authUser_ = value;
      } else {
        authUserBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.AuthUser auth_user = 1 [json_name = "authUser"];</code>
     */
    public Builder setAuthUser(
        com.com.hearlers.v1.model.AuthUser.Builder builderForValue) {
      if (authUserBuilder_ == null) {
        authUser_ = builderForValue.build();
      } else {
        authUserBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.AuthUser auth_user = 1 [json_name = "authUser"];</code>
     */
    public Builder mergeAuthUser(com.com.hearlers.v1.model.AuthUser value) {
      if (authUserBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          authUser_ != null &&
          authUser_ != com.com.hearlers.v1.model.AuthUser.getDefaultInstance()) {
          getAuthUserBuilder().mergeFrom(value);
        } else {
          authUser_ = value;
        }
      } else {
        authUserBuilder_.mergeFrom(value);
      }
      if (authUser_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.AuthUser auth_user = 1 [json_name = "authUser"];</code>
     */
    public Builder clearAuthUser() {
      bitField0_ = (bitField0_ & ~0x00000001);
      authUser_ = null;
      if (authUserBuilder_ != null) {
        authUserBuilder_.dispose();
        authUserBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.AuthUser auth_user = 1 [json_name = "authUser"];</code>
     */
    public com.com.hearlers.v1.model.AuthUser.Builder getAuthUserBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAuthUserFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.hearlers.v1.model.AuthUser auth_user = 1 [json_name = "authUser"];</code>
     */
    public com.com.hearlers.v1.model.AuthUserOrBuilder getAuthUserOrBuilder() {
      if (authUserBuilder_ != null) {
        return authUserBuilder_.getMessageOrBuilder();
      } else {
        return authUser_ == null ?
            com.com.hearlers.v1.model.AuthUser.getDefaultInstance() : authUser_;
      }
    }
    /**
     * <code>.com.hearlers.v1.model.AuthUser auth_user = 1 [json_name = "authUser"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.com.hearlers.v1.model.AuthUser, com.com.hearlers.v1.model.AuthUser.Builder, com.com.hearlers.v1.model.AuthUserOrBuilder> 
        getAuthUserFieldBuilder() {
      if (authUserBuilder_ == null) {
        authUserBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.com.hearlers.v1.model.AuthUser, com.com.hearlers.v1.model.AuthUser.Builder, com.com.hearlers.v1.model.AuthUserOrBuilder>(
                getAuthUser(),
                getParentForChildren(),
                isClean());
        authUser_ = null;
      }
      return authUserBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.FindOneAuthUserResponse)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.FindOneAuthUserResponse)
  private static final com.com.hearlers.v1.service.FindOneAuthUserResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.com.hearlers.v1.service.FindOneAuthUserResponse();
  }

  public static com.com.hearlers.v1.service.FindOneAuthUserResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindOneAuthUserResponse>
      PARSER = new com.google.protobuf.AbstractParser<FindOneAuthUserResponse>() {
    @java.lang.Override
    public FindOneAuthUserResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<FindOneAuthUserResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindOneAuthUserResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.com.hearlers.v1.service.FindOneAuthUserResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

