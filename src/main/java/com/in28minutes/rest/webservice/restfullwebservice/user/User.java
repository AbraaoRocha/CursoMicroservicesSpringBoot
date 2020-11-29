package com.in28minutes.rest.webservice.restfullwebservice.user;

import java.util.Date;

public class User {

	private Integer id;

	private String name;

	private Date brithDate;

	protected User() {
		
	}
	
	public User(Integer id, String name, Date brithDate) {
		super();
		this.id = id;
		this.name = name;
		this.brithDate = brithDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBrithDate() {
		return brithDate;
	}

	public void setBrithDate(Date brithDate) {
		this.brithDate = brithDate;
	}

	@Override
	public String toString() {
		return String.format("User [id=%s, name=%s, brithDate=%s]", id, name, brithDate);
	}

}
