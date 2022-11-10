package com.example.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String main(Model model) {

        return "index";
    }
    @RequestMapping("/profile")
    public String profile(Model model) {

        return "profile";
    }

    @RequestMapping("/table")
    public String table(Model model) {

        return "table";
    }


}
