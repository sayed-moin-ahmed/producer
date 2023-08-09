package com.producer.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Producer {

    @Autowired
    Publisher publisher;

    @GetMapping("/publish")
    public ResponseEntity<String> sendMessage(){
        publisher.sendMessage("users","Hello World");
        return ResponseEntity.ok("Success");
    }


}
