package com.paradigma.grpc.streaming;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.1)",
    comments = "Source: store.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StoreProviderGrpc {

  private StoreProviderGrpc() {}

  public static final String SERVICE_NAME = "store.StoreProvider";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.paradigma.grpc.streaming.ProductById,
      com.paradigma.grpc.streaming.Product> getUnaryStreamingGetProductByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "unaryStreamingGetProductById",
      requestType = com.paradigma.grpc.streaming.ProductById.class,
      responseType = com.paradigma.grpc.streaming.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.paradigma.grpc.streaming.ProductById,
      com.paradigma.grpc.streaming.Product> getUnaryStreamingGetProductByIdMethod() {
    io.grpc.MethodDescriptor<com.paradigma.grpc.streaming.ProductById, com.paradigma.grpc.streaming.Product> getUnaryStreamingGetProductByIdMethod;
    if ((getUnaryStreamingGetProductByIdMethod = StoreProviderGrpc.getUnaryStreamingGetProductByIdMethod) == null) {
      synchronized (StoreProviderGrpc.class) {
        if ((getUnaryStreamingGetProductByIdMethod = StoreProviderGrpc.getUnaryStreamingGetProductByIdMethod) == null) {
          StoreProviderGrpc.getUnaryStreamingGetProductByIdMethod = getUnaryStreamingGetProductByIdMethod =
              io.grpc.MethodDescriptor.<com.paradigma.grpc.streaming.ProductById, com.paradigma.grpc.streaming.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "unaryStreamingGetProductById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.paradigma.grpc.streaming.ProductById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.paradigma.grpc.streaming.Product.getDefaultInstance()))
              .setSchemaDescriptor(new StoreProviderMethodDescriptorSupplier("unaryStreamingGetProductById"))
              .build();
        }
      }
    }
    return getUnaryStreamingGetProductByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.paradigma.grpc.streaming.ProductsByName,
      com.paradigma.grpc.streaming.Product> getServerSideStreamingGetProductsByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serverSideStreamingGetProductsByName",
      requestType = com.paradigma.grpc.streaming.ProductsByName.class,
      responseType = com.paradigma.grpc.streaming.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.paradigma.grpc.streaming.ProductsByName,
      com.paradigma.grpc.streaming.Product> getServerSideStreamingGetProductsByNameMethod() {
    io.grpc.MethodDescriptor<com.paradigma.grpc.streaming.ProductsByName, com.paradigma.grpc.streaming.Product> getServerSideStreamingGetProductsByNameMethod;
    if ((getServerSideStreamingGetProductsByNameMethod = StoreProviderGrpc.getServerSideStreamingGetProductsByNameMethod) == null) {
      synchronized (StoreProviderGrpc.class) {
        if ((getServerSideStreamingGetProductsByNameMethod = StoreProviderGrpc.getServerSideStreamingGetProductsByNameMethod) == null) {
          StoreProviderGrpc.getServerSideStreamingGetProductsByNameMethod = getServerSideStreamingGetProductsByNameMethod =
              io.grpc.MethodDescriptor.<com.paradigma.grpc.streaming.ProductsByName, com.paradigma.grpc.streaming.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "serverSideStreamingGetProductsByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.paradigma.grpc.streaming.ProductsByName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.paradigma.grpc.streaming.Product.getDefaultInstance()))
              .setSchemaDescriptor(new StoreProviderMethodDescriptorSupplier("serverSideStreamingGetProductsByName"))
              .build();
        }
      }
    }
    return getServerSideStreamingGetProductsByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.paradigma.grpc.streaming.Product,
      com.paradigma.grpc.streaming.Order> getClientSideStreamingCreateOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clientSideStreamingCreateOrder",
      requestType = com.paradigma.grpc.streaming.Product.class,
      responseType = com.paradigma.grpc.streaming.Order.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.paradigma.grpc.streaming.Product,
      com.paradigma.grpc.streaming.Order> getClientSideStreamingCreateOrderMethod() {
    io.grpc.MethodDescriptor<com.paradigma.grpc.streaming.Product, com.paradigma.grpc.streaming.Order> getClientSideStreamingCreateOrderMethod;
    if ((getClientSideStreamingCreateOrderMethod = StoreProviderGrpc.getClientSideStreamingCreateOrderMethod) == null) {
      synchronized (StoreProviderGrpc.class) {
        if ((getClientSideStreamingCreateOrderMethod = StoreProviderGrpc.getClientSideStreamingCreateOrderMethod) == null) {
          StoreProviderGrpc.getClientSideStreamingCreateOrderMethod = getClientSideStreamingCreateOrderMethod =
              io.grpc.MethodDescriptor.<com.paradigma.grpc.streaming.Product, com.paradigma.grpc.streaming.Order>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "clientSideStreamingCreateOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.paradigma.grpc.streaming.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.paradigma.grpc.streaming.Order.getDefaultInstance()))
              .setSchemaDescriptor(new StoreProviderMethodDescriptorSupplier("clientSideStreamingCreateOrder"))
              .build();
        }
      }
    }
    return getClientSideStreamingCreateOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.paradigma.grpc.streaming.Stock,
      com.paradigma.grpc.streaming.StockByProduct> getBidirectionalStreamingUpdateStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bidirectionalStreamingUpdateStock",
      requestType = com.paradigma.grpc.streaming.Stock.class,
      responseType = com.paradigma.grpc.streaming.StockByProduct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.paradigma.grpc.streaming.Stock,
      com.paradigma.grpc.streaming.StockByProduct> getBidirectionalStreamingUpdateStockMethod() {
    io.grpc.MethodDescriptor<com.paradigma.grpc.streaming.Stock, com.paradigma.grpc.streaming.StockByProduct> getBidirectionalStreamingUpdateStockMethod;
    if ((getBidirectionalStreamingUpdateStockMethod = StoreProviderGrpc.getBidirectionalStreamingUpdateStockMethod) == null) {
      synchronized (StoreProviderGrpc.class) {
        if ((getBidirectionalStreamingUpdateStockMethod = StoreProviderGrpc.getBidirectionalStreamingUpdateStockMethod) == null) {
          StoreProviderGrpc.getBidirectionalStreamingUpdateStockMethod = getBidirectionalStreamingUpdateStockMethod =
              io.grpc.MethodDescriptor.<com.paradigma.grpc.streaming.Stock, com.paradigma.grpc.streaming.StockByProduct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "bidirectionalStreamingUpdateStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.paradigma.grpc.streaming.Stock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.paradigma.grpc.streaming.StockByProduct.getDefaultInstance()))
              .setSchemaDescriptor(new StoreProviderMethodDescriptorSupplier("bidirectionalStreamingUpdateStock"))
              .build();
        }
      }
    }
    return getBidirectionalStreamingUpdateStockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StoreProviderStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreProviderStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreProviderStub>() {
        @java.lang.Override
        public StoreProviderStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreProviderStub(channel, callOptions);
        }
      };
    return StoreProviderStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StoreProviderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreProviderBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreProviderBlockingStub>() {
        @java.lang.Override
        public StoreProviderBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreProviderBlockingStub(channel, callOptions);
        }
      };
    return StoreProviderBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StoreProviderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreProviderFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreProviderFutureStub>() {
        @java.lang.Override
        public StoreProviderFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreProviderFutureStub(channel, callOptions);
        }
      };
    return StoreProviderFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class StoreProviderImplBase implements io.grpc.BindableService {

    /**
     */
    public void unaryStreamingGetProductById(com.paradigma.grpc.streaming.ProductById request,
        io.grpc.stub.StreamObserver<com.paradigma.grpc.streaming.Product> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnaryStreamingGetProductByIdMethod(), responseObserver);
    }

    /**
     */
    public void serverSideStreamingGetProductsByName(com.paradigma.grpc.streaming.ProductsByName request,
        io.grpc.stub.StreamObserver<com.paradigma.grpc.streaming.Product> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerSideStreamingGetProductsByNameMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.paradigma.grpc.streaming.Product> clientSideStreamingCreateOrder(
        io.grpc.stub.StreamObserver<com.paradigma.grpc.streaming.Order> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getClientSideStreamingCreateOrderMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.paradigma.grpc.streaming.Stock> bidirectionalStreamingUpdateStock(
        io.grpc.stub.StreamObserver<com.paradigma.grpc.streaming.StockByProduct> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBidirectionalStreamingUpdateStockMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUnaryStreamingGetProductByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.paradigma.grpc.streaming.ProductById,
                com.paradigma.grpc.streaming.Product>(
                  this, METHODID_UNARY_STREAMING_GET_PRODUCT_BY_ID)))
          .addMethod(
            getServerSideStreamingGetProductsByNameMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.paradigma.grpc.streaming.ProductsByName,
                com.paradigma.grpc.streaming.Product>(
                  this, METHODID_SERVER_SIDE_STREAMING_GET_PRODUCTS_BY_NAME)))
          .addMethod(
            getClientSideStreamingCreateOrderMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.paradigma.grpc.streaming.Product,
                com.paradigma.grpc.streaming.Order>(
                  this, METHODID_CLIENT_SIDE_STREAMING_CREATE_ORDER)))
          .addMethod(
            getBidirectionalStreamingUpdateStockMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.paradigma.grpc.streaming.Stock,
                com.paradigma.grpc.streaming.StockByProduct>(
                  this, METHODID_BIDIRECTIONAL_STREAMING_UPDATE_STOCK)))
          .build();
    }
  }

  /**
   */
  public static final class StoreProviderStub extends io.grpc.stub.AbstractAsyncStub<StoreProviderStub> {
    private StoreProviderStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreProviderStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreProviderStub(channel, callOptions);
    }

    /**
     */
    public void unaryStreamingGetProductById(com.paradigma.grpc.streaming.ProductById request,
        io.grpc.stub.StreamObserver<com.paradigma.grpc.streaming.Product> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnaryStreamingGetProductByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serverSideStreamingGetProductsByName(com.paradigma.grpc.streaming.ProductsByName request,
        io.grpc.stub.StreamObserver<com.paradigma.grpc.streaming.Product> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getServerSideStreamingGetProductsByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.paradigma.grpc.streaming.Product> clientSideStreamingCreateOrder(
        io.grpc.stub.StreamObserver<com.paradigma.grpc.streaming.Order> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getClientSideStreamingCreateOrderMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.paradigma.grpc.streaming.Stock> bidirectionalStreamingUpdateStock(
        io.grpc.stub.StreamObserver<com.paradigma.grpc.streaming.StockByProduct> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getBidirectionalStreamingUpdateStockMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class StoreProviderBlockingStub extends io.grpc.stub.AbstractBlockingStub<StoreProviderBlockingStub> {
    private StoreProviderBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreProviderBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreProviderBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.paradigma.grpc.streaming.Product unaryStreamingGetProductById(com.paradigma.grpc.streaming.ProductById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnaryStreamingGetProductByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.paradigma.grpc.streaming.Product> serverSideStreamingGetProductsByName(
        com.paradigma.grpc.streaming.ProductsByName request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getServerSideStreamingGetProductsByNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StoreProviderFutureStub extends io.grpc.stub.AbstractFutureStub<StoreProviderFutureStub> {
    private StoreProviderFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreProviderFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreProviderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.paradigma.grpc.streaming.Product> unaryStreamingGetProductById(
        com.paradigma.grpc.streaming.ProductById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnaryStreamingGetProductByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UNARY_STREAMING_GET_PRODUCT_BY_ID = 0;
  private static final int METHODID_SERVER_SIDE_STREAMING_GET_PRODUCTS_BY_NAME = 1;
  private static final int METHODID_CLIENT_SIDE_STREAMING_CREATE_ORDER = 2;
  private static final int METHODID_BIDIRECTIONAL_STREAMING_UPDATE_STOCK = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StoreProviderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StoreProviderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UNARY_STREAMING_GET_PRODUCT_BY_ID:
          serviceImpl.unaryStreamingGetProductById((com.paradigma.grpc.streaming.ProductById) request,
              (io.grpc.stub.StreamObserver<com.paradigma.grpc.streaming.Product>) responseObserver);
          break;
        case METHODID_SERVER_SIDE_STREAMING_GET_PRODUCTS_BY_NAME:
          serviceImpl.serverSideStreamingGetProductsByName((com.paradigma.grpc.streaming.ProductsByName) request,
              (io.grpc.stub.StreamObserver<com.paradigma.grpc.streaming.Product>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLIENT_SIDE_STREAMING_CREATE_ORDER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientSideStreamingCreateOrder(
              (io.grpc.stub.StreamObserver<com.paradigma.grpc.streaming.Order>) responseObserver);
        case METHODID_BIDIRECTIONAL_STREAMING_UPDATE_STOCK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidirectionalStreamingUpdateStock(
              (io.grpc.stub.StreamObserver<com.paradigma.grpc.streaming.StockByProduct>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StoreProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StoreProviderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.paradigma.grpc.streaming.StorProviderProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StoreProvider");
    }
  }

  private static final class StoreProviderFileDescriptorSupplier
      extends StoreProviderBaseDescriptorSupplier {
    StoreProviderFileDescriptorSupplier() {}
  }

  private static final class StoreProviderMethodDescriptorSupplier
      extends StoreProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StoreProviderMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StoreProviderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StoreProviderFileDescriptorSupplier())
              .addMethod(getUnaryStreamingGetProductByIdMethod())
              .addMethod(getServerSideStreamingGetProductsByNameMethod())
              .addMethod(getClientSideStreamingCreateOrderMethod())
              .addMethod(getBidirectionalStreamingUpdateStockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
