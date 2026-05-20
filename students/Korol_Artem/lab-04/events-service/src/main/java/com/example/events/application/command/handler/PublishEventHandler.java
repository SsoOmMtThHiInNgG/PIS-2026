package com.example.events.application.command.handler;

import com.example.events.application.command.PublishEventCommand;
import com.example.events.application.port.out.EventRepository;
import com.example.events.domain.entities.Event;

public class PublishEventHandler {

    private final EventRepository repository;

    public PublishEventHandler(
            EventRepository repository
    ) {
        this.repository = repository;
    }

    public Event handle(PublishEventCommand command) {

        Event event = repository.findById(
                command.getEventId()
        );

        event.publish();

        return repository.save(event);
    }
}