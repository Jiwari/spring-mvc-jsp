package com.github.jiwari.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Constraint(
        validatedBy = CourseCodeConstraintValidator.class
)
public @interface CourseCode {
    String message() default "must start with EW";

    String value() default "EW";
}
