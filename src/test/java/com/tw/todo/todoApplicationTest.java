package com.tw.todo;

import com.tw.todo.dto.TodoItemRequest;
import com.tw.todo.dto.TodoItemResponse;
import com.tw.todo.entity.TodoItem;
import com.tw.todo.repository.TodoRepository;
import com.tw.todo.service.TodoService;
import com.tw.todo.service.impl.TodoServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class todoApplicationTest {

    @Mock
    TodoRepository todoRepository;

    @InjectMocks
    TodoServiceImpl todoServiceImpl;

    @Test
    void should_return_1_todo_item_response_when_add_todo_item_given_1_todo_item_request() {
        //given
        TodoItemRequest todoItemRequest = new TodoItemRequest("I start to do homework", false);
        TodoItem todoItem = new TodoItem();
        todoItem.setId(1);
        todoItem.setContent("I start to do homework");
        todoItem.setStatus(false);
        Mockito.when(todoRepository.save(any())).thenReturn(todoItem);

        //when
        TodoItemResponse todoItemResponse = todoServiceImpl.addTodoItem(todoItemRequest);

        //then
        assertEquals(todoItem.getId(),todoItemResponse.getId());
        assertEquals(todoItem.getContent(),todoItemResponse.getContent());
        assertEquals(todoItem.getStatus(),todoItemResponse.getStatus());
    }
}
