package com.malotor.taskmanager.Infrastructure.Presentation;

import com.malotor.taskmanager.Application.DataTransform.TaskDataTransform;
import com.malotor.taskmanager.Domain.Task;
import com.malotor.taskmanager.Application.DataTransform.TaskDTO;
import com.malotor.taskmanager.Domain.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


@RestController
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    private final List<TaskDTO> tasks = new ArrayList<TaskDTO>();


    @RequestMapping("/tasks")
    Collection<Task> taskList()
    {


        taskRepository.save(new Task("A task name", "A task description", new Date()));

        TaskDataTransform taskDataTransform = new TaskDataTransform();

        taskDataTransform.write(taskRepository.findAll());

        return taskDataTransform.read();
    }

}
