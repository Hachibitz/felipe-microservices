package br.com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidOperatorException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public InvalidOperatorException(String exception) {
		super(exception);
	}
}
