// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service.proto

package com.grpccrudserver.proto;

public interface UserUpdateProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UserUpdateProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string userId = 1;</code>
   */
  java.lang.String getUserId();
  /**
   * <code>string userId = 1;</code>
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
   */
  boolean hasUserDetailsRequestProto();
  /**
   * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
   */
  com.grpccrudserver.proto.UserDetailsRequestProto getUserDetailsRequestProto();
  /**
   * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
   */
  com.grpccrudserver.proto.UserDetailsRequestProtoOrBuilder getUserDetailsRequestProtoOrBuilder();
}
