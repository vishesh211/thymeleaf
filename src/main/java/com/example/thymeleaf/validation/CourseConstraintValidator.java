package com.example.thymeleaf.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;
    @Override
    public void initialize(CourseCode theCode) {
        coursePrefix = theCode.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;

        if (s != null) {
            result = s.startsWith(coursePrefix);
        } else {
            result = true;
        }

        return result;
    }
}
