package com.kfka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerGroupC {

    @KafkaListener(topics = "multi-topic", groupId = "groupC")

    public void consume(String message) {
        System.out.println("Group C received: " + message);
    }
}
