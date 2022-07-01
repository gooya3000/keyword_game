package com.example.keyword_game.controller;

import com.example.keyword_game.dto.QuestDTO;
import com.example.keyword_game.service.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import javax.validation.Validation;

@Controller
@RequestMapping("/quest")
public class QuestController {

    @Autowired
    QuestService questService;

    @GetMapping("/enroll")
    public String enroll(Model model, QuestDTO dto){
        model.addAttribute("title", "Enroll");
        return "quest/enroll";
    }

    @PostMapping("/enroll")
    public String enrolAction(Model model, @Validated QuestDTO questDTO, Errors errors, BindingResult bindingResult){
        if (errors.hasErrors()){
            model.addAttribute("title", "Enroll");
            return "quest/enroll";
        }else{
            questService.enroll(questDTO);
            return "redirect:/welcome";
        }


    }
}

