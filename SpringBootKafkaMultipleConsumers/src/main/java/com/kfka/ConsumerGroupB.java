package com.kfka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerGroupB {

    @KafkaListener(topics = "multi-topic", groupId = "groupB")
    public void consume(String message) {
        System.out.println("Group B received: " + message);
    }
}
