package com.ottimizza.api_manager.manager.task.repository;

import com.ottimizza.api_manager.manager.task.domain.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryTask extends JpaRepository<Task, String> {
}
