package com.hcl.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ResponseDto> loginExceptionHandler(UserNotFoundException ex, WebRequest request) {

		ResponseDto responseDto = new ResponseDto();
		responseDto.setMessage(ex.getMessage());
		responseDto.setStatusCode(404);
    	return new ResponseEntity<>(responseDto, HttpStatus.NOT_FOUND);


	}
	@ExceptionHandler(EnterValidDetailsException.class)
	public ResponseEntity<ResponseDto> regExceptionHandler(EnterValidDetailsException ex, WebRequest request) {

		ResponseDto responseDto = new ResponseDto();
		responseDto.setMessage(ex.getMessage());
		responseDto.setStatusCode(400);
    	return new ResponseEntity<>(responseDto, HttpStatus.BAD_REQUEST);


	}


}