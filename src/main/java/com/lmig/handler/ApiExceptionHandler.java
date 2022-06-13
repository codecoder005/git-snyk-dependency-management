package com.lmig.handler;

import com.lmig.error.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
class ApiExceptionHandler {
    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public ResponseEntity<Object> handleSpringValidators(MethodArgumentNotValidException e, HttpServletRequest request) {
        Error error = new Error();
        return ResponseEntity.badRequest().body(error);
    }
}
