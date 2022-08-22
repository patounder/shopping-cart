package com.globant.shoppingcart.messaging;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class Publisher {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Value("${publish.queue.name}")
    private String publishQueueName;

    public boolean postMessage(String msg){
        amqpTemplate.convertAndSend(this.publishQueueName, msg);
        return true;
    }
}
