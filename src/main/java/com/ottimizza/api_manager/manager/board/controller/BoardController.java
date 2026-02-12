package com.ottimizza.api_manager.manager.board.controller;

import com.ottimizza.api_manager.core.controller.CrudController;
import com.ottimizza.api_manager.core.service.CrudService;
import com.ottimizza.api_manager.manager.board.domain.board.Board;
import com.ottimizza.api_manager.manager.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
public class BoardController extends CrudController<Board, String> {
    protected BoardController(CrudService<Board, String> service) {
        super(service);
    }

    @Autowired
    private BoardService boardService;
}
