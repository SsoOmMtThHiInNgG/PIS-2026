package com.example.events.rabbitmq;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(
            "events.exchange"
        );
    }

    @Bean
    public Queue notificationQueue() {
        return new Queue(
            "notification.queue"
        );
    }

    @Bean
    public Binding binding(
        Queue notificationQueue,
        TopicExchange exchange
    ) {

        return BindingBuilder
            .bind(notificationQueue)
            .to(exchange)
            .with("#");
    }
}