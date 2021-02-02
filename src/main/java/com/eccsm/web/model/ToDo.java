package com.eccsm.web.model;

import java.util.Date;

import javax.validation.constraints.Size;

import lombok.Data;

@Data

public class ToDo {

	private Integer id;
	private String user;
	@Size(min = 10, message = "Enter at least 10 Characters...")
	private String desc;

	private Date targetDate;
	private boolean isDone;

	public ToDo() {
		super();
	}

	public ToDo(int id, String user, String desc, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.user = user;
		this.desc = desc;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}

}
