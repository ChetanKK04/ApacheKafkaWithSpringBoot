package com.kfka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class MyController {

    @Autowired
    ProducerMsg producerMsg;

    @GetMapping("/getcall")
    public String getMethod(@RequestParam("message") String msg) {
        producerMsg.sendMessageToTopic(msg);
        return "Get api"+ msg;
    }
    @PostMapping("/postcall")
    public String postMethod(@RequestBody String msg) {
        producerMsg.sendMessageToTopic(msg);
        return "Post api"+ msg;
    }
}
