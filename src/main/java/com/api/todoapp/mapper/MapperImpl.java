package com.api.todoapp.mapper;

import com.api.todoapp.controllers.dtos.Requests.CreateTaskRequest;
import com.api.todoapp.controllers.dtos.Responses.CreateTaskResponse;
import com.api.todoapp.persistence.entities.Task;
import com.api.todoapp.constants.TaskStatusEnum;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MapperImpl implements IMapper {

    @Override
    public CreateTaskResponse from(Task task) {
        CreateTaskResponse response = new CreateTaskResponse();
        response.setTitle(task.getTitle());
        response.setDescription(task.getDescription());
        response.setCreatedDate(task.getCreatedDate());
        response.setEta(task.getEta());
        response.setFinished(task.isFinished());
        response.setTaskStatusEnum(task.getTaskStatus());
        return response;
    }

    @Override
    public Task from(CreateTaskResponse response) {
        Task task = new Task();
        task.setTitle(response.getTitle());
        task.setDescription(response.getDescription());
        task.setEta(response.getEta());
        task.setCreatedDate(response.getCreatedDate());
        task.setFinished(response.getFinished());
        task.setTaskStatus(response.getTaskStatusEnum());
        return task;
    }

    @Override
    public Task from(CreateTaskRequest request) {
        Task task = new Task();
        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        task.setEta(request.getEta());
        task.setCreatedDate(LocalDateTime.now());
        task.setFinished(false);
        task.setTaskStatus(TaskStatusEnum.ON_TIME);
        return task;
    }
}
