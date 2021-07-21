package com.winemall.mall.service;

import com.winemall.mall.pojo.Goods;
import com.winemall.mall.pojo.GoodsOrder;
import com.winemall.mall.pojo.Orders;
import org.springframework.core.annotation.Order;

import java.util.List;


public interface OrderService {
    //创建方法根据用户手机号码查询用户订单信息
    List<Orders> findOrdersByPhone(String phone);

    //根据订单编号查询订单
    Orders findOrderById(long id);

    //根据订单id查找goods_order
    List<GoodsOrder> findGoodsOrderById(long id);

    //创建方法根据订单编号删除订单(本质是修改,并不真正删除订单数据)
    boolean deleteOrderById(Orders order);

    //增加订单
    boolean insertOrders(Orders order);

    //往订单中添加商品
    boolean isnertGoodsOrder(List<GoodsOrder> goodsOrders);

    //更新订单: 根据商户交易订单编号修改子订单的状态
    boolean updateOrder(Orders order);
}
