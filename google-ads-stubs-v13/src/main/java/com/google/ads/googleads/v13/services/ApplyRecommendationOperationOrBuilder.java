// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/recommendation_service.proto

package com.google.ads.googleads.v13.services;

public interface ApplyRecommendationOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v13.services.ApplyRecommendationOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the recommendation to apply.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the recommendation to apply.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Optional parameters to use when applying a campaign budget
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.CampaignBudgetParameters campaign_budget = 2;</code>
   * @return Whether the campaignBudget field is set.
   */
  boolean hasCampaignBudget();
  /**
   * <pre>
   * Optional parameters to use when applying a campaign budget
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.CampaignBudgetParameters campaign_budget = 2;</code>
   * @return The campaignBudget.
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.CampaignBudgetParameters getCampaignBudget();
  /**
   * <pre>
   * Optional parameters to use when applying a campaign budget
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.CampaignBudgetParameters campaign_budget = 2;</code>
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.CampaignBudgetParametersOrBuilder getCampaignBudgetOrBuilder();

  /**
   * <pre>
   * Optional parameters to use when applying a text ad recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.TextAdParameters text_ad = 3;</code>
   * @return Whether the textAd field is set.
   */
  boolean hasTextAd();
  /**
   * <pre>
   * Optional parameters to use when applying a text ad recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.TextAdParameters text_ad = 3;</code>
   * @return The textAd.
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.TextAdParameters getTextAd();
  /**
   * <pre>
   * Optional parameters to use when applying a text ad recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.TextAdParameters text_ad = 3;</code>
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.TextAdParametersOrBuilder getTextAdOrBuilder();

  /**
   * <pre>
   * Optional parameters to use when applying keyword recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.KeywordParameters keyword = 4;</code>
   * @return Whether the keyword field is set.
   */
  boolean hasKeyword();
  /**
   * <pre>
   * Optional parameters to use when applying keyword recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.KeywordParameters keyword = 4;</code>
   * @return The keyword.
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.KeywordParameters getKeyword();
  /**
   * <pre>
   * Optional parameters to use when applying keyword recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.KeywordParameters keyword = 4;</code>
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.KeywordParametersOrBuilder getKeywordOrBuilder();

  /**
   * <pre>
   * Optional parameters to use when applying target CPA opt-in
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.TargetCpaOptInParameters target_cpa_opt_in = 5;</code>
   * @return Whether the targetCpaOptIn field is set.
   */
  boolean hasTargetCpaOptIn();
  /**
   * <pre>
   * Optional parameters to use when applying target CPA opt-in
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.TargetCpaOptInParameters target_cpa_opt_in = 5;</code>
   * @return The targetCpaOptIn.
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.TargetCpaOptInParameters getTargetCpaOptIn();
  /**
   * <pre>
   * Optional parameters to use when applying target CPA opt-in
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.TargetCpaOptInParameters target_cpa_opt_in = 5;</code>
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.TargetCpaOptInParametersOrBuilder getTargetCpaOptInOrBuilder();

  /**
   * <pre>
   * Optional parameters to use when applying target ROAS opt-in
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.TargetRoasOptInParameters target_roas_opt_in = 10;</code>
   * @return Whether the targetRoasOptIn field is set.
   */
  boolean hasTargetRoasOptIn();
  /**
   * <pre>
   * Optional parameters to use when applying target ROAS opt-in
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.TargetRoasOptInParameters target_roas_opt_in = 10;</code>
   * @return The targetRoasOptIn.
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.TargetRoasOptInParameters getTargetRoasOptIn();
  /**
   * <pre>
   * Optional parameters to use when applying target ROAS opt-in
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.TargetRoasOptInParameters target_roas_opt_in = 10;</code>
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.TargetRoasOptInParametersOrBuilder getTargetRoasOptInOrBuilder();

  /**
   * <pre>
   * Parameters to use when applying callout extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.CalloutExtensionParameters callout_extension = 6;</code>
   * @return Whether the calloutExtension field is set.
   */
  boolean hasCalloutExtension();
  /**
   * <pre>
   * Parameters to use when applying callout extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.CalloutExtensionParameters callout_extension = 6;</code>
   * @return The calloutExtension.
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.CalloutExtensionParameters getCalloutExtension();
  /**
   * <pre>
   * Parameters to use when applying callout extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.CalloutExtensionParameters callout_extension = 6;</code>
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.CalloutExtensionParametersOrBuilder getCalloutExtensionOrBuilder();

  /**
   * <pre>
   * Parameters to use when applying call extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.CallExtensionParameters call_extension = 7;</code>
   * @return Whether the callExtension field is set.
   */
  boolean hasCallExtension();
  /**
   * <pre>
   * Parameters to use when applying call extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.CallExtensionParameters call_extension = 7;</code>
   * @return The callExtension.
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.CallExtensionParameters getCallExtension();
  /**
   * <pre>
   * Parameters to use when applying call extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.CallExtensionParameters call_extension = 7;</code>
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.CallExtensionParametersOrBuilder getCallExtensionOrBuilder();

  /**
   * <pre>
   * Parameters to use when applying sitelink extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.SitelinkExtensionParameters sitelink_extension = 8;</code>
   * @return Whether the sitelinkExtension field is set.
   */
  boolean hasSitelinkExtension();
  /**
   * <pre>
   * Parameters to use when applying sitelink extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.SitelinkExtensionParameters sitelink_extension = 8;</code>
   * @return The sitelinkExtension.
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.SitelinkExtensionParameters getSitelinkExtension();
  /**
   * <pre>
   * Parameters to use when applying sitelink extension recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.SitelinkExtensionParameters sitelink_extension = 8;</code>
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.SitelinkExtensionParametersOrBuilder getSitelinkExtensionOrBuilder();

  /**
   * <pre>
   * Parameters to use when applying move unused budget recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.MoveUnusedBudgetParameters move_unused_budget = 9;</code>
   * @return Whether the moveUnusedBudget field is set.
   */
  boolean hasMoveUnusedBudget();
  /**
   * <pre>
   * Parameters to use when applying move unused budget recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.MoveUnusedBudgetParameters move_unused_budget = 9;</code>
   * @return The moveUnusedBudget.
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.MoveUnusedBudgetParameters getMoveUnusedBudget();
  /**
   * <pre>
   * Parameters to use when applying move unused budget recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.MoveUnusedBudgetParameters move_unused_budget = 9;</code>
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.MoveUnusedBudgetParametersOrBuilder getMoveUnusedBudgetOrBuilder();

  /**
   * <pre>
   * Parameters to use when applying a responsive search ad recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.ResponsiveSearchAdParameters responsive_search_ad = 11;</code>
   * @return Whether the responsiveSearchAd field is set.
   */
  boolean hasResponsiveSearchAd();
  /**
   * <pre>
   * Parameters to use when applying a responsive search ad recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.ResponsiveSearchAdParameters responsive_search_ad = 11;</code>
   * @return The responsiveSearchAd.
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.ResponsiveSearchAdParameters getResponsiveSearchAd();
  /**
   * <pre>
   * Parameters to use when applying a responsive search ad recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.ResponsiveSearchAdParameters responsive_search_ad = 11;</code>
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.ResponsiveSearchAdParametersOrBuilder getResponsiveSearchAdOrBuilder();

  /**
   * <pre>
   * Parameters to use when applying a use broad match keyword recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.UseBroadMatchKeywordParameters use_broad_match_keyword = 12;</code>
   * @return Whether the useBroadMatchKeyword field is set.
   */
  boolean hasUseBroadMatchKeyword();
  /**
   * <pre>
   * Parameters to use when applying a use broad match keyword recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.UseBroadMatchKeywordParameters use_broad_match_keyword = 12;</code>
   * @return The useBroadMatchKeyword.
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.UseBroadMatchKeywordParameters getUseBroadMatchKeyword();
  /**
   * <pre>
   * Parameters to use when applying a use broad match keyword recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.UseBroadMatchKeywordParameters use_broad_match_keyword = 12;</code>
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.UseBroadMatchKeywordParametersOrBuilder getUseBroadMatchKeywordOrBuilder();

  /**
   * <pre>
   * Parameters to use when applying a responsive search ad asset
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.ResponsiveSearchAdAssetParameters responsive_search_ad_asset = 13;</code>
   * @return Whether the responsiveSearchAdAsset field is set.
   */
  boolean hasResponsiveSearchAdAsset();
  /**
   * <pre>
   * Parameters to use when applying a responsive search ad asset
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.ResponsiveSearchAdAssetParameters responsive_search_ad_asset = 13;</code>
   * @return The responsiveSearchAdAsset.
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.ResponsiveSearchAdAssetParameters getResponsiveSearchAdAsset();
  /**
   * <pre>
   * Parameters to use when applying a responsive search ad asset
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.ResponsiveSearchAdAssetParameters responsive_search_ad_asset = 13;</code>
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.ResponsiveSearchAdAssetParametersOrBuilder getResponsiveSearchAdAssetOrBuilder();

  /**
   * <pre>
   * Parameters to use when applying a responsive search ad improve ad
   * strength recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.ResponsiveSearchAdImproveAdStrengthParameters responsive_search_ad_improve_ad_strength = 14;</code>
   * @return Whether the responsiveSearchAdImproveAdStrength field is set.
   */
  boolean hasResponsiveSearchAdImproveAdStrength();
  /**
   * <pre>
   * Parameters to use when applying a responsive search ad improve ad
   * strength recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.ResponsiveSearchAdImproveAdStrengthParameters responsive_search_ad_improve_ad_strength = 14;</code>
   * @return The responsiveSearchAdImproveAdStrength.
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.ResponsiveSearchAdImproveAdStrengthParameters getResponsiveSearchAdImproveAdStrength();
  /**
   * <pre>
   * Parameters to use when applying a responsive search ad improve ad
   * strength recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.ResponsiveSearchAdImproveAdStrengthParameters responsive_search_ad_improve_ad_strength = 14;</code>
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.ResponsiveSearchAdImproveAdStrengthParametersOrBuilder getResponsiveSearchAdImproveAdStrengthOrBuilder();

  /**
   * <pre>
   * Parameters to use when applying a raise target CPA bid too low
   * recommendation. The apply is asynchronous and can take minutes depending
   * on the number of ad groups there is in the related campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.RaiseTargetCpaBidTooLowParameters raise_target_cpa_bid_too_low = 15;</code>
   * @return Whether the raiseTargetCpaBidTooLow field is set.
   */
  boolean hasRaiseTargetCpaBidTooLow();
  /**
   * <pre>
   * Parameters to use when applying a raise target CPA bid too low
   * recommendation. The apply is asynchronous and can take minutes depending
   * on the number of ad groups there is in the related campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.RaiseTargetCpaBidTooLowParameters raise_target_cpa_bid_too_low = 15;</code>
   * @return The raiseTargetCpaBidTooLow.
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.RaiseTargetCpaBidTooLowParameters getRaiseTargetCpaBidTooLow();
  /**
   * <pre>
   * Parameters to use when applying a raise target CPA bid too low
   * recommendation. The apply is asynchronous and can take minutes depending
   * on the number of ad groups there is in the related campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.RaiseTargetCpaBidTooLowParameters raise_target_cpa_bid_too_low = 15;</code>
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.RaiseTargetCpaBidTooLowParametersOrBuilder getRaiseTargetCpaBidTooLowOrBuilder();

  /**
   * <pre>
   * Parameters to use when applying a forecasting set target ROAS
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.ForecastingSetTargetRoasParameters forecasting_set_target_roas = 16;</code>
   * @return Whether the forecastingSetTargetRoas field is set.
   */
  boolean hasForecastingSetTargetRoas();
  /**
   * <pre>
   * Parameters to use when applying a forecasting set target ROAS
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.ForecastingSetTargetRoasParameters forecasting_set_target_roas = 16;</code>
   * @return The forecastingSetTargetRoas.
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.ForecastingSetTargetRoasParameters getForecastingSetTargetRoas();
  /**
   * <pre>
   * Parameters to use when applying a forecasting set target ROAS
   * recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.ForecastingSetTargetRoasParameters forecasting_set_target_roas = 16;</code>
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.ForecastingSetTargetRoasParametersOrBuilder getForecastingSetTargetRoasOrBuilder();

  /**
   * <pre>
   * Parameters to use when applying callout asset recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.CalloutAssetParameters callout_asset = 17;</code>
   * @return Whether the calloutAsset field is set.
   */
  boolean hasCalloutAsset();
  /**
   * <pre>
   * Parameters to use when applying callout asset recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.CalloutAssetParameters callout_asset = 17;</code>
   * @return The calloutAsset.
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.CalloutAssetParameters getCalloutAsset();
  /**
   * <pre>
   * Parameters to use when applying callout asset recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.CalloutAssetParameters callout_asset = 17;</code>
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.CalloutAssetParametersOrBuilder getCalloutAssetOrBuilder();

  /**
   * <pre>
   * Parameters to use when applying call asset recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.CallAssetParameters call_asset = 18;</code>
   * @return Whether the callAsset field is set.
   */
  boolean hasCallAsset();
  /**
   * <pre>
   * Parameters to use when applying call asset recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.CallAssetParameters call_asset = 18;</code>
   * @return The callAsset.
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.CallAssetParameters getCallAsset();
  /**
   * <pre>
   * Parameters to use when applying call asset recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.CallAssetParameters call_asset = 18;</code>
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.CallAssetParametersOrBuilder getCallAssetOrBuilder();

  /**
   * <pre>
   * Parameters to use when applying sitelink asset recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.SitelinkAssetParameters sitelink_asset = 19;</code>
   * @return Whether the sitelinkAsset field is set.
   */
  boolean hasSitelinkAsset();
  /**
   * <pre>
   * Parameters to use when applying sitelink asset recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.SitelinkAssetParameters sitelink_asset = 19;</code>
   * @return The sitelinkAsset.
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.SitelinkAssetParameters getSitelinkAsset();
  /**
   * <pre>
   * Parameters to use when applying sitelink asset recommendation.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.services.ApplyRecommendationOperation.SitelinkAssetParameters sitelink_asset = 19;</code>
   */
  com.google.ads.googleads.v13.services.ApplyRecommendationOperation.SitelinkAssetParametersOrBuilder getSitelinkAssetOrBuilder();

  public com.google.ads.googleads.v13.services.ApplyRecommendationOperation.ApplyParametersCase getApplyParametersCase();
}
