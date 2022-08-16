package com.globant.shoppingcart.messaging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Publisher {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Value("${queue.name}")
    private String queueName;

    public boolean postMessage(String msg){
        amqpTemplate.convertAndSend(this.queueName, msg);
        return true;
    }
}
