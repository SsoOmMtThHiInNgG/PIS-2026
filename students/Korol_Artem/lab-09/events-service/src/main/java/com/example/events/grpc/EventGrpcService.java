package com.example.events.grpc;

import org.springframework.stereotype.Service;

@Service
public class EventGrpcService {

    public String publishEvent(
            Long eventId,
            String title
    ) {

        return "Event published: "
                + eventId
                + " "
                + title;
    }

    public String getEvent(
            Long eventId
    ) {

        return "Event: "
                + eventId;
    }
}