// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/campaign_bid_modifier_service.proto

package com.google.ads.googleads.v6.services;

public final class CampaignBidModifierServiceProto {
  private CampaignBidModifierServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_GetCampaignBidModifierRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GetCampaignBidModifierRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateCampaignBidModifiersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateCampaignBidModifiersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_CampaignBidModifierOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_CampaignBidModifierOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateCampaignBidModifiersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateCampaignBidModifiersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateCampaignBidModifierResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateCampaignBidModifierResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v6/services/campa" +
      "ign_bid_modifier_service.proto\022 google.a" +
      "ds.googleads.v6.services\0329google/ads/goo" +
      "gleads/v6/enums/response_content_type.pr" +
      "oto\032=google/ads/googleads/v6/resources/c" +
      "ampaign_bid_modifier.proto\032\034google/api/a" +
      "nnotations.proto\032\027google/api/client.prot" +
      "o\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\032 google/protobuf/f" +
      "ield_mask.proto\032\027google/rpc/status.proto" +
      "\"l\n\035GetCampaignBidModifierRequest\022K\n\rres" +
      "ource_name\030\001 \001(\tB4\340A\002\372A.\n,googleads.goog" +
      "leapis.com/CampaignBidModifier\"\261\002\n!Mutat" +
      "eCampaignBidModifiersRequest\022\030\n\013customer" +
      "_id\030\001 \001(\tB\003\340A\002\022W\n\noperations\030\002 \003(\0132>.goo" +
      "gle.ads.googleads.v6.services.CampaignBi" +
      "dModifierOperationB\003\340A\002\022\027\n\017partial_failu" +
      "re\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022i\n\025respo" +
      "nse_content_type\030\005 \001(\0162J.google.ads.goog" +
      "leads.v6.enums.ResponseContentTypeEnum.R" +
      "esponseContentType\"\202\002\n\034CampaignBidModifi" +
      "erOperation\022/\n\013update_mask\030\004 \001(\0132\032.googl" +
      "e.protobuf.FieldMask\022H\n\006create\030\001 \001(\01326.g" +
      "oogle.ads.googleads.v6.resources.Campaig" +
      "nBidModifierH\000\022H\n\006update\030\002 \001(\01326.google." +
      "ads.googleads.v6.resources.CampaignBidMo" +
      "difierH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\toperation\"" +
      "\253\001\n\"MutateCampaignBidModifiersResponse\0221" +
      "\n\025partial_failure_error\030\003 \001(\0132\022.google.r" +
      "pc.Status\022R\n\007results\030\002 \003(\0132A.google.ads." +
      "googleads.v6.services.MutateCampaignBidM" +
      "odifierResult\"\217\001\n\037MutateCampaignBidModif" +
      "ierResult\022\025\n\rresource_name\030\001 \001(\t\022U\n\025camp" +
      "aign_bid_modifier\030\002 \001(\01326.google.ads.goo" +
      "gleads.v6.resources.CampaignBidModifier2" +
      "\320\004\n\032CampaignBidModifierService\022\341\001\n\026GetCa" +
      "mpaignBidModifier\022?.google.ads.googleads" +
      ".v6.services.GetCampaignBidModifierReque" +
      "st\0326.google.ads.googleads.v6.resources.C" +
      "ampaignBidModifier\"N\202\323\344\223\0028\0226/v6/{resourc" +
      "e_name=customers/*/campaignBidModifiers/" +
      "*}\332A\rresource_name\022\206\002\n\032MutateCampaignBid" +
      "Modifiers\022C.google.ads.googleads.v6.serv" +
      "ices.MutateCampaignBidModifiersRequest\032D" +
      ".google.ads.googleads.v6.services.Mutate" +
      "CampaignBidModifiersResponse\"]\202\323\344\223\002>\"9/v" +
      "6/customers/{customer_id=*}/campaignBidM" +
      "odifiers:mutate:\001*\332A\026customer_id,operati" +
      "ons\032E\312A\030googleads.googleapis.com\322A\'https" +
      "://www.googleapis.com/auth/adwordsB\206\002\n$c" +
      "om.google.ads.googleads.v6.servicesB\037Cam" +
      "paignBidModifierServiceProtoP\001ZHgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v6/services;services\242\002\003GAA\252\002 Google." +
      "Ads.GoogleAds.V6.Services\312\002 Google\\Ads\\G" +
      "oogleAds\\V6\\Services\352\002$Google::Ads::Goog" +
      "leAds::V6::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v6.resources.CampaignBidModifierProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_services_GetCampaignBidModifierRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_GetCampaignBidModifierRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_GetCampaignBidModifierRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v6_services_MutateCampaignBidModifiersRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_services_MutateCampaignBidModifiersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateCampaignBidModifiersRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v6_services_CampaignBidModifierOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v6_services_CampaignBidModifierOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_CampaignBidModifierOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v6_services_MutateCampaignBidModifiersResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v6_services_MutateCampaignBidModifiersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateCampaignBidModifiersResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v6_services_MutateCampaignBidModifierResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v6_services_MutateCampaignBidModifierResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateCampaignBidModifierResult_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignBidModifier", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v6.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v6.resources.CampaignBidModifierProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
