package com.example.events.domain.events;

import java.time.Instant;

public class TicketCreatedEvent
        implements DomainEvent {

    private final Long ticketId;
    private final Long eventId;
    private final Long userId;
    private final Instant occurredOn;

    public TicketCreatedEvent(
            Long ticketId,
            Long eventId,
            Long userId
    ) {
        this.ticketId = ticketId;
        this.eventId = eventId;
        this.userId = userId;
        this.occurredOn = Instant.now();
    }

    public Long getTicketId() {
        return ticketId;
    }

    public Long getEventId() {
        return eventId;
    }

    public Long getUserId() {
        return userId;
    }

    @Override
    public Instant occurredOn() {
        return occurredOn;
    }
}