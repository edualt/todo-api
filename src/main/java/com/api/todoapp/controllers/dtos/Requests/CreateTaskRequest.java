package com.api.todoapp.controllers.dtos.Requests;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class CreateTaskRequest {
    private String title;
    private String description;
    private LocalDateTime eta;
}
