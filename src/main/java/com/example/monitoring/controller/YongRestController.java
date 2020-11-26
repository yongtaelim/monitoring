package com.example.monitoring.controller;

import com.example.monitoring.service.YongService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class YongRestController {

    private final YongService yongService;

    @GetMapping(value = "/yong/counter/increment")
    public String counterIncrement() {
        String increment = yongService.Increment();
        return increment;
    }
}
