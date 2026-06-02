package com.example.events.domain.entities;

import com.example.events.domain.value_objects.SpeakerName;

public class Speaker {

    private final Long id;

    private SpeakerName name;

    public Speaker(
        Long id,
        SpeakerName name
    ) {

        if (id == null)
            throw new IllegalArgumentException();

        this.id = id;
        this.name = name;
    }

    public void rename(SpeakerName newName) {
        this.name = newName;
    }
}