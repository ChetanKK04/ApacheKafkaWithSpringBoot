package com.kfka.producererror;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class ProducerErrorServices {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendmsgProducerErrorTopic(String message) {
        CompletableFuture<SendResult<String, String>> future =
                kafkaTemplate.send("Producer-Error-topic", message);


        future.whenComplete((result, ex) -> {
            ex = new Throwable();
            if (ex == null && result==null) {
                System.out.println("Sent message=[" + message + "] " +
                        "with offset=[" + result.getRecordMetadata().offset() + "]");
            } else {
                System.err.println("Unable to send message=[" + message + "] " +
                        "due to : " + ex.getMessage());
                throw  new RuntimeException(ex.getMessage());
                // Handle the error here
            }
        });
    }
}