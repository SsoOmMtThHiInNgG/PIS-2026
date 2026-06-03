package com.example.ticket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @GetMapping
    public String getTickets() {
        return "Ticket Service Works";
    }

    @PostMapping
    public String createTicket() {
        return "Ticket Created";
    }
}