package org.example.config.property;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "service-rabbit")
@Validated
@Data
public class MyRabbitProperties {
    @NotNull
    private String exchangeReceiverName;

    @NotNull
    private String exchangeSenderName;

    @NotNull
    private String telegramRoutingKey;

    @NotNull
    private String vkRoutingKey;

    @NotNull
    private String youtubeRoutingKey;

    @NotNull
    private String crawlerRoutingKey;
}

