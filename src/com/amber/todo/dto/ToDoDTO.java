package com.amber.todo.dto;

import java.io.Serializable;
import java.util.Date;
import com.amber.todo.utils.Constants;

public class ToDoDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String desc;
	private Date date;
	private String status;
	
	private ToDoDTO() {
		date = new Date();
		status = Constants.PENDING;
	}
	
	public ToDoDTO(String name, String desc) {
		this();
		this.name = name;
		this.desc = desc;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDecs(String desc) {
		this.desc = desc;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "ToDoDTO [name=" + name + ", decs=" + desc + ", date=" + date + ", status=" + status + "]";
	}

	
	
}
