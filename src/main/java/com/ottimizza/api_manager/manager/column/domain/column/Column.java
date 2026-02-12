package com.ottimizza.api_manager.manager.column.domain.column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "column")
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
    private Number position;
    private String boardId;
}
