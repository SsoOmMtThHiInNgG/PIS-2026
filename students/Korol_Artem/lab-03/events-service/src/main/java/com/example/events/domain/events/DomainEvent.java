package com.example.events.domain.events;
import com.example.events.domain.entities.Event;

import java.time.Instant;

public interface DomainEvent {

    Instant occurredOn();
}