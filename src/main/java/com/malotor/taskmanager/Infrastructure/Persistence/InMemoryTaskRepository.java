package com.malotor.taskmanager.Infrastructure.Persistence;

import com.malotor.taskmanager.Domain.Task;
import com.malotor.taskmanager.Domain.TaskId;
import com.malotor.taskmanager.Domain.TaskRepository;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;


public class InMemoryTaskRepository {
    /*

    @Override
    public Task fetchById(String id) {
       return  new Task(
                 new TaskId(id),
                "A task Name",
                "A task description",
                new Date());
    }

    @Override
    public Collection<Task> fetchAll() {
        Collection<Task> collection = new HashSet();

        collection.add(new Task(
                new TaskId("A Custom Id"),
                "A task Name",
                "A task description",
                new Date()));

        return collection;
    }
    */
}
