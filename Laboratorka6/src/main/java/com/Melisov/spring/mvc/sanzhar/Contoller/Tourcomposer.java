package com.Melisov.spring.mvc.sanzhar.Contoller;


import com.Melisov.spring.mvc.sanzhar.POJO.CLIENT;
import com.Melisov.spring.mvc.sanzhar.POJO.EVENTTICKETS;
import com.Melisov.spring.mvc.sanzhar.POJO.PROGRAM;
import com.charginovmarsel.spring.mvc.sanzhar.POJO.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tourComposer")
public class Tourcomposer {

    @RequestMapping("/menu-view")
    public String showMenu(){
        return "menu-view";
    }

    @RequestMapping("/compile-applications-view")
    public String compileApplications(Model model){
        model.addAttribute("ticket",new EVENTTICKETS());
        return "tourComposer/compile-applications-view";
    }

    @RequestMapping("/make-program-view")
    public String makeProgram(Model model){
        model.addAttribute("program",new PROGRAM());
        return "tourComposer/make-program-view";
    }

    @RequestMapping("/read-customer-review-view")
    public String readCustomerReview(Model model){
        model.addAttribute("client",new CLIENT());
        return "tourComposer/read-customer-review-view";
    }

}
