package com.example.events.domain.value_objects;

import java.time.LocalDateTime;

public record EventTimeSlot(
    LocalDateTime start,
    LocalDateTime end
) {

    public EventTimeSlot {

        if (start == null || end == null)
            throw new IllegalArgumentException();

        if (!start.isBefore(end))
            throw new IllegalArgumentException(
                "Start must be before end"
            );
    }

    public boolean overlaps(
        EventTimeSlot other
    ) {

        return start.isBefore(other.end())
            && other.start().isBefore(end);
    }
}