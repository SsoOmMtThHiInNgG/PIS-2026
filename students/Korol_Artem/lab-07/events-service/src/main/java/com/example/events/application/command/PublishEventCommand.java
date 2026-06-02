package com.example.events.application.command;

public final class PublishEventCommand {

    private final Long eventId;

    public PublishEventCommand(Long eventId) {

        if (eventId == null || eventId <= 0) {
            throw new IllegalArgumentException("Invalid eventId");
        }

        this.eventId = eventId;
    }

    public Long getEventId() {
        return eventId;
    }
}