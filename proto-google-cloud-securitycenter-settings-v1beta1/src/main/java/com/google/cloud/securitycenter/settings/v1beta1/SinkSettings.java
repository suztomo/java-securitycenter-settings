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
// source: google/cloud/securitycenter/settings/v1beta1/sink_settings.proto

package com.google.cloud.securitycenter.settings.v1beta1;

/**
 *
 *
 * <pre>
 * Sink Settings for Security Command Center
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.settings.v1beta1.SinkSettings}
 */
public final class SinkSettings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.settings.v1beta1.SinkSettings)
    SinkSettingsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SinkSettings.newBuilder() to construct.
  private SinkSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SinkSettings() {
    loggingSinkProject_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SinkSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SinkSettings(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              loggingSinkProject_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.settings.v1beta1.SinkProto
        .internal_static_google_cloud_securitycenter_settings_v1beta1_SinkSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.settings.v1beta1.SinkProto
        .internal_static_google_cloud_securitycenter_settings_v1beta1_SinkSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.settings.v1beta1.SinkSettings.class,
            com.google.cloud.securitycenter.settings.v1beta1.SinkSettings.Builder.class);
  }

  public static final int LOGGING_SINK_PROJECT_FIELD_NUMBER = 1;
  private volatile java.lang.Object loggingSinkProject_;
  /**
   *
   *
   * <pre>
   * The resource name of the project to send logs to. This project must be
   * part of the same organization where the Security Center API is
   * enabled. The format is `projects/{project}`. If it is empty, we do
   * not output logs. If a project ID is provided it will be normalized to a
   * project number.
   * </pre>
   *
   * <code>string logging_sink_project = 1;</code>
   *
   * @return The loggingSinkProject.
   */
  @java.lang.Override
  public java.lang.String getLoggingSinkProject() {
    java.lang.Object ref = loggingSinkProject_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      loggingSinkProject_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The resource name of the project to send logs to. This project must be
   * part of the same organization where the Security Center API is
   * enabled. The format is `projects/{project}`. If it is empty, we do
   * not output logs. If a project ID is provided it will be normalized to a
   * project number.
   * </pre>
   *
   * <code>string logging_sink_project = 1;</code>
   *
   * @return The bytes for loggingSinkProject.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLoggingSinkProjectBytes() {
    java.lang.Object ref = loggingSinkProject_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      loggingSinkProject_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(loggingSinkProject_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, loggingSinkProject_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(loggingSinkProject_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, loggingSinkProject_);
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
    if (!(obj instanceof com.google.cloud.securitycenter.settings.v1beta1.SinkSettings)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.settings.v1beta1.SinkSettings other =
        (com.google.cloud.securitycenter.settings.v1beta1.SinkSettings) obj;

    if (!getLoggingSinkProject().equals(other.getLoggingSinkProject())) return false;
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
    hash = (37 * hash) + LOGGING_SINK_PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getLoggingSinkProject().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.SinkSettings parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.SinkSettings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.SinkSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.SinkSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.SinkSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.SinkSettings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.SinkSettings parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.SinkSettings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.SinkSettings parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.SinkSettings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.SinkSettings parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.SinkSettings parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.securitycenter.settings.v1beta1.SinkSettings prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Sink Settings for Security Command Center
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.settings.v1beta1.SinkSettings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.settings.v1beta1.SinkSettings)
      com.google.cloud.securitycenter.settings.v1beta1.SinkSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.settings.v1beta1.SinkProto
          .internal_static_google_cloud_securitycenter_settings_v1beta1_SinkSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.settings.v1beta1.SinkProto
          .internal_static_google_cloud_securitycenter_settings_v1beta1_SinkSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.settings.v1beta1.SinkSettings.class,
              com.google.cloud.securitycenter.settings.v1beta1.SinkSettings.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.settings.v1beta1.SinkSettings.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      loggingSinkProject_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.settings.v1beta1.SinkProto
          .internal_static_google_cloud_securitycenter_settings_v1beta1_SinkSettings_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.settings.v1beta1.SinkSettings
        getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.settings.v1beta1.SinkSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.settings.v1beta1.SinkSettings build() {
      com.google.cloud.securitycenter.settings.v1beta1.SinkSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.settings.v1beta1.SinkSettings buildPartial() {
      com.google.cloud.securitycenter.settings.v1beta1.SinkSettings result =
          new com.google.cloud.securitycenter.settings.v1beta1.SinkSettings(this);
      result.loggingSinkProject_ = loggingSinkProject_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.securitycenter.settings.v1beta1.SinkSettings) {
        return mergeFrom((com.google.cloud.securitycenter.settings.v1beta1.SinkSettings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.settings.v1beta1.SinkSettings other) {
      if (other
          == com.google.cloud.securitycenter.settings.v1beta1.SinkSettings.getDefaultInstance())
        return this;
      if (!other.getLoggingSinkProject().isEmpty()) {
        loggingSinkProject_ = other.loggingSinkProject_;
        onChanged();
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
      com.google.cloud.securitycenter.settings.v1beta1.SinkSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.securitycenter.settings.v1beta1.SinkSettings)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object loggingSinkProject_ = "";
    /**
     *
     *
     * <pre>
     * The resource name of the project to send logs to. This project must be
     * part of the same organization where the Security Center API is
     * enabled. The format is `projects/{project}`. If it is empty, we do
     * not output logs. If a project ID is provided it will be normalized to a
     * project number.
     * </pre>
     *
     * <code>string logging_sink_project = 1;</code>
     *
     * @return The loggingSinkProject.
     */
    public java.lang.String getLoggingSinkProject() {
      java.lang.Object ref = loggingSinkProject_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        loggingSinkProject_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name of the project to send logs to. This project must be
     * part of the same organization where the Security Center API is
     * enabled. The format is `projects/{project}`. If it is empty, we do
     * not output logs. If a project ID is provided it will be normalized to a
     * project number.
     * </pre>
     *
     * <code>string logging_sink_project = 1;</code>
     *
     * @return The bytes for loggingSinkProject.
     */
    public com.google.protobuf.ByteString getLoggingSinkProjectBytes() {
      java.lang.Object ref = loggingSinkProject_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        loggingSinkProject_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name of the project to send logs to. This project must be
     * part of the same organization where the Security Center API is
     * enabled. The format is `projects/{project}`. If it is empty, we do
     * not output logs. If a project ID is provided it will be normalized to a
     * project number.
     * </pre>
     *
     * <code>string logging_sink_project = 1;</code>
     *
     * @param value The loggingSinkProject to set.
     * @return This builder for chaining.
     */
    public Builder setLoggingSinkProject(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      loggingSinkProject_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the project to send logs to. This project must be
     * part of the same organization where the Security Center API is
     * enabled. The format is `projects/{project}`. If it is empty, we do
     * not output logs. If a project ID is provided it will be normalized to a
     * project number.
     * </pre>
     *
     * <code>string logging_sink_project = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLoggingSinkProject() {

      loggingSinkProject_ = getDefaultInstance().getLoggingSinkProject();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the project to send logs to. This project must be
     * part of the same organization where the Security Center API is
     * enabled. The format is `projects/{project}`. If it is empty, we do
     * not output logs. If a project ID is provided it will be normalized to a
     * project number.
     * </pre>
     *
     * <code>string logging_sink_project = 1;</code>
     *
     * @param value The bytes for loggingSinkProject to set.
     * @return This builder for chaining.
     */
    public Builder setLoggingSinkProjectBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      loggingSinkProject_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.settings.v1beta1.SinkSettings)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.settings.v1beta1.SinkSettings)
  private static final com.google.cloud.securitycenter.settings.v1beta1.SinkSettings
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.settings.v1beta1.SinkSettings();
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.SinkSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SinkSettings> PARSER =
      new com.google.protobuf.AbstractParser<SinkSettings>() {
        @java.lang.Override
        public SinkSettings parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SinkSettings(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SinkSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SinkSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.settings.v1beta1.SinkSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
