// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface CreateCounselResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.CreateCounselResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.hearlers.v1.model.Counsel counsel = 1 [json_name = "counsel"];</code>
   * @return Whether the counsel field is set.
   */
  boolean hasCounsel();
  /**
   * <code>.com.hearlers.v1.model.Counsel counsel = 1 [json_name = "counsel"];</code>
   * @return The counsel.
   */
  com.hearlers.api.proto.v1.model.Counsel getCounsel();
  /**
   * <code>.com.hearlers.v1.model.Counsel counsel = 1 [json_name = "counsel"];</code>
   */
  com.hearlers.api.proto.v1.model.CounselOrBuilder getCounselOrBuilder();

  /**
   * <code>repeated .com.hearlers.v1.model.CounselMessage counsel_messages = 2 [json_name = "counselMessages"];</code>
   */
  java.util.List<com.hearlers.api.proto.v1.model.CounselMessage> 
      getCounselMessagesList();
  /**
   * <code>repeated .com.hearlers.v1.model.CounselMessage counsel_messages = 2 [json_name = "counselMessages"];</code>
   */
  com.hearlers.api.proto.v1.model.CounselMessage getCounselMessages(int index);
  /**
   * <code>repeated .com.hearlers.v1.model.CounselMessage counsel_messages = 2 [json_name = "counselMessages"];</code>
   */
  int getCounselMessagesCount();
  /**
   * <code>repeated .com.hearlers.v1.model.CounselMessage counsel_messages = 2 [json_name = "counselMessages"];</code>
   */
  java.util.List<? extends com.hearlers.api.proto.v1.model.CounselMessageOrBuilder> 
      getCounselMessagesOrBuilderList();
  /**
   * <code>repeated .com.hearlers.v1.model.CounselMessage counsel_messages = 2 [json_name = "counselMessages"];</code>
   */
  com.hearlers.api.proto.v1.model.CounselMessageOrBuilder getCounselMessagesOrBuilder(
      int index);
}
