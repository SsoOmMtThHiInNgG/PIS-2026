package com.example.events.application.query.handler;

import com.example.events.application.port.out.ScheduleRepository;
import com.example.events.application.query.GetEventScheduleQuery;
import com.example.events.domain.entities.Schedule;

public class GetEventScheduleHandler {

    private final ScheduleRepository repository;

    public GetEventScheduleHandler(
            ScheduleRepository repository
    ) {
        this.repository = repository;
    }

    public Schedule handle(GetEventScheduleQuery query) {

        return repository.findByEventId(
                query.getEventId()
        );
    }
}