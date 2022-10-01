package com.api.todoapp.controllers.dtos.Responses;

import com.api.todoapp.constants.TaskStatusEnum;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CreateTaskResponse {

    private String title;
    private String description;
    private LocalDateTime createdDate;
    private LocalDateTime eta;
    private Boolean finished;
    private TaskStatusEnum taskStatusEnum;

}
