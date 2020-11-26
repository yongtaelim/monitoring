package com.example.monitoring.service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YongService {
    private Counter counter;

    @Autowired
    public YongService(MeterRegistry registry) {
        this.counter = registry.counter("yong.counter", Tags.of("study", "run"));
    }

    public String Increment() {
        counter.increment();
        return "increment success.";
    }
}
