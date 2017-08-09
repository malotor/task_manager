package com.malotor.taskmanager.Domain;

abstract public class Indentificable {

    private String id;

    public String id() {
        return id;
    }

    public void set$id(String $id) {
        this.id = $id;
    }
}
