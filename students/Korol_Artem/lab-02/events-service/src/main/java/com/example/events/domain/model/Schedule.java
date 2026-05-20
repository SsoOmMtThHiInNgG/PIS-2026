package com.example.events.domain.model;

import java.time.LocalDateTime;

public class Schedule {

    private LocalDateTime start;
    private LocalDateTime end;

    public Schedule() {
    }

    public Schedule(LocalDateTime start, LocalDateTime end) {
        this.start = start;
        this.end = end;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }
}