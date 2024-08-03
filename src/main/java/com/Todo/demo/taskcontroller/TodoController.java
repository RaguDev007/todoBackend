package com.Todo.demo.taskcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Todo.demo.customException.ResourceNotFoundException;
import com.Todo.demo.dto.TodoUpdateDto;
import com.Todo.demo.entity.Todo;
import com.Todo.demo.taskservices.TodoServices;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

    @Autowired
    private TodoServices todoService;

    @PostMapping("/save")
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
        Todo createdTodo = todoService.createTodo(todo);
        return new ResponseEntity<>(createdTodo, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable Long id, @RequestBody TodoUpdateDto todoDTO) {
        Todo updatedTodo = todoService.updateTodo(id, todoDTO);
        return ResponseEntity.ok(updatedTodo);
    }

    @GetMapping("/alltasks")
    public ResponseEntity<List<Todo>> getAllTodos() {
        List<Todo> todos = todoService.getAllTodos();
        return ResponseEntity.ok(todos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTodoById(@PathVariable Long id) {
        try {
            Todo todo = todoService.getTodoById(id);
            return ResponseEntity.ok(todo);
        } catch (ResourceNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Todo not found");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTodo(@PathVariable Long id) {
        try {
            todoService.deleteTodo(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Todo deleted successfully");
        } catch (ResourceNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Todo not found");
        }
    }
}
