package com.tw.todo.service;

import com.tw.todo.dto.TodoItemRequest;
import com.tw.todo.dto.TodoItemResponse;

import java.util.List;

public interface TodoService {
    TodoItemResponse addTodoItem(TodoItemRequest todoItemRequest);

    List<TodoItemResponse> getTodoItems();

    TodoItemResponse updateTodoItems(int todoItemId);

    TodoItemResponse deleteTodoItem(int todoItemId);
}
