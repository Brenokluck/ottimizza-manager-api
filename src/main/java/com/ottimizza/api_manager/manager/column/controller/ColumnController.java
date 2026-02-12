package com.ottimizza.api_manager.manager.column.controller;

import com.ottimizza.api_manager.core.controller.CrudController;
import com.ottimizza.api_manager.core.service.CrudService;
import com.ottimizza.api_manager.manager.column.domain.column.Column;
import com.ottimizza.api_manager.manager.column.service.ColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/column")
public class ColumnController extends CrudController<Column, String> {
    protected ColumnController(CrudService<Column, String> service) {
        super(service);
    }

    @Autowired
    private ColumnService columnService;
}
