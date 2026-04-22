package com.taskmanager.app.dto;

import jakarta.validation.constraints.NotBlank;
public class TaskRequest {

    @NotBlank(message ="Title is required")
    private String title;
    private String description;
    private String priority;

    public String getTitle() {
        return title;
    }

    public void setTitles(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
