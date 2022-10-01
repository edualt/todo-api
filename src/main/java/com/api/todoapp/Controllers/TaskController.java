package com.api.todoapp.Controllers;

import com.api.todoapp.Controllers.dtos.Requests.CreateTaskRequest;
import com.api.todoapp.Controllers.dtos.Responses.CreateTaskResponse;
import com.api.todoapp.Services.ITaskService;
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
