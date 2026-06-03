package com.example.ticket.grpc;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TicketGrpcService {

    public String createTicket(
            Long ticketId,
            Long eventId
    ) {

        return "Ticket created: "
                + ticketId
                + " for event "
                + eventId;
    }

    public List<String> streamTickets() {

        return List.of(
                "Ticket 1",
                "Ticket 2",
                "Ticket 3"
        );
    }
}