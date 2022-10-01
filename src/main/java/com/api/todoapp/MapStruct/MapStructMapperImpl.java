package com.api.todoapp.MapStruct;

import com.api.todoapp.Controllers.dtos.Requests.CreateTaskRequest;
import com.api.todoapp.Controllers.dtos.Responses.CreateTaskResponse;
import com.api.todoapp.Persistence.Entities.Task;
import com.api.todoapp.Persistence.Entities.TaskStatus;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("mapper")
public class MapStructMapperImpl implements IMapStructMapper {
    @Override
    public CreateTaskResponse taskToCreateTaskResponse(Task task) {
        CreateTaskResponse response = new CreateTaskResponse();
        response.setTitle(task.getTitle());
        response.setDescription(task.getDescription());
        response.setCreatedDate(task.getCreatedDate());
        response.setEta(task.getEta());
        response.setFinished(task.isFinished());
        response.setTaskStatus(task.getTaskStatus());
        return response;
    }

    @Override
    public Task createTaskResponseToTask(CreateTaskResponse response) {
        Task task = new Task();
        task.setTitle(response.getTitle());
        task.setDescription(response.getDescription());
        task.setEta(response.getEta());
        task.setCreatedDate(response.getCreatedDate());
        task.setFinished(response.getFinished());
        task.setTaskStatus(response.getTaskStatus());
        return task;
    }

    @Override
    public Task createTaskRequestToTask(CreateTaskRequest request) {
        Task task = new Task();
        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        task.setEta(request.getEta());
        task.setCreatedDate(LocalDateTime.now());
        task.setFinished(false);
        task.setTaskStatus(TaskStatus.ON_TIME);
        return task;
    }
}
