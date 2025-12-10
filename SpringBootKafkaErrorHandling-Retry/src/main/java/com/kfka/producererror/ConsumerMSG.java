package com.kfka.producererror;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerMSG {


    @KafkaListener(topics = "Producer-Error-topic", groupId = "error-group")
    public void consumemsg(String message) {
        System.out.println("Msg Rcvd ConsumerMSG :"+message);
            }
}