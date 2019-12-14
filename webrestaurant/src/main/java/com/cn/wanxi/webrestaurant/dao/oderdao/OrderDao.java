package com.cn.wanxi.webrestaurant.dao.oderdao;
import com.cn.wanxi.webrestaurant.entity.order.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface OrderDao {
    @Select("select * from t_order")
    List<Order> queryOrder();
}
