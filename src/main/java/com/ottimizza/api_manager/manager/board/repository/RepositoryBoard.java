package com.ottimizza.api_manager.manager.board.repository;

import com.ottimizza.api_manager.manager.board.domain.board.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryBoard extends JpaRepository<Board, String> {
}
