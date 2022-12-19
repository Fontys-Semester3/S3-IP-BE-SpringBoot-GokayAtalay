package com.example.Workethic.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tasks")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Task {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Getter
    @Setter
    public String title;
    @Getter
    @Setter
    private String body;
    @Getter
    @Setter
    private String userId;
    @Getter
    @Setter
    private String userName;
    @Getter
    @Setter
    private String userPicture;
    @Getter
    @Setter
    @GeneratedValue
    private LocalDateTime created_at;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    private TaskPriority taskPriority;

    public Task(String title, String body, String userId, String userName, String userPicture,TaskPriority taskPriority) {
        this.title = title;
        this.body = body;
        this.userId = userId;
        this.userName = userName;
        this.userPicture = userPicture;
        this.created_at = LocalDateTime.now();
        this.taskPriority = taskPriority;
    }

    public Task() {

    }
}
