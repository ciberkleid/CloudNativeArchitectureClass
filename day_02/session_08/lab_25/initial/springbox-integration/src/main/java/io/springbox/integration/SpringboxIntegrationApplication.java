package io.springbox.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class SpringboxIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringboxIntegrationApplication.class, args);
    }
}
