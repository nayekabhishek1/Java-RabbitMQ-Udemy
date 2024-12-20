package com.nayek.rabbitmq.consumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

//@Service
public class HelloRabbitConsumer {

    @RabbitListener(queues = "nayek.testqueue")
    public void listen(String message) {
        System.out.println("Message received from RabbitMQ : " + message);
    }
}
