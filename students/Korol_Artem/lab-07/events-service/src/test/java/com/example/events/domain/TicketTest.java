package com.example.events.domain;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import com.example.events.domain.entities.Ticket;

public class TicketTest {

    @Test
    void shouldCreateTicket() {

        Ticket ticket = new Ticket(
                1L,
                1L
        );

        assertNotNull(ticket);
    }
}