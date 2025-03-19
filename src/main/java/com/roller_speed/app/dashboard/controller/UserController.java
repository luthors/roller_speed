package com.roller_speed.app.dashboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.roller_speed.app.dashboard.model.entity.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "users/login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String email, @RequestParam String password, Model model) {
        // TODO: Implementar lógica de autenticación
        boolean isAuthenticated = true; // Simulación

        if (isAuthenticated) {
            return "redirect:/profile";
        } else {
            model.addAttribute("error", "Correo o contraseña incorrectos");
            return "users/login";
        }
    }

    @GetMapping("/register")
    public String showRegisterPage() {
        return "users/register";
    }

    @PostMapping("/register")
    public String processRegister(@RequestParam String name, @RequestParam String email, 
                                  @RequestParam String password, Model model) {
        // TODO: Implementar lógica de registro
        boolean isRegistered = true; // Simulación

        if (isRegistered) {
            return "redirect:/login";
        } else {
            model.addAttribute("error", "Error al registrar usuario");
            return "users/register";
        }
    }

    
    /* profile */
    @GetMapping("/profile")
    public String showProfilePage(Model model) {
        
        model.addAttribute("user", new User());
        return "users/profile";
    }

        
        
}
