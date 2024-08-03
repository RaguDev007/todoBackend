package com.Todo.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String taskTitle;
	private String taskNote;
	private String taskEnrolleddate;
	private String taskDeadline;
	private String Status;

	public Todo() {
	}

	public Todo(Long id, String taskTitle, String taskNote, String taskEnrolleddate, String taskDeadline,
			String status) {
		this.Id = id;
		this.taskTitle = taskTitle;
		this.taskNote = taskNote;
		this.taskEnrolleddate = taskEnrolleddate;
		this.taskDeadline = taskDeadline;
		this.Status = status;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		this.Id = id;
	}

	public String getTaskTitle() {
		return taskTitle;
	}

	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}

	public String getTaskNote() {
		return taskNote;
	}

	public void setTaskNote(String taskNote) {
		this.taskNote = taskNote;
	}

	public String getTaskEnrolleddate() {
		return taskEnrolleddate;
	}

	public void setTaskEnrolleddate(String taskEnrolleddate) {
		this.taskEnrolleddate = taskEnrolleddate;
	}

	public String getTaskDeadline() {
		return taskDeadline;
	}

	public void setTaskDeadline(String taskDeadline) {
		this.taskDeadline = taskDeadline;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		this.Status = status;
	}

	@Override
	public String toString() {
		return "Task [Id=" + Id + ", taskTitle=" + taskTitle + ", taskNote=" + taskNote + ", taskEnrolleddate="
				+ taskEnrolleddate + ", taskDeadline=" + taskDeadline + ", Status=" + Status + "]";
	}

}
