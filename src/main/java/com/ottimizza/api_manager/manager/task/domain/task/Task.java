package com.ottimizza.api_manager.manager.task.domain.task;

import com.ottimizza.api_manager.manager.column.domain.column.Column;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Table(name = "task")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue
    private String id;

    private String name;
    private Integer position;
    private Instant createdAt;
    private Instant dueDate;
    private Boolean completed;
    private List<String> tags;

    @ManyToOne(optional = false)
    @JoinColumn(name = "columnId", nullable = false)
    private Column columnId;
}
