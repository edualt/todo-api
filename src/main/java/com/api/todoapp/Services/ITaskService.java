package com.api.todoapp.Services;

import com.api.todoapp.Controllers.dtos.Requests.CreateTaskRequest;
import com.api.todoapp.Controllers.dtos.Responses.CreateTaskResponse;
import com.api.todoapp.Persistence.Entities.Task;

public interface ITaskService {

    CreateTaskResponse create(CreateTaskRequest request);

}
