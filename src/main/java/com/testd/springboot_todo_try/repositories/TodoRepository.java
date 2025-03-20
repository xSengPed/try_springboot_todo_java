package com.testd.springboot_todo_try.repositories;

import com.testd.springboot_todo_try.models.TodoModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class TodoRepository {
    private ArrayList<TodoModel> todos = new ArrayList<>();

    TodoRepository() {
        this.todos.add(
                new TodoModel("1", "Learn Spring Boot", "Learn Spring Boot", false)
        );
        this.todos.add(
                new TodoModel("2", "Learn Flutter", "Learn Spring Boot", false)
        );
        this.todos.add(
                new TodoModel("3", "Learn Kotlin", "Learn Spring Boot", true)
        );
        this.todos.add(
                new TodoModel("4", "Learn Delta Force", "Learn Spring Boot", false)
        );

    }

    public ArrayList<TodoModel> findAll() {

        return todos;
    }
}