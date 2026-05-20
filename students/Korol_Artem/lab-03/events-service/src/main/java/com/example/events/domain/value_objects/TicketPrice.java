package com.example.events.domain.value_objects;

public record TicketPrice(Double value) {

    public TicketPrice {

        if (value == null || value <= 0)
            throw new IllegalArgumentException(
                "Ticket price must be positive"
            );
    }
}