package com.api.todoapp.controllers.dtos.Responses;

import com.api.todoapp.constants.TaskStatusEnum;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class UpdateTaskResponse {

    private Long id;
    private String title;
    private String description;
    private LocalDateTime createdDate;
    private LocalDateTime todoDate;
    private Boolean finished;
    private TaskStatusEnum taskStatus;

}
