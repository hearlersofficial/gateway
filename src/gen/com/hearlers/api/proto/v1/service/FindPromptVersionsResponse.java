// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel_prompt.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.FindPromptVersionsResponse}
 */
public final class FindPromptVersionsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.FindPromptVersionsResponse)
    FindPromptVersionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      FindPromptVersionsResponse.class.getName());
  }
  // Use FindPromptVersionsResponse.newBuilder() to construct.
  private FindPromptVersionsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FindPromptVersionsResponse() {
    promptVersions_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_FindPromptVersionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_FindPromptVersionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.FindPromptVersionsResponse.class, com.hearlers.api.proto.v1.service.FindPromptVersionsResponse.Builder.class);
  }

  public static final int PROMPT_VERSIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.hearlers.api.proto.v1.model.PromptVersion> promptVersions_;
  /**
   * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
   */
  @java.lang.Override
  public java.util.List<com.hearlers.api.proto.v1.model.PromptVersion> getPromptVersionsList() {
    return promptVersions_;
  }
  /**
   * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.hearlers.api.proto.v1.model.PromptVersionOrBuilder> 
      getPromptVersionsOrBuilderList() {
    return promptVersions_;
  }
  /**
   * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
   */
  @java.lang.Override
  public int getPromptVersionsCount() {
    return promptVersions_.size();
  }
  /**
   * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.PromptVersion getPromptVersions(int index) {
    return promptVersions_.get(index);
  }
  /**
   * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.PromptVersionOrBuilder getPromptVersionsOrBuilder(
      int index) {
    return promptVersions_.get(index);
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
    for (int i = 0; i < promptVersions_.size(); i++) {
      output.writeMessage(1, promptVersions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < promptVersions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, promptVersions_.get(i));
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.FindPromptVersionsResponse)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.FindPromptVersionsResponse other = (com.hearlers.api.proto.v1.service.FindPromptVersionsResponse) obj;

    if (!getPromptVersionsList()
        .equals(other.getPromptVersionsList())) return false;
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
    if (getPromptVersionsCount() > 0) {
      hash = (37 * hash) + PROMPT_VERSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getPromptVersionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.FindPromptVersionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindPromptVersionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindPromptVersionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindPromptVersionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindPromptVersionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindPromptVersionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindPromptVersionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindPromptVersionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.FindPromptVersionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.FindPromptVersionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindPromptVersionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindPromptVersionsResponse parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.FindPromptVersionsResponse prototype) {
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
   * Protobuf type {@code com.hearlers.v1.service.FindPromptVersionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.FindPromptVersionsResponse)
      com.hearlers.api.proto.v1.service.FindPromptVersionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_FindPromptVersionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_FindPromptVersionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.FindPromptVersionsResponse.class, com.hearlers.api.proto.v1.service.FindPromptVersionsResponse.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.FindPromptVersionsResponse.newBuilder()
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
      if (promptVersionsBuilder_ == null) {
        promptVersions_ = java.util.Collections.emptyList();
      } else {
        promptVersions_ = null;
        promptVersionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_FindPromptVersionsResponse_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindPromptVersionsResponse getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.FindPromptVersionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindPromptVersionsResponse build() {
      com.hearlers.api.proto.v1.service.FindPromptVersionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindPromptVersionsResponse buildPartial() {
      com.hearlers.api.proto.v1.service.FindPromptVersionsResponse result = new com.hearlers.api.proto.v1.service.FindPromptVersionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.hearlers.api.proto.v1.service.FindPromptVersionsResponse result) {
      if (promptVersionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          promptVersions_ = java.util.Collections.unmodifiableList(promptVersions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.promptVersions_ = promptVersions_;
      } else {
        result.promptVersions_ = promptVersionsBuilder_.build();
      }
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.FindPromptVersionsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.FindPromptVersionsResponse) {
        return mergeFrom((com.hearlers.api.proto.v1.service.FindPromptVersionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.FindPromptVersionsResponse other) {
      if (other == com.hearlers.api.proto.v1.service.FindPromptVersionsResponse.getDefaultInstance()) return this;
      if (promptVersionsBuilder_ == null) {
        if (!other.promptVersions_.isEmpty()) {
          if (promptVersions_.isEmpty()) {
            promptVersions_ = other.promptVersions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePromptVersionsIsMutable();
            promptVersions_.addAll(other.promptVersions_);
          }
          onChanged();
        }
      } else {
        if (!other.promptVersions_.isEmpty()) {
          if (promptVersionsBuilder_.isEmpty()) {
            promptVersionsBuilder_.dispose();
            promptVersionsBuilder_ = null;
            promptVersions_ = other.promptVersions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            promptVersionsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getPromptVersionsFieldBuilder() : null;
          } else {
            promptVersionsBuilder_.addAllMessages(other.promptVersions_);
          }
        }
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
              com.hearlers.api.proto.v1.model.PromptVersion m =
                  input.readMessage(
                      com.hearlers.api.proto.v1.model.PromptVersion.parser(),
                      extensionRegistry);
              if (promptVersionsBuilder_ == null) {
                ensurePromptVersionsIsMutable();
                promptVersions_.add(m);
              } else {
                promptVersionsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.hearlers.api.proto.v1.model.PromptVersion> promptVersions_ =
      java.util.Collections.emptyList();
    private void ensurePromptVersionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        promptVersions_ = new java.util.ArrayList<com.hearlers.api.proto.v1.model.PromptVersion>(promptVersions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.hearlers.api.proto.v1.model.PromptVersion, com.hearlers.api.proto.v1.model.PromptVersion.Builder, com.hearlers.api.proto.v1.model.PromptVersionOrBuilder> promptVersionsBuilder_;

    /**
     * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
     */
    public java.util.List<com.hearlers.api.proto.v1.model.PromptVersion> getPromptVersionsList() {
      if (promptVersionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(promptVersions_);
      } else {
        return promptVersionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
     */
    public int getPromptVersionsCount() {
      if (promptVersionsBuilder_ == null) {
        return promptVersions_.size();
      } else {
        return promptVersionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
     */
    public com.hearlers.api.proto.v1.model.PromptVersion getPromptVersions(int index) {
      if (promptVersionsBuilder_ == null) {
        return promptVersions_.get(index);
      } else {
        return promptVersionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
     */
    public Builder setPromptVersions(
        int index, com.hearlers.api.proto.v1.model.PromptVersion value) {
      if (promptVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePromptVersionsIsMutable();
        promptVersions_.set(index, value);
        onChanged();
      } else {
        promptVersionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
     */
    public Builder setPromptVersions(
        int index, com.hearlers.api.proto.v1.model.PromptVersion.Builder builderForValue) {
      if (promptVersionsBuilder_ == null) {
        ensurePromptVersionsIsMutable();
        promptVersions_.set(index, builderForValue.build());
        onChanged();
      } else {
        promptVersionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
     */
    public Builder addPromptVersions(com.hearlers.api.proto.v1.model.PromptVersion value) {
      if (promptVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePromptVersionsIsMutable();
        promptVersions_.add(value);
        onChanged();
      } else {
        promptVersionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
     */
    public Builder addPromptVersions(
        int index, com.hearlers.api.proto.v1.model.PromptVersion value) {
      if (promptVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePromptVersionsIsMutable();
        promptVersions_.add(index, value);
        onChanged();
      } else {
        promptVersionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
     */
    public Builder addPromptVersions(
        com.hearlers.api.proto.v1.model.PromptVersion.Builder builderForValue) {
      if (promptVersionsBuilder_ == null) {
        ensurePromptVersionsIsMutable();
        promptVersions_.add(builderForValue.build());
        onChanged();
      } else {
        promptVersionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
     */
    public Builder addPromptVersions(
        int index, com.hearlers.api.proto.v1.model.PromptVersion.Builder builderForValue) {
      if (promptVersionsBuilder_ == null) {
        ensurePromptVersionsIsMutable();
        promptVersions_.add(index, builderForValue.build());
        onChanged();
      } else {
        promptVersionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
     */
    public Builder addAllPromptVersions(
        java.lang.Iterable<? extends com.hearlers.api.proto.v1.model.PromptVersion> values) {
      if (promptVersionsBuilder_ == null) {
        ensurePromptVersionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, promptVersions_);
        onChanged();
      } else {
        promptVersionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
     */
    public Builder clearPromptVersions() {
      if (promptVersionsBuilder_ == null) {
        promptVersions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        promptVersionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
     */
    public Builder removePromptVersions(int index) {
      if (promptVersionsBuilder_ == null) {
        ensurePromptVersionsIsMutable();
        promptVersions_.remove(index);
        onChanged();
      } else {
        promptVersionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
     */
    public com.hearlers.api.proto.v1.model.PromptVersion.Builder getPromptVersionsBuilder(
        int index) {
      return getPromptVersionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
     */
    public com.hearlers.api.proto.v1.model.PromptVersionOrBuilder getPromptVersionsOrBuilder(
        int index) {
      if (promptVersionsBuilder_ == null) {
        return promptVersions_.get(index);  } else {
        return promptVersionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
     */
    public java.util.List<? extends com.hearlers.api.proto.v1.model.PromptVersionOrBuilder> 
         getPromptVersionsOrBuilderList() {
      if (promptVersionsBuilder_ != null) {
        return promptVersionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(promptVersions_);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
     */
    public com.hearlers.api.proto.v1.model.PromptVersion.Builder addPromptVersionsBuilder() {
      return getPromptVersionsFieldBuilder().addBuilder(
          com.hearlers.api.proto.v1.model.PromptVersion.getDefaultInstance());
    }
    /**
     * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
     */
    public com.hearlers.api.proto.v1.model.PromptVersion.Builder addPromptVersionsBuilder(
        int index) {
      return getPromptVersionsFieldBuilder().addBuilder(
          index, com.hearlers.api.proto.v1.model.PromptVersion.getDefaultInstance());
    }
    /**
     * <code>repeated .com.hearlers.v1.model.PromptVersion prompt_versions = 1 [json_name = "promptVersions"];</code>
     */
    public java.util.List<com.hearlers.api.proto.v1.model.PromptVersion.Builder> 
         getPromptVersionsBuilderList() {
      return getPromptVersionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.hearlers.api.proto.v1.model.PromptVersion, com.hearlers.api.proto.v1.model.PromptVersion.Builder, com.hearlers.api.proto.v1.model.PromptVersionOrBuilder> 
        getPromptVersionsFieldBuilder() {
      if (promptVersionsBuilder_ == null) {
        promptVersionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.hearlers.api.proto.v1.model.PromptVersion, com.hearlers.api.proto.v1.model.PromptVersion.Builder, com.hearlers.api.proto.v1.model.PromptVersionOrBuilder>(
                promptVersions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        promptVersions_ = null;
      }
      return promptVersionsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.FindPromptVersionsResponse)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.FindPromptVersionsResponse)
  private static final com.hearlers.api.proto.v1.service.FindPromptVersionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.FindPromptVersionsResponse();
  }

  public static com.hearlers.api.proto.v1.service.FindPromptVersionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindPromptVersionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<FindPromptVersionsResponse>() {
    @java.lang.Override
    public FindPromptVersionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<FindPromptVersionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindPromptVersionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.FindPromptVersionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

