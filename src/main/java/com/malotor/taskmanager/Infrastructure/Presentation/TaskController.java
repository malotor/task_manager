package com.malotor.taskmanager.Infrastructure.Presentation;

import com.malotor.taskmanager.Application.DataTransform.DataTransform;
import com.malotor.taskmanager.Domain.Task;
import com.malotor.taskmanager.Domain.TaskDTO;
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

    private final TaskRepository taskRepository;
    private final List<TaskDTO> tasks = new ArrayList<TaskDTO>();

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @RequestMapping("/tasks")
    Collection<Task> taskList()
    {

        DataTransform dataTransform = new DataTransform();

        dataTransform.write(this.taskRepository.fetchAll());

        return dataTransform.read();
    }

}
