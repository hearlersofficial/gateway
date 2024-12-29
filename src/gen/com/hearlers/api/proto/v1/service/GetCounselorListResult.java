// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.GetCounselorListResult}
 */
public final class GetCounselorListResult extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.GetCounselorListResult)
    GetCounselorListResultOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      GetCounselorListResult.class.getName());
  }
  // Use GetCounselorListResult.newBuilder() to construct.
  private GetCounselorListResult(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetCounselorListResult() {
    counselorList_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_GetCounselorListResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_GetCounselorListResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.GetCounselorListResult.class, com.hearlers.api.proto.v1.service.GetCounselorListResult.Builder.class);
  }

  public static final int COUNSELOR_LIST_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.hearlers.api.proto.v1.model.Counselor> counselorList_;
  /**
   * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
   */
  @java.lang.Override
  public java.util.List<com.hearlers.api.proto.v1.model.Counselor> getCounselorListList() {
    return counselorList_;
  }
  /**
   * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.hearlers.api.proto.v1.model.CounselorOrBuilder> 
      getCounselorListOrBuilderList() {
    return counselorList_;
  }
  /**
   * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
   */
  @java.lang.Override
  public int getCounselorListCount() {
    return counselorList_.size();
  }
  /**
   * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.Counselor getCounselorList(int index) {
    return counselorList_.get(index);
  }
  /**
   * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.CounselorOrBuilder getCounselorListOrBuilder(
      int index) {
    return counselorList_.get(index);
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
    for (int i = 0; i < counselorList_.size(); i++) {
      output.writeMessage(1, counselorList_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < counselorList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, counselorList_.get(i));
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.GetCounselorListResult)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.GetCounselorListResult other = (com.hearlers.api.proto.v1.service.GetCounselorListResult) obj;

    if (!getCounselorListList()
        .equals(other.getCounselorListList())) return false;
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
    if (getCounselorListCount() > 0) {
      hash = (37 * hash) + COUNSELOR_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getCounselorListList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.GetCounselorListResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.GetCounselorListResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.GetCounselorListResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.GetCounselorListResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.GetCounselorListResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.GetCounselorListResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.GetCounselorListResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.GetCounselorListResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.GetCounselorListResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.GetCounselorListResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.GetCounselorListResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.GetCounselorListResult parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.GetCounselorListResult prototype) {
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
   * Protobuf type {@code com.hearlers.v1.service.GetCounselorListResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.GetCounselorListResult)
      com.hearlers.api.proto.v1.service.GetCounselorListResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_GetCounselorListResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_GetCounselorListResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.GetCounselorListResult.class, com.hearlers.api.proto.v1.service.GetCounselorListResult.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.GetCounselorListResult.newBuilder()
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
      if (counselorListBuilder_ == null) {
        counselorList_ = java.util.Collections.emptyList();
      } else {
        counselorList_ = null;
        counselorListBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_GetCounselorListResult_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.GetCounselorListResult getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.GetCounselorListResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.GetCounselorListResult build() {
      com.hearlers.api.proto.v1.service.GetCounselorListResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.GetCounselorListResult buildPartial() {
      com.hearlers.api.proto.v1.service.GetCounselorListResult result = new com.hearlers.api.proto.v1.service.GetCounselorListResult(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.hearlers.api.proto.v1.service.GetCounselorListResult result) {
      if (counselorListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          counselorList_ = java.util.Collections.unmodifiableList(counselorList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.counselorList_ = counselorList_;
      } else {
        result.counselorList_ = counselorListBuilder_.build();
      }
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.GetCounselorListResult result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.GetCounselorListResult) {
        return mergeFrom((com.hearlers.api.proto.v1.service.GetCounselorListResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.GetCounselorListResult other) {
      if (other == com.hearlers.api.proto.v1.service.GetCounselorListResult.getDefaultInstance()) return this;
      if (counselorListBuilder_ == null) {
        if (!other.counselorList_.isEmpty()) {
          if (counselorList_.isEmpty()) {
            counselorList_ = other.counselorList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCounselorListIsMutable();
            counselorList_.addAll(other.counselorList_);
          }
          onChanged();
        }
      } else {
        if (!other.counselorList_.isEmpty()) {
          if (counselorListBuilder_.isEmpty()) {
            counselorListBuilder_.dispose();
            counselorListBuilder_ = null;
            counselorList_ = other.counselorList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            counselorListBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getCounselorListFieldBuilder() : null;
          } else {
            counselorListBuilder_.addAllMessages(other.counselorList_);
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
              com.hearlers.api.proto.v1.model.Counselor m =
                  input.readMessage(
                      com.hearlers.api.proto.v1.model.Counselor.parser(),
                      extensionRegistry);
              if (counselorListBuilder_ == null) {
                ensureCounselorListIsMutable();
                counselorList_.add(m);
              } else {
                counselorListBuilder_.addMessage(m);
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

    private java.util.List<com.hearlers.api.proto.v1.model.Counselor> counselorList_ =
      java.util.Collections.emptyList();
    private void ensureCounselorListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        counselorList_ = new java.util.ArrayList<com.hearlers.api.proto.v1.model.Counselor>(counselorList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.hearlers.api.proto.v1.model.Counselor, com.hearlers.api.proto.v1.model.Counselor.Builder, com.hearlers.api.proto.v1.model.CounselorOrBuilder> counselorListBuilder_;

    /**
     * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
     */
    public java.util.List<com.hearlers.api.proto.v1.model.Counselor> getCounselorListList() {
      if (counselorListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(counselorList_);
      } else {
        return counselorListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
     */
    public int getCounselorListCount() {
      if (counselorListBuilder_ == null) {
        return counselorList_.size();
      } else {
        return counselorListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
     */
    public com.hearlers.api.proto.v1.model.Counselor getCounselorList(int index) {
      if (counselorListBuilder_ == null) {
        return counselorList_.get(index);
      } else {
        return counselorListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
     */
    public Builder setCounselorList(
        int index, com.hearlers.api.proto.v1.model.Counselor value) {
      if (counselorListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCounselorListIsMutable();
        counselorList_.set(index, value);
        onChanged();
      } else {
        counselorListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
     */
    public Builder setCounselorList(
        int index, com.hearlers.api.proto.v1.model.Counselor.Builder builderForValue) {
      if (counselorListBuilder_ == null) {
        ensureCounselorListIsMutable();
        counselorList_.set(index, builderForValue.build());
        onChanged();
      } else {
        counselorListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
     */
    public Builder addCounselorList(com.hearlers.api.proto.v1.model.Counselor value) {
      if (counselorListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCounselorListIsMutable();
        counselorList_.add(value);
        onChanged();
      } else {
        counselorListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
     */
    public Builder addCounselorList(
        int index, com.hearlers.api.proto.v1.model.Counselor value) {
      if (counselorListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCounselorListIsMutable();
        counselorList_.add(index, value);
        onChanged();
      } else {
        counselorListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
     */
    public Builder addCounselorList(
        com.hearlers.api.proto.v1.model.Counselor.Builder builderForValue) {
      if (counselorListBuilder_ == null) {
        ensureCounselorListIsMutable();
        counselorList_.add(builderForValue.build());
        onChanged();
      } else {
        counselorListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
     */
    public Builder addCounselorList(
        int index, com.hearlers.api.proto.v1.model.Counselor.Builder builderForValue) {
      if (counselorListBuilder_ == null) {
        ensureCounselorListIsMutable();
        counselorList_.add(index, builderForValue.build());
        onChanged();
      } else {
        counselorListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
     */
    public Builder addAllCounselorList(
        java.lang.Iterable<? extends com.hearlers.api.proto.v1.model.Counselor> values) {
      if (counselorListBuilder_ == null) {
        ensureCounselorListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, counselorList_);
        onChanged();
      } else {
        counselorListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
     */
    public Builder clearCounselorList() {
      if (counselorListBuilder_ == null) {
        counselorList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        counselorListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
     */
    public Builder removeCounselorList(int index) {
      if (counselorListBuilder_ == null) {
        ensureCounselorListIsMutable();
        counselorList_.remove(index);
        onChanged();
      } else {
        counselorListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
     */
    public com.hearlers.api.proto.v1.model.Counselor.Builder getCounselorListBuilder(
        int index) {
      return getCounselorListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
     */
    public com.hearlers.api.proto.v1.model.CounselorOrBuilder getCounselorListOrBuilder(
        int index) {
      if (counselorListBuilder_ == null) {
        return counselorList_.get(index);  } else {
        return counselorListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
     */
    public java.util.List<? extends com.hearlers.api.proto.v1.model.CounselorOrBuilder> 
         getCounselorListOrBuilderList() {
      if (counselorListBuilder_ != null) {
        return counselorListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(counselorList_);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
     */
    public com.hearlers.api.proto.v1.model.Counselor.Builder addCounselorListBuilder() {
      return getCounselorListFieldBuilder().addBuilder(
          com.hearlers.api.proto.v1.model.Counselor.getDefaultInstance());
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
     */
    public com.hearlers.api.proto.v1.model.Counselor.Builder addCounselorListBuilder(
        int index) {
      return getCounselorListFieldBuilder().addBuilder(
          index, com.hearlers.api.proto.v1.model.Counselor.getDefaultInstance());
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
     */
    public java.util.List<com.hearlers.api.proto.v1.model.Counselor.Builder> 
         getCounselorListBuilderList() {
      return getCounselorListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.hearlers.api.proto.v1.model.Counselor, com.hearlers.api.proto.v1.model.Counselor.Builder, com.hearlers.api.proto.v1.model.CounselorOrBuilder> 
        getCounselorListFieldBuilder() {
      if (counselorListBuilder_ == null) {
        counselorListBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.hearlers.api.proto.v1.model.Counselor, com.hearlers.api.proto.v1.model.Counselor.Builder, com.hearlers.api.proto.v1.model.CounselorOrBuilder>(
                counselorList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        counselorList_ = null;
      }
      return counselorListBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.GetCounselorListResult)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.GetCounselorListResult)
  private static final com.hearlers.api.proto.v1.service.GetCounselorListResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.GetCounselorListResult();
  }

  public static com.hearlers.api.proto.v1.service.GetCounselorListResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCounselorListResult>
      PARSER = new com.google.protobuf.AbstractParser<GetCounselorListResult>() {
    @java.lang.Override
    public GetCounselorListResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetCounselorListResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCounselorListResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.GetCounselorListResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

