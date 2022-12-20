package com.example.Workethic.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "taskPriority")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TaskPriority {
    @Getter
    @Setter
    @GeneratedValue
    @Id
    private long id;

    @Getter
    @Setter
    private String value;
}
