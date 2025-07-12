package com.sree.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

	@ExceptionHandler(value = NoStudentFoundError.class)
	public ResponseEntity<ApiError> handlestudentNotFound() {
		ApiError error = new ApiError(400,"No Student Found",new Date());
		return new ResponseEntity<ApiError>(error,HttpStatus.BAD_REQUEST);
	}
	
}
