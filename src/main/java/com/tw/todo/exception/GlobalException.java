package com.tw.todo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class GlobalException {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(TodoItemNotFoundException.class)
    void handlerCompanyNotFoundException(TodoItemNotFoundException exception) {

    }
}
