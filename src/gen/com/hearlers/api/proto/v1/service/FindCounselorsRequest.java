// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counselor.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.FindCounselorsRequest}
 */
public final class FindCounselorsRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.FindCounselorsRequest)
    FindCounselorsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      FindCounselorsRequest.class.getName());
  }
  // Use FindCounselorsRequest.newBuilder() to construct.
  private FindCounselorsRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FindCounselorsRequest() {
    toneId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.Counselor.internal_static_com_hearlers_v1_service_FindCounselorsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.Counselor.internal_static_com_hearlers_v1_service_FindCounselorsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.FindCounselorsRequest.class, com.hearlers.api.proto.v1.service.FindCounselorsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int TONE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object toneId_ = "";
  /**
   * <code>optional string tone_id = 1 [json_name = "toneId"];</code>
   * @return Whether the toneId field is set.
   */
  @java.lang.Override
  public boolean hasToneId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string tone_id = 1 [json_name = "toneId"];</code>
   * @return The toneId.
   */
  @java.lang.Override
  public java.lang.String getToneId() {
    java.lang.Object ref = toneId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toneId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string tone_id = 1 [json_name = "toneId"];</code>
   * @return The bytes for toneId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getToneIdBytes() {
    java.lang.Object ref = toneId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toneId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
      com.google.protobuf.GeneratedMessage.writeString(output, 1, toneId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, toneId_);
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.FindCounselorsRequest)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.FindCounselorsRequest other = (com.hearlers.api.proto.v1.service.FindCounselorsRequest) obj;

    if (hasToneId() != other.hasToneId()) return false;
    if (hasToneId()) {
      if (!getToneId()
          .equals(other.getToneId())) return false;
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
    if (hasToneId()) {
      hash = (37 * hash) + TONE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getToneId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.FindCounselorsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.FindCounselorsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.FindCounselorsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorsRequest parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.FindCounselorsRequest prototype) {
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
   * Protobuf type {@code com.hearlers.v1.service.FindCounselorsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.FindCounselorsRequest)
      com.hearlers.api.proto.v1.service.FindCounselorsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.Counselor.internal_static_com_hearlers_v1_service_FindCounselorsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.Counselor.internal_static_com_hearlers_v1_service_FindCounselorsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.FindCounselorsRequest.class, com.hearlers.api.proto.v1.service.FindCounselorsRequest.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.FindCounselorsRequest.newBuilder()
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
      toneId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.Counselor.internal_static_com_hearlers_v1_service_FindCounselorsRequest_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindCounselorsRequest getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.FindCounselorsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindCounselorsRequest build() {
      com.hearlers.api.proto.v1.service.FindCounselorsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindCounselorsRequest buildPartial() {
      com.hearlers.api.proto.v1.service.FindCounselorsRequest result = new com.hearlers.api.proto.v1.service.FindCounselorsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.FindCounselorsRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.toneId_ = toneId_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.FindCounselorsRequest) {
        return mergeFrom((com.hearlers.api.proto.v1.service.FindCounselorsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.FindCounselorsRequest other) {
      if (other == com.hearlers.api.proto.v1.service.FindCounselorsRequest.getDefaultInstance()) return this;
      if (other.hasToneId()) {
        toneId_ = other.toneId_;
        bitField0_ |= 0x00000001;
        onChanged();
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
              toneId_ = input.readStringRequireUtf8();
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

    private java.lang.Object toneId_ = "";
    /**
     * <code>optional string tone_id = 1 [json_name = "toneId"];</code>
     * @return Whether the toneId field is set.
     */
    public boolean hasToneId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string tone_id = 1 [json_name = "toneId"];</code>
     * @return The toneId.
     */
    public java.lang.String getToneId() {
      java.lang.Object ref = toneId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toneId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string tone_id = 1 [json_name = "toneId"];</code>
     * @return The bytes for toneId.
     */
    public com.google.protobuf.ByteString
        getToneIdBytes() {
      java.lang.Object ref = toneId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toneId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string tone_id = 1 [json_name = "toneId"];</code>
     * @param value The toneId to set.
     * @return This builder for chaining.
     */
    public Builder setToneId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      toneId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional string tone_id = 1 [json_name = "toneId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearToneId() {
      toneId_ = getDefaultInstance().getToneId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>optional string tone_id = 1 [json_name = "toneId"];</code>
     * @param value The bytes for toneId to set.
     * @return This builder for chaining.
     */
    public Builder setToneIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      toneId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.FindCounselorsRequest)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.FindCounselorsRequest)
  private static final com.hearlers.api.proto.v1.service.FindCounselorsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.FindCounselorsRequest();
  }

  public static com.hearlers.api.proto.v1.service.FindCounselorsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindCounselorsRequest>
      PARSER = new com.google.protobuf.AbstractParser<FindCounselorsRequest>() {
    @java.lang.Override
    public FindCounselorsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<FindCounselorsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindCounselorsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.FindCounselorsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

