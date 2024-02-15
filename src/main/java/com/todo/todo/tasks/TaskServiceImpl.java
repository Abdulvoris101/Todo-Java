package com.todo.todo.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task getTaskById(Long id) {

        return taskRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Task not found"));
    }

    @Override
    public Task createTask(Task task) {
        task.setCreatedAt(LocalDateTime.now());
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public void deleteTaskById(Long id) {
        var task = taskRepository.findById(id);

        if (task.isEmpty()) {
            throw new IllegalStateException("Provided task id not found!");
        }

        taskRepository.deleteById(id);
    }

    @Override
    public Task updateTask(Task task) {
        return null;
    }

}
