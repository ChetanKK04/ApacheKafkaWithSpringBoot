package com.kfka.consumererror;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerErrorService {


    @KafkaListener(topics = "Consumer-Error-topic", groupId = "error-group")
    public void consumeWithErrorHandling(String message) {
        System.out.println("Msg Rcvd ConsumerMSG :"+message);
        if (message.contains("error")){
            throw new RuntimeException("Error processing msg "+message);
        }
        //Normal processing logic here
            }
}