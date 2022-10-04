package com.api.todoapp.services;

import com.api.todoapp.controllers.dtos.Requests.CreateTaskRequest;
import com.api.todoapp.controllers.dtos.Requests.UpdateTaskRequest;
import com.api.todoapp.controllers.dtos.Responses.CreateTaskResponse;
import com.api.todoapp.controllers.dtos.Responses.GetTaskResponse;
import com.api.todoapp.controllers.dtos.Responses.UpdateTaskResponse;

import java.util.List;

public interface ITaskService {

    List<GetTaskResponse> list();

    GetTaskResponse get(Long id);

    CreateTaskResponse create(CreateTaskRequest request);

    UpdateTaskResponse update(Long id, UpdateTaskRequest request);

}
