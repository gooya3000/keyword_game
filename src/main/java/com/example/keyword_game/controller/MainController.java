package com.example.keyword_game.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class MainController {

    @GetMapping("")
    public String welcome(Model model){
        model.addAttribute("data","소영");
        return "/main/welcome";
    }
}
