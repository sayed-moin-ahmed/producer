package com.producer.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Producer {

    @Autowired
    Publisher publisher;

    @PostMapping("/publish")
    public ResponseEntity.BodyBuilder sendMessage(@RequestParam("topic") final String topic, @RequestParam("message") final String message){
        publisher.sendMessage(topic,message);
        return ResponseEntity.ok();
    }


}
