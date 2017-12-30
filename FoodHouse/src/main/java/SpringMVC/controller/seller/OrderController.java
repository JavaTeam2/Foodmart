package SpringMVC.controller.seller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
    @RequestMapping(path="/seller")
    public String index(){
        return "seller-index";
    }
}
