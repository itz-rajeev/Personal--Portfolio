package com.portfolio.my_portfolio.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // Serves templates/index.html
    }

    @GetMapping("/projects")
    public String projects() {
        return "projects"; // Serves templates/projects.html
    }

    @GetMapping("/experience")
    public String experience() {
        return "experience"; // Serves templates/experience.html
    }
}