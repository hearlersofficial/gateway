// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel_prompt.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface FindActiveVersionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.FindActiveVersionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .com.hearlers.v1.model.PromptVersion prompt_version = 1 [json_name = "promptVersion"];</code>
   * @return Whether the promptVersion field is set.
   */
  boolean hasPromptVersion();
  /**
   * <code>optional .com.hearlers.v1.model.PromptVersion prompt_version = 1 [json_name = "promptVersion"];</code>
   * @return The promptVersion.
   */
  com.hearlers.api.proto.v1.model.PromptVersion getPromptVersion();
  /**
   * <code>optional .com.hearlers.v1.model.PromptVersion prompt_version = 1 [json_name = "promptVersion"];</code>
   */
  com.hearlers.api.proto.v1.model.PromptVersionOrBuilder getPromptVersionOrBuilder();
}
