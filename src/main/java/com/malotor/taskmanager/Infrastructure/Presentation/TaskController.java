package com.malotor.taskmanager.Infrastructure.Presentation;

import com.malotor.taskmanager.Application.DataTransform.DataTransformer.TaskDataTransform;
import com.malotor.taskmanager.Domain.Task;
import com.malotor.taskmanager.Domain.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Date;


@RestController
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping("/tasks")
    Collection<Task> taskList()
    {

        TaskDataTransform taskDataTransform = new TaskDataTransform();

        taskDataTransform.write(taskRepository.findAll());

        return taskDataTransform.read();
    }


}
