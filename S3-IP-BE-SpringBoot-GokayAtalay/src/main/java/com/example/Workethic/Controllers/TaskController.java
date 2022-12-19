package com.example.Workethic.Controllers;

import com.example.Workethic.DTO.TaskDTO;
import com.example.Workethic.Models.Task;
import com.example.Workethic.Models.TaskPriority;
import com.example.Workethic.Repository.TaskRepository;
import com.example.Workethic.Services.Interfaces.ITaskService;
import com.example.Workethic.Services.TaskService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {

    @Autowired
    private EntityManager em;
    @Autowired
    private ITaskService taskService;

    @GetMapping
    public ResponseEntity<?> index() {
        List<Task> tasks = taskService.getAllTasks();

        return ResponseEntity
                .ok()
                .body(tasks);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable long id) {
        Optional<Task> task = taskService.getTaskById(id);
        return ResponseEntity
                .ok()
                .body(task);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody TaskDTO requestTask) {
        Task newTask = new Task(requestTask.title, requestTask.body, requestTask.userId, requestTask.userName, requestTask.userPicture,em.getReference(TaskPriority.class,requestTask.task_priority_id));
        Task task = taskService.createTask(newTask);

        return ResponseEntity
                .ok()
                .body(task);
    }
}