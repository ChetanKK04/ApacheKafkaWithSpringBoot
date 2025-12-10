package com.customobject;

import org.springframework.kafka.annotation.KafkaListener;

public class UserMassageConsumer {

    @KafkaListener(topics = "user-topic", groupId = "group-1")
    public void consume(User user) {
        System.out.println("Received User Consumer : " + user);
    }

}
