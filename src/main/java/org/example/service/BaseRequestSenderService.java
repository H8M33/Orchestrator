package org.example.service;

import ch.qos.logback.core.util.FixedDelay;
import lombok.RequiredArgsConstructor;
import org.example.config.property.MyRabbitProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
@RequiredArgsConstructor
@EnableScheduling
public class BaseRequestSenderService implements RequestSenderService{

    private final RabbitTemplate template;
    private final MyRabbitProperties properties;

    private Instant instant = LocalDateTime.of(2022,1,1,0,0,0).toInstant(ZoneOffset.UTC);
    @Override
    @Scheduled(fixedDelay = 3600000)
    public void sendRequest() {
        template.convertAndSend(
                properties.getExchangeSenderName(),
                instant
        );
        instant = Instant.now();
    }
}
