// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface CreateCounselTechniqueRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.CreateCounselTechniqueRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string tone_id = 2 [json_name = "toneId"];</code>
   * @return Whether the toneId field is set.
   */
  boolean hasToneId();
  /**
   * <code>optional string tone_id = 2 [json_name = "toneId"];</code>
   * @return The toneId.
   */
  java.lang.String getToneId();
  /**
   * <code>optional string tone_id = 2 [json_name = "toneId"];</code>
   * @return The bytes for toneId.
   */
  com.google.protobuf.ByteString
      getToneIdBytes();

  /**
   * <code>string context_id = 3 [json_name = "contextId"];</code>
   * @return The contextId.
   */
  java.lang.String getContextId();
  /**
   * <code>string context_id = 3 [json_name = "contextId"];</code>
   * @return The bytes for contextId.
   */
  com.google.protobuf.ByteString
      getContextIdBytes();

  /**
   * <code>string instruction_id = 4 [json_name = "instructionId"];</code>
   * @return The instructionId.
   */
  java.lang.String getInstructionId();
  /**
   * <code>string instruction_id = 4 [json_name = "instructionId"];</code>
   * @return The bytes for instructionId.
   */
  com.google.protobuf.ByteString
      getInstructionIdBytes();

  /**
   * <code>.com.hearlers.v1.model.CounselTechniqueStage counsel_technique_stage = 5 [json_name = "counselTechniqueStage"];</code>
   * @return The enum numeric value on the wire for counselTechniqueStage.
   */
  int getCounselTechniqueStageValue();
  /**
   * <code>.com.hearlers.v1.model.CounselTechniqueStage counsel_technique_stage = 5 [json_name = "counselTechniqueStage"];</code>
   * @return The counselTechniqueStage.
   */
  com.hearlers.api.proto.v1.model.CounselTechniqueStage getCounselTechniqueStage();
}
