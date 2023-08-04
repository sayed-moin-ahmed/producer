package com.producer.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Publisher {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(final String topic, final String message) {
        log.info("Topic : {} and Message : {}",topic, message);
        this.kafkaTemplate.send(topic, message);
    }

}
