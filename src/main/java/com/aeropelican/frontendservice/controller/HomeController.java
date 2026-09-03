package com.aeropelican.frontendservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/ui/login")
    public String login() {
        return "login";
    }

    @GetMapping("/ui/home")
    public String homepage() {
        return "home";
    }

    @GetMapping("/ui/profile")
    public String profile() {
        return "profile";
    }

    @GetMapping("/ui/orders")
    public String orders() {
        return "orders";
    }

    @GetMapping("/ui/cart")
    public String cart() {
        return "cart";
    }
}
