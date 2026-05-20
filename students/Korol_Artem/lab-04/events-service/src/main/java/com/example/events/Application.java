package com.example.events;

import com.example.events.domain.entities.Event;
import com.example.events.domain.entities.Ticket;
import com.example.events.domain.value_objects.EventTitle;
import com.example.events.domain.value_objects.Location;

public class Application {

    public static void main(String[] args) {

        Event event =
            new Event(
                1L,
                new EventTitle("Java Conference"),
                new Location("Minsk")
            );

        event.publish();

        Ticket ticket =
            new Ticket(1L, 1L);

        ticket.activate();

        System.out.println(
            "Lab 3 project started!"
        );

        System.out.println(
            "Ticket status: "
            + ticket.getStatus()
        );
    }
}