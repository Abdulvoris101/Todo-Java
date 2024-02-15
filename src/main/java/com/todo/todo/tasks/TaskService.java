package com.todo.todo.tasks;

import java.util.List;
import java.util.Optional;

public interface TaskService {

    Task getTaskById(Long id);

    Task createTask(Task task);

    List<Task> getAllTasks();

    void deleteTaskById(Long id);

    Task updateTask(Task task);

}
