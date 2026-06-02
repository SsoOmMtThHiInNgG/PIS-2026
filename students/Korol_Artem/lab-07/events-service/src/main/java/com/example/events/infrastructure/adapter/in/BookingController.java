package com.example.events.infrastructure.adapter.in;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @GetMapping("/tickets")
    public String tickets() {
        return "Tickets CQRS API";
    }
}