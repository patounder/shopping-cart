package com.globant.shoppingcart.messaging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Listener {

    @RabbitListener(queues = "${queue.name}")
    public void listen(String in) {
        log.info("Message read from testQueue: {} ", in);
    }
}
