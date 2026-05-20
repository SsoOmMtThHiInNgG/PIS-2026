package com.example.events.domain.model;

public class Event {

    private Long id;
    private String title;
    private String location;

    public Event() {
    }

    public Event(Long id, String title, String location) {
        this.id = id;
        this.title = title;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }
}