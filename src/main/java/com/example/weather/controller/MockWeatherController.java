package com.example.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class MockWeatherController {

    @GetMapping("/api/weather")
    public Map<String, Object> weather(@RequestParam String city) {

        // mock data (no external API calls)
        return Map.of(
                "success", true,
                "city", city,
                "temp", 26,
                "status", "晴",
                "wind", "3级",
                "humidity", "55%",
                "update_time", LocalDateTime.now().toString()
        );
    }
}
