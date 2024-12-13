package com.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.restaurant.vo.usersVO;
import com.restaurant.entity.UsersEntity;
import com.restaurant.repositories.UserService;


@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    
    @PostMapping("/login")
    public String handleLogin(@ModelAttribute usersVO user, Model model) {
        // Validate the credentials (e.g., username and password)
        // boolean isAuthenticated = authenticationService.authenticate(loginForm.getUsername(), loginForm.getPassword());
        
        if (user.getUserName()!=null) {
            // Redirect to the dashboard or home page on success
            System.out.println(user.getUserName());
            System.out.println(user.getPassword());
            if(user.getPassword().isEmpty()){
                System.out.println(user.getPassword());
                model.addAttribute("error", "Invalid username or password");
                return "./";
            }
            return "/dashboard";
        } else {
            // Add an error message and reload the login page on failure
            model.addAttribute("error", "Invalid username or password");
            return "/login";
        }
    }

    @PostMapping("/register")
    public String registering(@ModelAttribute UsersEntity user,Model model){
        if(user!=null){
            userService.saveUser(user);
        }

            return null;
    }
}
