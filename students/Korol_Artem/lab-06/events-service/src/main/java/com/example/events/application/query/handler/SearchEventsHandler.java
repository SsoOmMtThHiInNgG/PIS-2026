package com.example.events.application.query.handler;

import java.util.List;

import com.example.events.application.port.out.EventRepository;
import com.example.events.application.query.SearchEventsQuery;
import com.example.events.domain.entities.Event;

public class SearchEventsHandler {

    private final EventRepository repository;

    public SearchEventsHandler(
            EventRepository repository
    ) {
        this.repository = repository;
    }

    public List<Event> handle(SearchEventsQuery query) {

        return repository.searchByTitle(
                query.getText()
        );
    }
}