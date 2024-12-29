// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/model/user.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.model;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.model.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string nickname = 2 [json_name = "nickname"];</code>
   * @return The nickname.
   */
  java.lang.String getNickname();
  /**
   * <code>string nickname = 2 [json_name = "nickname"];</code>
   * @return The bytes for nickname.
   */
  com.google.protobuf.ByteString
      getNicknameBytes();

  /**
   * <code>.com.hearlers.v1.model.UserProfile user_profile = 3 [json_name = "userProfile"];</code>
   * @return Whether the userProfile field is set.
   */
  boolean hasUserProfile();
  /**
   * <code>.com.hearlers.v1.model.UserProfile user_profile = 3 [json_name = "userProfile"];</code>
   * @return The userProfile.
   */
  com.hearlers.api.proto.v1.model.UserProfile getUserProfile();
  /**
   * <code>.com.hearlers.v1.model.UserProfile user_profile = 3 [json_name = "userProfile"];</code>
   */
  com.hearlers.api.proto.v1.model.UserProfileOrBuilder getUserProfileOrBuilder();

  /**
   * <code>repeated .com.hearlers.v1.model.UserProgress user_progresses = 4 [json_name = "userProgresses"];</code>
   */
  java.util.List<com.hearlers.api.proto.v1.model.UserProgress> 
      getUserProgressesList();
  /**
   * <code>repeated .com.hearlers.v1.model.UserProgress user_progresses = 4 [json_name = "userProgresses"];</code>
   */
  com.hearlers.api.proto.v1.model.UserProgress getUserProgresses(int index);
  /**
   * <code>repeated .com.hearlers.v1.model.UserProgress user_progresses = 4 [json_name = "userProgresses"];</code>
   */
  int getUserProgressesCount();
  /**
   * <code>repeated .com.hearlers.v1.model.UserProgress user_progresses = 4 [json_name = "userProgresses"];</code>
   */
  java.util.List<? extends com.hearlers.api.proto.v1.model.UserProgressOrBuilder> 
      getUserProgressesOrBuilderList();
  /**
   * <code>repeated .com.hearlers.v1.model.UserProgress user_progresses = 4 [json_name = "userProgresses"];</code>
   */
  com.hearlers.api.proto.v1.model.UserProgressOrBuilder getUserProgressesOrBuilder(
      int index);

  /**
   * <pre>
   * YYYY-MM-DD HH:MM:SS
   * </pre>
   *
   * <code>string created_at = 5 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  java.lang.String getCreatedAt();
  /**
   * <pre>
   * YYYY-MM-DD HH:MM:SS
   * </pre>
   *
   * <code>string created_at = 5 [json_name = "createdAt"];</code>
   * @return The bytes for createdAt.
   */
  com.google.protobuf.ByteString
      getCreatedAtBytes();

  /**
   * <pre>
   * YYYY-MM-DD HH:MM:SS
   * </pre>
   *
   * <code>string updated_at = 6 [json_name = "updatedAt"];</code>
   * @return The updatedAt.
   */
  java.lang.String getUpdatedAt();
  /**
   * <pre>
   * YYYY-MM-DD HH:MM:SS
   * </pre>
   *
   * <code>string updated_at = 6 [json_name = "updatedAt"];</code>
   * @return The bytes for updatedAt.
   */
  com.google.protobuf.ByteString
      getUpdatedAtBytes();

  /**
   * <pre>
   * YYYY-MM-DD HH:MM:SS
   * </pre>
   *
   * <code>string deleted_at = 7 [json_name = "deletedAt"];</code>
   * @return The deletedAt.
   */
  java.lang.String getDeletedAt();
  /**
   * <pre>
   * YYYY-MM-DD HH:MM:SS
   * </pre>
   *
   * <code>string deleted_at = 7 [json_name = "deletedAt"];</code>
   * @return The bytes for deletedAt.
   */
  com.google.protobuf.ByteString
      getDeletedAtBytes();
}
