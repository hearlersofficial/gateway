// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel_prompt.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.CreateCounselTechniqueResponse}
 */
public final class CreateCounselTechniqueResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.CreateCounselTechniqueResponse)
    CreateCounselTechniqueResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      CreateCounselTechniqueResponse.class.getName());
  }
  // Use CreateCounselTechniqueResponse.newBuilder() to construct.
  private CreateCounselTechniqueResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CreateCounselTechniqueResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_CreateCounselTechniqueResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_CreateCounselTechniqueResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse.class, com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse.Builder.class);
  }

  private int bitField0_;
  public static final int COUNSEL_TECHNIQUE_FIELD_NUMBER = 1;
  private com.hearlers.api.proto.v1.model.CounselTechnique counselTechnique_;
  /**
   * <code>.com.hearlers.v1.model.CounselTechnique counsel_technique = 1 [json_name = "counselTechnique"];</code>
   * @return Whether the counselTechnique field is set.
   */
  @java.lang.Override
  public boolean hasCounselTechnique() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.com.hearlers.v1.model.CounselTechnique counsel_technique = 1 [json_name = "counselTechnique"];</code>
   * @return The counselTechnique.
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.CounselTechnique getCounselTechnique() {
    return counselTechnique_ == null ? com.hearlers.api.proto.v1.model.CounselTechnique.getDefaultInstance() : counselTechnique_;
  }
  /**
   * <code>.com.hearlers.v1.model.CounselTechnique counsel_technique = 1 [json_name = "counselTechnique"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.CounselTechniqueOrBuilder getCounselTechniqueOrBuilder() {
    return counselTechnique_ == null ? com.hearlers.api.proto.v1.model.CounselTechnique.getDefaultInstance() : counselTechnique_;
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
      output.writeMessage(1, getCounselTechnique());
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
        .computeMessageSize(1, getCounselTechnique());
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse other = (com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse) obj;

    if (hasCounselTechnique() != other.hasCounselTechnique()) return false;
    if (hasCounselTechnique()) {
      if (!getCounselTechnique()
          .equals(other.getCounselTechnique())) return false;
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
    if (hasCounselTechnique()) {
      hash = (37 * hash) + COUNSEL_TECHNIQUE_FIELD_NUMBER;
      hash = (53 * hash) + getCounselTechnique().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse prototype) {
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
   * Protobuf type {@code com.hearlers.v1.service.CreateCounselTechniqueResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.CreateCounselTechniqueResponse)
      com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_CreateCounselTechniqueResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_CreateCounselTechniqueResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse.class, com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse.newBuilder()
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
        getCounselTechniqueFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      counselTechnique_ = null;
      if (counselTechniqueBuilder_ != null) {
        counselTechniqueBuilder_.dispose();
        counselTechniqueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_CreateCounselTechniqueResponse_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse build() {
      com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse buildPartial() {
      com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse result = new com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.counselTechnique_ = counselTechniqueBuilder_ == null
            ? counselTechnique_
            : counselTechniqueBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse) {
        return mergeFrom((com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse other) {
      if (other == com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse.getDefaultInstance()) return this;
      if (other.hasCounselTechnique()) {
        mergeCounselTechnique(other.getCounselTechnique());
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
                  getCounselTechniqueFieldBuilder().getBuilder(),
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

    private com.hearlers.api.proto.v1.model.CounselTechnique counselTechnique_;
    private com.google.protobuf.SingleFieldBuilder<
        com.hearlers.api.proto.v1.model.CounselTechnique, com.hearlers.api.proto.v1.model.CounselTechnique.Builder, com.hearlers.api.proto.v1.model.CounselTechniqueOrBuilder> counselTechniqueBuilder_;
    /**
     * <code>.com.hearlers.v1.model.CounselTechnique counsel_technique = 1 [json_name = "counselTechnique"];</code>
     * @return Whether the counselTechnique field is set.
     */
    public boolean hasCounselTechnique() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.com.hearlers.v1.model.CounselTechnique counsel_technique = 1 [json_name = "counselTechnique"];</code>
     * @return The counselTechnique.
     */
    public com.hearlers.api.proto.v1.model.CounselTechnique getCounselTechnique() {
      if (counselTechniqueBuilder_ == null) {
        return counselTechnique_ == null ? com.hearlers.api.proto.v1.model.CounselTechnique.getDefaultInstance() : counselTechnique_;
      } else {
        return counselTechniqueBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.hearlers.v1.model.CounselTechnique counsel_technique = 1 [json_name = "counselTechnique"];</code>
     */
    public Builder setCounselTechnique(com.hearlers.api.proto.v1.model.CounselTechnique value) {
      if (counselTechniqueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        counselTechnique_ = value;
      } else {
        counselTechniqueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.CounselTechnique counsel_technique = 1 [json_name = "counselTechnique"];</code>
     */
    public Builder setCounselTechnique(
        com.hearlers.api.proto.v1.model.CounselTechnique.Builder builderForValue) {
      if (counselTechniqueBuilder_ == null) {
        counselTechnique_ = builderForValue.build();
      } else {
        counselTechniqueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.CounselTechnique counsel_technique = 1 [json_name = "counselTechnique"];</code>
     */
    public Builder mergeCounselTechnique(com.hearlers.api.proto.v1.model.CounselTechnique value) {
      if (counselTechniqueBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          counselTechnique_ != null &&
          counselTechnique_ != com.hearlers.api.proto.v1.model.CounselTechnique.getDefaultInstance()) {
          getCounselTechniqueBuilder().mergeFrom(value);
        } else {
          counselTechnique_ = value;
        }
      } else {
        counselTechniqueBuilder_.mergeFrom(value);
      }
      if (counselTechnique_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.CounselTechnique counsel_technique = 1 [json_name = "counselTechnique"];</code>
     */
    public Builder clearCounselTechnique() {
      bitField0_ = (bitField0_ & ~0x00000001);
      counselTechnique_ = null;
      if (counselTechniqueBuilder_ != null) {
        counselTechniqueBuilder_.dispose();
        counselTechniqueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.CounselTechnique counsel_technique = 1 [json_name = "counselTechnique"];</code>
     */
    public com.hearlers.api.proto.v1.model.CounselTechnique.Builder getCounselTechniqueBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCounselTechniqueFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.hearlers.v1.model.CounselTechnique counsel_technique = 1 [json_name = "counselTechnique"];</code>
     */
    public com.hearlers.api.proto.v1.model.CounselTechniqueOrBuilder getCounselTechniqueOrBuilder() {
      if (counselTechniqueBuilder_ != null) {
        return counselTechniqueBuilder_.getMessageOrBuilder();
      } else {
        return counselTechnique_ == null ?
            com.hearlers.api.proto.v1.model.CounselTechnique.getDefaultInstance() : counselTechnique_;
      }
    }
    /**
     * <code>.com.hearlers.v1.model.CounselTechnique counsel_technique = 1 [json_name = "counselTechnique"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.hearlers.api.proto.v1.model.CounselTechnique, com.hearlers.api.proto.v1.model.CounselTechnique.Builder, com.hearlers.api.proto.v1.model.CounselTechniqueOrBuilder> 
        getCounselTechniqueFieldBuilder() {
      if (counselTechniqueBuilder_ == null) {
        counselTechniqueBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.hearlers.api.proto.v1.model.CounselTechnique, com.hearlers.api.proto.v1.model.CounselTechnique.Builder, com.hearlers.api.proto.v1.model.CounselTechniqueOrBuilder>(
                getCounselTechnique(),
                getParentForChildren(),
                isClean());
        counselTechnique_ = null;
      }
      return counselTechniqueBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.CreateCounselTechniqueResponse)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.CreateCounselTechniqueResponse)
  private static final com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse();
  }

  public static com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCounselTechniqueResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateCounselTechniqueResponse>() {
    @java.lang.Override
    public CreateCounselTechniqueResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCounselTechniqueResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCounselTechniqueResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.CreateCounselTechniqueResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

