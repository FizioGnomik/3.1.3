package com.example.demo.controller;

import com.example.demo.model.User;;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/")
    public String show(@AuthenticationPrincipal User user, ModelMap model) {
        model.addAttribute("user", user);
        return "user/user";
    }
}

