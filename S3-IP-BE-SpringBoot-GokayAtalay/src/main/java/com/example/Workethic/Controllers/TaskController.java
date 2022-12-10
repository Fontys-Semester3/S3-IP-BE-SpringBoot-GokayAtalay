package com.example.Workethic.Controllers;

import com.example.Workethic.DTO.TaskDTO;
import com.example.Workethic.Models.Task;
import com.example.Workethic.Repository.TaskRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public ResponseEntity<?> index() {
        List<Task> tasks = taskRepository.findAll();

        return ResponseEntity
                .ok()
                .body(tasks);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable long id) {
        Optional<Task> task = taskRepository.findById(id);
        return ResponseEntity
                .ok()
                .body(task);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody TaskDTO requestTask) {
        Task newTask = new Task(requestTask.id, requestTask.title, requestTask.body);
        Task task = taskRepository.save(newTask);

        return ResponseEntity
                .ok()
                .body(task);
    }
}