package SpringMVC.controller.seller;


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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    @RequestMapping(path="/seller")
    public String index(Model model){
        model.addAttribute("orders", orderService.getOrders());
        model.addAttribute("foods", branchService.getBranchHasFood(1).getFoods());
        return "seller-index";
    }

    @RequestMapping(path="/seller/test")
    public String index(Food food, Model model){
        int a = 5;
        return "redirect:/seller";
    }

    @RequestMapping(path="/seller/order/create", method = RequestMethod.GET)
    public String create(Model model, Order order, @RequestParam("food")int[] food, @RequestParam("food_quantity")int[] food_quantity){
        order.setDate_time(new Date());
        order.setBranch_id(branchService.getBranch(1));
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
}
