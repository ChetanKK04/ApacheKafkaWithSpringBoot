package com.kfka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ChainedProcessing")
public class ChainedProcessingController {

    @Autowired
    Producer producer;

    @GetMapping("chainStart")
   public String getChainedProcessing(@RequestParam("msg")String msg){
       System.out.println("controller hit");
       producer.sendMessage(msg);
       return "controller getChainedProcessing"+msg;
    }
}
