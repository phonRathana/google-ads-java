// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/customer_user_access_service.proto

package com.google.ads.googleads.v6.services;

public final class CustomerUserAccessServiceProto {
  private CustomerUserAccessServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_GetCustomerUserAccessRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GetCustomerUserAccessRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateCustomerUserAccessRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateCustomerUserAccessRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_CustomerUserAccessOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_CustomerUserAccessOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateCustomerUserAccessResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateCustomerUserAccessResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateCustomerUserAccessResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateCustomerUserAccessResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v6/services/custo" +
      "mer_user_access_service.proto\022 google.ad" +
      "s.googleads.v6.services\032<google/ads/goog" +
      "leads/v6/resources/customer_user_access." +
      "proto\032\034google/api/annotations.proto\032\027goo" +
      "gle/api/client.proto\032\037google/api/field_b" +
      "ehavior.proto\032\031google/api/resource.proto" +
      "\032 google/protobuf/field_mask.proto\"j\n\034Ge" +
      "tCustomerUserAccessRequest\022J\n\rresource_n" +
      "ame\030\001 \001(\tB3\340A\002\372A-\n+googleads.googleapis." +
      "com/CustomerUserAccess\"\222\001\n\037MutateCustome" +
      "rUserAccessRequest\022\030\n\013customer_id\030\001 \001(\tB" +
      "\003\340A\002\022U\n\toperation\030\002 \001(\0132=.google.ads.goo" +
      "gleads.v6.services.CustomerUserAccessOpe" +
      "rationB\003\340A\002\"\266\001\n\033CustomerUserAccessOperat" +
      "ion\022/\n\013update_mask\030\003 \001(\0132\032.google.protob" +
      "uf.FieldMask\022G\n\006update\030\001 \001(\01325.google.ad" +
      "s.googleads.v6.resources.CustomerUserAcc" +
      "essH\000\022\020\n\006remove\030\002 \001(\tH\000B\013\n\toperation\"t\n " +
      "MutateCustomerUserAccessResponse\022P\n\006resu" +
      "lt\030\001 \001(\0132@.google.ads.googleads.v6.servi" +
      "ces.MutateCustomerUserAccessResult\"7\n\036Mu" +
      "tateCustomerUserAccessResult\022\025\n\rresource" +
      "_name\030\001 \001(\t2\305\004\n\031CustomerUserAccessServic" +
      "e\022\336\001\n\025GetCustomerUserAccess\022>.google.ads" +
      ".googleads.v6.services.GetCustomerUserAc" +
      "cessRequest\0325.google.ads.googleads.v6.re" +
      "sources.CustomerUserAccess\"N\202\323\344\223\0028\0226/v6/" +
      "{resource_name=customers/*/customerUserA" +
      "ccesses/*}\332A\rresource_name\022\377\001\n\030MutateCus" +
      "tomerUserAccess\022A.google.ads.googleads.v" +
      "6.services.MutateCustomerUserAccessReque" +
      "st\032B.google.ads.googleads.v6.services.Mu" +
      "tateCustomerUserAccessResponse\"\\\202\323\344\223\002>\"9" +
      "/v6/customers/{customer_id=*}/customerUs" +
      "erAccesses:mutate:\001*\332A\025customer_id,opera" +
      "tion\032E\312A\030googleads.googleapis.com\322A\'http" +
      "s://www.googleapis.com/auth/adwordsB\205\002\n$" +
      "com.google.ads.googleads.v6.servicesB\036Cu" +
      "stomerUserAccessServiceProtoP\001ZHgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v6/services;services\242\002\003GAA\252\002 Google." +
      "Ads.GoogleAds.V6.Services\312\002 Google\\Ads\\G" +
      "oogleAds\\V6\\Services\352\002$Google::Ads::Goog" +
      "leAds::V6::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.resources.CustomerUserAccessProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_services_GetCustomerUserAccessRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_GetCustomerUserAccessRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_GetCustomerUserAccessRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v6_services_MutateCustomerUserAccessRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_services_MutateCustomerUserAccessRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateCustomerUserAccessRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", });
    internal_static_google_ads_googleads_v6_services_CustomerUserAccessOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v6_services_CustomerUserAccessOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_CustomerUserAccessOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v6_services_MutateCustomerUserAccessResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v6_services_MutateCustomerUserAccessResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateCustomerUserAccessResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v6_services_MutateCustomerUserAccessResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v6_services_MutateCustomerUserAccessResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateCustomerUserAccessResult_descriptor,
        new java.lang.String[] { "ResourceName", });
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
    com.google.ads.googleads.v6.resources.CustomerUserAccessProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
