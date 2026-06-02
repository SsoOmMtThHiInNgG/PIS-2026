package com.example.events.application.query;

public final class GetEventScheduleQuery {

    private final Long eventId;

    public GetEventScheduleQuery(Long eventId) {

        if (eventId == null || eventId <= 0) {
            throw new IllegalArgumentException();
        }

        this.eventId = eventId;
    }

    public Long getEventId() {
        return eventId;
    }
}