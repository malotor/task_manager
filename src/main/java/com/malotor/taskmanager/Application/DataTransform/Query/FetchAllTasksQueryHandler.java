package com.malotor.taskmanager.Application.DataTransform.Query;

import com.malotor.taskmanager.Application.DataTransform.DataTransformer.TaskDataTransform;
import com.malotor.taskmanager.Domain.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class FetchAllTasksQueryHandler {

    @Autowired
    private TaskRepository taskRepository;

    public ArrayList handle(FetchAllTasksQuery $query)
    {

        TaskDataTransform taskDataTransform = new TaskDataTransform();

        taskDataTransform.write(taskRepository.findAll());

        return taskDataTransform.read();
    }
}
