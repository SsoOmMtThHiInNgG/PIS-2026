package com.example.events.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class EventController {

    @GetMapping
    public String getEvents() {
        return "Event Service Works";
    }

    @PostMapping
    public String createEvent() {
        return "Event Created";
    }
}