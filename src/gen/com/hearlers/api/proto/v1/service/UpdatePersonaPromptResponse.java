// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel_prompt.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.UpdatePersonaPromptResponse}
 */
public final class UpdatePersonaPromptResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.UpdatePersonaPromptResponse)
    UpdatePersonaPromptResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      UpdatePersonaPromptResponse.class.getName());
  }
  // Use UpdatePersonaPromptResponse.newBuilder() to construct.
  private UpdatePersonaPromptResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdatePersonaPromptResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_UpdatePersonaPromptResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_UpdatePersonaPromptResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse.class, com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse.Builder.class);
  }

  private int bitField0_;
  public static final int PERSONA_PROMPT_FIELD_NUMBER = 1;
  private com.hearlers.api.proto.v1.model.PersonaPrompt personaPrompt_;
  /**
   * <code>optional .com.hearlers.v1.model.PersonaPrompt persona_prompt = 1 [json_name = "personaPrompt"];</code>
   * @return Whether the personaPrompt field is set.
   */
  @java.lang.Override
  public boolean hasPersonaPrompt() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .com.hearlers.v1.model.PersonaPrompt persona_prompt = 1 [json_name = "personaPrompt"];</code>
   * @return The personaPrompt.
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.PersonaPrompt getPersonaPrompt() {
    return personaPrompt_ == null ? com.hearlers.api.proto.v1.model.PersonaPrompt.getDefaultInstance() : personaPrompt_;
  }
  /**
   * <code>optional .com.hearlers.v1.model.PersonaPrompt persona_prompt = 1 [json_name = "personaPrompt"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.PersonaPromptOrBuilder getPersonaPromptOrBuilder() {
    return personaPrompt_ == null ? com.hearlers.api.proto.v1.model.PersonaPrompt.getDefaultInstance() : personaPrompt_;
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
      output.writeMessage(1, getPersonaPrompt());
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
        .computeMessageSize(1, getPersonaPrompt());
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse other = (com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse) obj;

    if (hasPersonaPrompt() != other.hasPersonaPrompt()) return false;
    if (hasPersonaPrompt()) {
      if (!getPersonaPrompt()
          .equals(other.getPersonaPrompt())) return false;
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
    if (hasPersonaPrompt()) {
      hash = (37 * hash) + PERSONA_PROMPT_FIELD_NUMBER;
      hash = (53 * hash) + getPersonaPrompt().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse prototype) {
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
   * Protobuf type {@code com.hearlers.v1.service.UpdatePersonaPromptResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.UpdatePersonaPromptResponse)
      com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_UpdatePersonaPromptResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_UpdatePersonaPromptResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse.class, com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse.newBuilder()
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
        getPersonaPromptFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      personaPrompt_ = null;
      if (personaPromptBuilder_ != null) {
        personaPromptBuilder_.dispose();
        personaPromptBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_UpdatePersonaPromptResponse_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse build() {
      com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse buildPartial() {
      com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse result = new com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.personaPrompt_ = personaPromptBuilder_ == null
            ? personaPrompt_
            : personaPromptBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse) {
        return mergeFrom((com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse other) {
      if (other == com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse.getDefaultInstance()) return this;
      if (other.hasPersonaPrompt()) {
        mergePersonaPrompt(other.getPersonaPrompt());
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
                  getPersonaPromptFieldBuilder().getBuilder(),
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

    private com.hearlers.api.proto.v1.model.PersonaPrompt personaPrompt_;
    private com.google.protobuf.SingleFieldBuilder<
        com.hearlers.api.proto.v1.model.PersonaPrompt, com.hearlers.api.proto.v1.model.PersonaPrompt.Builder, com.hearlers.api.proto.v1.model.PersonaPromptOrBuilder> personaPromptBuilder_;
    /**
     * <code>optional .com.hearlers.v1.model.PersonaPrompt persona_prompt = 1 [json_name = "personaPrompt"];</code>
     * @return Whether the personaPrompt field is set.
     */
    public boolean hasPersonaPrompt() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .com.hearlers.v1.model.PersonaPrompt persona_prompt = 1 [json_name = "personaPrompt"];</code>
     * @return The personaPrompt.
     */
    public com.hearlers.api.proto.v1.model.PersonaPrompt getPersonaPrompt() {
      if (personaPromptBuilder_ == null) {
        return personaPrompt_ == null ? com.hearlers.api.proto.v1.model.PersonaPrompt.getDefaultInstance() : personaPrompt_;
      } else {
        return personaPromptBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.hearlers.v1.model.PersonaPrompt persona_prompt = 1 [json_name = "personaPrompt"];</code>
     */
    public Builder setPersonaPrompt(com.hearlers.api.proto.v1.model.PersonaPrompt value) {
      if (personaPromptBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        personaPrompt_ = value;
      } else {
        personaPromptBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.hearlers.v1.model.PersonaPrompt persona_prompt = 1 [json_name = "personaPrompt"];</code>
     */
    public Builder setPersonaPrompt(
        com.hearlers.api.proto.v1.model.PersonaPrompt.Builder builderForValue) {
      if (personaPromptBuilder_ == null) {
        personaPrompt_ = builderForValue.build();
      } else {
        personaPromptBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.hearlers.v1.model.PersonaPrompt persona_prompt = 1 [json_name = "personaPrompt"];</code>
     */
    public Builder mergePersonaPrompt(com.hearlers.api.proto.v1.model.PersonaPrompt value) {
      if (personaPromptBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          personaPrompt_ != null &&
          personaPrompt_ != com.hearlers.api.proto.v1.model.PersonaPrompt.getDefaultInstance()) {
          getPersonaPromptBuilder().mergeFrom(value);
        } else {
          personaPrompt_ = value;
        }
      } else {
        personaPromptBuilder_.mergeFrom(value);
      }
      if (personaPrompt_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>optional .com.hearlers.v1.model.PersonaPrompt persona_prompt = 1 [json_name = "personaPrompt"];</code>
     */
    public Builder clearPersonaPrompt() {
      bitField0_ = (bitField0_ & ~0x00000001);
      personaPrompt_ = null;
      if (personaPromptBuilder_ != null) {
        personaPromptBuilder_.dispose();
        personaPromptBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.hearlers.v1.model.PersonaPrompt persona_prompt = 1 [json_name = "personaPrompt"];</code>
     */
    public com.hearlers.api.proto.v1.model.PersonaPrompt.Builder getPersonaPromptBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPersonaPromptFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.hearlers.v1.model.PersonaPrompt persona_prompt = 1 [json_name = "personaPrompt"];</code>
     */
    public com.hearlers.api.proto.v1.model.PersonaPromptOrBuilder getPersonaPromptOrBuilder() {
      if (personaPromptBuilder_ != null) {
        return personaPromptBuilder_.getMessageOrBuilder();
      } else {
        return personaPrompt_ == null ?
            com.hearlers.api.proto.v1.model.PersonaPrompt.getDefaultInstance() : personaPrompt_;
      }
    }
    /**
     * <code>optional .com.hearlers.v1.model.PersonaPrompt persona_prompt = 1 [json_name = "personaPrompt"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.hearlers.api.proto.v1.model.PersonaPrompt, com.hearlers.api.proto.v1.model.PersonaPrompt.Builder, com.hearlers.api.proto.v1.model.PersonaPromptOrBuilder> 
        getPersonaPromptFieldBuilder() {
      if (personaPromptBuilder_ == null) {
        personaPromptBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.hearlers.api.proto.v1.model.PersonaPrompt, com.hearlers.api.proto.v1.model.PersonaPrompt.Builder, com.hearlers.api.proto.v1.model.PersonaPromptOrBuilder>(
                getPersonaPrompt(),
                getParentForChildren(),
                isClean());
        personaPrompt_ = null;
      }
      return personaPromptBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.UpdatePersonaPromptResponse)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.UpdatePersonaPromptResponse)
  private static final com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse();
  }

  public static com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdatePersonaPromptResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdatePersonaPromptResponse>() {
    @java.lang.Override
    public UpdatePersonaPromptResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdatePersonaPromptResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdatePersonaPromptResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.UpdatePersonaPromptResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

