package com.globant.shoppingcart.messaging;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Value("${queue.name}")
    private String queueName;
    @Bean
    public Queue myQueue() {
        return new Queue(this.queueName, false);
    }
}
