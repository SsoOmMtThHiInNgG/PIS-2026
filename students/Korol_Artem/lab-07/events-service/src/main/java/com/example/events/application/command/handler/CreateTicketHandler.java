package com.example.events.application.command.handler;

import com.example.events.application.command.CreateTicketCommand;
import com.example.events.application.port.out.TicketRepository;
import com.example.events.domain.entities.Ticket;

public class CreateTicketHandler {

    private final TicketRepository repository;

    public CreateTicketHandler(
            TicketRepository repository
    ) {
        this.repository = repository;
    }

    public Ticket handle(CreateTicketCommand command) {

        Ticket ticket = new Ticket(
            command.getEventId(),
            command.getUserId()
        );

        return repository.save(ticket);
    }
}