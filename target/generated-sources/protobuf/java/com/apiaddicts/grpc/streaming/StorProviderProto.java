// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: store.proto

package com.apiaddicts.grpc.streaming;

public final class StorProviderProto {
  private StorProviderProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_store_ProductById_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_store_ProductById_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_store_ProductsByName_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_store_ProductsByName_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_store_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_store_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_store_Order_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_store_Order_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_store_Stock_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_store_Stock_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_store_StockByProduct_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_store_StockByProduct_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013store.proto\022\005store\032\026google/type/date.p" +
      "roto\"!\n\013ProductById\022\022\n\nproduct_id\030\001 \001(\t\"" +
      "&\n\016ProductsByName\022\024\n\014product_name\030\001 \001(\t\"" +
      "g\n\007Product\022\022\n\nproduct_id\030\001 \001(\t\022\024\n\014produc" +
      "t_name\030\002 \001(\t\022\033\n\023product_description\030\003 \001(" +
      "\t\022\025\n\rproduct_price\030\004 \001(\001\"\202\001\n\005Order\022\020\n\010or" +
      "der_id\030\001 \001(\t\022%\n\norder_date\030\002 \001(\0132\021.googl" +
      "e.type.Date\022\024\n\014order_status\030\003 \001(\t\022\024\n\014ite" +
      "ms_number\030\004 \001(\005\022\024\n\014total_amount\030\005 \001(\001\"J\n" +
      "\005Stock\022\022\n\nproduct_id\030\001 \001(\t\022\027\n\017stock_oper" +
      "ation\030\002 \001(\t\022\024\n\014items_number\030\003 \001(\005\"\204\001\n\016St" +
      "ockByProduct\022\022\n\nproduct_id\030\001 \001(\t\022\024\n\014prod" +
      "uct_name\030\002 \001(\t\022\033\n\023product_description\030\003 " +
      "\001(\t\022\025\n\rproduct_price\030\004 \001(\001\022\024\n\014items_numb" +
      "er\030\005 \001(\0052\272\002\n\rStoreProvider\022B\n\034unaryStrea" +
      "mingGetProductById\022\022.store.ProductById\032\016" +
      ".store.Product\022Q\n$serverSideStreamingGet" +
      "ProductsByName\022\025.store.ProductsByName\032\016." +
      "store.Product\"\0000\001\022B\n\036clientSideStreaming" +
      "CreateOrder\022\016.store.Product\032\014.store.Orde" +
      "r\"\000(\001\022N\n!bidirectionalStreamingUpdateSto" +
      "ck\022\014.store.Stock\032\025.store.StockByProduct\"" +
      "\000(\0010\001B:\n\035com.apiaddicts.grpc.streamingB\021" +
      "StorProviderProtoP\001\242\002\003RTGb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.type.DateProto.getDescriptor(),
        });
    internal_static_store_ProductById_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_store_ProductById_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_store_ProductById_descriptor,
        new java.lang.String[] { "ProductId", });
    internal_static_store_ProductsByName_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_store_ProductsByName_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_store_ProductsByName_descriptor,
        new java.lang.String[] { "ProductName", });
    internal_static_store_Product_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_store_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_store_Product_descriptor,
        new java.lang.String[] { "ProductId", "ProductName", "ProductDescription", "ProductPrice", });
    internal_static_store_Order_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_store_Order_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_store_Order_descriptor,
        new java.lang.String[] { "OrderId", "OrderDate", "OrderStatus", "ItemsNumber", "TotalAmount", });
    internal_static_store_Stock_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_store_Stock_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_store_Stock_descriptor,
        new java.lang.String[] { "ProductId", "StockOperation", "ItemsNumber", });
    internal_static_store_StockByProduct_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_store_StockByProduct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_store_StockByProduct_descriptor,
        new java.lang.String[] { "ProductId", "ProductName", "ProductDescription", "ProductPrice", "ItemsNumber", });
    com.google.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
