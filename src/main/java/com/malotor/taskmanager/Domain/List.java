package com.malotor.taskmanager.Domain;

public class List {

    private ListId id;
    private String name;

    public List(ListId id, String name) {
        this.id = id;
        this.name = name;
    }

    public ListId getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
