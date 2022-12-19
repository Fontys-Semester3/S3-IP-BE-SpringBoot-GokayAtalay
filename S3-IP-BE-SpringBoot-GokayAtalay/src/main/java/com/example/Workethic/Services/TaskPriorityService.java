package com.example.Workethic.Services;

import com.example.Workethic.Models.TaskPriority;
import com.example.Workethic.Repository.TaskPriorityRepository;
import com.example.Workethic.Services.Interfaces.ITaskPriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskPriorityService implements ITaskPriorityService {
    @Autowired
    TaskPriorityRepository repository;

    public List<TaskPriority> getAllPriorities(){
        return repository.findAll();
    }
}
