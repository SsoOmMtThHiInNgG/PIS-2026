package com.example.events.domain.entities;

import com.example.events.domain.enums.TicketStatus;
import com.example.events.domain.events.DomainEvent;
import com.example.events.domain.events.TicketActivatedEvent;
import com.example.events.domain.events.TicketCancelledEvent;
import com.example.events.domain.events.TicketCreatedEvent;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

    private final Long id;

    private final Long eventId;

    private TicketStatus status =
        TicketStatus.CREATED;

    private final List<DomainEvent> events =
        new ArrayList<>();

    public Ticket(
        Long id,
        Long eventId
    ) {

        if (id == null)
            throw new IllegalArgumentException();

        if (eventId == null)
            throw new IllegalArgumentException();

        this.id = id;
        this.eventId = eventId;

        events.add(
            new TicketCreatedEvent(
                id,
                eventId
            )
        );
    }

    public void activate() {

        if (status == TicketStatus.ACTIVE)
            throw new IllegalStateException();

        status = TicketStatus.ACTIVE;

        events.add(
            new TicketActivatedEvent(id)
        );
    }

    public void cancel() {

        if (status == TicketStatus.USED)
            throw new IllegalStateException();

        status = TicketStatus.CANCELLED;

        events.add(
            new TicketCancelledEvent(id)
        );
    }

    public TicketStatus getStatus() {
        return status;
    }

    public List<DomainEvent> getEvents() {
        return List.copyOf(events);
    }
}