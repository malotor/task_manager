package com.malotor.taskmanager.Domain;

public class TaskId extends Identity {

    public TaskId(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return this.id();
    }
}
