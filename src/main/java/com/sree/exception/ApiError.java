package com.sree.exception;

import java.util.Date;

public class ApiError {
	
	public int errorCode;
	public String desc;
	public Date date;
	
	public ApiError(int errorCode, String desc, Date date) {
		super();
		this.errorCode = errorCode;
		this.desc = desc;
		this.date = date;
	}
	

}
