package com.example.events.application.query.handler;

import org.junit.jupiter.api.Test;
import com.example.events.application.query.handler.GetEventScheduleHandler;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GetEventScheduleHandlerTest {

    @Test
    void shouldCreateHandler() {

        GetEventScheduleHandler handler =
                new GetEventScheduleHandler(null);

        assertNotNull(handler);
    }
}   