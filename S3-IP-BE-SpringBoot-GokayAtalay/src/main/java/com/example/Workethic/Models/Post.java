package com.example.Workethic.Models;

import java.time.LocalDateTime;


public class Post {

    private String uuid;
    private String title;
    private String body;
    private LocalDateTime created_at;

    public Post(String uuid, String title, String body, LocalDateTime created_at) {
        this.uuid = uuid;
        this.title = title;
        this.body = body;
        this.created_at = created_at;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }
}
