package SpringMVC.controller.seller;


import SpringMVC.entity.*;
import SpringMVC.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class ReportController {
    @Autowired
    private CostsIncurredService costsIncurredService;
    @Autowired
    private BranchService branchService;
    @RequestMapping(path="/seller/report")
    public String index(Model model){
        return "report-index";
    }

    @RequestMapping(path="/seller/report/create")
    public String index(CostsIncurred costsIncurred, Model model){
        if (costsIncurred.getCost()>0){
            costsIncurred.setDate(new Date());
            costsIncurred.setBranch_id(branchService.getBranch(1));
            costsIncurredService.addCostsIncurred(costsIncurred);
        }
        return "redirect:/seller/report";
    }
}
