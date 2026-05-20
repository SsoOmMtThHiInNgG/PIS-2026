package com.example.events.domain.value_objects;

public record EventTitle(String value) {

    public EventTitle {

        if (value == null || value.isBlank())
            throw new IllegalArgumentException(
                "Event title cannot be empty"
            );

        if (value.length() < 3)
            throw new IllegalArgumentException(
                "Event title too short"
            );
    }
}