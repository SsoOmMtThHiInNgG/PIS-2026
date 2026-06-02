package com.example.events.domain.events;
import com.example.events.domain.entities.Event;

import java.time.Instant;

public class TicketCancelledEvent
    implements DomainEvent {

    private final Long ticketId;
    private final Instant occurredOn;

    public TicketCancelledEvent(Long ticketId) {

        this.ticketId = ticketId;
        this.occurredOn = Instant.now();
    }

    @Override
    public Instant occurredOn() {
        return occurredOn;
    }
}