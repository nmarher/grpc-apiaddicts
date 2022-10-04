package com.apiaddicts.grpc.streaming;

import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.apiaddicts.grpc.streaming.Product;
import com.apiaddicts.grpc.streaming.ProductById;
import com.apiaddicts.grpc.streaming.ProductsByName;
import com.apiaddicts.grpc.streaming.Stock;
import com.apiaddicts.grpc.streaming.Order;
import com.apiaddicts.grpc.streaming.Order.Builder;
import com.google.type.Date;
import io.grpc.stub.StreamObserver;

public class StoreService extends StoreProviderGrpc.StoreProviderImplBase {

    private static final Logger logger = LoggerFactory.getLogger(StoreService.class.getName());

        StoreService() {
        }
        
        @Override
        public void unaryStreamingGetProductById(ProductById request, StreamObserver<Product> responseObserver) {
        	
        	Random random = new Random();
            Product response = Product.newBuilder()
                .setProductId(request.getProductId())
                .setProductName(RandomStringUtils.randomAlphanumeric(10))
                .setProductDescription(RandomStringUtils.randomAlphanumeric(10))
                .setProductPrice(random.nextDouble())
                .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void serverSideStreamingGetProductsByName(ProductsByName request, StreamObserver<Product> responseObserver) {

            for (int i = 1; i <= 5; i++) {
            	Random random = new Random();
            	Product product = Product.newBuilder()
            		.setProductId(RandomStringUtils.randomAlphanumeric(10))
            		.setProductName(request.getProductName() + " "+ RandomStringUtils.randomAlphanumeric(10))
            		.setProductDescription(RandomStringUtils.randomAlphanumeric(20))
            		.setProductPrice(random.nextDouble())
                    .build();
                responseObserver.onNext(product);
            }
            responseObserver.onCompleted();
        }
        
        @Override
        public StreamObserver<Product> clientSideStreamingCreateOrder(final StreamObserver<Order> responseObserver) {
            return new StreamObserver<Product>() {
            	
                int count;
                double price = 0.0;
                
                @Override
                public void onNext(Product product) {
                    count++;
                    price = price + product.getProductPrice();
                    
                }

                @Override
                public void onCompleted() {
                	
                	LocalDate currentDate = LocalDate.now();
                	Date orderDate = Date.newBuilder()
                	.setDay(currentDate.getDayOfMonth())
                	.setMonth(currentDate.getMonthValue())
                	.setYear(currentDate.getYear())
                	.build();
                	
                	Order order = Order.newBuilder()
                	.setOrderId(RandomStringUtils.randomAlphanumeric(10))
                	.setOrderStatus("Pending")
                	.setOrderDate(orderDate)
                	.setItemsNumber(count)
                	.setTotalAmount(price)
                	.build();

                    responseObserver.onNext(order);
                    responseObserver.onCompleted();
                }

				@Override
				public void onError(Throwable t) {
					logger.warn("error:{}", t.getMessage());
					
				}

            };
        }
    
	    @Override
	    public StreamObserver<Stock> bidirectionalStreamingUpdateStock(final StreamObserver<StockByProduct> responseObserver) {
	        return new StreamObserver<Stock>() {
	        	
	        	@Override
				public void onNext(Stock stock) {
	        		Random random = new Random();
	        		StockByProduct stockByProduct = StockByProduct.newBuilder()
	        				.setProductId(stock.getProductId())
	        				.setProductName(RandomStringUtils.randomAlphanumeric(10))
	        				.setProductDescription(RandomStringUtils.randomAlphanumeric(10))
	        				.setProductPrice(random.nextDouble())
	        				.setItemsNumber(stock.getItemsNumber()+100)
                            .build();
                        responseObserver.onNext(stockByProduct);
					
				}
	        	
	            @Override
	            public void onCompleted() {
	                responseObserver.onCompleted();
	            }
	
	            @Override
	            public void onError(Throwable t) {
	                logger.warn("error:{}", t.getMessage());
	            }

	        };
	    }
 
}