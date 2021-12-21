package com.github.jiwari.model;

import lombok.Data;

import java.util.Collection;

@Data
public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String programmingLanguage;
    private Collection<String> operationalSystems;

}
