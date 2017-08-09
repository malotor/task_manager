package com.malotor.taskmanager.Domain;

public class TaskDTO {

    public String id;

    public String name;

    public String description;

    public String dueDate;


    public TaskDTO(Task task) {
        this.id = task.get$id().toString();
        this.name = task.get$name();
        this.description = task.get$description();
        this.dueDate = task.get$dueDate().toString();
    }
}
