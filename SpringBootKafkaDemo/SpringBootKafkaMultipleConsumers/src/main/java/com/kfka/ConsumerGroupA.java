package com.kfka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerGroupA {

    @KafkaListener(topics = "multi-topic", groupId = "groupA")

    public void consume(String message) {
        System.out.println("Group A received: " + message);
    }
}
