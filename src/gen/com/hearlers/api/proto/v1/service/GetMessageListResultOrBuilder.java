// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface GetMessageListResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.GetMessageListResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.hearlers.v1.model.CounselMessage message_list = 1 [json_name = "messageList"];</code>
   */
  java.util.List<com.hearlers.api.proto.v1.model.CounselMessage> 
      getMessageListList();
  /**
   * <code>repeated .com.hearlers.v1.model.CounselMessage message_list = 1 [json_name = "messageList"];</code>
   */
  com.hearlers.api.proto.v1.model.CounselMessage getMessageList(int index);
  /**
   * <code>repeated .com.hearlers.v1.model.CounselMessage message_list = 1 [json_name = "messageList"];</code>
   */
  int getMessageListCount();
  /**
   * <code>repeated .com.hearlers.v1.model.CounselMessage message_list = 1 [json_name = "messageList"];</code>
   */
  java.util.List<? extends com.hearlers.api.proto.v1.model.CounselMessageOrBuilder> 
      getMessageListOrBuilderList();
  /**
   * <code>repeated .com.hearlers.v1.model.CounselMessage message_list = 1 [json_name = "messageList"];</code>
   */
  com.hearlers.api.proto.v1.model.CounselMessageOrBuilder getMessageListOrBuilder(
      int index);
}
