package com.tw.todo.repository;

import com.tw.todo.entity.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoItem, Integer> {
}
