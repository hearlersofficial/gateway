// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/user.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface UpdateUserRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.UpdateUserRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  int getUserId();

  /**
   * <code>optional string nickname = 2 [json_name = "nickname"];</code>
   * @return Whether the nickname field is set.
   */
  boolean hasNickname();
  /**
   * <code>optional string nickname = 2 [json_name = "nickname"];</code>
   * @return The nickname.
   */
  java.lang.String getNickname();
  /**
   * <code>optional string nickname = 2 [json_name = "nickname"];</code>
   * @return The bytes for nickname.
   */
  com.google.protobuf.ByteString
      getNicknameBytes();

  /**
   * <code>optional string profile_image = 3 [json_name = "profileImage"];</code>
   * @return Whether the profileImage field is set.
   */
  boolean hasProfileImage();
  /**
   * <code>optional string profile_image = 3 [json_name = "profileImage"];</code>
   * @return The profileImage.
   */
  java.lang.String getProfileImage();
  /**
   * <code>optional string profile_image = 3 [json_name = "profileImage"];</code>
   * @return The bytes for profileImage.
   */
  com.google.protobuf.ByteString
      getProfileImageBytes();

  /**
   * <code>optional string phone_number = 4 [json_name = "phoneNumber"];</code>
   * @return Whether the phoneNumber field is set.
   */
  boolean hasPhoneNumber();
  /**
   * <code>optional string phone_number = 4 [json_name = "phoneNumber"];</code>
   * @return The phoneNumber.
   */
  java.lang.String getPhoneNumber();
  /**
   * <code>optional string phone_number = 4 [json_name = "phoneNumber"];</code>
   * @return The bytes for phoneNumber.
   */
  com.google.protobuf.ByteString
      getPhoneNumberBytes();

  /**
   * <code>optional .com.hearlers.v1.model.Gender gender = 5 [json_name = "gender"];</code>
   * @return Whether the gender field is set.
   */
  boolean hasGender();
  /**
   * <code>optional .com.hearlers.v1.model.Gender gender = 5 [json_name = "gender"];</code>
   * @return The enum numeric value on the wire for gender.
   */
  int getGenderValue();
  /**
   * <code>optional .com.hearlers.v1.model.Gender gender = 5 [json_name = "gender"];</code>
   * @return The gender.
   */
  com.hearlers.api.proto.v1.model.Gender getGender();

  /**
   * <code>optional string birthday = 6 [json_name = "birthday"];</code>
   * @return Whether the birthday field is set.
   */
  boolean hasBirthday();
  /**
   * <code>optional string birthday = 6 [json_name = "birthday"];</code>
   * @return The birthday.
   */
  java.lang.String getBirthday();
  /**
   * <code>optional string birthday = 6 [json_name = "birthday"];</code>
   * @return The bytes for birthday.
   */
  com.google.protobuf.ByteString
      getBirthdayBytes();

  /**
   * <code>optional string introduction = 7 [json_name = "introduction"];</code>
   * @return Whether the introduction field is set.
   */
  boolean hasIntroduction();
  /**
   * <code>optional string introduction = 7 [json_name = "introduction"];</code>
   * @return The introduction.
   */
  java.lang.String getIntroduction();
  /**
   * <code>optional string introduction = 7 [json_name = "introduction"];</code>
   * @return The bytes for introduction.
   */
  com.google.protobuf.ByteString
      getIntroductionBytes();

  /**
   * <code>optional .com.hearlers.v1.model.Mbti mbti = 8 [json_name = "mbti"];</code>
   * @return Whether the mbti field is set.
   */
  boolean hasMbti();
  /**
   * <code>optional .com.hearlers.v1.model.Mbti mbti = 8 [json_name = "mbti"];</code>
   * @return The enum numeric value on the wire for mbti.
   */
  int getMbtiValue();
  /**
   * <code>optional .com.hearlers.v1.model.Mbti mbti = 8 [json_name = "mbti"];</code>
   * @return The mbti.
   */
  com.hearlers.api.proto.v1.model.Mbti getMbti();
}
