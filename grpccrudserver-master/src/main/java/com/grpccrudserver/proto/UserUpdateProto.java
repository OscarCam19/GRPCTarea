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

  @Override
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
      throw new NullPointerException();
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
            String s = input.readStringRequireUtf8();

            userId_ = s;
            break;
          }
          case 18: {
            UserDetailsRequestProto.Builder subBuilder = null;
            if (userDetailsRequestProto_ != null) {
              subBuilder = userDetailsRequestProto_.toBuilder();
            }
            userDetailsRequestProto_ = input.readMessage(UserDetailsRequestProto.parser(), extensionRegistry);
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
    return Service.internal_static_UserUpdateProto_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Service.internal_static_UserUpdateProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            UserUpdateProto.class, Builder.class);
  }

  public static final int USERID_FIELD_NUMBER = 1;
  private volatile Object userId_;
  /**
   * <code>string userId = 1;</code>
   */
  public String getUserId() {
    Object ref = userId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string userId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    Object ref = userId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_DETAILS_REQUEST_PROTO_FIELD_NUMBER = 2;
  private UserDetailsRequestProto userDetailsRequestProto_;
  /**
   * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
   */
  public boolean hasUserDetailsRequestProto() {
    return userDetailsRequestProto_ != null;
  }
  /**
   * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
   */
  public UserDetailsRequestProto getUserDetailsRequestProto() {
    return userDetailsRequestProto_ == null ? UserDetailsRequestProto.getDefaultInstance() : userDetailsRequestProto_;
  }
  /**
   * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
   */
  public UserDetailsRequestProtoOrBuilder getUserDetailsRequestProtoOrBuilder() {
    return getUserDetailsRequestProto();
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
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

  @Override
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

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof UserUpdateProto)) {
      return super.equals(obj);
    }
    UserUpdateProto other = (UserUpdateProto) obj;

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

  @Override
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

  public static UserUpdateProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UserUpdateProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UserUpdateProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UserUpdateProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UserUpdateProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UserUpdateProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UserUpdateProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UserUpdateProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static UserUpdateProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static UserUpdateProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static UserUpdateProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UserUpdateProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(UserUpdateProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code UserUpdateProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UserUpdateProto)
      UserUpdateProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Service.internal_static_UserUpdateProto_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Service.internal_static_UserUpdateProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              UserUpdateProto.class, Builder.class);
    }

    // Construct using com.grpccrudserver.proto.UserUpdateProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
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

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Service.internal_static_UserUpdateProto_descriptor;
    }

    @Override
    public UserUpdateProto getDefaultInstanceForType() {
      return UserUpdateProto.getDefaultInstance();
    }

    @Override
    public UserUpdateProto build() {
      UserUpdateProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public UserUpdateProto buildPartial() {
      UserUpdateProto result = new UserUpdateProto(this);
      result.userId_ = userId_;
      if (userDetailsRequestProtoBuilder_ == null) {
        result.userDetailsRequestProto_ = userDetailsRequestProto_;
      } else {
        result.userDetailsRequestProto_ = userDetailsRequestProtoBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof UserUpdateProto) {
        return mergeFrom((UserUpdateProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(UserUpdateProto other) {
      if (other == UserUpdateProto.getDefaultInstance()) return this;
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

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      UserUpdateProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (UserUpdateProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object userId_ = "";
    /**
     * <code>string userId = 1;</code>
     */
    public String getUserId() {
      Object ref = userId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string userId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
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
        String value) {
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

    private UserDetailsRequestProto userDetailsRequestProto_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        UserDetailsRequestProto, UserDetailsRequestProto.Builder, UserDetailsRequestProtoOrBuilder> userDetailsRequestProtoBuilder_;
    /**
     * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
     */
    public boolean hasUserDetailsRequestProto() {
      return userDetailsRequestProtoBuilder_ != null || userDetailsRequestProto_ != null;
    }
    /**
     * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
     */
    public UserDetailsRequestProto getUserDetailsRequestProto() {
      if (userDetailsRequestProtoBuilder_ == null) {
        return userDetailsRequestProto_ == null ? UserDetailsRequestProto.getDefaultInstance() : userDetailsRequestProto_;
      } else {
        return userDetailsRequestProtoBuilder_.getMessage();
      }
    }
    /**
     * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
     */
    public Builder setUserDetailsRequestProto(UserDetailsRequestProto value) {
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
        UserDetailsRequestProto.Builder builderForValue) {
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
    public Builder mergeUserDetailsRequestProto(UserDetailsRequestProto value) {
      if (userDetailsRequestProtoBuilder_ == null) {
        if (userDetailsRequestProto_ != null) {
          userDetailsRequestProto_ =
            UserDetailsRequestProto.newBuilder(userDetailsRequestProto_).mergeFrom(value).buildPartial();
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
    public UserDetailsRequestProto.Builder getUserDetailsRequestProtoBuilder() {

      onChanged();
      return getUserDetailsRequestProtoFieldBuilder().getBuilder();
    }
    /**
     * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
     */
    public UserDetailsRequestProtoOrBuilder getUserDetailsRequestProtoOrBuilder() {
      if (userDetailsRequestProtoBuilder_ != null) {
        return userDetailsRequestProtoBuilder_.getMessageOrBuilder();
      } else {
        return userDetailsRequestProto_ == null ?
            UserDetailsRequestProto.getDefaultInstance() : userDetailsRequestProto_;
      }
    }
    /**
     * <code>.UserDetailsRequestProto user_details_request_proto = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        UserDetailsRequestProto, UserDetailsRequestProto.Builder, UserDetailsRequestProtoOrBuilder>
        getUserDetailsRequestProtoFieldBuilder() {
      if (userDetailsRequestProtoBuilder_ == null) {
        userDetailsRequestProtoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            UserDetailsRequestProto, UserDetailsRequestProto.Builder, UserDetailsRequestProtoOrBuilder>(
                getUserDetailsRequestProto(),
                getParentForChildren(),
                isClean());
        userDetailsRequestProto_ = null;
      }
      return userDetailsRequestProtoBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:UserUpdateProto)
  }

  // @@protoc_insertion_point(class_scope:UserUpdateProto)
  private static final UserUpdateProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UserUpdateProto();
  }

  public static UserUpdateProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserUpdateProto>
      PARSER = new com.google.protobuf.AbstractParser<UserUpdateProto>() {
    @Override
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

  @Override
  public com.google.protobuf.Parser<UserUpdateProto> getParserForType() {
    return PARSER;
  }

  @Override
  public UserUpdateProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

