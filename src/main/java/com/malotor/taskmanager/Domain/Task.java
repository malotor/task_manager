package com.malotor.taskmanager.Domain;

import java.util.Date;

public class Task {

    private TaskId $id;

    private String $name;

    private String $description;

    private Date $dueDate;


    public Task(TaskId $id, String $name, String $description, Date $dueDate) {
        this.$id = $id;
        this.$name = $name;
        this.$description = $description;
        this.$dueDate = $dueDate;
    }

    public TaskId get$id() {
        return $id;
    }

    public String get$name() {
        return $name;
    }

    public String get$description() {
        return $description;
    }

    public Date get$dueDate() {
        return $dueDate;
    }

    /* SUBROGATED ID

     public TaskId taskId() {

     if (null === taskId) {
     this.taskId = new TaskId(this.id());
     }

     return this.taskId;
     }
     */
}
