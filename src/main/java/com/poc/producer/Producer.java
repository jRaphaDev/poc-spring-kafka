package com.poc.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class Producer {

    @Autowired
    private KafkaTemplate<String, String> template;

    @Value("${app.topic.poc}")
    String TOPIC;

    public String post(String message) {
        System.out.println("sending: " + message + " sent to topic: " + TOPIC);
        template.send(TOPIC, message);
        return "Message Posted";
    }
}
