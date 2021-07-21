package com.winemall.mall.service;

import com.winemall.mall.dto.Condition;
import com.winemall.mall.dto.PageResult;
import com.winemall.mall.pojo.GoodsWithBLOBs;

import java.util.List;


public interface GoodsService {
    //根据商品编号查询商品信息
    GoodsWithBLOBs findByGoodsId(Long goodsId);

    //分页查询商品信息
    PageResult findPage(int pageNo,int pageSize);

    //更新商品信息
    boolean updateGoods(GoodsWithBLOBs goods);

    //查询指定一级类型中销量前8的商品信息
    List<GoodsWithBLOBs> findTop8GoodsByCategoryId(Integer categoryId);

    //查询全网销量最好的三种商品
    List<GoodsWithBLOBs> findTop3Goods();

    //根据商品编号查询商品信息
    GoodsWithBLOBs findGoodsById(long goodsId);

    //根据条件分页查询
    PageResult findPageByCondition(Condition condition);
}
