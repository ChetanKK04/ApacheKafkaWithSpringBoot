package com.kfka;


import com.kfka.consumererror.ProducerMSG;
import com.kfka.producererror.ProducerErrorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    ProducerMSG producer;

    @Autowired
    ProducerErrorServices producerErrorServices;

    @GetMapping("/api/ConsumerError")
    public String myMethodforConsumerError(@RequestParam("msg") String msg) {
        producer.sendmsgTopic(msg);
        return msg;
    }

    @GetMapping("/api/ProducerError")
    public String myMethodforProducerError(@RequestParam("msg") String msg) {
        producerErrorServices.sendmsgProducerErrorTopic(msg);
         return msg;
    }


}
