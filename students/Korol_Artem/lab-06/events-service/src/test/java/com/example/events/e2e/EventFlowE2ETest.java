package com.example.events.e2e;

import com.example.events.application.command.CreateTicketCommand;
import com.example.events.application.command.handler.CreateTicketHandler;
import com.example.events.infrastructure.adapter.out.InMemoryTicketRepository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EventFlowE2ETest {

    @Test
    void shouldCreateTicketFlow() {

        InMemoryTicketRepository repository =
                new InMemoryTicketRepository();

        CreateTicketHandler handler =
                new CreateTicketHandler(
                        repository
                );

        var ticket =
                handler.handle(
                        new CreateTicketCommand(
                                1L,
                                1L,
                                1
                        )
                );

        assertNotNull(ticket);
    }
}