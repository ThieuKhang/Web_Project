// src/main/java/com/khang/notes/controllers/HomeController.java
package com.khang.notes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // This will render index.html in src/main/resources/templates
    }
}
