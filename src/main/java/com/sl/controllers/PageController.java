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

    //About Page
    @RequestMapping("/about")
    public String AboutPage(){
        System.out.println("About Page Handler");
        return "about";
    }

    //Services
    @RequestMapping("/services")
    public String ServicesPage(){
        System.out.println("Services Page Handler");
        return "services";
    }

    //Signup
    @RequestMapping("/register")
    public String SignupPage(){
        System.out.println("Signup Page Handler");
        return "register";
    }

    //Login
    @RequestMapping("/login")
    public String LoginPage(){
        System.out.println("Login page Handler");
        return "login";
    }

    //Contact
    @RequestMapping("/contact")
    public String ContactPage(){
        System.out.println("Contact Page Handler");
        return "contact";
    
    }

}
