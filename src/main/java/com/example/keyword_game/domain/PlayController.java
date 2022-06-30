package com.example.keyword_game.domain;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlayController {

    @GetMapping("/play")
    public String hello(Model model){
        model.addAttribute("data","hello!!!");
        return "Hello";
    }
}
