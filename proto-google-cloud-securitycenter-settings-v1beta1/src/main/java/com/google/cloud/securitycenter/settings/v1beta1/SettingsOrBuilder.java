/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/settings/v1beta1/settings.proto

package com.google.cloud.securitycenter.settings.v1beta1;

public interface SettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.settings.v1beta1.Settings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The relative resource name of the settings resource.
   * Formats:
   *  * `organizations/{organization}/settings`
   *  * `folders/{folder}/settings`
   *  * `projects/{project}/settings`
   *  * `projects/{project}/locations/{location}/clusters/{cluster}/settings`
   *  * `projects/{project}/regions/{region}/clusters/{cluster}/settings`
   *  * `projects/{project}/zones/{zone}/clusters/{cluster}/settings`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The relative resource name of the settings resource.
   * Formats:
   *  * `organizations/{organization}/settings`
   *  * `folders/{folder}/settings`
   *  * `projects/{project}/settings`
   *  * `projects/{project}/locations/{location}/clusters/{cluster}/settings`
   *  * `projects/{project}/regions/{region}/clusters/{cluster}/settings`
   *  * `projects/{project}/zones/{zone}/clusters/{cluster}/settings`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Billing settings
   * </pre>
   *
   * <code>.google.cloud.securitycenter.settings.v1beta1.BillingSettings billing_settings = 2;
   * </code>
   *
   * @return Whether the billingSettings field is set.
   */
  boolean hasBillingSettings();
  /**
   *
   *
   * <pre>
   * Billing settings
   * </pre>
   *
   * <code>.google.cloud.securitycenter.settings.v1beta1.BillingSettings billing_settings = 2;
   * </code>
   *
   * @return The billingSettings.
   */
  com.google.cloud.securitycenter.settings.v1beta1.BillingSettings getBillingSettings();
  /**
   *
   *
   * <pre>
   * Billing settings
   * </pre>
   *
   * <code>.google.cloud.securitycenter.settings.v1beta1.BillingSettings billing_settings = 2;
   * </code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.BillingSettingsOrBuilder
      getBillingSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * An enum representing the current on boarding state of SCC.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.settings.v1beta1.Settings.OnboardingState state = 3;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * An enum representing the current on boarding state of SCC.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.settings.v1beta1.Settings.OnboardingState state = 3;</code>
   *
   * @return The state.
   */
  com.google.cloud.securitycenter.settings.v1beta1.Settings.OnboardingState getState();

  /**
   *
   *
   * <pre>
   * Output only. The organization-level service account to be used for security center
   * components. The component must have permission to "act as" the service
   * account.
   * </pre>
   *
   * <code>string org_service_account = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The orgServiceAccount.
   */
  java.lang.String getOrgServiceAccount();
  /**
   *
   *
   * <pre>
   * Output only. The organization-level service account to be used for security center
   * components. The component must have permission to "act as" the service
   * account.
   * </pre>
   *
   * <code>string org_service_account = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for orgServiceAccount.
   */
  com.google.protobuf.ByteString getOrgServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * Sink settings.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.settings.v1beta1.SinkSettings sink_settings = 6;</code>
   *
   * @return Whether the sinkSettings field is set.
   */
  boolean hasSinkSettings();
  /**
   *
   *
   * <pre>
   * Sink settings.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.settings.v1beta1.SinkSettings sink_settings = 6;</code>
   *
   * @return The sinkSettings.
   */
  com.google.cloud.securitycenter.settings.v1beta1.SinkSettings getSinkSettings();
  /**
   *
   *
   * <pre>
   * Sink settings.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.settings.v1beta1.SinkSettings sink_settings = 6;</code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.SinkSettingsOrBuilder getSinkSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * The settings for detectors and/or scanners.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.settings.v1beta1.ComponentSettings&gt; component_settings = 7;
   * </code>
   */
  int getComponentSettingsCount();
  /**
   *
   *
   * <pre>
   * The settings for detectors and/or scanners.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.settings.v1beta1.ComponentSettings&gt; component_settings = 7;
   * </code>
   */
  boolean containsComponentSettings(java.lang.String key);
  /** Use {@link #getComponentSettingsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String, com.google.cloud.securitycenter.settings.v1beta1.ComponentSettings>
      getComponentSettings();
  /**
   *
   *
   * <pre>
   * The settings for detectors and/or scanners.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.settings.v1beta1.ComponentSettings&gt; component_settings = 7;
   * </code>
   */
  java.util.Map<
          java.lang.String, com.google.cloud.securitycenter.settings.v1beta1.ComponentSettings>
      getComponentSettingsMap();
  /**
   *
   *
   * <pre>
   * The settings for detectors and/or scanners.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.settings.v1beta1.ComponentSettings&gt; component_settings = 7;
   * </code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.ComponentSettings getComponentSettingsOrDefault(
      java.lang.String key,
      com.google.cloud.securitycenter.settings.v1beta1.ComponentSettings defaultValue);
  /**
   *
   *
   * <pre>
   * The settings for detectors and/or scanners.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.settings.v1beta1.ComponentSettings&gt; component_settings = 7;
   * </code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.ComponentSettings getComponentSettingsOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * Detector group settings for all Security Center components.
   * The key is the name of the detector group and the value is the settings for
   * that group.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.settings.v1beta1.Settings.DetectorGroupSettings&gt; detector_group_settings = 8;
   * </code>
   */
  int getDetectorGroupSettingsCount();
  /**
   *
   *
   * <pre>
   * Detector group settings for all Security Center components.
   * The key is the name of the detector group and the value is the settings for
   * that group.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.settings.v1beta1.Settings.DetectorGroupSettings&gt; detector_group_settings = 8;
   * </code>
   */
  boolean containsDetectorGroupSettings(java.lang.String key);
  /** Use {@link #getDetectorGroupSettingsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String,
          com.google.cloud.securitycenter.settings.v1beta1.Settings.DetectorGroupSettings>
      getDetectorGroupSettings();
  /**
   *
   *
   * <pre>
   * Detector group settings for all Security Center components.
   * The key is the name of the detector group and the value is the settings for
   * that group.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.settings.v1beta1.Settings.DetectorGroupSettings&gt; detector_group_settings = 8;
   * </code>
   */
  java.util.Map<
          java.lang.String,
          com.google.cloud.securitycenter.settings.v1beta1.Settings.DetectorGroupSettings>
      getDetectorGroupSettingsMap();
  /**
   *
   *
   * <pre>
   * Detector group settings for all Security Center components.
   * The key is the name of the detector group and the value is the settings for
   * that group.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.settings.v1beta1.Settings.DetectorGroupSettings&gt; detector_group_settings = 8;
   * </code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.Settings.DetectorGroupSettings
      getDetectorGroupSettingsOrDefault(
          java.lang.String key,
          com.google.cloud.securitycenter.settings.v1beta1.Settings.DetectorGroupSettings
              defaultValue);
  /**
   *
   *
   * <pre>
   * Detector group settings for all Security Center components.
   * The key is the name of the detector group and the value is the settings for
   * that group.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.settings.v1beta1.Settings.DetectorGroupSettings&gt; detector_group_settings = 8;
   * </code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.Settings.DetectorGroupSettings
      getDetectorGroupSettingsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * A fingerprint used for optimistic concurrency. If none is provided
   * on updates then the existing metadata will be blindly overwritten.
   * </pre>
   *
   * <code>string etag = 9;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * A fingerprint used for optimistic concurrency. If none is provided
   * on updates then the existing metadata will be blindly overwritten.
   * </pre>
   *
   * <code>string etag = 9;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time these settings were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time these settings were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time these settings were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
