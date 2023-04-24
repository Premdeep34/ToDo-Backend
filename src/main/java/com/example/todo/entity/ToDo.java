package com.example.todo.entity;

public class ToDo {
	private int id;
	private String toDo;
	private boolean completed;
	
	public ToDo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ToDo(int id, String toDo, boolean completed) {
		super();
		this.id = id;
		this.toDo = toDo;
		this.completed = completed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getToDo() {
		return toDo;
	}

	public void setToDo(String toDo) {
		this.toDo = toDo;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", toDo=" + toDo + ", completed=" + completed + "]";
	}
	
}
