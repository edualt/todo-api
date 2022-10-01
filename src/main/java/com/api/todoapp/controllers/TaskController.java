package com.api.todoapp.controllers;

import com.api.todoapp.controllers.dtos.Requests.CreateTaskRequest;
import com.api.todoapp.controllers.dtos.Responses.CreateTaskResponse;
import com.api.todoapp.services.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tasks")
public class TaskController {

    @Autowired
    private ITaskService service;

    @PostMapping
    public CreateTaskResponse create(@RequestBody CreateTaskRequest request){
        return service.create(request);
    }

}
