package com.example.events.application.service;

import com.example.events.application.port.in.BuyTicketUseCase;

public class TicketService implements BuyTicketUseCase {

    @Override
    public Long buy(Long eventId) {
        return 1L;
    }
}