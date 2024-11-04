package com.mouakkal.discouvery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication @EnableEurekaServer

public class DiscouveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscouveryApplication.class, args);
    }

}
