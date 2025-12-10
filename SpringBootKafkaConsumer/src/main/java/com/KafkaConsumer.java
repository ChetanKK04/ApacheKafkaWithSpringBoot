package com;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "Testing", groupId = "test-kafka")
    public void consumeMessage(String message) {

        readMessage(message);
         System.out.println("Received message on KafkaConsumer: " + message);
    }

   public void readMessage(String message){

       System.out.println("readMessage to :"+message);

   }


}