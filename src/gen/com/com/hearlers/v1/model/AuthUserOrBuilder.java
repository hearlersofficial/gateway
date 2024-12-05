// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/model/auth_user.proto
// Protobuf Java Version: 4.29.0

package com.com.hearlers.v1.model;

public interface AuthUserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.model.AuthUser)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>int32 user_id = 2 [json_name = "userId"];</code>
   * @return The userId.
   */
  int getUserId();

  /**
   * <code>.com.hearlers.v1.model.AuthChannel auth_channel = 3 [json_name = "authChannel"];</code>
   * @return The enum numeric value on the wire for authChannel.
   */
  int getAuthChannelValue();
  /**
   * <code>.com.hearlers.v1.model.AuthChannel auth_channel = 3 [json_name = "authChannel"];</code>
   * @return The authChannel.
   */
  com.com.hearlers.v1.model.AuthChannel getAuthChannel();

  /**
   * <code>.com.hearlers.v1.model.OAuthChannelInfo oauth_channel_info = 4 [json_name = "oauthChannelInfo"];</code>
   * @return Whether the oauthChannelInfo field is set.
   */
  boolean hasOauthChannelInfo();
  /**
   * <code>.com.hearlers.v1.model.OAuthChannelInfo oauth_channel_info = 4 [json_name = "oauthChannelInfo"];</code>
   * @return The oauthChannelInfo.
   */
  com.com.hearlers.v1.model.OAuthChannelInfo getOauthChannelInfo();
  /**
   * <code>.com.hearlers.v1.model.OAuthChannelInfo oauth_channel_info = 4 [json_name = "oauthChannelInfo"];</code>
   */
  com.com.hearlers.v1.model.OAuthChannelInfoOrBuilder getOauthChannelInfoOrBuilder();

  /**
   * <code>repeated .com.hearlers.v1.model.RefreshToken refresh_tokens = 5 [json_name = "refreshTokens"];</code>
   */
  java.util.List<com.com.hearlers.v1.model.RefreshToken> 
      getRefreshTokensList();
  /**
   * <code>repeated .com.hearlers.v1.model.RefreshToken refresh_tokens = 5 [json_name = "refreshTokens"];</code>
   */
  com.com.hearlers.v1.model.RefreshToken getRefreshTokens(int index);
  /**
   * <code>repeated .com.hearlers.v1.model.RefreshToken refresh_tokens = 5 [json_name = "refreshTokens"];</code>
   */
  int getRefreshTokensCount();
  /**
   * <code>repeated .com.hearlers.v1.model.RefreshToken refresh_tokens = 5 [json_name = "refreshTokens"];</code>
   */
  java.util.List<? extends com.com.hearlers.v1.model.RefreshTokenOrBuilder> 
      getRefreshTokensOrBuilderList();
  /**
   * <code>repeated .com.hearlers.v1.model.RefreshToken refresh_tokens = 5 [json_name = "refreshTokens"];</code>
   */
  com.com.hearlers.v1.model.RefreshTokenOrBuilder getRefreshTokensOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.Timestamp last_login_at = 6 [json_name = "lastLoginAt"];</code>
   * @return Whether the lastLoginAt field is set.
   */
  boolean hasLastLoginAt();
  /**
   * <code>.google.protobuf.Timestamp last_login_at = 6 [json_name = "lastLoginAt"];</code>
   * @return The lastLoginAt.
   */
  com.google.protobuf.Timestamp getLastLoginAt();
  /**
   * <code>.google.protobuf.Timestamp last_login_at = 6 [json_name = "lastLoginAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastLoginAtOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp created_at = 7 [json_name = "createdAt"];</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 7 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 7 [json_name = "createdAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp updated_at = 8 [json_name = "updatedAt"];</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 8 [json_name = "updatedAt"];</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 8 [json_name = "updatedAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp deleted_at = 9 [json_name = "deletedAt"];</code>
   * @return Whether the deletedAt field is set.
   */
  boolean hasDeletedAt();
  /**
   * <code>.google.protobuf.Timestamp deleted_at = 9 [json_name = "deletedAt"];</code>
   * @return The deletedAt.
   */
  com.google.protobuf.Timestamp getDeletedAt();
  /**
   * <code>.google.protobuf.Timestamp deleted_at = 9 [json_name = "deletedAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeletedAtOrBuilder();
}
