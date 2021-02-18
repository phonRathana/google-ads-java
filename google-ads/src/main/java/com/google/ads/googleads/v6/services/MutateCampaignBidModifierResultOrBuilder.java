// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/campaign_bid_modifier_service.proto

package com.google.ads.googleads.v6.services;

public interface MutateCampaignBidModifierResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.services.MutateCampaignBidModifierResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The mutated campaign bid modifier with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v6.resources.CampaignBidModifier campaign_bid_modifier = 2;</code>
   * @return Whether the campaignBidModifier field is set.
   */
  boolean hasCampaignBidModifier();
  /**
   * <pre>
   * The mutated campaign bid modifier with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v6.resources.CampaignBidModifier campaign_bid_modifier = 2;</code>
   * @return The campaignBidModifier.
   */
  com.google.ads.googleads.v6.resources.CampaignBidModifier getCampaignBidModifier();
  /**
   * <pre>
   * The mutated campaign bid modifier with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v6.resources.CampaignBidModifier campaign_bid_modifier = 2;</code>
   */
  com.google.ads.googleads.v6.resources.CampaignBidModifierOrBuilder getCampaignBidModifierOrBuilder();
}
