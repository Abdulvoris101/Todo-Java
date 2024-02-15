package com.todo.todo.tasks;

import jakarta.validation.constraints.NotNull;

public class UpdateTaskModel {
    @NotNull
    private String taskName;

    @NotNull
    private String description;

    @NotNull
    private String author;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
