package com.taskmanager.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.taskmanager.app.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
