package org.example.rabbitlistener;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.event.WebcrawlerMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class YoutubeListener {

    @RabbitListener(queues = {"${service-rabbit.youtube-routing-key}"}, ackMode = "AUTO")
    public void getMessage(WebcrawlerMessage[] messageArray){
        log.info("Youtube: {}", messageArray);
    }
}
