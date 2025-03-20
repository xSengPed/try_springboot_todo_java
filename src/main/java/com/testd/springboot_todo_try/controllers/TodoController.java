package com.testd.springboot_todo_try.controllers;


import com.testd.springboot_todo_try.models.ResponseModel;
import com.testd.springboot_todo_try.models.TodoModel;
import com.testd.springboot_todo_try.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/todo")
public class TodoController {

    @Autowired
    private TodoRepository repository;

    /* Create */
    // Request Body
    @PostMapping("/create")
    public ResponseEntity<ResponseModel<TodoModel>> createTodo(@RequestBody TodoModel request) {
        repository.create(request);
        try {
            return ResponseEntity.status(200).body(new ResponseModel<TodoModel>(1000, "create success", request));
        } catch (Exception exception) {
            return ResponseEntity.status(500).body(new ResponseModel<TodoModel>(5000, "create failed", null));
        }
    }

    /* Read */
    @GetMapping("/all")
    public ResponseEntity<ResponseModel<List<TodoModel>>> getTodos() {
        final List<TodoModel> result = repository.findAll();
        return ResponseEntity.status(200).body(new ResponseModel<List<TodoModel>>(1000, "create success", result));
    }


    // Request Query / Query Params
    @GetMapping("")
    public ResponseEntity<ResponseModel<TodoModel>> getTodoById(@RequestParam(required = true) String id) {
        try {
            final TodoModel result = repository.findById(Integer.parseInt(id));
            return ResponseEntity.status(200).body(new ResponseModel<TodoModel>(1000, "get success", result));
        } catch (Exception exception) {
            return ResponseEntity.status(500).body(new ResponseModel<TodoModel>(5000, "get failed", null));
        }
    }

    // Request Params
    @GetMapping("/{id}")
    public ResponseEntity<ResponseModel<TodoModel>> getTodo(@PathVariable String id) {

        try {
            final TodoModel result = repository.findById(Integer.parseInt(id));
            return ResponseEntity.status(200).body(new ResponseModel<TodoModel>(1000, "create success", result));

        } catch (Exception exception) {
            return ResponseEntity.status(500).body(new ResponseModel<TodoModel>(5000, "get failed", null));
        }

    }


    /* Update */
    @PutMapping("/update")
    public ResponseEntity<ResponseModel<TodoModel>> updateTodoById(@RequestBody TodoModel request) {
        repository.update(request);
        try {
            return ResponseEntity.status(200).body(new ResponseModel<TodoModel>(1000, "update success", request));
        } catch (Exception exception) {
            return ResponseEntity.status(500).body(new ResponseModel<TodoModel>(5000, "update failed", null));
        }
    }

    /* Delete */
    @DeleteMapping("/delete")
    public ResponseEntity<ResponseModel<TodoModel>> deleteTodoById(@RequestParam(required = true) String id) {
        try {
            repository.delete(Integer.parseInt(id));
            return ResponseEntity.status(200).body(new ResponseModel<TodoModel>(1000, "delete success", null));
        } catch (Exception exception) {
            return ResponseEntity.status(500).body(new ResponseModel<TodoModel>(5000, "delete failed", null));
        }
    }


}
