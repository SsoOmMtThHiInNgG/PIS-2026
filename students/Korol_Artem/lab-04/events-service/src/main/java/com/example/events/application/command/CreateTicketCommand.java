package com.example.events.application.command;

public final class CreateTicketCommand {

    private final Long eventId;
    private final Long userId;
    private final Integer seatNumber;

    public CreateTicketCommand(
            Long eventId,
            Long userId,
            Integer seatNumber
    ) {

        if (eventId == null || eventId <= 0) {
            throw new IllegalArgumentException("Invalid eventId");
        }

        if (userId == null || userId <= 0) {
            throw new IllegalArgumentException("Invalid userId");
        }

        if (seatNumber == null || seatNumber <= 0) {
            throw new IllegalArgumentException("Invalid seat");
        }

        this.eventId = eventId;
        this.userId = userId;
        this.seatNumber = seatNumber;
    }

    public Long getEventId() {
        return eventId;
    }

    public Long getUserId() {
        return userId;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }
}