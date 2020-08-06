package com.tw.todo;

import com.tw.todo.repository.TodoRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class todoIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    private TodoRepository todoRepository;

    @AfterEach
    public void clear() {
        todoRepository.deleteAll();
    }

    @Test
    void should_return_1_todo_item_response_when_add_todo_item_given_1_todo_item_request() throws Exception {
        String todoItemJsonPay = "{\n" +
                "    \"content\": \"I start to do homework\",\n" +
                "    \"status\": false\n" +
                "}";

        mockMvc.perform(post("/todos")
                .contentType(MediaType.APPLICATION_JSON)
                .content(todoItemJsonPay))
                .andExpect(status().isOk())
                .andExpect(jsonPath("content").value("I start to do homework"))
                .andExpect(jsonPath("status").isBoolean());
    }
}
