// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hdfsformat.proto

package ds.hdfs.generated;

public interface FileListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ds.hdfs.FileList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .ds.hdfs.FileMetadata files = 1;</code>
   */
  java.util.List<ds.hdfs.generated.FileMetadata> 
      getFilesList();
  /**
   * <code>repeated .ds.hdfs.FileMetadata files = 1;</code>
   */
  ds.hdfs.generated.FileMetadata getFiles(int index);
  /**
   * <code>repeated .ds.hdfs.FileMetadata files = 1;</code>
   */
  int getFilesCount();
  /**
   * <code>repeated .ds.hdfs.FileMetadata files = 1;</code>
   */
  java.util.List<? extends ds.hdfs.generated.FileMetadataOrBuilder> 
      getFilesOrBuilderList();
  /**
   * <code>repeated .ds.hdfs.FileMetadata files = 1;</code>
   */
  ds.hdfs.generated.FileMetadataOrBuilder getFilesOrBuilder(
      int index);
}
