package com.github.jiwari.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String world() {
        return "main-menu";
    }

    @GetMapping("/searchStudent")
    public String searchStudent() {
        return "searchStudent";
    }

    @GetMapping("/showForm")
    public String showForm() {
        return "showForm";
    }

    @GetMapping("/processFormV2")
    public Object letsShoutDude(Model model, @RequestParam String studentName) {
        String result = "Yo! " + studentName.toUpperCase();
        model.addAttribute("message", result);
        return "shout-view";
    }
}
