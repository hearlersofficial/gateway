// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel_prompt.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface UpdatePromptVersionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.UpdatePromptVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string prompt_version_id = 1 [json_name = "promptVersionId"];</code>
   * @return The promptVersionId.
   */
  java.lang.String getPromptVersionId();
  /**
   * <code>string prompt_version_id = 1 [json_name = "promptVersionId"];</code>
   * @return The bytes for promptVersionId.
   */
  com.google.protobuf.ByteString
      getPromptVersionIdBytes();

  /**
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string description = 3 [json_name = "description"];</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>optional string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>optional bool is_bookmarked = 4 [json_name = "isBookmarked"];</code>
   * @return Whether the isBookmarked field is set.
   */
  boolean hasIsBookmarked();
  /**
   * <code>optional bool is_bookmarked = 4 [json_name = "isBookmarked"];</code>
   * @return The isBookmarked.
   */
  boolean getIsBookmarked();

  /**
   * <code>optional .com.hearlers.v1.model.GPTModel gpt_model = 5 [json_name = "gptModel"];</code>
   * @return Whether the gptModel field is set.
   */
  boolean hasGptModel();
  /**
   * <code>optional .com.hearlers.v1.model.GPTModel gpt_model = 5 [json_name = "gptModel"];</code>
   * @return The enum numeric value on the wire for gptModel.
   */
  int getGptModelValue();
  /**
   * <code>optional .com.hearlers.v1.model.GPTModel gpt_model = 5 [json_name = "gptModel"];</code>
   * @return The gptModel.
   */
  com.hearlers.api.proto.v1.model.GPTModel getGptModel();
}
