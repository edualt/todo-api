package com.api.todoapp.Controllers.dtos.Responses;

import com.api.todoapp.Persistence.Entities.TaskStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CreateTaskResponse {

    private String title;
    private String description;
    private LocalDateTime createdDate;
    private LocalDateTime eta;
    private Boolean finished;
    private TaskStatus taskStatus;

}
