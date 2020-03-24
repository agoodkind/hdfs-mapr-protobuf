// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hdfsformat.proto

package ds.hdfs.generated;

/**
 * Protobuf type {@code ds.hdfs.BlockMetadata}
 */
public  final class BlockMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ds.hdfs.BlockMetadata)
    BlockMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlockMetadata.newBuilder() to construct.
  private BlockMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlockMetadata() {
    fileName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlockMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlockMetadata(
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
          case 8: {

            index_ = input.readInt32();
            break;
          }
          case 16: {

            blockSize_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            fileName_ = s;
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
    return ds.hdfs.generated.HDFSFormat.internal_static_ds_hdfs_BlockMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.hdfs.generated.HDFSFormat.internal_static_ds_hdfs_BlockMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.hdfs.generated.BlockMetadata.class, ds.hdfs.generated.BlockMetadata.Builder.class);
  }

  public static final int INDEX_FIELD_NUMBER = 1;
  private int index_;
  /**
   * <code>int32 index = 1;</code>
   * @return The index.
   */
  public int getIndex() {
    return index_;
  }

  public static final int BLOCK_SIZE_FIELD_NUMBER = 2;
  private int blockSize_;
  /**
   * <code>int32 block_size = 2;</code>
   * @return The blockSize.
   */
  public int getBlockSize() {
    return blockSize_;
  }

  public static final int FILE_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object fileName_;
  /**
   * <code>string file_name = 3;</code>
   * @return The fileName.
   */
  public java.lang.String getFileName() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fileName_ = s;
      return s;
    }
  }
  /**
   * <code>string file_name = 3;</code>
   * @return The bytes for fileName.
   */
  public com.google.protobuf.ByteString
      getFileNameBytes() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fileName_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (index_ != 0) {
      output.writeInt32(1, index_);
    }
    if (blockSize_ != 0) {
      output.writeInt32(2, blockSize_);
    }
    if (!getFileNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fileName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (index_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, index_);
    }
    if (blockSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, blockSize_);
    }
    if (!getFileNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fileName_);
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
    if (!(obj instanceof ds.hdfs.generated.BlockMetadata)) {
      return super.equals(obj);
    }
    ds.hdfs.generated.BlockMetadata other = (ds.hdfs.generated.BlockMetadata) obj;

    if (getIndex()
        != other.getIndex()) return false;
    if (getBlockSize()
        != other.getBlockSize()) return false;
    if (!getFileName()
        .equals(other.getFileName())) return false;
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
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getIndex();
    hash = (37 * hash) + BLOCK_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getBlockSize();
    hash = (37 * hash) + FILE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFileName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.hdfs.generated.BlockMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.hdfs.generated.BlockMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.hdfs.generated.BlockMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.hdfs.generated.BlockMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.hdfs.generated.BlockMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.hdfs.generated.BlockMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.hdfs.generated.BlockMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.hdfs.generated.BlockMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.hdfs.generated.BlockMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.hdfs.generated.BlockMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.hdfs.generated.BlockMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.hdfs.generated.BlockMetadata parseFrom(
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
  public static Builder newBuilder(ds.hdfs.generated.BlockMetadata prototype) {
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
   * Protobuf type {@code ds.hdfs.BlockMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ds.hdfs.BlockMetadata)
      ds.hdfs.generated.BlockMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.hdfs.generated.HDFSFormat.internal_static_ds_hdfs_BlockMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.hdfs.generated.HDFSFormat.internal_static_ds_hdfs_BlockMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.hdfs.generated.BlockMetadata.class, ds.hdfs.generated.BlockMetadata.Builder.class);
    }

    // Construct using ds.hdfs.generated.BlockMetadata.newBuilder()
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
      index_ = 0;

      blockSize_ = 0;

      fileName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.hdfs.generated.HDFSFormat.internal_static_ds_hdfs_BlockMetadata_descriptor;
    }

    @java.lang.Override
    public ds.hdfs.generated.BlockMetadata getDefaultInstanceForType() {
      return ds.hdfs.generated.BlockMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public ds.hdfs.generated.BlockMetadata build() {
      ds.hdfs.generated.BlockMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.hdfs.generated.BlockMetadata buildPartial() {
      ds.hdfs.generated.BlockMetadata result = new ds.hdfs.generated.BlockMetadata(this);
      result.index_ = index_;
      result.blockSize_ = blockSize_;
      result.fileName_ = fileName_;
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
      if (other instanceof ds.hdfs.generated.BlockMetadata) {
        return mergeFrom((ds.hdfs.generated.BlockMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.hdfs.generated.BlockMetadata other) {
      if (other == ds.hdfs.generated.BlockMetadata.getDefaultInstance()) return this;
      if (other.getIndex() != 0) {
        setIndex(other.getIndex());
      }
      if (other.getBlockSize() != 0) {
        setBlockSize(other.getBlockSize());
      }
      if (!other.getFileName().isEmpty()) {
        fileName_ = other.fileName_;
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
      ds.hdfs.generated.BlockMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.hdfs.generated.BlockMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int index_ ;
    /**
     * <code>int32 index = 1;</code>
     * @return The index.
     */
    public int getIndex() {
      return index_;
    }
    /**
     * <code>int32 index = 1;</code>
     * @param value The index to set.
     * @return This builder for chaining.
     */
    public Builder setIndex(int value) {
      
      index_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 index = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIndex() {
      
      index_ = 0;
      onChanged();
      return this;
    }

    private int blockSize_ ;
    /**
     * <code>int32 block_size = 2;</code>
     * @return The blockSize.
     */
    public int getBlockSize() {
      return blockSize_;
    }
    /**
     * <code>int32 block_size = 2;</code>
     * @param value The blockSize to set.
     * @return This builder for chaining.
     */
    public Builder setBlockSize(int value) {
      
      blockSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 block_size = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlockSize() {
      
      blockSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fileName_ = "";
    /**
     * <code>string file_name = 3;</code>
     * @return The fileName.
     */
    public java.lang.String getFileName() {
      java.lang.Object ref = fileName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string file_name = 3;</code>
     * @return The bytes for fileName.
     */
    public com.google.protobuf.ByteString
        getFileNameBytes() {
      java.lang.Object ref = fileName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string file_name = 3;</code>
     * @param value The fileName to set.
     * @return This builder for chaining.
     */
    public Builder setFileName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fileName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string file_name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileName() {
      
      fileName_ = getDefaultInstance().getFileName();
      onChanged();
      return this;
    }
    /**
     * <code>string file_name = 3;</code>
     * @param value The bytes for fileName to set.
     * @return This builder for chaining.
     */
    public Builder setFileNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fileName_ = value;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:ds.hdfs.BlockMetadata)
  }

  // @@protoc_insertion_point(class_scope:ds.hdfs.BlockMetadata)
  private static final ds.hdfs.generated.BlockMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.hdfs.generated.BlockMetadata();
  }

  public static ds.hdfs.generated.BlockMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlockMetadata>
      PARSER = new com.google.protobuf.AbstractParser<BlockMetadata>() {
    @java.lang.Override
    public BlockMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlockMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlockMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlockMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.hdfs.generated.BlockMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

