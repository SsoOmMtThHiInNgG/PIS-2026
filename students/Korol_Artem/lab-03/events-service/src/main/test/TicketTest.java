package tests;

import domain.entities.Ticket;
import domain.enums.TicketStatus;

public class TicketTest {

    public static void main(String[] args) {

        Ticket ticket =
            new Ticket(1L, 10L);

        ticket.activate();

        if (ticket.getStatus()
            != TicketStatus.ACTIVE) {

            throw new RuntimeException(
                "Test failed"
            );
        }

        System.out.println(
            "TicketTest passed"
        );
    }
}