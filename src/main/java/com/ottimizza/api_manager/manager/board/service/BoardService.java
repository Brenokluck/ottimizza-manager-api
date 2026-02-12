package com.ottimizza.api_manager.manager.board.service;

import com.ottimizza.api_manager.core.service.CrudServiceImpl;
import com.ottimizza.api_manager.manager.board.domain.board.Board;
import com.ottimizza.api_manager.manager.board.repository.RepositoryBoard;
import org.springframework.stereotype.Service;

@Service
public class BoardService extends CrudServiceImpl<Board, String> {

    public BoardService(RepositoryBoard repository) {
        super(repository);
    }
}
