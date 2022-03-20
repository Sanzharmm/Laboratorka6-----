package com.Melisov.spring.mvc.sanzhar.Contoller;

import com.Melisov.spring.mvc.sanzhar.POJO.CLIENT;
import com.Melisov.spring.mvc.sanzhar.POJO.TOUR;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tourManager")
public class Tourofmanager {

    @RequestMapping("/menu-view")
    public String showMenu(){
        return "menu-view";
    }

    @RequestMapping("/tour-information-view")
    public String showTourInformation(Model model){
        model.addAttribute("tour",new TOUR());
        return "tourManager/tour-information-view";
    }

    @RequestMapping("/get-client-list")
    public String getClientList(Model model){
        model.addAttribute("client",new CLIENT());
        return "tourManager/get-client-list";
    }
}
