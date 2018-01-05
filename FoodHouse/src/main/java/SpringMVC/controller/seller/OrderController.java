package SpringMVC.controller.seller;


import SpringMVC.dao.SellerDAO;
import SpringMVC.entity.Branch;
import SpringMVC.entity.Food;
import SpringMVC.entity.Order;
import SpringMVC.entity.OrderDetail;
import SpringMVC.service.BranchService;
import SpringMVC.service.FoodService;
import SpringMVC.service.OrderDetailService;
import SpringMVC.service.OrderService;
import net.sourceforge.jtds.jdbc.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private FoodService foodService;
    @Autowired
    private OrderDetailService orderDetailService;
    @Autowired
    private BranchService branchService;
    @Autowired
    private SellerDAO sellerDAO;
    @ModelAttribute
    public void addBranch(Model model, Principal principal){
        Branch currentBranch = sellerDAO.getSellerByUsername(principal.getName()).getBranch();
        model.addAttribute("branch", currentBranch);
    }
    @RequestMapping(path="/seller")
    public String index(Model model, Principal principal){
        Branch currentBranch = sellerDAO.getSellerByUsername(principal.getName()).getBranch();
        model.addAttribute("orders", currentBranch.getOrders());
        model.addAttribute("foods", currentBranch.getFoods());
        return "seller-index";
    }


    @RequestMapping(path="/seller/order/create", method = RequestMethod.POST)
    public String create(Model model, Order order, @RequestParam("food")int[] food, @RequestParam("food_quantity")int[] food_quantity, Principal principal){
        Branch currentBranch = sellerDAO.getSellerByUsername(principal.getName()).getBranch();
        if ((food == null) || (food.length == 0))
            return "redirect:/seller";
        order.setDate_time(new Date());
        order.setBranch_id(currentBranch);
        order.setStatus("CHECKING");
        order.setTotal_money(0);
        orderService.addOrder(order);
        double toltalMoney = 0;
        for(int i = 0; i < food.length; i++ ){
            Food foodEntity = foodService.getFood(food[i]);
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setOrder_id(order);
            orderDetail.setFood_id(foodEntity);
            orderDetail.setPrice(foodEntity.getPrice()*food_quantity[i]);
            toltalMoney += orderDetail.getPrice();
            orderDetail.setQuantity(food_quantity[i]);
            orderDetailService.addOrderDetail(orderDetail);
        }
        order.setTotal_money(toltalMoney);
        orderService.updateOrder(order);
        return "redirect:/seller";
    }

    @RequestMapping(value = "/seller/order/get", method = RequestMethod.GET)
    public @ResponseBody Order getOrder(@RequestParam int id){
        return orderService.getOrder(id);
    }
    @RequestMapping(value = "/seller/order/complete", method = RequestMethod.POST)
    public String completeOrder(@RequestParam int id){
        Order order =  orderService.getOrder(id);
        order.setStatus("PAID");
        orderService.updateOrder(order);
        return "redirect:/seller";
    }
}
