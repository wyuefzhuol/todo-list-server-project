package com.tw.todo.dto;

public class TodoItemResponse {
    private int id;
    private String content;
    private boolean status;

    public TodoItemResponse() {
    }

    public TodoItemResponse(int id, String content, boolean status) {
        this.id = id;
        this.content = content;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
