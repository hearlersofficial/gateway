// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/model/auth_user.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.model;

public interface OAuthChannelInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.model.OAuthChannelInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  int getId();

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
   * <code>string unique_id = 3 [json_name = "uniqueId"];</code>
   * @return The uniqueId.
   */
  java.lang.String getUniqueId();
  /**
   * <code>string unique_id = 3 [json_name = "uniqueId"];</code>
   * @return The bytes for uniqueId.
   */
  com.google.protobuf.ByteString
      getUniqueIdBytes();

  /**
   * <pre>
   * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
   * </pre>
   *
   * <code>string created_at = 4 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  java.lang.String getCreatedAt();
  /**
   * <pre>
   * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
   * </pre>
   *
   * <code>string created_at = 4 [json_name = "createdAt"];</code>
   * @return The bytes for createdAt.
   */
  com.google.protobuf.ByteString
      getCreatedAtBytes();

  /**
   * <pre>
   * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
   * </pre>
   *
   * <code>string updated_at = 5 [json_name = "updatedAt"];</code>
   * @return The updatedAt.
   */
  java.lang.String getUpdatedAt();
  /**
   * <pre>
   * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
   * </pre>
   *
   * <code>string updated_at = 5 [json_name = "updatedAt"];</code>
   * @return The bytes for updatedAt.
   */
  com.google.protobuf.ByteString
      getUpdatedAtBytes();

  /**
   * <pre>
   * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
   * </pre>
   *
   * <code>string deleted_at = 6 [json_name = "deletedAt"];</code>
   * @return The deletedAt.
   */
  java.lang.String getDeletedAt();
  /**
   * <pre>
   * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
   * </pre>
   *
   * <code>string deleted_at = 6 [json_name = "deletedAt"];</code>
   * @return The bytes for deletedAt.
   */
  com.google.protobuf.ByteString
      getDeletedAtBytes();
}
