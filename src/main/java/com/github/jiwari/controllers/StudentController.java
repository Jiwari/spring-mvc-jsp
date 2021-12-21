package com.github.jiwari.controllers;

import com.github.jiwari.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private Map<String, String> countriesOptions;
    @Autowired
    private Map<String, String> programmingLanguagesOptions;
    @Autowired
    private Map<String, String> operationalSystemsOptions;

    @RequestMapping("/add")
    public String viewForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("countriesOptions", countriesOptions);
        model.addAttribute("programmingLanguagesOptions", programmingLanguagesOptions);
        model.addAttribute("operationalSystemOptions", operationalSystemsOptions);
        return "student/add";
    }

    @RequestMapping("/confirmation")
    public String viewForm(@ModelAttribute("student") Student student) {
        return "student/confirmation";
    }
}
