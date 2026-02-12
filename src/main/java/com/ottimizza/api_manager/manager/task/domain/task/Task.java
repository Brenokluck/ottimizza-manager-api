package com.ottimizza.api_manager.manager.task.domain.task;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private String Id;

    private String name;
    private Number position;
    private Instant createdAt;
    private Instant dueDate;
    private Boolean completed;
    private List<String> tags;
    private String columnId;
}
