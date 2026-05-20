package com.example.events.infrastructure.adapter.in;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @PostMapping
    public String buyTicket() {
        return "Ticket created";
    }
}