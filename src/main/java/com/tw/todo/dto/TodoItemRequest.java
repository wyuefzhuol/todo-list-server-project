package com.tw.todo.dto;

public class TodoItemRequest {
    private String content;
    private boolean status;

    public TodoItemRequest() {
    }

    public TodoItemRequest(String content, boolean status) {
        this.content = content;
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
