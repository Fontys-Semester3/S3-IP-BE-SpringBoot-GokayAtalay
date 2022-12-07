package com.example.Workethic.Repository;

import com.example.Workethic.Models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    @Query(value = "SELECT * FROM tasks LIMIT 100", nativeQuery = true)
    List<Task> All();
}
