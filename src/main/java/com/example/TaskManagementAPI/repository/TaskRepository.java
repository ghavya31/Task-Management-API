package com.example.TaskManagementAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TaskManagementAPI.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
