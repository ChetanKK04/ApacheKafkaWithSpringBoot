package com.kfka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ConsumerProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @KafkaListener(topics = "first-producer", groupId = "first-producer")
    public void consumeAndForward(String message) {
        String enriched = message + " - processed";
        System.out.println("ConsumerProducer "+enriched);
        kafkaTemplate.send("Second-topic", enriched);
    }

}
