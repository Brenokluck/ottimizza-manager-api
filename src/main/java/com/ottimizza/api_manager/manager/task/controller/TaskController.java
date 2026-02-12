package com.ottimizza.api_manager.manager.task.controller;

import com.ottimizza.api_manager.core.controller.CrudController;
import com.ottimizza.api_manager.core.service.CrudService;
import com.ottimizza.api_manager.manager.task.domain.task.Task;
import com.ottimizza.api_manager.manager.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController extends CrudController<Task, String> {
    protected TaskController(CrudService<Task, String> service) {
        super(service);
    }

    @Autowired
    private TaskService taskService;
}
