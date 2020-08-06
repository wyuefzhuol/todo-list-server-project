package com.tw.todo.service.impl;

import com.tw.todo.dto.TodoItemRequest;
import com.tw.todo.dto.TodoItemResponse;
import com.tw.todo.entity.TodoItem;
import com.tw.todo.repository.TodoRepository;
import com.tw.todo.service.TodoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public TodoItemResponse addTodoItem(TodoItemRequest todoItemRequest) {
        TodoItem todoItem = new TodoItem();
        TodoItemResponse todoItemResponse = new TodoItemResponse();
        BeanUtils.copyProperties(todoItemRequest, todoItem);
        BeanUtils.copyProperties(todoRepository.save(todoItem), todoItemResponse);
        return todoItemResponse;
    }

    @Override
    public List<TodoItemResponse> getTodoItems() {
        return null;
    }
}
