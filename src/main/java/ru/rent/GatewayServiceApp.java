package ru.rent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class GatewayServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApp.class, args);
    }
}
