// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/service/user.proto
// Protobuf Java Version: 4.29.0

package com.com.hearlers.v1.service;

public interface ConnectAuthChannelRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.ConnectAuthChannelRequest)
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
  com.com.hearlers.v1.model.AuthChannel getAuthChannel();

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
}
