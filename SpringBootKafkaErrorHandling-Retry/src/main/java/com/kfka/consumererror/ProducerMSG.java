package com.kfka.consumererror;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerMSG {
    @Autowired
   private KafkaTemplate<String,String> kafkaTemplate;

       public void sendmsgTopic(String msg){
           kafkaTemplate.send("Consumer-Error-topic",msg);
           System.out.println("Its in ProducerMSG ");
       }
}
