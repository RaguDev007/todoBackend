package com.Todo.demo.taskservices;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Todo.demo.customException.ResourceNotFoundException;
import com.Todo.demo.dto.TodoNoteDTO;
import com.Todo.demo.dto.TodoUpdateDto;
import com.Todo.demo.dto.TodostatusDTO;
import com.Todo.demo.entity.Todo;
import com.Todo.demo.repo.TodoRepo;

@Service
public class TodoServices {

	@Autowired
	TodoRepo todoRepo;
	
	@Autowired
	ModelMapper modelMapper;
	
	public List<Todo> getAllTodos() {
        return todoRepo.findAll();
    }

    public Todo getTodoById(Long id) {
        return todoRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Todo not found" + id));
    }

    public Todo createTodo(Todo todo) {
        return todoRepo.save(todo);
    }
    
    ///////////////update only Note ////////////////////////////
    
    public Todo updateTaskNote(Long id, TodoNoteDTO taskNoteDTO) {
        Todo existingTodo = getTodoById(id);
        modelMapper.map(taskNoteDTO, existingTodo); // Map only taskNote field
        return todoRepo.save(existingTodo);
    }

    ///////////////update only status ////////////////////////////
    
    public Todo updateStatus(Long id, TodostatusDTO statusDTO) {
        Todo existingTodo = getTodoById(id);
        modelMapper.map(statusDTO, existingTodo); // Map only status field
        return todoRepo.save(existingTodo);
    }

    public Todo updateTodo(Long id, TodoUpdateDto todoDto) {
        Todo existingTodo = getTodoById(id);
        existingTodo.setTaskTitle(todoDto.getTaskTitle());
        existingTodo.setTaskDeadline(todoDto.getTaskDeadline());
        existingTodo.setStatus(todoDto.getStatus());
        existingTodo.setTaskNote(todoDto.getTaskNote());
        return todoRepo.save(existingTodo);
    }

    public void deleteTodo(Long id) { 
    	todoRepo.deleteById(id);
    }

	
	


}
