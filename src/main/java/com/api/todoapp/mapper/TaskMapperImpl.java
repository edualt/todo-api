package com.api.todoapp.mapper;

import com.api.todoapp.controllers.dtos.Requests.CreateTaskRequest;
import com.api.todoapp.controllers.dtos.Responses.CreateTaskResponse;
import com.api.todoapp.controllers.dtos.Responses.GetTaskResponse;
import com.api.todoapp.controllers.dtos.Responses.UpdateTaskResponse;
import com.api.todoapp.persistence.entities.Task;
import com.api.todoapp.constants.TaskStatusEnum;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskMapperImpl implements ITaskMapper {

    @Override
    public GetTaskResponse from(Task task) {
        GetTaskResponse response = new GetTaskResponse();
        response.setId(task.getId());
        response.setTitle(task.getTitle());
        response.setDescription(task.getDescription());
        response.setCreatedDate(task.getCreatedDate());
        response.setTodoDate(task.getTodoDate());
        response.setFinished(task.isFinished());
        response.setTaskStatus(task.getTaskStatus());
        return response;
    }

    @Override
    public CreateTaskResponse toCreateTaskResponse(Task task) {
        CreateTaskResponse response = new CreateTaskResponse();
        response.setId(task.getId());
        response.setTitle(task.getTitle());
        response.setDescription(task.getDescription());
        response.setCreatedDate(task.getCreatedDate());
        response.setTodoDate(task.getTodoDate());
        response.setFinished(task.isFinished());
        response.setTaskStatus(task.getTaskStatus());
        return response;
    }

    @Override
    public UpdateTaskResponse toUpdateTaskResponse(Task task) {
        UpdateTaskResponse response = new UpdateTaskResponse();
        response.setId(task.getId());
        response.setTitle(task.getTitle());
        response.setDescription(task.getDescription());
        response.setCreatedDate(task.getCreatedDate());
        response.setTodoDate(task.getTodoDate());
        response.setFinished(task.isFinished());
        response.setTaskStatus(task.getTaskStatus());
        return response;
    }


    @Override
    public Task from(GetTaskResponse response) {
        Task task = new Task();
        task.setTitle(response.getTitle());
        task.setDescription(response.getDescription());
        task.setTodoDate(response.getTodoDate());
        task.setCreatedDate(response.getCreatedDate());
        task.setFinished(response.getFinished());
        task.setTaskStatus(response.getTaskStatus());
        return task;
    }

    @Override
    public Task from(CreateTaskRequest request) {
        Task task = new Task();
        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        task.setTodoDate(request.getTodoDate());
        task.setCreatedDate(LocalDateTime.now());
        task.setFinished(false);
        task.setTaskStatus(TaskStatusEnum.ON_TIME);
        return task;
    }
}
