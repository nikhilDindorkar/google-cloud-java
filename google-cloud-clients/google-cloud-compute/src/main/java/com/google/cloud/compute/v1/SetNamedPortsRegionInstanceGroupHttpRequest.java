/*
 * Copyright 2018 Google LLC
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
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class SetNamedPortsRegionInstanceGroupHttpRequest implements ApiMessage {
  private final String access_token;
  private final String callback;
  private final String fields;
  private final String instanceGroup;
  private final String key;
  private final String prettyPrint;
  private final String quotaUser;
  private final RegionInstanceGroupsSetNamedPortsRequest
      regionInstanceGroupsSetNamedPortsRequestResource;
  private final String requestId;
  private final String userIp;

  private SetNamedPortsRegionInstanceGroupHttpRequest() {
    this.access_token = null;
    this.callback = null;
    this.fields = null;
    this.instanceGroup = null;
    this.key = null;
    this.prettyPrint = null;
    this.quotaUser = null;
    this.regionInstanceGroupsSetNamedPortsRequestResource = null;
    this.requestId = null;
    this.userIp = null;
  }

  private SetNamedPortsRegionInstanceGroupHttpRequest(
      String access_token,
      String callback,
      String fields,
      String instanceGroup,
      String key,
      String prettyPrint,
      String quotaUser,
      RegionInstanceGroupsSetNamedPortsRequest regionInstanceGroupsSetNamedPortsRequestResource,
      String requestId,
      String userIp) {
    this.access_token = access_token;
    this.callback = callback;
    this.fields = fields;
    this.instanceGroup = instanceGroup;
    this.key = key;
    this.prettyPrint = prettyPrint;
    this.quotaUser = quotaUser;
    this.regionInstanceGroupsSetNamedPortsRequestResource =
        regionInstanceGroupsSetNamedPortsRequestResource;
    this.requestId = requestId;
    this.userIp = userIp;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if (fieldName.equals("access_token")) {
      return access_token;
    }
    if (fieldName.equals("callback")) {
      return callback;
    }
    if (fieldName.equals("fields")) {
      return fields;
    }
    if (fieldName.equals("instanceGroup")) {
      return instanceGroup;
    }
    if (fieldName.equals("key")) {
      return key;
    }
    if (fieldName.equals("prettyPrint")) {
      return prettyPrint;
    }
    if (fieldName.equals("quotaUser")) {
      return quotaUser;
    }
    if (fieldName.equals("regionInstanceGroupsSetNamedPortsRequestResource")) {
      return regionInstanceGroupsSetNamedPortsRequestResource;
    }
    if (fieldName.equals("requestId")) {
      return requestId;
    }
    if (fieldName.equals("userIp")) {
      return userIp;
    }
    return null;
  }

  @Nullable
  @Override
  public RegionInstanceGroupsSetNamedPortsRequest getApiMessageRequestBody() {
    return regionInstanceGroupsSetNamedPortsRequestResource;
  }

  @Nullable
  @Override
  public List<String> getFieldMask() {
    return null;
  }

  public String getAccessToken() {
    return access_token;
  }

  public String getCallback() {
    return callback;
  }

  public String getFields() {
    return fields;
  }

  public String getInstanceGroup() {
    return instanceGroup;
  }

  public String getKey() {
    return key;
  }

  public String getPrettyPrint() {
    return prettyPrint;
  }

  public String getQuotaUser() {
    return quotaUser;
  }

  public RegionInstanceGroupsSetNamedPortsRequest
      getRegionInstanceGroupsSetNamedPortsRequestResource() {
    return regionInstanceGroupsSetNamedPortsRequestResource;
  }

  public String getRequestId() {
    return requestId;
  }

  public String getUserIp() {
    return userIp;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(SetNamedPortsRegionInstanceGroupHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static SetNamedPortsRegionInstanceGroupHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final SetNamedPortsRegionInstanceGroupHttpRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new SetNamedPortsRegionInstanceGroupHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private String callback;
    private String fields;
    private String instanceGroup;
    private String key;
    private String prettyPrint;
    private String quotaUser;
    private RegionInstanceGroupsSetNamedPortsRequest
        regionInstanceGroupsSetNamedPortsRequestResource;
    private String requestId;
    private String userIp;

    Builder() {}

    public Builder mergeFrom(SetNamedPortsRegionInstanceGroupHttpRequest other) {
      if (other == SetNamedPortsRegionInstanceGroupHttpRequest.getDefaultInstance()) return this;
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
      }
      if (other.getCallback() != null) {
        this.callback = other.callback;
      }
      if (other.getFields() != null) {
        this.fields = other.fields;
      }
      if (other.getInstanceGroup() != null) {
        this.instanceGroup = other.instanceGroup;
      }
      if (other.getKey() != null) {
        this.key = other.key;
      }
      if (other.getPrettyPrint() != null) {
        this.prettyPrint = other.prettyPrint;
      }
      if (other.getQuotaUser() != null) {
        this.quotaUser = other.quotaUser;
      }
      if (other.getRegionInstanceGroupsSetNamedPortsRequestResource() != null) {
        this.regionInstanceGroupsSetNamedPortsRequestResource =
            other.regionInstanceGroupsSetNamedPortsRequestResource;
      }
      if (other.getRequestId() != null) {
        this.requestId = other.requestId;
      }
      if (other.getUserIp() != null) {
        this.userIp = other.userIp;
      }
      return this;
    }

    Builder(SetNamedPortsRegionInstanceGroupHttpRequest source) {
      this.access_token = source.access_token;
      this.callback = source.callback;
      this.fields = source.fields;
      this.instanceGroup = source.instanceGroup;
      this.key = source.key;
      this.prettyPrint = source.prettyPrint;
      this.quotaUser = source.quotaUser;
      this.regionInstanceGroupsSetNamedPortsRequestResource =
          source.regionInstanceGroupsSetNamedPortsRequestResource;
      this.requestId = source.requestId;
      this.userIp = source.userIp;
    }

    public String getAccessToken() {
      return access_token;
    }

    public Builder setAccessToken(String access_token) {
      this.access_token = access_token;
      return this;
    }

    public String getCallback() {
      return callback;
    }

    public Builder setCallback(String callback) {
      this.callback = callback;
      return this;
    }

    public String getFields() {
      return fields;
    }

    public Builder setFields(String fields) {
      this.fields = fields;
      return this;
    }

    public String getInstanceGroup() {
      return instanceGroup;
    }

    public Builder setInstanceGroup(String instanceGroup) {
      this.instanceGroup = instanceGroup;
      return this;
    }

    public String getKey() {
      return key;
    }

    public Builder setKey(String key) {
      this.key = key;
      return this;
    }

    public String getPrettyPrint() {
      return prettyPrint;
    }

    public Builder setPrettyPrint(String prettyPrint) {
      this.prettyPrint = prettyPrint;
      return this;
    }

    public String getQuotaUser() {
      return quotaUser;
    }

    public Builder setQuotaUser(String quotaUser) {
      this.quotaUser = quotaUser;
      return this;
    }

    public RegionInstanceGroupsSetNamedPortsRequest
        getRegionInstanceGroupsSetNamedPortsRequestResource() {
      return regionInstanceGroupsSetNamedPortsRequestResource;
    }

    public Builder setRegionInstanceGroupsSetNamedPortsRequestResource(
        RegionInstanceGroupsSetNamedPortsRequest regionInstanceGroupsSetNamedPortsRequestResource) {
      this.regionInstanceGroupsSetNamedPortsRequestResource =
          regionInstanceGroupsSetNamedPortsRequestResource;
      return this;
    }

    public String getRequestId() {
      return requestId;
    }

    public Builder setRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }

    public String getUserIp() {
      return userIp;
    }

    public Builder setUserIp(String userIp) {
      this.userIp = userIp;
      return this;
    }

    public SetNamedPortsRegionInstanceGroupHttpRequest build() {
      String missing = "";

      if (instanceGroup == null) {
        missing += " instanceGroup";
      }

      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new SetNamedPortsRegionInstanceGroupHttpRequest(
          access_token,
          callback,
          fields,
          instanceGroup,
          key,
          prettyPrint,
          quotaUser,
          regionInstanceGroupsSetNamedPortsRequestResource,
          requestId,
          userIp);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setCallback(this.callback);
      newBuilder.setFields(this.fields);
      newBuilder.setInstanceGroup(this.instanceGroup);
      newBuilder.setKey(this.key);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setRegionInstanceGroupsSetNamedPortsRequestResource(
          this.regionInstanceGroupsSetNamedPortsRequestResource);
      newBuilder.setRequestId(this.requestId);
      newBuilder.setUserIp(this.userIp);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "SetNamedPortsRegionInstanceGroupHttpRequest{"
        + "access_token="
        + access_token
        + ", "
        + "callback="
        + callback
        + ", "
        + "fields="
        + fields
        + ", "
        + "instanceGroup="
        + instanceGroup
        + ", "
        + "key="
        + key
        + ", "
        + "prettyPrint="
        + prettyPrint
        + ", "
        + "quotaUser="
        + quotaUser
        + ", "
        + "regionInstanceGroupsSetNamedPortsRequestResource="
        + regionInstanceGroupsSetNamedPortsRequestResource
        + ", "
        + "requestId="
        + requestId
        + ", "
        + "userIp="
        + userIp
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SetNamedPortsRegionInstanceGroupHttpRequest) {
      SetNamedPortsRegionInstanceGroupHttpRequest that =
          (SetNamedPortsRegionInstanceGroupHttpRequest) o;
      return Objects.equals(this.access_token, that.getAccessToken())
          && Objects.equals(this.callback, that.getCallback())
          && Objects.equals(this.fields, that.getFields())
          && Objects.equals(this.instanceGroup, that.getInstanceGroup())
          && Objects.equals(this.key, that.getKey())
          && Objects.equals(this.prettyPrint, that.getPrettyPrint())
          && Objects.equals(this.quotaUser, that.getQuotaUser())
          && Objects.equals(
              this.regionInstanceGroupsSetNamedPortsRequestResource,
              that.getRegionInstanceGroupsSetNamedPortsRequestResource())
          && Objects.equals(this.requestId, that.getRequestId())
          && Objects.equals(this.userIp, that.getUserIp());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        access_token,
        callback,
        fields,
        instanceGroup,
        key,
        prettyPrint,
        quotaUser,
        regionInstanceGroupsSetNamedPortsRequestResource,
        requestId,
        userIp);
  }
}
