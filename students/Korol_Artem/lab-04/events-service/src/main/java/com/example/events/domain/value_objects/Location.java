package com.example.events.domain.value_objects;

public record Location(String value) {

    public Location {

        if (value == null || value.isBlank())
            throw new IllegalArgumentException(
                "Location cannot be empty"
            );
    }
}