package com.example.events.integration;

import com.example.events.infrastructure.adapter.out.InMemoryEventRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EventRepositoryIntegrationTest {

    @Test
    void shouldReturnEvents() {

        InMemoryEventRepository repository =
                new InMemoryEventRepository();

        assertNotNull(
                repository.findAll()
        );
    }
}