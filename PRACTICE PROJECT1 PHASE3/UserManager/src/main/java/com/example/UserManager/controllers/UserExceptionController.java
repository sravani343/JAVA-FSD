package com.example.UserManager.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.UserManager.exceptions.UserNotFoundException;

@ControllerAdvice
public class UserExceptionController {
	@ExceptionHandler(value = UserNotFoundException.class)
    public ResponseEntity<String> exception(UserNotFoundException exception) {
       return new ResponseEntity<String>("User not found", HttpStatus.NOT_FOUND);
    }

}

