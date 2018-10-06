package com.poc.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    private static final Logger LOG = LoggerFactory.getLogger(Consumer.class);

    final String TOPIC = "topic";

    @KafkaListener(topics = TOPIC)
    public String get(@Payload String message) {
        LOG.info("receving: " + message);
        return message;
    }
}
