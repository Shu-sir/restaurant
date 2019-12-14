package com.cn.wanxi.webrestaurant.service.orderservice;

import com.cn.wanxi.webrestaurant.dao.oderdao.OrderDao;
import com.cn.wanxi.webrestaurant.entity.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderDao orderDao;
    public List<Order> queryOrder(){
        return orderDao.queryOrder();
    }
}
