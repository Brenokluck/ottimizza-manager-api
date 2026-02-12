package com.ottimizza.api_manager.core.service;

import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CrudService<T, ID> {
    Iterable<T> getAll();
    Optional<T> getById(ID id);
    boolean existsById(ID id);
    T create(T entity);
    T update(ID id, T entity);
    void delete(ID id);
}
