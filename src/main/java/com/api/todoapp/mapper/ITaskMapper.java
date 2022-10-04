package com.api.todoapp.mapper;

import com.api.todoapp.controllers.dtos.Requests.CreateTaskRequest;
import com.api.todoapp.controllers.dtos.Responses.CreateTaskResponse;
import com.api.todoapp.controllers.dtos.Responses.GetTaskResponse;
import com.api.todoapp.controllers.dtos.Responses.UpdateTaskResponse;
import com.api.todoapp.persistence.entities.Task;

public interface ITaskMapper {

    GetTaskResponse from(Task task);

    CreateTaskResponse toCreateTaskResponse(Task task);

    UpdateTaskResponse toUpdateTaskResponse(Task task);

    Task from(GetTaskResponse response);

    Task from(CreateTaskRequest request);
}
