// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: price_service.proto

package protos;

/**
 * Protobuf type {@code AllCountryPrice}
 */
public  final class AllCountryPrice extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AllCountryPrice)
    AllCountryPriceOrBuilder {
  // Use AllCountryPrice.newBuilder() to construct.
  private AllCountryPrice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AllCountryPrice() {
    countryPrice_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AllCountryPrice(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              countryPrice_ = new java.util.ArrayList<protos.CountryPrice>();
              mutable_bitField0_ |= 0x00000001;
            }
            countryPrice_.add(
                input.readMessage(protos.CountryPrice.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        countryPrice_ = java.util.Collections.unmodifiableList(countryPrice_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protos.PriceGuideProtos.internal_static_AllCountryPrice_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protos.PriceGuideProtos.internal_static_AllCountryPrice_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protos.AllCountryPrice.class, protos.AllCountryPrice.Builder.class);
  }

  public static final int COUNTRYPRICE_FIELD_NUMBER = 1;
  private java.util.List<protos.CountryPrice> countryPrice_;
  /**
   * <code>repeated .CountryPrice countryPrice = 1;</code>
   */
  public java.util.List<protos.CountryPrice> getCountryPriceList() {
    return countryPrice_;
  }
  /**
   * <code>repeated .CountryPrice countryPrice = 1;</code>
   */
  public java.util.List<? extends protos.CountryPriceOrBuilder> 
      getCountryPriceOrBuilderList() {
    return countryPrice_;
  }
  /**
   * <code>repeated .CountryPrice countryPrice = 1;</code>
   */
  public int getCountryPriceCount() {
    return countryPrice_.size();
  }
  /**
   * <code>repeated .CountryPrice countryPrice = 1;</code>
   */
  public protos.CountryPrice getCountryPrice(int index) {
    return countryPrice_.get(index);
  }
  /**
   * <code>repeated .CountryPrice countryPrice = 1;</code>
   */
  public protos.CountryPriceOrBuilder getCountryPriceOrBuilder(
      int index) {
    return countryPrice_.get(index);
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
    for (int i = 0; i < countryPrice_.size(); i++) {
      output.writeMessage(1, countryPrice_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < countryPrice_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, countryPrice_.get(i));
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
    if (!(obj instanceof protos.AllCountryPrice)) {
      return super.equals(obj);
    }
    protos.AllCountryPrice other = (protos.AllCountryPrice) obj;

    boolean result = true;
    result = result && getCountryPriceList()
        .equals(other.getCountryPriceList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getCountryPriceCount() > 0) {
      hash = (37 * hash) + COUNTRYPRICE_FIELD_NUMBER;
      hash = (53 * hash) + getCountryPriceList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protos.AllCountryPrice parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protos.AllCountryPrice parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protos.AllCountryPrice parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protos.AllCountryPrice parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protos.AllCountryPrice parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protos.AllCountryPrice parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protos.AllCountryPrice parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protos.AllCountryPrice parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protos.AllCountryPrice parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protos.AllCountryPrice parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protos.AllCountryPrice parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protos.AllCountryPrice parseFrom(
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
  public static Builder newBuilder(protos.AllCountryPrice prototype) {
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
   * Protobuf type {@code AllCountryPrice}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AllCountryPrice)
      protos.AllCountryPriceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protos.PriceGuideProtos.internal_static_AllCountryPrice_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protos.PriceGuideProtos.internal_static_AllCountryPrice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protos.AllCountryPrice.class, protos.AllCountryPrice.Builder.class);
    }

    // Construct using protos.AllCountryPrice.newBuilder()
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
        getCountryPriceFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (countryPriceBuilder_ == null) {
        countryPrice_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        countryPriceBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protos.PriceGuideProtos.internal_static_AllCountryPrice_descriptor;
    }

    public protos.AllCountryPrice getDefaultInstanceForType() {
      return protos.AllCountryPrice.getDefaultInstance();
    }

    public protos.AllCountryPrice build() {
      protos.AllCountryPrice result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protos.AllCountryPrice buildPartial() {
      protos.AllCountryPrice result = new protos.AllCountryPrice(this);
      int from_bitField0_ = bitField0_;
      if (countryPriceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          countryPrice_ = java.util.Collections.unmodifiableList(countryPrice_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.countryPrice_ = countryPrice_;
      } else {
        result.countryPrice_ = countryPriceBuilder_.build();
      }
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
      if (other instanceof protos.AllCountryPrice) {
        return mergeFrom((protos.AllCountryPrice)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protos.AllCountryPrice other) {
      if (other == protos.AllCountryPrice.getDefaultInstance()) return this;
      if (countryPriceBuilder_ == null) {
        if (!other.countryPrice_.isEmpty()) {
          if (countryPrice_.isEmpty()) {
            countryPrice_ = other.countryPrice_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCountryPriceIsMutable();
            countryPrice_.addAll(other.countryPrice_);
          }
          onChanged();
        }
      } else {
        if (!other.countryPrice_.isEmpty()) {
          if (countryPriceBuilder_.isEmpty()) {
            countryPriceBuilder_.dispose();
            countryPriceBuilder_ = null;
            countryPrice_ = other.countryPrice_;
            bitField0_ = (bitField0_ & ~0x00000001);
            countryPriceBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCountryPriceFieldBuilder() : null;
          } else {
            countryPriceBuilder_.addAllMessages(other.countryPrice_);
          }
        }
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
      protos.AllCountryPrice parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protos.AllCountryPrice) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<protos.CountryPrice> countryPrice_ =
      java.util.Collections.emptyList();
    private void ensureCountryPriceIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        countryPrice_ = new java.util.ArrayList<protos.CountryPrice>(countryPrice_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        protos.CountryPrice, protos.CountryPrice.Builder, protos.CountryPriceOrBuilder> countryPriceBuilder_;

    /**
     * <code>repeated .CountryPrice countryPrice = 1;</code>
     */
    public java.util.List<protos.CountryPrice> getCountryPriceList() {
      if (countryPriceBuilder_ == null) {
        return java.util.Collections.unmodifiableList(countryPrice_);
      } else {
        return countryPriceBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .CountryPrice countryPrice = 1;</code>
     */
    public int getCountryPriceCount() {
      if (countryPriceBuilder_ == null) {
        return countryPrice_.size();
      } else {
        return countryPriceBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .CountryPrice countryPrice = 1;</code>
     */
    public protos.CountryPrice getCountryPrice(int index) {
      if (countryPriceBuilder_ == null) {
        return countryPrice_.get(index);
      } else {
        return countryPriceBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .CountryPrice countryPrice = 1;</code>
     */
    public Builder setCountryPrice(
        int index, protos.CountryPrice value) {
      if (countryPriceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCountryPriceIsMutable();
        countryPrice_.set(index, value);
        onChanged();
      } else {
        countryPriceBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .CountryPrice countryPrice = 1;</code>
     */
    public Builder setCountryPrice(
        int index, protos.CountryPrice.Builder builderForValue) {
      if (countryPriceBuilder_ == null) {
        ensureCountryPriceIsMutable();
        countryPrice_.set(index, builderForValue.build());
        onChanged();
      } else {
        countryPriceBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .CountryPrice countryPrice = 1;</code>
     */
    public Builder addCountryPrice(protos.CountryPrice value) {
      if (countryPriceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCountryPriceIsMutable();
        countryPrice_.add(value);
        onChanged();
      } else {
        countryPriceBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .CountryPrice countryPrice = 1;</code>
     */
    public Builder addCountryPrice(
        int index, protos.CountryPrice value) {
      if (countryPriceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCountryPriceIsMutable();
        countryPrice_.add(index, value);
        onChanged();
      } else {
        countryPriceBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .CountryPrice countryPrice = 1;</code>
     */
    public Builder addCountryPrice(
        protos.CountryPrice.Builder builderForValue) {
      if (countryPriceBuilder_ == null) {
        ensureCountryPriceIsMutable();
        countryPrice_.add(builderForValue.build());
        onChanged();
      } else {
        countryPriceBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .CountryPrice countryPrice = 1;</code>
     */
    public Builder addCountryPrice(
        int index, protos.CountryPrice.Builder builderForValue) {
      if (countryPriceBuilder_ == null) {
        ensureCountryPriceIsMutable();
        countryPrice_.add(index, builderForValue.build());
        onChanged();
      } else {
        countryPriceBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .CountryPrice countryPrice = 1;</code>
     */
    public Builder addAllCountryPrice(
        java.lang.Iterable<? extends protos.CountryPrice> values) {
      if (countryPriceBuilder_ == null) {
        ensureCountryPriceIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, countryPrice_);
        onChanged();
      } else {
        countryPriceBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .CountryPrice countryPrice = 1;</code>
     */
    public Builder clearCountryPrice() {
      if (countryPriceBuilder_ == null) {
        countryPrice_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        countryPriceBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .CountryPrice countryPrice = 1;</code>
     */
    public Builder removeCountryPrice(int index) {
      if (countryPriceBuilder_ == null) {
        ensureCountryPriceIsMutable();
        countryPrice_.remove(index);
        onChanged();
      } else {
        countryPriceBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .CountryPrice countryPrice = 1;</code>
     */
    public protos.CountryPrice.Builder getCountryPriceBuilder(
        int index) {
      return getCountryPriceFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .CountryPrice countryPrice = 1;</code>
     */
    public protos.CountryPriceOrBuilder getCountryPriceOrBuilder(
        int index) {
      if (countryPriceBuilder_ == null) {
        return countryPrice_.get(index);  } else {
        return countryPriceBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .CountryPrice countryPrice = 1;</code>
     */
    public java.util.List<? extends protos.CountryPriceOrBuilder> 
         getCountryPriceOrBuilderList() {
      if (countryPriceBuilder_ != null) {
        return countryPriceBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(countryPrice_);
      }
    }
    /**
     * <code>repeated .CountryPrice countryPrice = 1;</code>
     */
    public protos.CountryPrice.Builder addCountryPriceBuilder() {
      return getCountryPriceFieldBuilder().addBuilder(
          protos.CountryPrice.getDefaultInstance());
    }
    /**
     * <code>repeated .CountryPrice countryPrice = 1;</code>
     */
    public protos.CountryPrice.Builder addCountryPriceBuilder(
        int index) {
      return getCountryPriceFieldBuilder().addBuilder(
          index, protos.CountryPrice.getDefaultInstance());
    }
    /**
     * <code>repeated .CountryPrice countryPrice = 1;</code>
     */
    public java.util.List<protos.CountryPrice.Builder> 
         getCountryPriceBuilderList() {
      return getCountryPriceFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        protos.CountryPrice, protos.CountryPrice.Builder, protos.CountryPriceOrBuilder> 
        getCountryPriceFieldBuilder() {
      if (countryPriceBuilder_ == null) {
        countryPriceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            protos.CountryPrice, protos.CountryPrice.Builder, protos.CountryPriceOrBuilder>(
                countryPrice_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        countryPrice_ = null;
      }
      return countryPriceBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:AllCountryPrice)
  }

  // @@protoc_insertion_point(class_scope:AllCountryPrice)
  private static final protos.AllCountryPrice DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protos.AllCountryPrice();
  }

  public static protos.AllCountryPrice getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllCountryPrice>
      PARSER = new com.google.protobuf.AbstractParser<AllCountryPrice>() {
    public AllCountryPrice parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AllCountryPrice(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AllCountryPrice> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllCountryPrice> getParserForType() {
    return PARSER;
  }

  public protos.AllCountryPrice getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

