package com.taskmanager.app.dto;

public class TaskRequest {

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
