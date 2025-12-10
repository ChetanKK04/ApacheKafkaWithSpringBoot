package com.kfka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @KafkaListener(topics = "Second-topic", groupId = "Second-producer")
    public void consumeAndForward(String message) {

        System.out.println("Second topic "+message);
    }

}
