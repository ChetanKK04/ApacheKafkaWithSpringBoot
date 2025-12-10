package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/api")
public class MessageSendController {

    @Autowired
    MessageProducer messageProducer;

    @GetMapping(value = "/producer")
    public String sendMessage(@RequestParam("message") String message)
    {
        messageProducer.sendMessageToTopic(message);
        return "Message sent Successfully to the your code decode topic " + message;
    }


}