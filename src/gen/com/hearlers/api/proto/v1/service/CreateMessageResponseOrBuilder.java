// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface CreateMessageResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.CreateMessageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.hearlers.v1.model.CounselMessage counsel_message = 1 [json_name = "counselMessage"];</code>
   * @return Whether the counselMessage field is set.
   */
  boolean hasCounselMessage();
  /**
   * <code>.com.hearlers.v1.model.CounselMessage counsel_message = 1 [json_name = "counselMessage"];</code>
   * @return The counselMessage.
   */
  com.hearlers.api.proto.v1.model.CounselMessage getCounselMessage();
  /**
   * <code>.com.hearlers.v1.model.CounselMessage counsel_message = 1 [json_name = "counselMessage"];</code>
   */
  com.hearlers.api.proto.v1.model.CounselMessageOrBuilder getCounselMessageOrBuilder();
}
