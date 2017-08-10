package com.malotor.taskmanager.Application.DataTransform;

import com.malotor.taskmanager.Domain.Task;
import com.malotor.taskmanager.Domain.TaskDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class DataTransform {

    private Collection<Task> tasks;

    public void write(Collection<Task> tasks)
    {
        this.tasks = tasks;
    }

    public ArrayList read()
    {

        ArrayList result = new ArrayList();

        for(Task task : this.tasks){
            result.add(new TaskDTO(task));
        }

        return result;

    }


}
