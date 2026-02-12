package com.ottimizza.api_manager.manager.column.repository;

import com.ottimizza.api_manager.manager.column.domain.column.Column;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryColumn extends JpaRepository<Column, String> {
}
