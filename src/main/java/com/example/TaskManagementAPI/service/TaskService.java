package com.example.TaskManagementAPI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.TaskManagementAPI.dto.TaskRequest;
import com.example.TaskManagementAPI.entity.Task;
import com.example.TaskManagementAPI.repository.TaskRepository;

@Service
public class TaskService {

	private final TaskRepository repo;

    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public List<Task> getAllTasks() {
        return repo.findAll();
    }

    public Task createTask(TaskRequest taskRequest) {
        Task task=new Task();
        task.setTitle(taskRequest.getTitle());
        task.setDescription(taskRequest.getDescription());
        // task.setCompleted(taskRequest.get);

        return repo.save(task);
    }

    public void deleteTask(Long id) {
        repo.deleteById(id);
    }
}
