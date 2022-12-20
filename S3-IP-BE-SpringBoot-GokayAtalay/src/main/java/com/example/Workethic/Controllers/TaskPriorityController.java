package com.example.Workethic.Controllers;

import com.example.Workethic.DTO.TaskDTO;
import com.example.Workethic.Models.Task;
import com.example.Workethic.Models.TaskPriority;
import com.example.Workethic.Services.Interfaces.ITaskPriorityService;
import com.example.Workethic.Services.Interfaces.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks/priorities")
@CrossOrigin(origins = "http://localhost:3000")
public class TaskPriorityController {


    @Autowired
    private ITaskPriorityService priorityService;

    @GetMapping
    public ResponseEntity<?> index() {
        List<TaskPriority> priorities = priorityService.getAllPriorities();

        return ResponseEntity
                .ok()
                .body(priorities);
    }
}