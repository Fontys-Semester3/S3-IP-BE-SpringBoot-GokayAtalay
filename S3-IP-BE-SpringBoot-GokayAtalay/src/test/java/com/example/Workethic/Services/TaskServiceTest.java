package com.example.Workethic.Services;

import com.example.Workethic.Models.Task;
import com.example.Workethic.Repository.TaskRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@SpringBootTest
class TaskServiceTest {
    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private TaskService taskService;

    @Test
    void createTask() {
        Task task = new Task("bzbz", "some more bzbz");

        Task returnedTask = taskService.createTask(task);

        assert(returnedTask).equals(task);
    }

    @Test
    void getAllTasks() {
        Task task = new Task("gang", "some more gang");
        Task task2 = new Task("gang2", "some more bzbz2");
        taskService.createTask(task);
        taskService.createTask(task2);

        List<Task> allTasks = taskService.getAllTasks();
        int count = allTasks.size();
        boolean result = false;

        if(count == 2){
            result = true;
        }

        Assertions.assertTrue(result);
    }

    @Test
    void getTaskById() {
    }
}