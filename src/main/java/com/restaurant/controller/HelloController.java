package com.restaurant.controller;

import com.restaurant.entity.UsersEntity;
import com.restaurant.vo.usersVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

  @GetMapping("/dashboard")
  public String dashboard() {
    return "Dashboard"; // refers to Dashboard.html in `src/main/resources/templates`
  }

  @GetMapping("/")
  public String showHomePage(Model model) {
    model.addAttribute("usersVO", new usersVO()); // Initialize the form object
    return "Home"; // Thymeleaf template name
  }

  @GetMapping("/restaurants")
  public String restaurantDetails() {
    return "RestaurantsDetails"; // refers to RestaurantsDetails.html
  }

  @GetMapping("/users")
  public String userDetails() {
    return "UserDetails"; // refers to UserDetails.html
  }

  @GetMapping("/register")
  public String register(Model model) {
    model.addAttribute("UsersEntity", new UsersEntity());
    return "Register";
  }
}
