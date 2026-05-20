package com.example.events.domain.entities;

import com.example.events.domain.events.EventPublishedEvent;
import com.example.events.domain.value_objects.EventTitle;
import com.example.events.domain.value_objects.Location;

import java.util.ArrayList;
import java.util.List;

public class Event {

    private final Long id;

    private EventTitle title;

    private Location location;

    private boolean published = false;

    private final List<Object> events =
        new ArrayList<>();

    public Event(
        Long id,
        EventTitle title,
        Location location
    ) {

        if (id == null)
            throw new IllegalArgumentException();

        this.id = id;
        this.title = title;
        this.location = location;
    }

    public void publish() {

        if (published)
            throw new IllegalStateException(
                "Already published"
            );

        published = true;

        events.add(
            new EventPublishedEvent(id)
        );
    }

    public void rename(EventTitle newTitle) {

        if (published)
            throw new IllegalStateException(
                "Cannot rename published event"
            );

        this.title = newTitle;
    }

    public boolean isPublished() {
        return published;
    }

    public List<Object> getEvents() {
        return List.copyOf(events);
    }
}