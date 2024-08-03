package com.Todo.demo.dto;

public class TodoUpdateDto {

	private Long Id;
	private String taskTitle;
	private String taskNote;
	private String taskEnrolleddate;
	private String taskDeadline;
	private String Status;

	public TodoUpdateDto(Long id, String taskTitle, String taskNote, String taskEnrolleddate, String taskDeadline,
			String status) {

		Id = id;
		this.taskTitle = taskTitle;
		this.taskNote = taskNote;
		this.taskEnrolleddate = taskEnrolleddate;
		this.taskDeadline = taskDeadline;
		Status = status;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
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
		Status = status;
	}

}
