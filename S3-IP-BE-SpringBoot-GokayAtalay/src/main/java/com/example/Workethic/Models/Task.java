package com.example.Workethic.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
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

    public Task(String title, String body, String userId, String userName, String userPicture) {
        this.title = title;
        this.body = body;
        this.userId = userId;
        this.userName = userName;
        this.userPicture = userPicture;
        this.created_at = LocalDateTime.now();
    }

    public Task() {

    }
}
