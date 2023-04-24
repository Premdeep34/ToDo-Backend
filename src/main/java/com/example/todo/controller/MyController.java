package com.example.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.entity.ToDo;
import com.example.todo.services.ToDoService;

@CrossOrigin(origins = "*")
@RestController
public class MyController {
	
	@Autowired
	private ToDoService toDoService;
	
	@GetMapping("/todos")
	public List<ToDo> getToDos() {
		return toDoService.getToDos();
	}
	
	@PostMapping("/todos")
	public ToDo addToDo(@RequestBody ToDo toDo) {
		return toDoService.addToDo(toDo);
	}
	
	@DeleteMapping("/todos/{id}")
	public ToDo deleteToDo(@PathVariable int id) {
		return toDoService.deleteToDo(id);
	}
	
	@PutMapping("/todos")
	public ToDo updateToDo(@RequestBody ToDo toDo) {
		return toDoService.updateToDo(toDo);
	}
}
