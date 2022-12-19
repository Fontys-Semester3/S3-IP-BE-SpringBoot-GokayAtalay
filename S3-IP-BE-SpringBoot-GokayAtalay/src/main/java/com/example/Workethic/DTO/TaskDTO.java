package com.example.Workethic.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class TaskDTO {
    public long id;
    public String title;
    public String body;
    public String userId;
    public String userName;
    public String userPicture;
    public LocalDateTime created_at;

    public long task_priority_id;
}