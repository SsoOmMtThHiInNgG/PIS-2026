package com.example.events.cqrs;

import com.example.events.cqrs.projection.TicketProjection;
import com.example.events.cqrs.read_model.TicketView;
import com.example.events.domain.events.TicketCreatedEvent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicketProjectionTest {

    @Test
    void shouldCreateReadModel() {

        TicketProjection projection =
                new TicketProjection();

        TicketCreatedEvent event =
                new TicketCreatedEvent(
                        1L,
                        10L,
                        100L
                );

        projection.on(event);

        TicketView view =
                projection.findById(1L);

        assertNotNull(view);

        assertEquals(
                10L,
                view.getEventId()
        );

        assertEquals(
                "CREATED",
                view.getStatus()
        );
    }
}