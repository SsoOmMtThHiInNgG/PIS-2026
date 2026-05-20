package com.example.events.domain;

import com.example.events.domain.entities.Event;
import com.example.events.domain.value_objects.EventTitle;
import com.example.events.domain.value_objects.Location;

public class EventTest {

    public static void main(String[] args) {

        Event event =
            new Event(
                1L,
                new EventTitle("JavaConf"),
                new Location("Minsk")
            );

        event.publish();

        if (!event.isPublished()) {

            throw new RuntimeException(
                "Test failed"
            );
        }

        System.out.println(
            "EventTest passed"
        );
    }
}