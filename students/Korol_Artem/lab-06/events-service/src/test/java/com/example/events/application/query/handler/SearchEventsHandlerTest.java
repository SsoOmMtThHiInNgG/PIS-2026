package com.example.events.application.query.handler;

import org.junit.jupiter.api.Test;
import com.example.events.application.query.handler.SearchEventsHandler;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SearchEventsHandlerTest {

    @Test
    void shouldCreateHandler() {

        SearchEventsHandler handler =
                new SearchEventsHandler(null);

        assertNotNull(handler);
    }
}