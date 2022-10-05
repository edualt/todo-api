package com.api.todoapp.controllers.dtos.Requests;

import com.api.todoapp.constants.TaskStatusEnum;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class UpdateTaskRequest {
    private String title;
    private String description;
    private LocalDateTime todoDate;
    private Boolean finished;
    private TaskStatusEnum taskStatus;
}
