package com.example.events.cqrs.read_model;

public class TicketView {

    private Long ticketId;
    private Long eventId;
    private Long userId;
    private String status;

    public TicketView() {
    }

    public TicketView(
            Long ticketId,
            Long eventId,
            Long userId,
            String status
    ) {
        this.ticketId = ticketId;
        this.eventId = eventId;
        this.userId = userId;
        this.status = status;
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
}