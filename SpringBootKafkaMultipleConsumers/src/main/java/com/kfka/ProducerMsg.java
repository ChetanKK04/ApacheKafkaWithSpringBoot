package com.kfka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerMsg {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    public void sendMessageToTopic(String message) {
        kafkaTemplate.send("multi-topic", message);
        System.out.println("ProducerMsg  "+ message);
    }
}
