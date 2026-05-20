package com.example.events.domain.events;
import com.example.events.domain.entities.Event;

import java.time.Instant;

public class EventPublishedEvent
    implements DomainEvent {

    private final Long eventId;
    private final Instant occurredOn;

    public EventPublishedEvent(Long eventId) {

        this.eventId = eventId;
        this.occurredOn = Instant.now();
    }

    @Override
    public Instant occurredOn() {
        return occurredOn;
    }
}