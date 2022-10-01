package com.api.todoapp.Persistence.Repositories;

import com.api.todoapp.Persistence.Entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITaskRepository extends JpaRepository<Task, Long> {
}
