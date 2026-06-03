package com.example.TaskManagementAPI.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TaskManagementAPI.dto.TaskRequest;
import com.example.TaskManagementAPI.entity.Task;
import com.example.TaskManagementAPI.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

	private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping
    public Task createTask(@RequestBody TaskRequest taskRequest) {
        return service.createTask(taskRequest);
    }

    @GetMapping
    public List<Task> getTasks() {
        return service.getAllTasks();
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
    }
}
