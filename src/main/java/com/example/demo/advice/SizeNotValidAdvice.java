package com.example.demo.advice;

import com.example.demo.exception.SizeNotValidException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class SizeNotValidAdvice {

    @ExceptionHandler(value = {SizeNotValidException.class})
    public ResponseEntity sizeNotValidHandler(final SizeNotValidException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("SIZE NOT VALID");
    }
}
