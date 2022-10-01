package com.api.todoapp.Services;

import com.api.todoapp.Controllers.dtos.Requests.CreateTaskRequest;
import com.api.todoapp.Controllers.dtos.Responses.CreateTaskResponse;
import com.api.todoapp.MapStruct.IMapStructMapper;
import com.api.todoapp.Persistence.Entities.Task;
import com.api.todoapp.Persistence.Repositories.ITaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements ITaskService{

    private IMapStructMapper mapstructMapper;
    private ITaskRepository repository;


    @Autowired
    public TaskServiceImpl(
            ITaskRepository repository,
            @Qualifier("mapper") IMapStructMapper mapstructMapper
    ){
        this.repository = repository;
        this.mapstructMapper = mapstructMapper;
    }
    @Override
    public CreateTaskResponse create(CreateTaskRequest request) {
        Task task = repository.save(mapstructMapper.createTaskRequestToTask(request));
        return mapstructMapper.taskToCreateTaskResponse(task);
    }
}
