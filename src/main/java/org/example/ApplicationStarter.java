package org.example;

import org.example.config.property.DatabaseProperties;
import org.example.config.property.MyRabbitProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.time.Instant;

@EnableConfigurationProperties({MyRabbitProperties.class, DatabaseProperties.class})
@SpringBootApplication
public class ApplicationStarter {

    public static void main(String[] args) {
        System.out.println(Instant.ofEpochMilli(1677342000000L));
        SpringApplication.run(ApplicationStarter.class, args);
    }

}
