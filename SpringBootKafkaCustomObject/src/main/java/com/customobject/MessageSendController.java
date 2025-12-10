package com.customobject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/api")
public class MessageSendController {

    @Autowired
    UserMassageProducer userMassageProducer;

    @PostMapping(value = "/producer")
    public ResponseEntity sendMessage(@RequestBody User user)
    {
        userMassageProducer.sendUser(user);

        return ResponseEntity.ok( "Message sent Successfully to the your code decode topic " + user);
    }


}