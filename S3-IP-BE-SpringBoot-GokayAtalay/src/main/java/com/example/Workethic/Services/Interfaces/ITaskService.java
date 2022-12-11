package com.example.Workethic.Services.Interfaces;

import com.example.Workethic.Models.Task;

import java.util.List;
import java.util.Optional;

public interface ITaskService {
    public Task createTask(Task task);
    public List<Task> getAllTasks();
    public Optional<Task> getTaskById(long id);
}
