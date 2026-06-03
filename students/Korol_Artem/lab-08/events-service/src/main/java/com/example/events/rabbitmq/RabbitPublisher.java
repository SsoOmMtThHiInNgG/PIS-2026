package com.example.events.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class RabbitPublisher {

    private final RabbitTemplate rabbitTemplate;

    public RabbitPublisher(
        RabbitTemplate rabbitTemplate
    ) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void publish(
        String routingKey,
        String message
    ) {

        rabbitTemplate.convertAndSend(
            "events.exchange",
            routingKey,
            message
        );
    }
}