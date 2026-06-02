package com.example.events.cqrs.projection;

import com.example.events.cqrs.read_model.TicketView;
import com.example.events.domain.events.TicketCreatedEvent;

import java.util.HashMap;
import java.util.Map;

public class TicketProjection {

    private final Map<Long, TicketView> views =
            new HashMap<>();

    public void on(
            TicketCreatedEvent event
    ) {

        TicketView view =
                new TicketView(
                        event.getTicketId(),
                        event.getEventId(),
                        event.getUserId(),
                        "CREATED"
                );

        views.put(
                event.getTicketId(),
                view
        );
    }

    public TicketView findById(
            Long id
    ) {
        return views.get(id);
    }
}