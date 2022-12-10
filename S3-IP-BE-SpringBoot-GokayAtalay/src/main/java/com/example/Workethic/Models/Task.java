package com.example.Workethic.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String body;
    @Getter
    @Setter
    @GeneratedValue
    private LocalDateTime created_at;

    public Task(long id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.created_at = LocalDateTime.now();
    }

    public Task() {

    }
}
