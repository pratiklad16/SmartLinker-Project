package com.sl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import static java.lang.System.out;
import com.sl.entities.User;
import com.sl.forms.Userform;
import com.sl.services.UserService;

@Controller
public class PageController {

    @Autowired
    private UserService userService;

    @RequestMapping("/home")
    public String requestMethodName(Model model) {
        System.out.println("Home Page Handler");
        model.addAttribute("name", "Pratik Lad ");
        return "home";
    }

    // About Page
    @RequestMapping("/about")
    public String AboutPage() {
        System.out.println("About Page Handler");
        return "about";
    }

    // Services
    @RequestMapping("/services")
    public String ServicesPage() {
        System.out.println("Services Page Handler");
        return "services";
    }

    // Signup
    @RequestMapping("/register")
    public String SignupPage(Model model) {
        Userform userform = new Userform();
        model.addAttribute("userform", userform);
        System.out.println("Signup Page Handler");
        return "register";
    }

    // Login
    @RequestMapping("/login")
    public String LoginPage() {
        System.out.println("Login page Handler");
        return "login";
    }

    // Contact
    @RequestMapping("/contact")
    public String ContactPage() {
        System.out.println("Contact Page Handler");
        return "contact";

    }

    // processing registeration form
    @RequestMapping(value = "/do-register", method = RequestMethod.POST)
    public String processRegister(@ModelAttribute Userform userform) {
        System.out.println(userform);

        User user = User.builder()
                .name(userform.getName())
                .email(userform.getEmail())
                .password(userform.getPassword())
                .about(userform.getAbout())
                .phoneNumber(userform.getPhoneNumber())
                .profile(
                        "https://static.vecteezy.com/system/resources/previews/030/504/836/non_2x/avatar-account-flat-isolated-on-transparent-background-for-graphic-and-web-design-default-social-media-profile-photo-symbol-profile-and-people-silhouette-user-icon-vector.jpg")
                .build();

        User savedUser = userService.saveUser(user);
        System.out.println("user saved" + savedUser);
        return "redirect:/register";
    }

}
