package com.tw.todo.service;

import com.tw.todo.dto.TodoItemRequest;
import com.tw.todo.dto.TodoItemResponse;

public interface TodoService {
    TodoItemResponse addTodoItem(TodoItemRequest todoItemRequest);
}
