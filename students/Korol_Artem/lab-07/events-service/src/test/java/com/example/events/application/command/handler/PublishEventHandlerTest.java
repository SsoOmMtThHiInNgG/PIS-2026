package com.example.events.application.command.handler;

import org.junit.jupiter.api.Test;
import com.example.events.application.command.handler.PublishEventHandler;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PublishEventHandlerTest {

    @Test
    void shouldCreateHandler() {

        PublishEventHandler handler =
                new PublishEventHandler(null);

        assertNotNull(handler);
    }
}