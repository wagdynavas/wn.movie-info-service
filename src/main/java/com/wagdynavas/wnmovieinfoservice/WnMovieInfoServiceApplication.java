package com.wagdynavas.wnmovieinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WnMovieInfoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WnMovieInfoServiceApplication.class, args);
    }

}
