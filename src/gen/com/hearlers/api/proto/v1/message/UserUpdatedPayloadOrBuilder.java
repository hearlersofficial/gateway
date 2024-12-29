// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/message/user.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.message;

public interface UserUpdatedPayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.message.UserUpdatedPayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  int getUserId();

  /**
   * <code>.com.hearlers.v1.model.AuthChannel auth_channel = 2 [json_name = "authChannel"];</code>
   * @return The enum numeric value on the wire for authChannel.
   */
  int getAuthChannelValue();
  /**
   * <code>.com.hearlers.v1.model.AuthChannel auth_channel = 2 [json_name = "authChannel"];</code>
   * @return The authChannel.
   */
  com.hearlers.api.proto.v1.model.AuthChannel getAuthChannel();

  /**
   * <pre>
   * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
   * </pre>
   *
   * <code>string occurred_at = 3 [json_name = "occurredAt"];</code>
   * @return The occurredAt.
   */
  java.lang.String getOccurredAt();
  /**
   * <pre>
   * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
   * </pre>
   *
   * <code>string occurred_at = 3 [json_name = "occurredAt"];</code>
   * @return The bytes for occurredAt.
   */
  com.google.protobuf.ByteString
      getOccurredAtBytes();
}
