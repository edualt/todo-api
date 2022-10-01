package com.api.todoapp.Controllers.dtos.Requests;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CreateTaskRequest {
    private String title;
    private String description;
    private LocalDateTime eta;
}
