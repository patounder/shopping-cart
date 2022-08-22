package com.globant.shoppingcart.messaging;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@Configuration
public class RabbitMQConfig {

    @Value("${listen.queue.name}")
    private String queueName;
    @Bean
    public Queue myQueue() {
        return new Queue(this.queueName, false);
    }
}
