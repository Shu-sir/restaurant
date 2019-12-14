package com.cn.wanxi.webrestaurant.common.Order;

import com.cn.wanxi.webrestaurant.service.orderservice.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderCommon {
    @Autowired
    OrderService orderService;
    @RequestMapping("/order")
    public String queryOrder(Model model){
        model.addAttribute("orderList",orderService.queryOrder());
        System.out.println(model);
        return "order";
    }
}
