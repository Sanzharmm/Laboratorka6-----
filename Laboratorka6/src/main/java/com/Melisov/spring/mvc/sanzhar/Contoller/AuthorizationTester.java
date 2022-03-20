package com.Melisov.spring.mvc.sanzhar.Contoller;

import com.Melisov.spring.mvc.sanzhar.Model.Benutzer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorizationTester {

    @RequestMapping("/login")
    public String login(@ModelAttribute("User") Benutzer user){

        if(user.getUserType().equals("Deputy Director"))
        {
            return "/deputyDirector/menu-view";
        }
        else if(user.getUserType().equals("Tour composer"))
        {
            return "/tourComposer/menu-view";
        }
        else if(user.getUserType().equals("Tour manager"))
        {
            return "/tourManager/menu-view";
        }
        else if(user.getUserType().equals("Sales manager"))
        {
            return "/salesManager/menu-view";
        }
        return "";
    }

    @RequestMapping("/")
    public String authorView(Model model){
        model.addAttribute("user",new Benutzer());
        return "index";
    }

}
