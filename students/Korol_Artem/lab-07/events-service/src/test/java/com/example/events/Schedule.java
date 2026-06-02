package com.example.events;

import com.example.events.domain.value_objects.EventTimeSlot;

import java.util.ArrayList;
import java.util.List;

public class Schedule {

    private final Long id;

    private final List<EventTimeSlot> slots =
        new ArrayList<>();

    private boolean locked = false;

    public Schedule(Long id) {

        if (id == null)
            throw new IllegalArgumentException();

        this.id = id;
    }

    public void addSlot(
        EventTimeSlot slot
    ) {

        if (locked)
            throw new IllegalStateException();

        for (EventTimeSlot existing : slots) {

            if (existing.overlaps(slot))
                throw new IllegalStateException(
                    "Slot overlap"
                );
        }

        slots.add(slot);
    }

    public void lock() {

        if (locked)
            throw new IllegalStateException();

        locked = true;
    }
}