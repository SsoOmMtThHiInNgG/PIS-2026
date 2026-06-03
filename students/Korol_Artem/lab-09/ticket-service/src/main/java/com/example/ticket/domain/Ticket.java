package com.example.ticket.domain;

public class Ticket {

    private Long id;

    private Long eventId;

    public Ticket() {
    }

    public Ticket(
            Long id,
            Long eventId
    ) {

        this.id = id;
        this.eventId = eventId;
    }

    public Long getId() {
        return id;
    }

    public Long getEventId() {
        return eventId;
    }
}