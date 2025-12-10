package com.customobject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserMassageProducer {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void sendUser(User user) {

        kafkaTemplate.send("user-topic", user);
    }


}
