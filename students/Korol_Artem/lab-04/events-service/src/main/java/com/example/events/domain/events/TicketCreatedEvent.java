package com.example.events.domain.events;
import com.example.events.domain.entities.Event;

import java.time.Instant;

public class TicketCreatedEvent
    implements DomainEvent {

    private final Long ticketId;
    private final Long eventId;
    private final Instant occurredOn;

    public TicketCreatedEvent(
        Long ticketId,
        Long eventId
    ) {

        this.ticketId = ticketId;
        this.eventId = eventId;
        this.occurredOn = Instant.now();
    }

    @Override
    public Instant occurredOn() {
        return occurredOn;
    }
}