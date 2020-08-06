package com.tw.todo.controller;

import com.tw.todo.dto.TodoItemResponse;
import com.tw.todo.service.impl.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    TodoServiceImpl todoService;

    @GetMapping
    public List<TodoItemResponse> getTodoItems(){
        return todoService.getTodoItems();
    }

}
