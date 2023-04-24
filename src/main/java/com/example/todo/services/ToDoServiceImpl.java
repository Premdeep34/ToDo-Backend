package com.example.todo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.todo.entity.ToDo;

@Service
public class ToDoServiceImpl implements ToDoService {
	List<ToDo> todos;
	
	public ToDoServiceImpl() {
		todos = new ArrayList<>();
		
		todos.add(new ToDo(1, "Buy Chocolates", false));
		todos.add(new ToDo(2, "Buy apples", false));
		todos.add(new ToDo(3, "Buy magoes", false));
		todos.add(new ToDo(4, "Buy bananas", false));
	}
	
	//----------------------- Get ToDo
	@Override
	public List<ToDo> getToDos() {
		return todos;
	}

	//------------------------ Add ToDo
	@Override
	public ToDo addToDo(ToDo toDo) {
		todos.add(toDo);
		
		return toDo;
	}

	//------------------------ Delete ToDo
	@Override
	public ToDo deleteToDo(int id) {
		ToDo del_toDo = null;
		
		for (ToDo toDo : todos) {
			if (toDo.getId() == id) {
				del_toDo = toDo;
				todos.remove(toDo);
				break;
			}
		}
		
		return del_toDo;
	}

	//------------------------ Update ToDo
	@Override
	public ToDo updateToDo(ToDo toDo) {
		int i = 0; 
		
		for (ToDo task : todos) {
			if (task.getId() == toDo.getId()) {
				todos.set(i, toDo);
				break;
			}
			
			i++;
		}
		
		return toDo;
	}

}
