// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counselor.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface CreateToneResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.CreateToneResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.hearlers.v1.model.Tone tone = 1 [json_name = "tone"];</code>
   * @return Whether the tone field is set.
   */
  boolean hasTone();
  /**
   * <code>.com.hearlers.v1.model.Tone tone = 1 [json_name = "tone"];</code>
   * @return The tone.
   */
  com.hearlers.api.proto.v1.model.Tone getTone();
  /**
   * <code>.com.hearlers.v1.model.Tone tone = 1 [json_name = "tone"];</code>
   */
  com.hearlers.api.proto.v1.model.ToneOrBuilder getToneOrBuilder();
}
