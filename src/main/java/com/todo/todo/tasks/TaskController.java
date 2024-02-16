package com.todo.todo.tasks;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping(path = "{taskId}")
    private ResponseEntity<Task> getTaskById(@PathVariable(name = "taskId") Long taskId) {
        return ResponseEntity.ok(taskService.getTaskById(taskId));
    }

    @PostMapping
    private ResponseEntity<Task> createTask(@Valid @RequestBody Task task) {
        return ResponseEntity.ok(taskService.createTask(task));
    }

    @GetMapping
    private ResponseEntity<List<Task>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    @PutMapping(path = "{taskId}")
    private ResponseEntity<Task> updateTask(
            @PathVariable(name = "taskId") Long id,
            @Valid @RequestBody UpdateTaskModel updateTaskModel) {

        var updatedTask = taskService.updateTask(id, updateTaskModel);
        return ResponseEntity.ok(updatedTask);
    }

    @DeleteMapping(path = "{taskId}")
    private ResponseEntity<Void> deleteTaskById(@PathVariable(name = "taskId") Long taskId) {
        taskService.deleteTaskById(taskId);
        return ResponseEntity.noContent().build();
    }

}
