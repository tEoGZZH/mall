package com.winemall.mall.service;

import com.winemall.mall.dto.Condition;
import com.winemall.mall.dto.PageResult;
import com.winemall.mall.pojo.GoodsWithBLOBs;


import com.winemall.mall.pojo.GoodsSold;

import java.util.List;

/**
 * @Author: Stephen
 * @Edition: V1.0
 * @CreateDate: 2021/5/4 16:10
 * @Description: 商品业务接口
 */
public interface GoodsService {
    //根据商品编号查询商品信息
    GoodsWithBLOBs findByGoodsId(Long goodsId);

    //查询全网销量最好的三种商品
    List<GoodsWithBLOBs> findTop3Goods();

    //根据商品编号查询商品信息
    GoodsWithBLOBs findGoodsById(long goodsId);

    //更新商品信息
    boolean updateGoods(GoodsWithBLOBs goods);

    //分页查询商品信息
//    PageResult findPage(int pageNo, int pageSize);

    //查询指定一级类型中销量前8的商品信息
//    List<GoodsWithBLOBs> findTop8GoodsByCategoryId(Integer categoryId);


    //根据条件分页查询
//    PageResult findPageByCondition(Condition condition);
}
