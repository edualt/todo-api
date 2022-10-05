package com.api.todoapp.persistence.entities;

import com.api.todoapp.constants.TaskStatusEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
@Getter @Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDateTime createdDate;
    private LocalDateTime todoDate;
    private boolean finished;
    private TaskStatusEnum taskStatus;
}
