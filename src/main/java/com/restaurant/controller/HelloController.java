package com.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

  @GetMapping("/dashboard")
  public String dashboard() {
    return "Dashboard"; // refers to Dashboard.html in `src/main/resources/templates`
  }

  @GetMapping("/")
  public String home() {
    return "Home";
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
  public String register() {
    return "Register";
  }
}
