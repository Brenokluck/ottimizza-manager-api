package com.ottimizza.api_manager.manager.column.service;

import com.ottimizza.api_manager.core.service.CrudServiceImpl;
import com.ottimizza.api_manager.manager.column.domain.column.Column;
import com.ottimizza.api_manager.manager.column.repository.RepositoryColumn;
import org.springframework.stereotype.Service;

@Service
public class ColumnService extends CrudServiceImpl<Column, String> {

    public ColumnService(RepositoryColumn repository) {
        super(repository);
    }
}
