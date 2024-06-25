package com.sl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PageController {

    @RequestMapping("/home")
    public String requestMethodName(Model model) {
        System.out.println("Home Page Handler");
        model.addAttribute("name", "Pratik Lad ");
        return "home";
    }
}
