package com.malotor.taskmanager.Domain;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Transient
    private TaskId taskId;

    private String name;

    private String description;

    private Date dueDate;

    @Embedded
    private UserId user;

    public Task(String name, String description, Date dueDate, UserId user) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.user = user;
    }

    // JPA
    protected Task() {}

    public Long getId() {

        return id;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getDueDate() {
        return dueDate;
    }


    public TaskId getTaskId() {

         if (null == taskId) {
            taskId = new TaskId(this.getId().toString());
         }

         return taskId;
    }


    @Override
    public String toString() {
        return String.format(
                "Task[id=%d, name='%s', lastName='%s']",
                id, name);
    }
}
