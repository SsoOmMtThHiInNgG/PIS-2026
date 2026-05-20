package com.example.events.domain.model;

public class Ticket {

    private Long id;
    private Long eventId;
    private Double price;

    public Ticket() {
    }

    public Ticket(Long id, Long eventId, Double price) {
        this.id = id;
        this.eventId = eventId;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public Long getEventId() {
        return eventId;
    }

    public Double getPrice() {
        return price;
    }
}