package com.example.events.infrastructure.adapter.in;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @GetMapping("/events")
    public String events() {
        return "Events CQRS API";
    }
}