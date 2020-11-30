package com.in28minutes.rest.webservice.restfullwebservice.exception;

import java.util.Date;

public class ExceptionResponse {

	private Date timestamp;

	private String mensage;

	private String detail;

	public ExceptionResponse(Date timestamp, String mensage, String detail) {
		this.timestamp = timestamp;
		this.mensage = mensage;
		this.detail = detail;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMensage() {
		return mensage;
	}

	public String getDetail() {
		return detail;
	}

}
