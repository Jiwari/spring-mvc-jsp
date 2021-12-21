package com.github.jiwari.model;

import com.github.jiwari.validation.CourseCode;
import lombok.Data;

import javax.validation.constraints.*;

@Data
public class Customer {

    private String firstName;

    @NotNull(message = "can't be empty")
    @Size(min = 1, message = "minimum 1 character")
    private String lastName;

    @NotNull
    @Min(value = 0, message = "Number needs to be higher than 0")
    @Max(value = 10, message = "Needs to be lower than 10")
    private Integer freePasses;

    @Pattern(regexp = "\\d{5}", message = "Please enter a valid 5 digit postal code")
    private String postalCode;

    @CourseCode
    private String courseCode;

}
