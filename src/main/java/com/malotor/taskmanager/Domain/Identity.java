package com.malotor.taskmanager.Domain;

abstract public class Identity {

    private String value;

    public Identity(String value) {
        this.value = value;
    }

    public String id()
    {
        return this.value;
    }

    @Override
    public String toString() {
        return this.id();
    }
}
