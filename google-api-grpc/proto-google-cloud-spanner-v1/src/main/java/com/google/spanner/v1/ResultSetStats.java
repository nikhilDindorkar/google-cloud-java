// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/result_set.proto

package com.google.spanner.v1;

/**
 * <pre>
 * Additional statistics about a [ResultSet][google.spanner.v1.ResultSet] or [PartialResultSet][google.spanner.v1.PartialResultSet].
 * </pre>
 *
 * Protobuf type {@code google.spanner.v1.ResultSetStats}
 */
public  final class ResultSetStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.spanner.v1.ResultSetStats)
    ResultSetStatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResultSetStats.newBuilder() to construct.
  private ResultSetStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResultSetStats() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResultSetStats(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            com.google.spanner.v1.QueryPlan.Builder subBuilder = null;
            if (queryPlan_ != null) {
              subBuilder = queryPlan_.toBuilder();
            }
            queryPlan_ = input.readMessage(com.google.spanner.v1.QueryPlan.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(queryPlan_);
              queryPlan_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Struct.Builder subBuilder = null;
            if (queryStats_ != null) {
              subBuilder = queryStats_.toBuilder();
            }
            queryStats_ = input.readMessage(com.google.protobuf.Struct.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(queryStats_);
              queryStats_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {
            rowCountCase_ = 3;
            rowCount_ = input.readInt64();
            break;
          }
          case 32: {
            rowCountCase_ = 4;
            rowCount_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.google.spanner.v1.ResultSetProto.internal_static_google_spanner_v1_ResultSetStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.v1.ResultSetProto.internal_static_google_spanner_v1_ResultSetStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.v1.ResultSetStats.class, com.google.spanner.v1.ResultSetStats.Builder.class);
  }

  private int rowCountCase_ = 0;
  private java.lang.Object rowCount_;
  public enum RowCountCase
      implements com.google.protobuf.Internal.EnumLite {
    ROW_COUNT_EXACT(3),
    ROW_COUNT_LOWER_BOUND(4),
    ROWCOUNT_NOT_SET(0);
    private final int value;
    private RowCountCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RowCountCase valueOf(int value) {
      return forNumber(value);
    }

    public static RowCountCase forNumber(int value) {
      switch (value) {
        case 3: return ROW_COUNT_EXACT;
        case 4: return ROW_COUNT_LOWER_BOUND;
        case 0: return ROWCOUNT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public RowCountCase
  getRowCountCase() {
    return RowCountCase.forNumber(
        rowCountCase_);
  }

  public static final int QUERY_PLAN_FIELD_NUMBER = 1;
  private com.google.spanner.v1.QueryPlan queryPlan_;
  /**
   * <pre>
   * [QueryPlan][google.spanner.v1.QueryPlan] for the query associated with this result.
   * </pre>
   *
   * <code>.google.spanner.v1.QueryPlan query_plan = 1;</code>
   */
  public boolean hasQueryPlan() {
    return queryPlan_ != null;
  }
  /**
   * <pre>
   * [QueryPlan][google.spanner.v1.QueryPlan] for the query associated with this result.
   * </pre>
   *
   * <code>.google.spanner.v1.QueryPlan query_plan = 1;</code>
   */
  public com.google.spanner.v1.QueryPlan getQueryPlan() {
    return queryPlan_ == null ? com.google.spanner.v1.QueryPlan.getDefaultInstance() : queryPlan_;
  }
  /**
   * <pre>
   * [QueryPlan][google.spanner.v1.QueryPlan] for the query associated with this result.
   * </pre>
   *
   * <code>.google.spanner.v1.QueryPlan query_plan = 1;</code>
   */
  public com.google.spanner.v1.QueryPlanOrBuilder getQueryPlanOrBuilder() {
    return getQueryPlan();
  }

  public static final int QUERY_STATS_FIELD_NUMBER = 2;
  private com.google.protobuf.Struct queryStats_;
  /**
   * <pre>
   * Aggregated statistics from the execution of the query. Only present when
   * the query is profiled. For example, a query could return the statistics as
   * follows:
   *     {
   *       "rows_returned": "3",
   *       "elapsed_time": "1.22 secs",
   *       "cpu_time": "1.19 secs"
   *     }
   * </pre>
   *
   * <code>.google.protobuf.Struct query_stats = 2;</code>
   */
  public boolean hasQueryStats() {
    return queryStats_ != null;
  }
  /**
   * <pre>
   * Aggregated statistics from the execution of the query. Only present when
   * the query is profiled. For example, a query could return the statistics as
   * follows:
   *     {
   *       "rows_returned": "3",
   *       "elapsed_time": "1.22 secs",
   *       "cpu_time": "1.19 secs"
   *     }
   * </pre>
   *
   * <code>.google.protobuf.Struct query_stats = 2;</code>
   */
  public com.google.protobuf.Struct getQueryStats() {
    return queryStats_ == null ? com.google.protobuf.Struct.getDefaultInstance() : queryStats_;
  }
  /**
   * <pre>
   * Aggregated statistics from the execution of the query. Only present when
   * the query is profiled. For example, a query could return the statistics as
   * follows:
   *     {
   *       "rows_returned": "3",
   *       "elapsed_time": "1.22 secs",
   *       "cpu_time": "1.19 secs"
   *     }
   * </pre>
   *
   * <code>.google.protobuf.Struct query_stats = 2;</code>
   */
  public com.google.protobuf.StructOrBuilder getQueryStatsOrBuilder() {
    return getQueryStats();
  }

  public static final int ROW_COUNT_EXACT_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Standard DML returns an exact count of rows that were modified.
   * </pre>
   *
   * <code>int64 row_count_exact = 3;</code>
   */
  public long getRowCountExact() {
    if (rowCountCase_ == 3) {
      return (java.lang.Long) rowCount_;
    }
    return 0L;
  }

  public static final int ROW_COUNT_LOWER_BOUND_FIELD_NUMBER = 4;
  /**
   * <pre>
   * Partitioned DML does not offer exactly-once semantics, so it
   * returns a lower bound of the rows modified.
   * </pre>
   *
   * <code>int64 row_count_lower_bound = 4;</code>
   */
  public long getRowCountLowerBound() {
    if (rowCountCase_ == 4) {
      return (java.lang.Long) rowCount_;
    }
    return 0L;
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
    if (queryPlan_ != null) {
      output.writeMessage(1, getQueryPlan());
    }
    if (queryStats_ != null) {
      output.writeMessage(2, getQueryStats());
    }
    if (rowCountCase_ == 3) {
      output.writeInt64(
          3, (long)((java.lang.Long) rowCount_));
    }
    if (rowCountCase_ == 4) {
      output.writeInt64(
          4, (long)((java.lang.Long) rowCount_));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (queryPlan_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getQueryPlan());
    }
    if (queryStats_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getQueryStats());
    }
    if (rowCountCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            3, (long)((java.lang.Long) rowCount_));
    }
    if (rowCountCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            4, (long)((java.lang.Long) rowCount_));
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
    if (!(obj instanceof com.google.spanner.v1.ResultSetStats)) {
      return super.equals(obj);
    }
    com.google.spanner.v1.ResultSetStats other = (com.google.spanner.v1.ResultSetStats) obj;

    boolean result = true;
    result = result && (hasQueryPlan() == other.hasQueryPlan());
    if (hasQueryPlan()) {
      result = result && getQueryPlan()
          .equals(other.getQueryPlan());
    }
    result = result && (hasQueryStats() == other.hasQueryStats());
    if (hasQueryStats()) {
      result = result && getQueryStats()
          .equals(other.getQueryStats());
    }
    result = result && getRowCountCase().equals(
        other.getRowCountCase());
    if (!result) return false;
    switch (rowCountCase_) {
      case 3:
        result = result && (getRowCountExact()
            == other.getRowCountExact());
        break;
      case 4:
        result = result && (getRowCountLowerBound()
            == other.getRowCountLowerBound());
        break;
      case 0:
      default:
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasQueryPlan()) {
      hash = (37 * hash) + QUERY_PLAN_FIELD_NUMBER;
      hash = (53 * hash) + getQueryPlan().hashCode();
    }
    if (hasQueryStats()) {
      hash = (37 * hash) + QUERY_STATS_FIELD_NUMBER;
      hash = (53 * hash) + getQueryStats().hashCode();
    }
    switch (rowCountCase_) {
      case 3:
        hash = (37 * hash) + ROW_COUNT_EXACT_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getRowCountExact());
        break;
      case 4:
        hash = (37 * hash) + ROW_COUNT_LOWER_BOUND_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getRowCountLowerBound());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.v1.ResultSetStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.ResultSetStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.ResultSetStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.ResultSetStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.ResultSetStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.ResultSetStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.ResultSetStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.ResultSetStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.v1.ResultSetStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.ResultSetStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.v1.ResultSetStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.ResultSetStats parseFrom(
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
  public static Builder newBuilder(com.google.spanner.v1.ResultSetStats prototype) {
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
   * Additional statistics about a [ResultSet][google.spanner.v1.ResultSet] or [PartialResultSet][google.spanner.v1.PartialResultSet].
   * </pre>
   *
   * Protobuf type {@code google.spanner.v1.ResultSetStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.spanner.v1.ResultSetStats)
      com.google.spanner.v1.ResultSetStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.spanner.v1.ResultSetProto.internal_static_google_spanner_v1_ResultSetStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.v1.ResultSetProto.internal_static_google_spanner_v1_ResultSetStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.v1.ResultSetStats.class, com.google.spanner.v1.ResultSetStats.Builder.class);
    }

    // Construct using com.google.spanner.v1.ResultSetStats.newBuilder()
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
      if (queryPlanBuilder_ == null) {
        queryPlan_ = null;
      } else {
        queryPlan_ = null;
        queryPlanBuilder_ = null;
      }
      if (queryStatsBuilder_ == null) {
        queryStats_ = null;
      } else {
        queryStats_ = null;
        queryStatsBuilder_ = null;
      }
      rowCountCase_ = 0;
      rowCount_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.spanner.v1.ResultSetProto.internal_static_google_spanner_v1_ResultSetStats_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.v1.ResultSetStats getDefaultInstanceForType() {
      return com.google.spanner.v1.ResultSetStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.v1.ResultSetStats build() {
      com.google.spanner.v1.ResultSetStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.v1.ResultSetStats buildPartial() {
      com.google.spanner.v1.ResultSetStats result = new com.google.spanner.v1.ResultSetStats(this);
      if (queryPlanBuilder_ == null) {
        result.queryPlan_ = queryPlan_;
      } else {
        result.queryPlan_ = queryPlanBuilder_.build();
      }
      if (queryStatsBuilder_ == null) {
        result.queryStats_ = queryStats_;
      } else {
        result.queryStats_ = queryStatsBuilder_.build();
      }
      if (rowCountCase_ == 3) {
        result.rowCount_ = rowCount_;
      }
      if (rowCountCase_ == 4) {
        result.rowCount_ = rowCount_;
      }
      result.rowCountCase_ = rowCountCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.spanner.v1.ResultSetStats) {
        return mergeFrom((com.google.spanner.v1.ResultSetStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.v1.ResultSetStats other) {
      if (other == com.google.spanner.v1.ResultSetStats.getDefaultInstance()) return this;
      if (other.hasQueryPlan()) {
        mergeQueryPlan(other.getQueryPlan());
      }
      if (other.hasQueryStats()) {
        mergeQueryStats(other.getQueryStats());
      }
      switch (other.getRowCountCase()) {
        case ROW_COUNT_EXACT: {
          setRowCountExact(other.getRowCountExact());
          break;
        }
        case ROW_COUNT_LOWER_BOUND: {
          setRowCountLowerBound(other.getRowCountLowerBound());
          break;
        }
        case ROWCOUNT_NOT_SET: {
          break;
        }
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
      com.google.spanner.v1.ResultSetStats parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.spanner.v1.ResultSetStats) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int rowCountCase_ = 0;
    private java.lang.Object rowCount_;
    public RowCountCase
        getRowCountCase() {
      return RowCountCase.forNumber(
          rowCountCase_);
    }

    public Builder clearRowCount() {
      rowCountCase_ = 0;
      rowCount_ = null;
      onChanged();
      return this;
    }


    private com.google.spanner.v1.QueryPlan queryPlan_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.spanner.v1.QueryPlan, com.google.spanner.v1.QueryPlan.Builder, com.google.spanner.v1.QueryPlanOrBuilder> queryPlanBuilder_;
    /**
     * <pre>
     * [QueryPlan][google.spanner.v1.QueryPlan] for the query associated with this result.
     * </pre>
     *
     * <code>.google.spanner.v1.QueryPlan query_plan = 1;</code>
     */
    public boolean hasQueryPlan() {
      return queryPlanBuilder_ != null || queryPlan_ != null;
    }
    /**
     * <pre>
     * [QueryPlan][google.spanner.v1.QueryPlan] for the query associated with this result.
     * </pre>
     *
     * <code>.google.spanner.v1.QueryPlan query_plan = 1;</code>
     */
    public com.google.spanner.v1.QueryPlan getQueryPlan() {
      if (queryPlanBuilder_ == null) {
        return queryPlan_ == null ? com.google.spanner.v1.QueryPlan.getDefaultInstance() : queryPlan_;
      } else {
        return queryPlanBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * [QueryPlan][google.spanner.v1.QueryPlan] for the query associated with this result.
     * </pre>
     *
     * <code>.google.spanner.v1.QueryPlan query_plan = 1;</code>
     */
    public Builder setQueryPlan(com.google.spanner.v1.QueryPlan value) {
      if (queryPlanBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        queryPlan_ = value;
        onChanged();
      } else {
        queryPlanBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * [QueryPlan][google.spanner.v1.QueryPlan] for the query associated with this result.
     * </pre>
     *
     * <code>.google.spanner.v1.QueryPlan query_plan = 1;</code>
     */
    public Builder setQueryPlan(
        com.google.spanner.v1.QueryPlan.Builder builderForValue) {
      if (queryPlanBuilder_ == null) {
        queryPlan_ = builderForValue.build();
        onChanged();
      } else {
        queryPlanBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * [QueryPlan][google.spanner.v1.QueryPlan] for the query associated with this result.
     * </pre>
     *
     * <code>.google.spanner.v1.QueryPlan query_plan = 1;</code>
     */
    public Builder mergeQueryPlan(com.google.spanner.v1.QueryPlan value) {
      if (queryPlanBuilder_ == null) {
        if (queryPlan_ != null) {
          queryPlan_ =
            com.google.spanner.v1.QueryPlan.newBuilder(queryPlan_).mergeFrom(value).buildPartial();
        } else {
          queryPlan_ = value;
        }
        onChanged();
      } else {
        queryPlanBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * [QueryPlan][google.spanner.v1.QueryPlan] for the query associated with this result.
     * </pre>
     *
     * <code>.google.spanner.v1.QueryPlan query_plan = 1;</code>
     */
    public Builder clearQueryPlan() {
      if (queryPlanBuilder_ == null) {
        queryPlan_ = null;
        onChanged();
      } else {
        queryPlan_ = null;
        queryPlanBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * [QueryPlan][google.spanner.v1.QueryPlan] for the query associated with this result.
     * </pre>
     *
     * <code>.google.spanner.v1.QueryPlan query_plan = 1;</code>
     */
    public com.google.spanner.v1.QueryPlan.Builder getQueryPlanBuilder() {
      
      onChanged();
      return getQueryPlanFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * [QueryPlan][google.spanner.v1.QueryPlan] for the query associated with this result.
     * </pre>
     *
     * <code>.google.spanner.v1.QueryPlan query_plan = 1;</code>
     */
    public com.google.spanner.v1.QueryPlanOrBuilder getQueryPlanOrBuilder() {
      if (queryPlanBuilder_ != null) {
        return queryPlanBuilder_.getMessageOrBuilder();
      } else {
        return queryPlan_ == null ?
            com.google.spanner.v1.QueryPlan.getDefaultInstance() : queryPlan_;
      }
    }
    /**
     * <pre>
     * [QueryPlan][google.spanner.v1.QueryPlan] for the query associated with this result.
     * </pre>
     *
     * <code>.google.spanner.v1.QueryPlan query_plan = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.spanner.v1.QueryPlan, com.google.spanner.v1.QueryPlan.Builder, com.google.spanner.v1.QueryPlanOrBuilder> 
        getQueryPlanFieldBuilder() {
      if (queryPlanBuilder_ == null) {
        queryPlanBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.v1.QueryPlan, com.google.spanner.v1.QueryPlan.Builder, com.google.spanner.v1.QueryPlanOrBuilder>(
                getQueryPlan(),
                getParentForChildren(),
                isClean());
        queryPlan_ = null;
      }
      return queryPlanBuilder_;
    }

    private com.google.protobuf.Struct queryStats_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> queryStatsBuilder_;
    /**
     * <pre>
     * Aggregated statistics from the execution of the query. Only present when
     * the query is profiled. For example, a query could return the statistics as
     * follows:
     *     {
     *       "rows_returned": "3",
     *       "elapsed_time": "1.22 secs",
     *       "cpu_time": "1.19 secs"
     *     }
     * </pre>
     *
     * <code>.google.protobuf.Struct query_stats = 2;</code>
     */
    public boolean hasQueryStats() {
      return queryStatsBuilder_ != null || queryStats_ != null;
    }
    /**
     * <pre>
     * Aggregated statistics from the execution of the query. Only present when
     * the query is profiled. For example, a query could return the statistics as
     * follows:
     *     {
     *       "rows_returned": "3",
     *       "elapsed_time": "1.22 secs",
     *       "cpu_time": "1.19 secs"
     *     }
     * </pre>
     *
     * <code>.google.protobuf.Struct query_stats = 2;</code>
     */
    public com.google.protobuf.Struct getQueryStats() {
      if (queryStatsBuilder_ == null) {
        return queryStats_ == null ? com.google.protobuf.Struct.getDefaultInstance() : queryStats_;
      } else {
        return queryStatsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Aggregated statistics from the execution of the query. Only present when
     * the query is profiled. For example, a query could return the statistics as
     * follows:
     *     {
     *       "rows_returned": "3",
     *       "elapsed_time": "1.22 secs",
     *       "cpu_time": "1.19 secs"
     *     }
     * </pre>
     *
     * <code>.google.protobuf.Struct query_stats = 2;</code>
     */
    public Builder setQueryStats(com.google.protobuf.Struct value) {
      if (queryStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        queryStats_ = value;
        onChanged();
      } else {
        queryStatsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Aggregated statistics from the execution of the query. Only present when
     * the query is profiled. For example, a query could return the statistics as
     * follows:
     *     {
     *       "rows_returned": "3",
     *       "elapsed_time": "1.22 secs",
     *       "cpu_time": "1.19 secs"
     *     }
     * </pre>
     *
     * <code>.google.protobuf.Struct query_stats = 2;</code>
     */
    public Builder setQueryStats(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (queryStatsBuilder_ == null) {
        queryStats_ = builderForValue.build();
        onChanged();
      } else {
        queryStatsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Aggregated statistics from the execution of the query. Only present when
     * the query is profiled. For example, a query could return the statistics as
     * follows:
     *     {
     *       "rows_returned": "3",
     *       "elapsed_time": "1.22 secs",
     *       "cpu_time": "1.19 secs"
     *     }
     * </pre>
     *
     * <code>.google.protobuf.Struct query_stats = 2;</code>
     */
    public Builder mergeQueryStats(com.google.protobuf.Struct value) {
      if (queryStatsBuilder_ == null) {
        if (queryStats_ != null) {
          queryStats_ =
            com.google.protobuf.Struct.newBuilder(queryStats_).mergeFrom(value).buildPartial();
        } else {
          queryStats_ = value;
        }
        onChanged();
      } else {
        queryStatsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Aggregated statistics from the execution of the query. Only present when
     * the query is profiled. For example, a query could return the statistics as
     * follows:
     *     {
     *       "rows_returned": "3",
     *       "elapsed_time": "1.22 secs",
     *       "cpu_time": "1.19 secs"
     *     }
     * </pre>
     *
     * <code>.google.protobuf.Struct query_stats = 2;</code>
     */
    public Builder clearQueryStats() {
      if (queryStatsBuilder_ == null) {
        queryStats_ = null;
        onChanged();
      } else {
        queryStats_ = null;
        queryStatsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Aggregated statistics from the execution of the query. Only present when
     * the query is profiled. For example, a query could return the statistics as
     * follows:
     *     {
     *       "rows_returned": "3",
     *       "elapsed_time": "1.22 secs",
     *       "cpu_time": "1.19 secs"
     *     }
     * </pre>
     *
     * <code>.google.protobuf.Struct query_stats = 2;</code>
     */
    public com.google.protobuf.Struct.Builder getQueryStatsBuilder() {
      
      onChanged();
      return getQueryStatsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Aggregated statistics from the execution of the query. Only present when
     * the query is profiled. For example, a query could return the statistics as
     * follows:
     *     {
     *       "rows_returned": "3",
     *       "elapsed_time": "1.22 secs",
     *       "cpu_time": "1.19 secs"
     *     }
     * </pre>
     *
     * <code>.google.protobuf.Struct query_stats = 2;</code>
     */
    public com.google.protobuf.StructOrBuilder getQueryStatsOrBuilder() {
      if (queryStatsBuilder_ != null) {
        return queryStatsBuilder_.getMessageOrBuilder();
      } else {
        return queryStats_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : queryStats_;
      }
    }
    /**
     * <pre>
     * Aggregated statistics from the execution of the query. Only present when
     * the query is profiled. For example, a query could return the statistics as
     * follows:
     *     {
     *       "rows_returned": "3",
     *       "elapsed_time": "1.22 secs",
     *       "cpu_time": "1.19 secs"
     *     }
     * </pre>
     *
     * <code>.google.protobuf.Struct query_stats = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getQueryStatsFieldBuilder() {
      if (queryStatsBuilder_ == null) {
        queryStatsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getQueryStats(),
                getParentForChildren(),
                isClean());
        queryStats_ = null;
      }
      return queryStatsBuilder_;
    }

    /**
     * <pre>
     * Standard DML returns an exact count of rows that were modified.
     * </pre>
     *
     * <code>int64 row_count_exact = 3;</code>
     */
    public long getRowCountExact() {
      if (rowCountCase_ == 3) {
        return (java.lang.Long) rowCount_;
      }
      return 0L;
    }
    /**
     * <pre>
     * Standard DML returns an exact count of rows that were modified.
     * </pre>
     *
     * <code>int64 row_count_exact = 3;</code>
     */
    public Builder setRowCountExact(long value) {
      rowCountCase_ = 3;
      rowCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Standard DML returns an exact count of rows that were modified.
     * </pre>
     *
     * <code>int64 row_count_exact = 3;</code>
     */
    public Builder clearRowCountExact() {
      if (rowCountCase_ == 3) {
        rowCountCase_ = 0;
        rowCount_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * Partitioned DML does not offer exactly-once semantics, so it
     * returns a lower bound of the rows modified.
     * </pre>
     *
     * <code>int64 row_count_lower_bound = 4;</code>
     */
    public long getRowCountLowerBound() {
      if (rowCountCase_ == 4) {
        return (java.lang.Long) rowCount_;
      }
      return 0L;
    }
    /**
     * <pre>
     * Partitioned DML does not offer exactly-once semantics, so it
     * returns a lower bound of the rows modified.
     * </pre>
     *
     * <code>int64 row_count_lower_bound = 4;</code>
     */
    public Builder setRowCountLowerBound(long value) {
      rowCountCase_ = 4;
      rowCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Partitioned DML does not offer exactly-once semantics, so it
     * returns a lower bound of the rows modified.
     * </pre>
     *
     * <code>int64 row_count_lower_bound = 4;</code>
     */
    public Builder clearRowCountLowerBound() {
      if (rowCountCase_ == 4) {
        rowCountCase_ = 0;
        rowCount_ = null;
        onChanged();
      }
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.spanner.v1.ResultSetStats)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.v1.ResultSetStats)
  private static final com.google.spanner.v1.ResultSetStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.spanner.v1.ResultSetStats();
  }

  public static com.google.spanner.v1.ResultSetStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResultSetStats>
      PARSER = new com.google.protobuf.AbstractParser<ResultSetStats>() {
    @java.lang.Override
    public ResultSetStats parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResultSetStats(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResultSetStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResultSetStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.v1.ResultSetStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

