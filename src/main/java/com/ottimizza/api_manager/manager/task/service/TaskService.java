package com.ottimizza.api_manager.manager.task.service;

import com.ottimizza.api_manager.core.service.CrudServiceImpl;
import com.ottimizza.api_manager.manager.task.domain.task.Task;
import com.ottimizza.api_manager.manager.task.repository.RepositoryTask;
import org.springframework.stereotype.Service;

@Service
public class TaskService extends CrudServiceImpl<Task, String> {

    public TaskService(RepositoryTask repository) {
        super(repository);
    }
}
