package com.deni.test.message;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Messages {
	@Id
	int id;
	String message;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Messages(int id, String message) {
		super();
		this.id = id;
		this.message = message;
	}

	public Messages() {
		super();
	}

	@Override
	public String toString() {
		return "Messages [id=" + id + ", message=" + message + "]";
	}
	
	
	
	
	

}
