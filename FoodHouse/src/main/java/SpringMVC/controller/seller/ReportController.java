package SpringMVC.controller.seller;


import SpringMVC.dao.SellerDAO;
import SpringMVC.dao.impl.SellerDAOImpl;
import SpringMVC.entity.*;
import SpringMVC.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ReportController {
    @Autowired
    private CostsIncurredService costsIncurredService;
    @Autowired
    private BranchService branchService;
    @Autowired
    private SellerDAO sellerDAO;
    @ModelAttribute
    public void addBranch(Model model, Principal principal){
        Branch currentBranch = sellerDAO.getSellerByUsername(principal.getName()).getBranch();
        model.addAttribute("branch", currentBranch);
    }
    @RequestMapping(path="/seller/report")
    public String index(Model model, Principal principal){
        Branch currentBranch = sellerDAO.getSellerByUsername(principal.getName()).getBranch();
        model.addAttribute("reports", currentBranch.getCostsIncurred());
        return "report-index";
    }
    @RequestMapping(path="/seller/report-monthly")
    public String reportMonthly(Model model){
        return "report-monthly";
    }

    @RequestMapping(path="/seller/report/create")
    public String index(CostsIncurred costsIncurred, Model model, Principal principal){
        Branch currentBranch = sellerDAO.getSellerByUsername(principal.getName()).getBranch();
        if (costsIncurred.getCost()>0){
            costsIncurred.setDate(new Date());
            costsIncurred.setBranch_id(currentBranch);
            costsIncurredService.addCostsIncurred(costsIncurred);
        }
        return "redirect:/seller/report";
    }
    @RequestMapping(path="/seller/report-monthly/create")
    public String index(Model model,
                        @RequestParam(name = "cause")String cause[],
                        @RequestParam(name = "cost")double cost[],
                        @RequestParam(name = "date")String date, Principal principal){
        Branch currentBranch = sellerDAO.getSellerByUsername(principal.getName()).getBranch();
        for (int i=0; i < cause.length; i++){
            CostsIncurred costsIncurred = new CostsIncurred();
            costsIncurred.setCost(cost[i]);
            costsIncurred.setCause(cause[i]);
            DateFormat df = new SimpleDateFormat("yyyy-MM");
            Date startDate = null;
            try {
                startDate = df.parse(date);
            } catch (ParseException e) {
                return "redirect:/seller/report-monthly";
            }
            Seller seller = sellerDAO.getSellerByUsername(principal.getName());
            costsIncurred.setDate(startDate);
            costsIncurred.setBranch_id(currentBranch);
            costsIncurredService.addCostsIncurred(costsIncurred);
        }
        return "redirect:/seller/report";
    }
}
