package com.tw.todo.service.impl;

import com.tw.todo.dto.TodoItemRequest;
import com.tw.todo.dto.TodoItemResponse;
import com.tw.todo.repository.TodoRepository;
import com.tw.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public TodoItemResponse addTodoItem(TodoItemRequest todoItemRequest) {
        return null;
    }
}
