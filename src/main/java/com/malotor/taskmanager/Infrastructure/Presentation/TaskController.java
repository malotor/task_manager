package com.malotor.taskmanager.Infrastructure.Presentation;

import com.malotor.taskmanager.Domain.Task;
import com.malotor.taskmanager.Domain.TaskDTO;
import com.malotor.taskmanager.Domain.TaskId;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
public class TaskController {

    List<TaskDTO> tasks = new ArrayList<TaskDTO>();

    @RequestMapping("/tasks")
    List<TaskDTO>  taskList()
    {

        this.tasks.add(new TaskDTO(new Task(
                new TaskId("An Id"),
                "A task Name",
                "A task description",
                new Date())
        ));

        return this.tasks;
    }

}
