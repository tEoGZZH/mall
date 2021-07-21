package com.winemall.mall.service.impl;

import com.winemall.mall.mapper.GoodsOrderMapper;
import com.winemall.mall.mapper.OrdersMapper;
import com.winemall.mall.pojo.GoodsOrder;
import com.winemall.mall.pojo.GoodsOrderExample;
import com.winemall.mall.pojo.Orders;
import com.winemall.mall.pojo.OrdersExample;
import com.winemall.mall.service.OrderService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService {
    //自动装配一个 OrdersMapper
    @Autowired
    private OrdersMapper ordersMapper;
    //自动装配一个 GoodsOrderMapper
    @Autowired
    private GoodsOrderMapper goodsOrderMapper;

    @Override
    public List<Orders> findOrdersByPhone(String phone) {
        //创建一个Example对象
        OrdersExample ordersExample = new OrdersExample();
        //设置查询条件
        ordersExample.createCriteria().andPhoneEqualTo(phone);
        //调用orderMapper接口的方法查询订单
        List<Orders> orders = ordersMapper.selectByExample(ordersExample);
        return orders;
    }

    @Override
    public Orders findOrderById(long id){
        Orders orders= ordersMapper.selectByPrimaryKey(id);
        return orders;
    }

    @Override
    public List<GoodsOrder> findGoodsOrderById(long id){
        Orders orders= ordersMapper.selectByPrimaryKey(id);
        GoodsOrderExample goodsOrderExample = new GoodsOrderExample();
        // 设置查询条件
        goodsOrderExample.createCriteria().andOrderIdEqualTo(id);
        //调用goodsorderMapper接口的方法查询订单
        List<GoodsOrder> goodsOrders = goodsOrderMapper.selectByExample(goodsOrderExample);
        return goodsOrders;
    }

    @Override
    public boolean deleteOrderById(Orders order) {
        // 调用orderMapper接口方法进行数据删除("修改")操作
        int i = ordersMapper.updateByPrimaryKeySelective(order);
        if (i > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean insertOrders(Orders orders) {
        //插入数据
        ordersMapper.insertSelective(orders);
        return true;
    }

    @Override
    public boolean isnertGoodsOrder(List<GoodsOrder> goodsOrders){
        // 循环插入数据
        boolean res=false;
        int pre=1, curr;
        for(GoodsOrder goodsOrder : goodsOrders){
            curr = goodsOrderMapper.insertSelective(goodsOrder);
            res = (curr>1 && pre>1);
            pre = curr;
        }
        return res;
    }

    @Override
    public boolean updateOrder(Orders order) {
        int i = ordersMapper.updateByPrimaryKeySelective(order);
        return i > 0;
    }
}
