package com.example.events.domain.value_objects;

import java.time.LocalDateTime;

public class EventTimeSlot {

    private final LocalDateTime start;
    private final LocalDateTime end;

    public EventTimeSlot(
            LocalDateTime start,
            LocalDateTime end
    ) {
        this.start = start;
        this.end = end;
    }

    public boolean overlaps(
            EventTimeSlot other
    ) {
        return start.isBefore(other.end)
                && end.isAfter(other.start);
    }
}