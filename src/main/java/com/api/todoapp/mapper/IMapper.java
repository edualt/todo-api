package com.api.todoapp.mapper;

import com.api.todoapp.controllers.dtos.Requests.CreateTaskRequest;
import com.api.todoapp.controllers.dtos.Responses.CreateTaskResponse;
import com.api.todoapp.persistence.entities.Task;

public interface IMapper {

    CreateTaskResponse from(Task task);

    Task from(CreateTaskResponse response);

    Task from(CreateTaskRequest request);

}
