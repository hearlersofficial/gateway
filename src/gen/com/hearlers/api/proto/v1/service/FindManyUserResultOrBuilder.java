// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/user.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface FindManyUserResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.FindManyUserResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.hearlers.v1.model.User users = 1 [json_name = "users"];</code>
   */
  java.util.List<com.hearlers.api.proto.v1.model.User> 
      getUsersList();
  /**
   * <code>repeated .com.hearlers.v1.model.User users = 1 [json_name = "users"];</code>
   */
  com.hearlers.api.proto.v1.model.User getUsers(int index);
  /**
   * <code>repeated .com.hearlers.v1.model.User users = 1 [json_name = "users"];</code>
   */
  int getUsersCount();
  /**
   * <code>repeated .com.hearlers.v1.model.User users = 1 [json_name = "users"];</code>
   */
  java.util.List<? extends com.hearlers.api.proto.v1.model.UserOrBuilder> 
      getUsersOrBuilderList();
  /**
   * <code>repeated .com.hearlers.v1.model.User users = 1 [json_name = "users"];</code>
   */
  com.hearlers.api.proto.v1.model.UserOrBuilder getUsersOrBuilder(
      int index);
}
