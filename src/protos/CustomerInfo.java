// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: price_service.proto

package protos;

/**
 * Protobuf type {@code CustomerInfo}
 */
public  final class CustomerInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CustomerInfo)
    CustomerInfoOrBuilder {
  // Use CustomerInfo.newBuilder() to construct.
  private CustomerInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomerInfo() {
    id_ = "";
    country_ = "";
    plan_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CustomerInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            country_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            plan_ = s;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protos.PriceGuideProtos.internal_static_CustomerInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protos.PriceGuideProtos.internal_static_CustomerInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protos.CustomerInfo.class, protos.CustomerInfo.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNTRY_FIELD_NUMBER = 2;
  private volatile java.lang.Object country_;
  /**
   * <code>string country = 2;</code>
   */
  public java.lang.String getCountry() {
    java.lang.Object ref = country_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      country_ = s;
      return s;
    }
  }
  /**
   * <code>string country = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCountryBytes() {
    java.lang.Object ref = country_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      country_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLAN_FIELD_NUMBER = 3;
  private volatile java.lang.Object plan_;
  /**
   * <code>string plan = 3;</code>
   */
  public java.lang.String getPlan() {
    java.lang.Object ref = plan_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      plan_ = s;
      return s;
    }
  }
  /**
   * <code>string plan = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPlanBytes() {
    java.lang.Object ref = plan_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      plan_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!getCountryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, country_);
    }
    if (!getPlanBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, plan_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!getCountryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, country_);
    }
    if (!getPlanBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, plan_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof protos.CustomerInfo)) {
      return super.equals(obj);
    }
    protos.CustomerInfo other = (protos.CustomerInfo) obj;

    boolean result = true;
    result = result && getId()
        .equals(other.getId());
    result = result && getCountry()
        .equals(other.getCountry());
    result = result && getPlan()
        .equals(other.getPlan());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + COUNTRY_FIELD_NUMBER;
    hash = (53 * hash) + getCountry().hashCode();
    hash = (37 * hash) + PLAN_FIELD_NUMBER;
    hash = (53 * hash) + getPlan().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protos.CustomerInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protos.CustomerInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protos.CustomerInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protos.CustomerInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protos.CustomerInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protos.CustomerInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protos.CustomerInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protos.CustomerInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protos.CustomerInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protos.CustomerInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protos.CustomerInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protos.CustomerInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(protos.CustomerInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code CustomerInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CustomerInfo)
      protos.CustomerInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protos.PriceGuideProtos.internal_static_CustomerInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protos.PriceGuideProtos.internal_static_CustomerInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protos.CustomerInfo.class, protos.CustomerInfo.Builder.class);
    }

    // Construct using protos.CustomerInfo.newBuilder()
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
    public Builder clear() {
      super.clear();
      id_ = "";

      country_ = "";

      plan_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protos.PriceGuideProtos.internal_static_CustomerInfo_descriptor;
    }

    public protos.CustomerInfo getDefaultInstanceForType() {
      return protos.CustomerInfo.getDefaultInstance();
    }

    public protos.CustomerInfo build() {
      protos.CustomerInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protos.CustomerInfo buildPartial() {
      protos.CustomerInfo result = new protos.CustomerInfo(this);
      result.id_ = id_;
      result.country_ = country_;
      result.plan_ = plan_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof protos.CustomerInfo) {
        return mergeFrom((protos.CustomerInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protos.CustomerInfo other) {
      if (other == protos.CustomerInfo.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getCountry().isEmpty()) {
        country_ = other.country_;
        onChanged();
      }
      if (!other.getPlan().isEmpty()) {
        plan_ = other.plan_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      protos.CustomerInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protos.CustomerInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object country_ = "";
    /**
     * <code>string country = 2;</code>
     */
    public java.lang.String getCountry() {
      java.lang.Object ref = country_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        country_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string country = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCountryBytes() {
      java.lang.Object ref = country_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        country_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string country = 2;</code>
     */
    public Builder setCountry(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      country_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string country = 2;</code>
     */
    public Builder clearCountry() {
      
      country_ = getDefaultInstance().getCountry();
      onChanged();
      return this;
    }
    /**
     * <code>string country = 2;</code>
     */
    public Builder setCountryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      country_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object plan_ = "";
    /**
     * <code>string plan = 3;</code>
     */
    public java.lang.String getPlan() {
      java.lang.Object ref = plan_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        plan_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string plan = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPlanBytes() {
      java.lang.Object ref = plan_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        plan_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string plan = 3;</code>
     */
    public Builder setPlan(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      plan_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string plan = 3;</code>
     */
    public Builder clearPlan() {
      
      plan_ = getDefaultInstance().getPlan();
      onChanged();
      return this;
    }
    /**
     * <code>string plan = 3;</code>
     */
    public Builder setPlanBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      plan_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:CustomerInfo)
  }

  // @@protoc_insertion_point(class_scope:CustomerInfo)
  private static final protos.CustomerInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protos.CustomerInfo();
  }

  public static protos.CustomerInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomerInfo>
      PARSER = new com.google.protobuf.AbstractParser<CustomerInfo>() {
    public CustomerInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CustomerInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CustomerInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomerInfo> getParserForType() {
    return PARSER;
  }

  public protos.CustomerInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

