// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hdfsformat.proto

package ds.hdfs.generated;

/**
 * Protobuf type {@code ds.hdfs.BlockLocation}
 */
public  final class BlockLocation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ds.hdfs.BlockLocation)
    BlockLocationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlockLocation.newBuilder() to construct.
  private BlockLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlockLocation() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlockLocation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlockLocation(
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
          case 10: {
            ds.hdfs.generated.DataNodeInfo.Builder subBuilder = null;
            if (dataNodeInfo_ != null) {
              subBuilder = dataNodeInfo_.toBuilder();
            }
            dataNodeInfo_ = input.readMessage(ds.hdfs.generated.DataNodeInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dataNodeInfo_);
              dataNodeInfo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            ds.hdfs.generated.BlockMetadata.Builder subBuilder = null;
            if (blockInfo_ != null) {
              subBuilder = blockInfo_.toBuilder();
            }
            blockInfo_ = input.readMessage(ds.hdfs.generated.BlockMetadata.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(blockInfo_);
              blockInfo_ = subBuilder.buildPartial();
            }

            break;
          }
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
    return ds.hdfs.generated.HDFSFormat.internal_static_ds_hdfs_BlockLocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.hdfs.generated.HDFSFormat.internal_static_ds_hdfs_BlockLocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.hdfs.generated.BlockLocation.class, ds.hdfs.generated.BlockLocation.Builder.class);
  }

  public static final int DATA_NODE_INFO_FIELD_NUMBER = 1;
  private ds.hdfs.generated.DataNodeInfo dataNodeInfo_;
  /**
   * <code>.ds.hdfs.DataNodeInfo data_node_info = 1;</code>
   * @return Whether the dataNodeInfo field is set.
   */
  public boolean hasDataNodeInfo() {
    return dataNodeInfo_ != null;
  }
  /**
   * <code>.ds.hdfs.DataNodeInfo data_node_info = 1;</code>
   * @return The dataNodeInfo.
   */
  public ds.hdfs.generated.DataNodeInfo getDataNodeInfo() {
    return dataNodeInfo_ == null ? ds.hdfs.generated.DataNodeInfo.getDefaultInstance() : dataNodeInfo_;
  }
  /**
   * <code>.ds.hdfs.DataNodeInfo data_node_info = 1;</code>
   */
  public ds.hdfs.generated.DataNodeInfoOrBuilder getDataNodeInfoOrBuilder() {
    return getDataNodeInfo();
  }

  public static final int BLOCK_INFO_FIELD_NUMBER = 2;
  private ds.hdfs.generated.BlockMetadata blockInfo_;
  /**
   * <code>.ds.hdfs.BlockMetadata block_info = 2;</code>
   * @return Whether the blockInfo field is set.
   */
  public boolean hasBlockInfo() {
    return blockInfo_ != null;
  }
  /**
   * <code>.ds.hdfs.BlockMetadata block_info = 2;</code>
   * @return The blockInfo.
   */
  public ds.hdfs.generated.BlockMetadata getBlockInfo() {
    return blockInfo_ == null ? ds.hdfs.generated.BlockMetadata.getDefaultInstance() : blockInfo_;
  }
  /**
   * <code>.ds.hdfs.BlockMetadata block_info = 2;</code>
   */
  public ds.hdfs.generated.BlockMetadataOrBuilder getBlockInfoOrBuilder() {
    return getBlockInfo();
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
    if (dataNodeInfo_ != null) {
      output.writeMessage(1, getDataNodeInfo());
    }
    if (blockInfo_ != null) {
      output.writeMessage(2, getBlockInfo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dataNodeInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDataNodeInfo());
    }
    if (blockInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBlockInfo());
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
    if (!(obj instanceof ds.hdfs.generated.BlockLocation)) {
      return super.equals(obj);
    }
    ds.hdfs.generated.BlockLocation other = (ds.hdfs.generated.BlockLocation) obj;

    if (hasDataNodeInfo() != other.hasDataNodeInfo()) return false;
    if (hasDataNodeInfo()) {
      if (!getDataNodeInfo()
          .equals(other.getDataNodeInfo())) return false;
    }
    if (hasBlockInfo() != other.hasBlockInfo()) return false;
    if (hasBlockInfo()) {
      if (!getBlockInfo()
          .equals(other.getBlockInfo())) return false;
    }
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
    if (hasDataNodeInfo()) {
      hash = (37 * hash) + DATA_NODE_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getDataNodeInfo().hashCode();
    }
    if (hasBlockInfo()) {
      hash = (37 * hash) + BLOCK_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getBlockInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.hdfs.generated.BlockLocation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.hdfs.generated.BlockLocation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.hdfs.generated.BlockLocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.hdfs.generated.BlockLocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.hdfs.generated.BlockLocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.hdfs.generated.BlockLocation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.hdfs.generated.BlockLocation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.hdfs.generated.BlockLocation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.hdfs.generated.BlockLocation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.hdfs.generated.BlockLocation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.hdfs.generated.BlockLocation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.hdfs.generated.BlockLocation parseFrom(
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
  public static Builder newBuilder(ds.hdfs.generated.BlockLocation prototype) {
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
   * Protobuf type {@code ds.hdfs.BlockLocation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ds.hdfs.BlockLocation)
      ds.hdfs.generated.BlockLocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.hdfs.generated.HDFSFormat.internal_static_ds_hdfs_BlockLocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.hdfs.generated.HDFSFormat.internal_static_ds_hdfs_BlockLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.hdfs.generated.BlockLocation.class, ds.hdfs.generated.BlockLocation.Builder.class);
    }

    // Construct using ds.hdfs.generated.BlockLocation.newBuilder()
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
      if (dataNodeInfoBuilder_ == null) {
        dataNodeInfo_ = null;
      } else {
        dataNodeInfo_ = null;
        dataNodeInfoBuilder_ = null;
      }
      if (blockInfoBuilder_ == null) {
        blockInfo_ = null;
      } else {
        blockInfo_ = null;
        blockInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.hdfs.generated.HDFSFormat.internal_static_ds_hdfs_BlockLocation_descriptor;
    }

    @java.lang.Override
    public ds.hdfs.generated.BlockLocation getDefaultInstanceForType() {
      return ds.hdfs.generated.BlockLocation.getDefaultInstance();
    }

    @java.lang.Override
    public ds.hdfs.generated.BlockLocation build() {
      ds.hdfs.generated.BlockLocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.hdfs.generated.BlockLocation buildPartial() {
      ds.hdfs.generated.BlockLocation result = new ds.hdfs.generated.BlockLocation(this);
      if (dataNodeInfoBuilder_ == null) {
        result.dataNodeInfo_ = dataNodeInfo_;
      } else {
        result.dataNodeInfo_ = dataNodeInfoBuilder_.build();
      }
      if (blockInfoBuilder_ == null) {
        result.blockInfo_ = blockInfo_;
      } else {
        result.blockInfo_ = blockInfoBuilder_.build();
      }
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
      if (other instanceof ds.hdfs.generated.BlockLocation) {
        return mergeFrom((ds.hdfs.generated.BlockLocation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.hdfs.generated.BlockLocation other) {
      if (other == ds.hdfs.generated.BlockLocation.getDefaultInstance()) return this;
      if (other.hasDataNodeInfo()) {
        mergeDataNodeInfo(other.getDataNodeInfo());
      }
      if (other.hasBlockInfo()) {
        mergeBlockInfo(other.getBlockInfo());
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
      ds.hdfs.generated.BlockLocation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.hdfs.generated.BlockLocation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private ds.hdfs.generated.DataNodeInfo dataNodeInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ds.hdfs.generated.DataNodeInfo, ds.hdfs.generated.DataNodeInfo.Builder, ds.hdfs.generated.DataNodeInfoOrBuilder> dataNodeInfoBuilder_;
    /**
     * <code>.ds.hdfs.DataNodeInfo data_node_info = 1;</code>
     * @return Whether the dataNodeInfo field is set.
     */
    public boolean hasDataNodeInfo() {
      return dataNodeInfoBuilder_ != null || dataNodeInfo_ != null;
    }
    /**
     * <code>.ds.hdfs.DataNodeInfo data_node_info = 1;</code>
     * @return The dataNodeInfo.
     */
    public ds.hdfs.generated.DataNodeInfo getDataNodeInfo() {
      if (dataNodeInfoBuilder_ == null) {
        return dataNodeInfo_ == null ? ds.hdfs.generated.DataNodeInfo.getDefaultInstance() : dataNodeInfo_;
      } else {
        return dataNodeInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.ds.hdfs.DataNodeInfo data_node_info = 1;</code>
     */
    public Builder setDataNodeInfo(ds.hdfs.generated.DataNodeInfo value) {
      if (dataNodeInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataNodeInfo_ = value;
        onChanged();
      } else {
        dataNodeInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ds.hdfs.DataNodeInfo data_node_info = 1;</code>
     */
    public Builder setDataNodeInfo(
        ds.hdfs.generated.DataNodeInfo.Builder builderForValue) {
      if (dataNodeInfoBuilder_ == null) {
        dataNodeInfo_ = builderForValue.build();
        onChanged();
      } else {
        dataNodeInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ds.hdfs.DataNodeInfo data_node_info = 1;</code>
     */
    public Builder mergeDataNodeInfo(ds.hdfs.generated.DataNodeInfo value) {
      if (dataNodeInfoBuilder_ == null) {
        if (dataNodeInfo_ != null) {
          dataNodeInfo_ =
            ds.hdfs.generated.DataNodeInfo.newBuilder(dataNodeInfo_).mergeFrom(value).buildPartial();
        } else {
          dataNodeInfo_ = value;
        }
        onChanged();
      } else {
        dataNodeInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ds.hdfs.DataNodeInfo data_node_info = 1;</code>
     */
    public Builder clearDataNodeInfo() {
      if (dataNodeInfoBuilder_ == null) {
        dataNodeInfo_ = null;
        onChanged();
      } else {
        dataNodeInfo_ = null;
        dataNodeInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ds.hdfs.DataNodeInfo data_node_info = 1;</code>
     */
    public ds.hdfs.generated.DataNodeInfo.Builder getDataNodeInfoBuilder() {
      
      onChanged();
      return getDataNodeInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.ds.hdfs.DataNodeInfo data_node_info = 1;</code>
     */
    public ds.hdfs.generated.DataNodeInfoOrBuilder getDataNodeInfoOrBuilder() {
      if (dataNodeInfoBuilder_ != null) {
        return dataNodeInfoBuilder_.getMessageOrBuilder();
      } else {
        return dataNodeInfo_ == null ?
            ds.hdfs.generated.DataNodeInfo.getDefaultInstance() : dataNodeInfo_;
      }
    }
    /**
     * <code>.ds.hdfs.DataNodeInfo data_node_info = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ds.hdfs.generated.DataNodeInfo, ds.hdfs.generated.DataNodeInfo.Builder, ds.hdfs.generated.DataNodeInfoOrBuilder> 
        getDataNodeInfoFieldBuilder() {
      if (dataNodeInfoBuilder_ == null) {
        dataNodeInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ds.hdfs.generated.DataNodeInfo, ds.hdfs.generated.DataNodeInfo.Builder, ds.hdfs.generated.DataNodeInfoOrBuilder>(
                getDataNodeInfo(),
                getParentForChildren(),
                isClean());
        dataNodeInfo_ = null;
      }
      return dataNodeInfoBuilder_;
    }

    private ds.hdfs.generated.BlockMetadata blockInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ds.hdfs.generated.BlockMetadata, ds.hdfs.generated.BlockMetadata.Builder, ds.hdfs.generated.BlockMetadataOrBuilder> blockInfoBuilder_;
    /**
     * <code>.ds.hdfs.BlockMetadata block_info = 2;</code>
     * @return Whether the blockInfo field is set.
     */
    public boolean hasBlockInfo() {
      return blockInfoBuilder_ != null || blockInfo_ != null;
    }
    /**
     * <code>.ds.hdfs.BlockMetadata block_info = 2;</code>
     * @return The blockInfo.
     */
    public ds.hdfs.generated.BlockMetadata getBlockInfo() {
      if (blockInfoBuilder_ == null) {
        return blockInfo_ == null ? ds.hdfs.generated.BlockMetadata.getDefaultInstance() : blockInfo_;
      } else {
        return blockInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.ds.hdfs.BlockMetadata block_info = 2;</code>
     */
    public Builder setBlockInfo(ds.hdfs.generated.BlockMetadata value) {
      if (blockInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        blockInfo_ = value;
        onChanged();
      } else {
        blockInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ds.hdfs.BlockMetadata block_info = 2;</code>
     */
    public Builder setBlockInfo(
        ds.hdfs.generated.BlockMetadata.Builder builderForValue) {
      if (blockInfoBuilder_ == null) {
        blockInfo_ = builderForValue.build();
        onChanged();
      } else {
        blockInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ds.hdfs.BlockMetadata block_info = 2;</code>
     */
    public Builder mergeBlockInfo(ds.hdfs.generated.BlockMetadata value) {
      if (blockInfoBuilder_ == null) {
        if (blockInfo_ != null) {
          blockInfo_ =
            ds.hdfs.generated.BlockMetadata.newBuilder(blockInfo_).mergeFrom(value).buildPartial();
        } else {
          blockInfo_ = value;
        }
        onChanged();
      } else {
        blockInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ds.hdfs.BlockMetadata block_info = 2;</code>
     */
    public Builder clearBlockInfo() {
      if (blockInfoBuilder_ == null) {
        blockInfo_ = null;
        onChanged();
      } else {
        blockInfo_ = null;
        blockInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ds.hdfs.BlockMetadata block_info = 2;</code>
     */
    public ds.hdfs.generated.BlockMetadata.Builder getBlockInfoBuilder() {
      
      onChanged();
      return getBlockInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.ds.hdfs.BlockMetadata block_info = 2;</code>
     */
    public ds.hdfs.generated.BlockMetadataOrBuilder getBlockInfoOrBuilder() {
      if (blockInfoBuilder_ != null) {
        return blockInfoBuilder_.getMessageOrBuilder();
      } else {
        return blockInfo_ == null ?
            ds.hdfs.generated.BlockMetadata.getDefaultInstance() : blockInfo_;
      }
    }
    /**
     * <code>.ds.hdfs.BlockMetadata block_info = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ds.hdfs.generated.BlockMetadata, ds.hdfs.generated.BlockMetadata.Builder, ds.hdfs.generated.BlockMetadataOrBuilder> 
        getBlockInfoFieldBuilder() {
      if (blockInfoBuilder_ == null) {
        blockInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ds.hdfs.generated.BlockMetadata, ds.hdfs.generated.BlockMetadata.Builder, ds.hdfs.generated.BlockMetadataOrBuilder>(
                getBlockInfo(),
                getParentForChildren(),
                isClean());
        blockInfo_ = null;
      }
      return blockInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ds.hdfs.BlockLocation)
  }

  // @@protoc_insertion_point(class_scope:ds.hdfs.BlockLocation)
  private static final ds.hdfs.generated.BlockLocation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.hdfs.generated.BlockLocation();
  }

  public static ds.hdfs.generated.BlockLocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlockLocation>
      PARSER = new com.google.protobuf.AbstractParser<BlockLocation>() {
    @java.lang.Override
    public BlockLocation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlockLocation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlockLocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlockLocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.hdfs.generated.BlockLocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
