package com.example.Workethic.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
public class Task {

    @Id
    @Getter
    private String uuid;
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String body;
    @Getter
    @Setter
    private LocalDateTime created_at;

    public Task(String uuid, String title, String body, LocalDateTime created_at) {
        this.uuid = uuid;
        this.title = title;
        this.body = body;
        this.created_at = created_at;
    }

    public Task() {

    }
}
