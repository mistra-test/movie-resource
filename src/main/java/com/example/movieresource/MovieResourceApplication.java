package com.example.movieresource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MovieResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieResourceApplication.class, args);
    }
}
