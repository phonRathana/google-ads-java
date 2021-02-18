// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/enums/change_event_resource_type.proto

package com.google.ads.googleads.v6.enums;

/**
 * <pre>
 * Container for enum describing supported resource types for the ChangeEvent
 * resource.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum}
 */
public final class ChangeEventResourceTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum)
    ChangeEventResourceTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChangeEventResourceTypeEnum.newBuilder() to construct.
  private ChangeEventResourceTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChangeEventResourceTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChangeEventResourceTypeEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChangeEventResourceTypeEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          default: {
            if (!parseUnknownField(
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
    return com.google.ads.googleads.v6.enums.ChangeEventResourceTypeProto.internal_static_google_ads_googleads_v6_enums_ChangeEventResourceTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v6.enums.ChangeEventResourceTypeProto.internal_static_google_ads_googleads_v6_enums_ChangeEventResourceTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum.class, com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum listing the resource types support by the ChangeEvent resource.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum.ChangeEventResourceType}
   */
  public enum ChangeEventResourceType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * No value has been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents an unclassified resource unknown
     * in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * An Ad resource change.
     * </pre>
     *
     * <code>AD = 2;</code>
     */
    AD(2),
    /**
     * <pre>
     * An AdGroup resource change.
     * </pre>
     *
     * <code>AD_GROUP = 3;</code>
     */
    AD_GROUP(3),
    /**
     * <pre>
     * An AdGroupCriterion resource change.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION = 4;</code>
     */
    AD_GROUP_CRITERION(4),
    /**
     * <pre>
     * A Campaign resource change.
     * </pre>
     *
     * <code>CAMPAIGN = 5;</code>
     */
    CAMPAIGN(5),
    /**
     * <pre>
     * A CampaignBudget resource change.
     * </pre>
     *
     * <code>CAMPAIGN_BUDGET = 6;</code>
     */
    CAMPAIGN_BUDGET(6),
    /**
     * <pre>
     * An AdGroupBidModifier resource change.
     * </pre>
     *
     * <code>AD_GROUP_BID_MODIFIER = 7;</code>
     */
    AD_GROUP_BID_MODIFIER(7),
    /**
     * <pre>
     * A CampaignCriterion resource change.
     * </pre>
     *
     * <code>CAMPAIGN_CRITERION = 8;</code>
     */
    CAMPAIGN_CRITERION(8),
    /**
     * <pre>
     * A Feed resource change.
     * </pre>
     *
     * <code>FEED = 9;</code>
     */
    FEED(9),
    /**
     * <pre>
     * A FeedItem resource change.
     * </pre>
     *
     * <code>FEED_ITEM = 10;</code>
     */
    FEED_ITEM(10),
    /**
     * <pre>
     * A CampaignFeed resource change.
     * </pre>
     *
     * <code>CAMPAIGN_FEED = 11;</code>
     */
    CAMPAIGN_FEED(11),
    /**
     * <pre>
     * An AdGroupFeed resource change.
     * </pre>
     *
     * <code>AD_GROUP_FEED = 12;</code>
     */
    AD_GROUP_FEED(12),
    /**
     * <pre>
     * An AdGroupAd resource change.
     * </pre>
     *
     * <code>AD_GROUP_AD = 13;</code>
     */
    AD_GROUP_AD(13),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * No value has been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents an unclassified resource unknown
     * in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * An Ad resource change.
     * </pre>
     *
     * <code>AD = 2;</code>
     */
    public static final int AD_VALUE = 2;
    /**
     * <pre>
     * An AdGroup resource change.
     * </pre>
     *
     * <code>AD_GROUP = 3;</code>
     */
    public static final int AD_GROUP_VALUE = 3;
    /**
     * <pre>
     * An AdGroupCriterion resource change.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION = 4;</code>
     */
    public static final int AD_GROUP_CRITERION_VALUE = 4;
    /**
     * <pre>
     * A Campaign resource change.
     * </pre>
     *
     * <code>CAMPAIGN = 5;</code>
     */
    public static final int CAMPAIGN_VALUE = 5;
    /**
     * <pre>
     * A CampaignBudget resource change.
     * </pre>
     *
     * <code>CAMPAIGN_BUDGET = 6;</code>
     */
    public static final int CAMPAIGN_BUDGET_VALUE = 6;
    /**
     * <pre>
     * An AdGroupBidModifier resource change.
     * </pre>
     *
     * <code>AD_GROUP_BID_MODIFIER = 7;</code>
     */
    public static final int AD_GROUP_BID_MODIFIER_VALUE = 7;
    /**
     * <pre>
     * A CampaignCriterion resource change.
     * </pre>
     *
     * <code>CAMPAIGN_CRITERION = 8;</code>
     */
    public static final int CAMPAIGN_CRITERION_VALUE = 8;
    /**
     * <pre>
     * A Feed resource change.
     * </pre>
     *
     * <code>FEED = 9;</code>
     */
    public static final int FEED_VALUE = 9;
    /**
     * <pre>
     * A FeedItem resource change.
     * </pre>
     *
     * <code>FEED_ITEM = 10;</code>
     */
    public static final int FEED_ITEM_VALUE = 10;
    /**
     * <pre>
     * A CampaignFeed resource change.
     * </pre>
     *
     * <code>CAMPAIGN_FEED = 11;</code>
     */
    public static final int CAMPAIGN_FEED_VALUE = 11;
    /**
     * <pre>
     * An AdGroupFeed resource change.
     * </pre>
     *
     * <code>AD_GROUP_FEED = 12;</code>
     */
    public static final int AD_GROUP_FEED_VALUE = 12;
    /**
     * <pre>
     * An AdGroupAd resource change.
     * </pre>
     *
     * <code>AD_GROUP_AD = 13;</code>
     */
    public static final int AD_GROUP_AD_VALUE = 13;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ChangeEventResourceType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ChangeEventResourceType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return AD;
        case 3: return AD_GROUP;
        case 4: return AD_GROUP_CRITERION;
        case 5: return CAMPAIGN;
        case 6: return CAMPAIGN_BUDGET;
        case 7: return AD_GROUP_BID_MODIFIER;
        case 8: return CAMPAIGN_CRITERION;
        case 9: return FEED;
        case 10: return FEED_ITEM;
        case 11: return CAMPAIGN_FEED;
        case 12: return AD_GROUP_FEED;
        case 13: return AD_GROUP_AD;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ChangeEventResourceType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ChangeEventResourceType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ChangeEventResourceType>() {
            public ChangeEventResourceType findValueByNumber(int number) {
              return ChangeEventResourceType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ChangeEventResourceType[] VALUES = values();

    public static ChangeEventResourceType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ChangeEventResourceType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum.ChangeEventResourceType)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum other = (com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum) obj;

    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum prototype) {
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
   * <pre>
   * Container for enum describing supported resource types for the ChangeEvent
   * resource.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum)
      com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v6.enums.ChangeEventResourceTypeProto.internal_static_google_ads_googleads_v6_enums_ChangeEventResourceTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v6.enums.ChangeEventResourceTypeProto.internal_static_google_ads_googleads_v6_enums_ChangeEventResourceTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum.class, com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v6.enums.ChangeEventResourceTypeProto.internal_static_google_ads_googleads_v6_enums_ChangeEventResourceTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum build() {
      com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum buildPartial() {
      com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum result = new com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum other) {
      if (other == com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum)
  private static final com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum();
  }

  public static com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChangeEventResourceTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<ChangeEventResourceTypeEnum>() {
    @java.lang.Override
    public ChangeEventResourceTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChangeEventResourceTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChangeEventResourceTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChangeEventResourceTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v6.enums.ChangeEventResourceTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

