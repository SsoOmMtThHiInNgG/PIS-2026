package com.example.events.domain.events;

public class EventPublishedEvent {

    private final Long eventId;

    public EventPublishedEvent(Long eventId) {
        this.eventId = eventId;
    }

    public Long getEventId() {
        return eventId;
    }
}