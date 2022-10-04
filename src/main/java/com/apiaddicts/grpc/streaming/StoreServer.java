package com.apiaddicts.grpc.streaming;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class StoreServer {

    private static final Logger logger = LoggerFactory.getLogger(StoreServer.class.getName());
    private final int port;
    private final Server server;
    
    public static void main(String[] args) throws Exception {
        StoreServer storeServer = new StoreServer(8980);
        storeServer.start();
        if (storeServer.server != null) {
            storeServer.server.awaitTermination();
        }
    }


    public StoreServer(int port) throws IOException {
        this.port = port;
        server = ServerBuilder.forPort(port)
            .addService(new StoreService())
            .build();
    }

    public void start() throws IOException {
        server.start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime()
            .addShutdownHook(new Thread() {
                @Override
                public void run() {
                    System.err.println("shutting down server");
                    try {
                        StoreServer.this.stop();
                    } catch (InterruptedException e) {
                        e.printStackTrace(System.err);
                    }
                    System.err.println("server shutted down");
                }
            });
    }

    public void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown()
                .awaitTermination(30, TimeUnit.SECONDS);
        }
    }
}