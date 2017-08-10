package com.malotor.taskmanager.Domain;

import java.util.Collection;

public interface TaskRepository {

    Task fetchById(String id);
    Collection<Task> fetchAll();
}
