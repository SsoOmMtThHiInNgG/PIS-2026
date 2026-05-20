package com.example.events.application.service;

import com.example.events.application.port.in.GetScheduleUseCase;
import com.example.events.application.query.GetEventScheduleQuery;
import com.example.events.application.query.handler.GetEventScheduleHandler;
import com.example.events.domain.entities.Schedule;

public class EventService
        implements GetScheduleUseCase {

    private final GetEventScheduleHandler handler;

    public EventService(
            GetEventScheduleHandler handler
    ) {
        this.handler = handler;
    }

    @Override
    public Schedule getSchedule(Long eventId) {

        return handler.handle(
                new GetEventScheduleQuery(eventId)
        );
    }
}