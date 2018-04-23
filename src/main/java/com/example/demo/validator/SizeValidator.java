package com.example.demo.validator;

import com.example.demo.model.Size;
import com.example.demo.exception.SizeNotValidException;
import org.springframework.stereotype.Component;

@Component
public class SizeValidator {

    public void validate(Size size) {
        if (Size.FOUR.equals(size) || Size.FIVE.equals(size)) {
            throw new SizeNotValidException();
        }
    }
}
