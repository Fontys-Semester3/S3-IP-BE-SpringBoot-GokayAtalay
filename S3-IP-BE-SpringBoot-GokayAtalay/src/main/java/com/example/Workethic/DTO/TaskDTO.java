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
    public LocalDateTime created_at;
}