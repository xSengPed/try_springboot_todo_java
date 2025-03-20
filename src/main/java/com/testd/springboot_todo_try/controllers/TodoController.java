package com.testd.springboot_todo_try.controllers;


import com.testd.springboot_todo_try.models.TodoModel;
import com.testd.springboot_todo_try.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/todo")
public class TodoController {

    @Autowired
    private TodoRepository repository;
    /* Create */

    @PostMapping("/create")
    public void createTodo() {

    }

    /* Read */
    @GetMapping("")
    public List<TodoModel> getTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public void getTodo(@PathVariable String todo) {

    }


    /* Update */

    /* Delete */


}
