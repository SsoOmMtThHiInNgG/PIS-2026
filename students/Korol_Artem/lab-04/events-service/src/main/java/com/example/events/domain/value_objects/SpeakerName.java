package com.example.events.domain.value_objects;

public record SpeakerName(String value) {

    public SpeakerName {

        if (value == null || value.isBlank())
            throw new IllegalArgumentException(
                "Speaker name cannot be empty"
            );
    }
}