package com;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    private final KafkaProducer kafkaProducer;

    public MessageController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/send/post")
    public ResponseEntity sendMessageToKafkapOST(@RequestBody String message) {
        kafkaProducer.sendMessage(message);

        return ResponseEntity.ok(message);
    }

    @GetMapping("/send/get")
    public ResponseEntity<String> sendMessageToKafkaget(@RequestParam("message") String message) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok(message);
    }
}