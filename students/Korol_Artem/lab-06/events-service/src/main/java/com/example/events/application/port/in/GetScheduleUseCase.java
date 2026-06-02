package com.example.events.application.port.in;

import com.example.events.domain.entities.Schedule;

public interface GetScheduleUseCase {

    Schedule getSchedule(Long eventId);
}