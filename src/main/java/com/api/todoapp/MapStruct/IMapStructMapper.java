package com.api.todoapp.MapStruct;

import com.api.todoapp.Controllers.dtos.Requests.CreateTaskRequest;
import com.api.todoapp.Controllers.dtos.Responses.CreateTaskResponse;
import com.api.todoapp.Persistence.Entities.Task;
import org.mapstruct.Mapper;

@Mapper(
       componentModel = "spring"
)
public interface IMapStructMapper {
    CreateTaskResponse taskToCreateTaskResponse(Task task);

    Task createTaskResponseToTask(CreateTaskResponse response);

    Task createTaskRequestToTask(CreateTaskRequest request);
}
