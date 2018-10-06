package com.poc.producer;

import com.poc.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    Producer producer;

    @PostMapping("/kafka/{topicName}")
    public String postMessage(@PathVariable String topicName, @RequestBody String message) {
        String result = producer.post(message);
        return result;
    }

}
