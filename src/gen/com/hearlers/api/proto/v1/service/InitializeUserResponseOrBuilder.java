// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/user.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface InitializeUserResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.InitializeUserResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.hearlers.v1.model.User user = 1 [json_name = "user"];</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <code>.com.hearlers.v1.model.User user = 1 [json_name = "user"];</code>
   * @return The user.
   */
  com.hearlers.api.proto.v1.model.User getUser();
  /**
   * <code>.com.hearlers.v1.model.User user = 1 [json_name = "user"];</code>
   */
  com.hearlers.api.proto.v1.model.UserOrBuilder getUserOrBuilder();

  /**
   * <code>.com.hearlers.v1.model.AuthUser auth_user = 2 [json_name = "authUser"];</code>
   * @return Whether the authUser field is set.
   */
  boolean hasAuthUser();
  /**
   * <code>.com.hearlers.v1.model.AuthUser auth_user = 2 [json_name = "authUser"];</code>
   * @return The authUser.
   */
  com.hearlers.api.proto.v1.model.AuthUser getAuthUser();
  /**
   * <code>.com.hearlers.v1.model.AuthUser auth_user = 2 [json_name = "authUser"];</code>
   */
  com.hearlers.api.proto.v1.model.AuthUserOrBuilder getAuthUserOrBuilder();
}
