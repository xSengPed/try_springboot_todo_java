package com.testd.springboot_todo_try.repositories;

import com.testd.springboot_todo_try.models.TodoModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {
    private ArrayList<TodoModel> todos = new ArrayList<>();

    TodoRepository() {
        this.todos.add(
                new TodoModel(1, "Learn Spring Boot", "Learn Spring Boot", false)
        );
        this.todos.add(
                new TodoModel(2, "Learn Flutter", "Learn Spring Boot", false)
        );
        this.todos.add(
                new TodoModel(3, "Learn Kotlin", "Learn Spring Boot", true)
        );
        this.todos.add(
                new TodoModel(4, "Learn Delta Force", "Learn Spring Boot", false)
        );

    }

    public void create(TodoModel todo) {
        todos.add(todo);
    }

    public List<TodoModel> findAll() {
        return todos;
    }

    public TodoModel findById(int id) {
        return todos.stream().filter(todo -> todo.getId() == id).findFirst().orElse(null);
    }

    public void update(TodoModel todo) {
        TodoModel todoToUpdate = findById(todo.getId());
        if (todoToUpdate != null) {
            todoToUpdate.setTitle(todo.getTitle());
            todoToUpdate.setDesc(todo.getDesc());
            todoToUpdate.setCompleted(todo.isCompleted());
        }
    }

    public void delete(int id) {
        todos.removeIf(todo -> todo.getId() == id);
    }


}