package com.api.todoapp.services;

import com.api.todoapp.controllers.dtos.Requests.CreateTaskRequest;
import com.api.todoapp.controllers.dtos.Responses.CreateTaskResponse;

public interface ITaskService {

    CreateTaskResponse create(CreateTaskRequest request);

}
