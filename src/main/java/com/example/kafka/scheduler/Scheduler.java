package com.example.kafka.scheduler;

import com.example.kafka.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    @Autowired
    private MessageProducer messageProducer;

    @Scheduled(fixedDelay = 10000)
    public void run() {
        messageProducer.sendMessage("my-topic", "hey");
    }

}
