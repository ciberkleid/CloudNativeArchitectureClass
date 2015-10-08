package io.springbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringboxUIApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringboxUIApplication.class, args);
    }
}
