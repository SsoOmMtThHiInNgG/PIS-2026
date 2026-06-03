package com.example.notification.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationConsumer {

    @RabbitListener(
        queues = "notification.queue"
    )
    public void receive(
        String message
    ) {

        System.out.println(
            "Notification received: "
            + message
        );
    }
}