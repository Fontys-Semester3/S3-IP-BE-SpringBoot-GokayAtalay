package com.example.Workethic.Controllers;

import com.example.Workethic.Models.Task;
import com.example.Workethic.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping("/")
    public ResponseEntity<?> index() {
        List<Task> tasks = taskRepository.All();
        return ResponseEntity
                .ok()
                .body(tasks);
    }
}