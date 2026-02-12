package com.ottimizza.api_manager.manager.column.domain.column;

import com.ottimizza.api_manager.manager.board.domain.board.Board;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "column_manager")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Column {
    @Id
    @GeneratedValue
    private String id;

    private String name;
    private Integer position;

    @ManyToOne(optional = false)
    @JoinColumn(name = "boardId", nullable = false)
    private Board boardId;
}
