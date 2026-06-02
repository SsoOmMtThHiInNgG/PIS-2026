package com.example.events.cqrs.write_model;

import com.example.events.domain.events.TicketCreatedEvent;

import java.util.ArrayList;
import java.util.List;

public class TicketAggregate {

    private Long ticketId;

    private Long eventId;

    private Long userId;

    private String status;

    private final List<Object> domainEvents =
            new ArrayList<>();

    public TicketAggregate(
            Long ticketId,
            Long eventId,
            Long userId
    ) {

        this.ticketId = ticketId;
        this.eventId = eventId;
        this.userId = userId;
        this.status = "CREATED";

        domainEvents.add(
                new TicketCreatedEvent(
                        ticketId,
                        eventId,
                        userId
                )
        );
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

    public String getStatus() {
        return status;
    }

    public List<Object> getDomainEvents() {
        return List.copyOf(domainEvents);
    }
}