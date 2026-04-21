package com.taskmanager.app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.taskmanager.app.model.Task;
import com.taskmanager.app.repository.TaskRepository;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;


    public Task createTask (Task task){

        //Validation
        if(task.getTitle() ==null || task.getTitle().isEmpty()){
            throw new RuntimeException("Title is required");
        }

        //default value
        task.setCompleted(false);

        //save to DB

        return taskRepository.save(task);

    }
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

}
