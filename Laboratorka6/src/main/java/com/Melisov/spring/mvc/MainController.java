package com.Melisov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class MainController {

//    @RequestMapping("/")
//    public String showFirstView(){
//        return "first-view";
//    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
        model.addAttribute("employee",new Human());
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@ModelAttribute("employee") Human employee){

        return "show-emp-details-view";
    }
}
