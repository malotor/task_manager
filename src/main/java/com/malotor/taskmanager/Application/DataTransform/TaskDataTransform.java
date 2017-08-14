package com.malotor.taskmanager.Application.DataTransform;

import com.malotor.taskmanager.Domain.Task;

import java.util.ArrayList;

public class TaskDataTransform {

    private Iterable<Task> tasks;

    public void write(Iterable<Task> tasks)
    {
        this.tasks = tasks;
    }

    public ArrayList read()
    {

        ArrayList<TaskDTO> result = new ArrayList<TaskDTO>();

        tasks.forEach(task -> result.add(new TaskDTO(task)));

        return result;

    }


}
