package com.api.todoapp.services;

import com.api.todoapp.controllers.dtos.Requests.CreateTaskRequest;
import com.api.todoapp.controllers.dtos.Responses.CreateTaskResponse;
import com.api.todoapp.mapper.IMapper;
import com.api.todoapp.persistence.entities.Task;
import com.api.todoapp.persistence.repositories.ITaskRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements ITaskService{

    @Autowired
    private IMapper mapper;

    @Autowired
    private ITaskRepository repository;

    @Autowired
    private ObjectMapper mapper2;

    @Override
    public CreateTaskResponse create(CreateTaskRequest request) {

        Task task1 = mapper2.convertValue(request, Task.class);

        Task task = mapper.from(request);
        return mapper.from(repository.save(task1));
    }
}
