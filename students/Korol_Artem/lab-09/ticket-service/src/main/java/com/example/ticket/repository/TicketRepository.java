package com.example.ticket.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.ticket.domain.Ticket;

public class TicketRepository {

    private final List<Ticket> tickets =
            new ArrayList<>();

    public void save(
            Ticket ticket
    ) {

        tickets.add(ticket);
    }

    public List<Ticket> findAll() {

        return tickets;
    }
}