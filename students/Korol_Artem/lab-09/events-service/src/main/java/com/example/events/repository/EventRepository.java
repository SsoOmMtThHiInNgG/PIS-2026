package com.example.events.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.events.domain.Event;

public class EventRepository {

    private final List<Event> events =
            new ArrayList<>();

    public void save(
            Event event
    ) {

        events.add(event);
    }

    public List<Event> findAll() {

        return events;
    }
}