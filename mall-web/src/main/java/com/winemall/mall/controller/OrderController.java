package com.winemall.mall.controller;

import com.winemall.mall.dto.Result;
import com.winemall.mall.pojo.Address;
import com.winemall.mall.pojo.Goods;
import com.winemall.mall.pojo.GoodsOrder;
import com.winemall.mall.pojo.Orders;
import com.winemall.mall.service.AddressService;
import com.winemall.mall.service.OrderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST})
public class OrderController {
    // 调用远程服务
    @Reference
    private OrderService orderService;
    @Reference
    private AddressService addressService;

    @RequestMapping("/all")
    public List<Result<Orders, List<Goods>>> getOrdersByPhone(@RequestBody String phone){
        // 首先查询orders
        List<Orders> orders = orderService.findOrdersByPhone(phone);
        // 封装数据
        List<Result<Orders, List<Goods>>> results = new ArrayList<>();
        for(Orders order:orders){
            List<Goods> temp = null;
            // 查出所有的goods_id
            List<GoodsOrder> goodsOrders = orderService.findGoodsOrderById(order.getOrderId());
            // 循环查找所有的goods
            for(GoodsOrder goodsOrder:goodsOrders){
                Goods goods = new Goods();
//                Goods goods = goodsService.findGoodsById(goodsOrder.getGoodsId());
                temp.add(goods);
            }
            // 封装
            Result<Orders, List<Goods>> result = new Result<>();
            result.setEntity(order);
            result.setRelateOne(temp);
            results.add(result);
        }
        return results;
    }

    @RequestMapping("/detail")
    public List<Result<Goods, Integer>> getOrdersDetail(@RequestBody long orderId){
        // 封装数据
        List<Result<Goods, Integer>> results = new ArrayList<>();
        // 查询goods_order
        List<GoodsOrder> goodsOrders = orderService.findGoodsOrderById(orderId);
        // 循环查找goods
        for(GoodsOrder goodsOrder:goodsOrders){
            Goods goods = new Goods();
//                Goods goods = goodsService.findGoodsById(goodsOrder.getGoodsId());
            // 数据封装
            Result<Goods, Integer> result = new Result<>();
            result.setEntity(goods);
            result.setRelateOne(goodsOrder.getAmmount());
            results.add(result);
        }
        return results;
    }

    @RequestMapping("/addresses")
    public List<Address> getAllAddressByPhone(@RequestBody String phone){
        List<Address> addresses = addressService.findAddressByPhone(phone);
        return addresses;
    }

    @RequestMapping("/addaddress")
    public boolean addAddress(@RequestBody Address address){
        return addressService.insertAddress(address);
    }

    @RequestMapping("/setdefualt")
    public boolean setDefaultAddress(@RequestBody Address address){
        return addressService.setDefautlAddress(address);
    }
}
