package com.example.events.application.query;

public final class SearchEventsQuery {

    private final String text;

    public SearchEventsQuery(String text) {

        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException();
        }

        this.text = text;
    }

    public String getText() {
        return text;
    }
}