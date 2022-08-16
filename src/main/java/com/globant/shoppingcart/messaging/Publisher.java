package com.globant.shoppingcart.messaging;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Publisher {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public boolean postMessage(String msg){
        amqpTemplate.convertAndSend("testQueue", msg);
        return true;
    }
}