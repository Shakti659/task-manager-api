package com.taskmanager.app.service;


import com.taskmanager.app.dto.TaskRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.taskmanager.app.model.Task;
import com.taskmanager.app.repository.TaskRepository;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;


    public Task createTask (TaskRequest request){

        //Validation
//        if(request.getTitle() ==null || request.getTitle().isEmpty()){
//            throw new RuntimeException("Title is required");
//        }(Remove this manual validation)

        //default value
        Task task=new Task();
        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        task.setPriority(request.getPriority());
        task.setCompleted(false);

        //save to DB

        return taskRepository.save(task);

    }
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void deleteTask(Long id){
        Task task=taskRepository.findById(id).orElseThrow(() -> new RuntimeException(("Task  not found")));
        taskRepository.delete(task);
    }

}
