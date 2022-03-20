package com.Melisov.spring.mvc.sanzhar.Contoller;


import com.Melisov.spring.mvc.sanzhar.POJO.CLIENT;
import com.Melisov.spring.mvc.sanzhar.POJO.CONTRACT;
import com.Melisov.spring.mvc.sanzhar.POJO.PERMIT;
import com.Melisov.spring.mvc.sanzhar.POJO.TOUR;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sales of Manager")
public class Salesmanager {

    @RequestMapping("/menu-view")
    public String showMenu(){
        return "menu-view";
    }

    @RequestMapping("show-dates-and-program-view")
    public String showDatesAndProgram(Model model){
        model.addAttribute("tour",new TOUR());
        return "salesManager/show-dates-and-program-view";
    }

    @RequestMapping("issue-contract-view")
    public String issueContract(Model model){
        model.addAttribute("contract",new CONTRACT());
        return "salesManager/issue-contract-view";
    }

    @RequestMapping("create-tour-permit-view")
    public String createPermit(Model model){
        model.addAttribute("permit",new PERMIT());
        return "salesManager/create-tour-permit-view";
    }

    @RequestMapping("get-client-information-view")
    public String getClientInformation(Model model){
        model.addAttribute("client",new CLIENT());
        return "salesManager/get-client-information-view";
    }

    @RequestMapping("get-tour-information-view")
    public String getTourInformation(Model model){
        model.addAttribute("tour",new TOUR());
        return "salesManager/get-tour-information-view";
    }
}
