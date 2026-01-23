package com.bkseducate.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.bkseducate")
public class MiappApplication {
    public static void main(String[] args) {
        SpringApplication.run(MiappApplication.class, args);
    }
}
