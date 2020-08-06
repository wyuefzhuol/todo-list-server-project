package com.tw.todo.controller;

import com.tw.todo.dto.TodoItemRequest;
import com.tw.todo.dto.TodoItemResponse;
import com.tw.todo.service.impl.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    TodoServiceImpl todoService;

    @GetMapping
    public List<TodoItemResponse> getTodoItems() {
        return todoService.getTodoItems();
    }

    @PostMapping
    public TodoItemResponse addTodoItem(@RequestBody TodoItemRequest todoItemRequest) {
        return todoService.addTodoItem(todoItemRequest);
    }

    @PutMapping("/{todoItemId}")
    public TodoItemResponse updateTodoItem(@PathVariable int todoItemId) {
        return todoService.updateTodoItems(todoItemId);
    }

    @DeleteMapping("/{todoItemId}")
    public TodoItemResponse deleteTodoItem(@PathVariable int todoItemId) {
        return todoService.deleteTodoItem(todoItemId);
    }
}
