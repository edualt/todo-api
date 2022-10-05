package com.api.todoapp.services;

import com.api.todoapp.controllers.dtos.Requests.CreateTaskRequest;
import com.api.todoapp.controllers.dtos.Requests.UpdateTaskRequest;
import com.api.todoapp.controllers.dtos.Responses.CreateTaskResponse;
import com.api.todoapp.controllers.dtos.Responses.GetTaskResponse;
import com.api.todoapp.controllers.dtos.Responses.UpdateTaskResponse;
import com.api.todoapp.mapper.ITaskMapper;
import com.api.todoapp.persistence.entities.Task;
import com.api.todoapp.persistence.repositories.ITaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements ITaskService{

    @Autowired
    private ITaskRepository repository;
    @Autowired
    private ITaskMapper mapper;

    @Override
    public List<GetTaskResponse> list() {
        return repository.findAll()
                .stream()
                .map(mapper::from)
                .collect(Collectors.toList());
    }

    @Override
    public GetTaskResponse get(Long id) {
        return mapper.from(FindAndEnsureExists(id));
    }
    @Override
    public CreateTaskResponse create(CreateTaskRequest request) {
        Task task = mapper.from(request);
        return mapper.toCreateTaskResponse(repository.save(task));
    }

    @Override
    public UpdateTaskResponse update(Long id, UpdateTaskRequest request) {
        Task task = FindAndEnsureExists(id);
        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        task.setTodoDate(request.getTodoDate());
        task.setFinished(request.getFinished());
        task.setTaskStatus(request.getTaskStatus());
        return mapper.toUpdateTaskResponse(repository.save(task));
    }

    private Task FindAndEnsureExists(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
    }
}
