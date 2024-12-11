package com.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.restaurant.vo.usersVO;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String handleLogin(@ModelAttribute usersVO loginForm, Model model) {
        // Validate the credentials (e.g., username and password)
        // boolean isAuthenticated = authenticationService.authenticate(loginForm.getUsername(), loginForm.getPassword());
        
        if (loginForm.getUserName()!=null) {
            // Redirect to the dashboard or home page on success
            System.out.println(loginForm.getUserName());
            return "/dashboard";
        } else {
            // Add an error message and reload the login page on failure
            model.addAttribute("error", "Invalid username or password");
            return "/login";
        }
    }
}
