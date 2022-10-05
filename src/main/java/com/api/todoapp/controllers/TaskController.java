package com.api.todoapp.controllers;

import com.api.todoapp.controllers.dtos.Requests.CreateTaskRequest;
import com.api.todoapp.controllers.dtos.Requests.UpdateTaskRequest;
import com.api.todoapp.controllers.dtos.Responses.CreateTaskResponse;
import com.api.todoapp.controllers.dtos.Responses.GetTaskResponse;
import com.api.todoapp.controllers.dtos.Responses.UpdateTaskResponse;
import com.api.todoapp.services.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tasks")
public class TaskController {

    @Autowired
    private ITaskService service;

    @GetMapping
    public List<GetTaskResponse> list(){
        return service.list();
    }

    @GetMapping("{id}")
    public GetTaskResponse get(@PathVariable Long id){
        return service.get(id);
    }

    @PostMapping
    public CreateTaskResponse create(@RequestBody CreateTaskRequest request){
        return service.create(request);
    }

    @PutMapping("{id}")
    public UpdateTaskResponse update(@PathVariable Long id, @RequestBody UpdateTaskRequest request){
        return service.update(id, request);
    }

}
