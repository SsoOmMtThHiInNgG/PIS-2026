package com.example.events.application.command.handler;

import com.example.events.application.command.handler.CreateTicketHandler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreateTicketHandlerTest {

    @Test
    void shouldCreateHandler() {

        CreateTicketHandler handler =
                new CreateTicketHandler(null);

        assertNotNull(handler);
    }
}