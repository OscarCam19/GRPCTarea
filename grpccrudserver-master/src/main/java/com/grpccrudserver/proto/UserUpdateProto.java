// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service.proto

package com.grpccrudserver.proto;

/**
 * Protobuf type {@code UserUpdateProto}
 */
public  final class UserUpdateProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UserUpdateProto)
    UserUpdateProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserUpdateProto.newBuilder() to construct.
  private UserUpdateProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserUpdateProto() {
    userId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserUpdateProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            userId_ = s;
            break;
          }
          case 18: {
            com.grpccrudserver.proto.UserDetailsRequestProto.Builder subBuilder = null;
            if (userDetailsRequestProto_ != null) {
              subBuilder = userDetailsRequestProto_.toBuilder();
            }
            userDetailsRequestProto_ = input.readMessage(com.grpccrudserver.proto.UserDetailsRequestProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(userDetailsRequestProto_);
              userDetailsRequestProto_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpccrudserver.proto.Service.internal_static_UserUpdateProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpccrudserver.proto.Service.internal_static_UserUpdateProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpccrudserver.proto.UserUpdateProto.class, com.grpccrudserver.proto.UserUpdateProto.Builder.class);
  }

  public static final int USERID_FIELD_NUMBER = 1;
  private volatile java.lang.Object userId_;
  /**
   * <code>string userId = 1;</code>
   */
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string userId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_DETAILS_REQUEST_PROTO_FIELD_NUMBER = 2;
  private com.grpccrudserver.proto.UserDetailsRequestProto userDetailsRequestProto_;
  /**
   * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
   */
  public boolean hasUserDetailsRequestProto() {
    return userDetailsRequestProto_ != null;
  }
  /**
   * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
   */
  public com.grpccrudserver.proto.UserDetailsRequestProto getUserDetailsRequestProto() {
    return userDetailsRequestProto_ == null ? com.grpccrudserver.proto.UserDetailsRequestProto.getDefaultInstance() : userDetailsRequestProto_;
  }
  /**
   * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
   */
  public com.grpccrudserver.proto.UserDetailsRequestProtoOrBuilder getUserDetailsRequestProtoOrBuilder() {
    return getUserDetailsRequestProto();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getUserIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userId_);
    }
    if (userDetailsRequestProto_ != null) {
      output.writeMessage(2, getUserDetailsRequestProto());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
    }
    if (userDetailsRequestProto_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUserDetailsRequestProto());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.grpccrudserver.proto.UserUpdateProto)) {
      return super.equals(obj);
    }
    com.grpccrudserver.proto.UserUpdateProto other = (com.grpccrudserver.proto.UserUpdateProto) obj;

    boolean result = true;
    result = result && getUserId()
        .equals(other.getUserId());
    result = result && (hasUserDetailsRequestProto() == other.hasUserDetailsRequestProto());
    if (hasUserDetailsRequestProto()) {
      result = result && getUserDetailsRequestProto()
          .equals(other.getUserDetailsRequestProto());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    if (hasUserDetailsRequestProto()) {
      hash = (37 * hash) + USER_DETAILS_REQUEST_PROTO_FIELD_NUMBER;
      hash = (53 * hash) + getUserDetailsRequestProto().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpccrudserver.proto.UserUpdateProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpccrudserver.proto.UserUpdateProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpccrudserver.proto.UserUpdateProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpccrudserver.proto.UserUpdateProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpccrudserver.proto.UserUpdateProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpccrudserver.proto.UserUpdateProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpccrudserver.proto.UserUpdateProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpccrudserver.proto.UserUpdateProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpccrudserver.proto.UserUpdateProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpccrudserver.proto.UserUpdateProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpccrudserver.proto.UserUpdateProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpccrudserver.proto.UserUpdateProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.grpccrudserver.proto.UserUpdateProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code UserUpdateProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UserUpdateProto)
      com.grpccrudserver.proto.UserUpdateProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpccrudserver.proto.Service.internal_static_UserUpdateProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpccrudserver.proto.Service.internal_static_UserUpdateProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpccrudserver.proto.UserUpdateProto.class, com.grpccrudserver.proto.UserUpdateProto.Builder.class);
    }

    // Construct using com.grpccrudserver.proto.UserUpdateProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      userId_ = "";

      if (userDetailsRequestProtoBuilder_ == null) {
        userDetailsRequestProto_ = null;
      } else {
        userDetailsRequestProto_ = null;
        userDetailsRequestProtoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpccrudserver.proto.Service.internal_static_UserUpdateProto_descriptor;
    }

    @java.lang.Override
    public com.grpccrudserver.proto.UserUpdateProto getDefaultInstanceForType() {
      return com.grpccrudserver.proto.UserUpdateProto.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpccrudserver.proto.UserUpdateProto build() {
      com.grpccrudserver.proto.UserUpdateProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpccrudserver.proto.UserUpdateProto buildPartial() {
      com.grpccrudserver.proto.UserUpdateProto result = new com.grpccrudserver.proto.UserUpdateProto(this);
      result.userId_ = userId_;
      if (userDetailsRequestProtoBuilder_ == null) {
        result.userDetailsRequestProto_ = userDetailsRequestProto_;
      } else {
        result.userDetailsRequestProto_ = userDetailsRequestProtoBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grpccrudserver.proto.UserUpdateProto) {
        return mergeFrom((com.grpccrudserver.proto.UserUpdateProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpccrudserver.proto.UserUpdateProto other) {
      if (other == com.grpccrudserver.proto.UserUpdateProto.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (other.hasUserDetailsRequestProto()) {
        mergeUserDetailsRequestProto(other.getUserDetailsRequestProto());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.grpccrudserver.proto.UserUpdateProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpccrudserver.proto.UserUpdateProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <code>string userId = 1;</code>
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userId = 1;</code>
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userId = 1;</code>
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <code>string userId = 1;</code>
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private com.grpccrudserver.proto.UserDetailsRequestProto userDetailsRequestProto_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpccrudserver.proto.UserDetailsRequestProto, com.grpccrudserver.proto.UserDetailsRequestProto.Builder, com.grpccrudserver.proto.UserDetailsRequestProtoOrBuilder> userDetailsRequestProtoBuilder_;
    /**
     * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
     */
    public boolean hasUserDetailsRequestProto() {
      return userDetailsRequestProtoBuilder_ != null || userDetailsRequestProto_ != null;
    }
    /**
     * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
     */
    public com.grpccrudserver.proto.UserDetailsRequestProto getUserDetailsRequestProto() {
      if (userDetailsRequestProtoBuilder_ == null) {
        return userDetailsRequestProto_ == null ? com.grpccrudserver.proto.UserDetailsRequestProto.getDefaultInstance() : userDetailsRequestProto_;
      } else {
        return userDetailsRequestProtoBuilder_.getMessage();
      }
    }
    /**
     * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
     */
    public Builder setUserDetailsRequestProto(com.grpccrudserver.proto.UserDetailsRequestProto value) {
      if (userDetailsRequestProtoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userDetailsRequestProto_ = value;
        onChanged();
      } else {
        userDetailsRequestProtoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
     */
    public Builder setUserDetailsRequestProto(
        com.grpccrudserver.proto.UserDetailsRequestProto.Builder builderForValue) {
      if (userDetailsRequestProtoBuilder_ == null) {
        userDetailsRequestProto_ = builderForValue.build();
        onChanged();
      } else {
        userDetailsRequestProtoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
     */
    public Builder mergeUserDetailsRequestProto(com.grpccrudserver.proto.UserDetailsRequestProto value) {
      if (userDetailsRequestProtoBuilder_ == null) {
        if (userDetailsRequestProto_ != null) {
          userDetailsRequestProto_ =
            com.grpccrudserver.proto.UserDetailsRequestProto.newBuilder(userDetailsRequestProto_).mergeFrom(value).buildPartial();
        } else {
          userDetailsRequestProto_ = value;
        }
        onChanged();
      } else {
        userDetailsRequestProtoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
     */
    public Builder clearUserDetailsRequestProto() {
      if (userDetailsRequestProtoBuilder_ == null) {
        userDetailsRequestProto_ = null;
        onChanged();
      } else {
        userDetailsRequestProto_ = null;
        userDetailsRequestProtoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
     */
    public com.grpccrudserver.proto.UserDetailsRequestProto.Builder getUserDetailsRequestProtoBuilder() {
      
      onChanged();
      return getUserDetailsRequestProtoFieldBuilder().getBuilder();
    }
    /**
     * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
     */
    public com.grpccrudserver.proto.UserDetailsRequestProtoOrBuilder getUserDetailsRequestProtoOrBuilder() {
      if (userDetailsRequestProtoBuilder_ != null) {
        return userDetailsRequestProtoBuilder_.getMessageOrBuilder();
      } else {
        return userDetailsRequestProto_ == null ?
            com.grpccrudserver.proto.UserDetailsRequestProto.getDefaultInstance() : userDetailsRequestProto_;
      }
    }
    /**
     * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpccrudserver.proto.UserDetailsRequestProto, com.grpccrudserver.proto.UserDetailsRequestProto.Builder, com.grpccrudserver.proto.UserDetailsRequestProtoOrBuilder> 
        getUserDetailsRequestProtoFieldBuilder() {
      if (userDetailsRequestProtoBuilder_ == null) {
        userDetailsRequestProtoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.grpccrudserver.proto.UserDetailsRequestProto, com.grpccrudserver.proto.UserDetailsRequestProto.Builder, com.grpccrudserver.proto.UserDetailsRequestProtoOrBuilder>(
                getUserDetailsRequestProto(),
                getParentForChildren(),
                isClean());
        userDetailsRequestProto_ = null;
      }
      return userDetailsRequestProtoBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:UserUpdateProto)
  }

  // @@protoc_insertion_point(class_scope:UserUpdateProto)
  private static final com.grpccrudserver.proto.UserUpdateProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpccrudserver.proto.UserUpdateProto();
  }

  public static com.grpccrudserver.proto.UserUpdateProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserUpdateProto>
      PARSER = new com.google.protobuf.AbstractParser<UserUpdateProto>() {
    @java.lang.Override
    public UserUpdateProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserUpdateProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserUpdateProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserUpdateProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpccrudserver.proto.UserUpdateProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

