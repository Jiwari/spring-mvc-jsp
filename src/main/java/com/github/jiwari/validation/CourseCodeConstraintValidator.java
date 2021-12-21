package com.github.jiwari.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String annotationCode;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        annotationCode = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return value != null && value.startsWith(annotationCode);
    }
}
