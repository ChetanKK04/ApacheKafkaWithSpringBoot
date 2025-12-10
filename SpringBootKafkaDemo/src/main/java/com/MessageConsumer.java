package com;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @KafkaListener(topics = "SendingString", groupId = "string-group")
    public void listenToString(String messageReceived) {
        System.out.println("Message received is " + messageReceived);
    }

}