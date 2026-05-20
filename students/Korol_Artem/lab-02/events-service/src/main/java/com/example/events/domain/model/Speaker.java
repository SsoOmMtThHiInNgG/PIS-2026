package com.example.events.domain.model;

public class Speaker {

    private Long id;
    private String name;

    public Speaker() {
    }

    public Speaker(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}