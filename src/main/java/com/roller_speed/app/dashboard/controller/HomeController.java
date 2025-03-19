package com.roller_speed.app.dashboard.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String index() {
        return "home/index";
    }

    @GetMapping("/about")
    public String about() {
        return "home/about";
    }

    @GetMapping("/services")
    public String services() {
        return "home/services";
    }

    @GetMapping("/gallery")
    public String gallery() {
        return "home/gallery";
    }

    @GetMapping("/testimonials")
    public String testimonials() {
        return "home/testimonials";
    }

    @GetMapping("/news")
    public String news() {
        return "home/news";
    }
}
