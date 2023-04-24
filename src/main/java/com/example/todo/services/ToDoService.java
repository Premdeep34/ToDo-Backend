package com.example.todo.services;

import java.util.List;

import com.example.todo.entity.ToDo;

public interface ToDoService {
	public List<ToDo> getToDos();
	public ToDo addToDo(ToDo toDo);
	public ToDo deleteToDo(int id);
	public ToDo updateToDo(ToDo toDo);
}
