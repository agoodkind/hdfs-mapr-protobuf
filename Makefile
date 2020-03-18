curdir:=$(shell pwd)
out:=$(curdir)/bin
hdfs_java_sources:="$(curdir)/src/ds/hdfs"
classpath:="$(curdir)/lib/*:$(curdir)/bin/"
proto_sources:=$(curdir)/src/ds/hdfs/protos
protoc_grpc_plugin:=$(curdir)/plugins/protoc-gen-grpc-java-1.28.0-osx-x86_64.exe

all: hdfs proto mapreduce

hdfs:
	javac -d $(out) -cp $(classpath) $(hdfs_java_sources)/generated/*.java $(hdfs_java_sources)/*.java
mapreduce:

proto:
	chmod +x $(protoc_grpc_plugin)
	protoc --plugin=protoc-gen-grpc-java=$(protoc_grpc_plugin) --grpc-java_out=src --proto_path=$(proto_sources) --java_out=src $(proto_sources)/hdfsformat.proto
test:

clean:
	rm -rf $(curdir)/bin/* $(curdir)/persist/*