package com.malotor.taskmanager.Application.DataTransform;

import com.malotor.taskmanager.Domain.Task;

public class TaskDTO {

    public String id;

    public String name;

    public String description;

    public String dueDate;

    public String taskId;

    public TaskDTO(Task task) {
        id = task.getId().toString();
        name = task.getName();
        description = task.getDescription();
        dueDate = task.getDueDate().toString();
        taskId = task.getTaskId().toString();
    }
}
