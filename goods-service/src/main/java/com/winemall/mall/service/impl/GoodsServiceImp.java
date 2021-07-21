package com.winemall.mall.service.impl;

import com.winemall.mall.dto.Condition;
import com.winemall.mall.dto.PageResult;
import com.winemall.mall.mapper.GoodsMapper;
import com.winemall.mall.pojo.Goods;
import com.winemall.mall.pojo.GoodsExample;
import com.winemall.mall.pojo.GoodsWithBLOBs;
import com.winemall.mall.service.GoodsService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: Stephen
 * @Edition: V1.0
 * @CreateDate: 2021/5/4 16:20
 * @Description: 商品业务接口实现类
 */
@Service
public class GoodsServiceImp implements GoodsService {
    //自动装配goodsMapper
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public GoodsWithBLOBs findByGoodsId(Long goodsId) {
        //调用mapper接口的方法查询商品信息
        GoodsWithBLOBs goods = goodsMapper.selecyPrimaryKey(goodsId);
        return goods;
    }

    @Override
    public boolean updateGoods(GoodsWithBLOBs goods) {
        //调用mapper接口的方法实现修改
        int i = goodsMapper.updateByPrimaryKeySelective(goods);
        if (i > 0) {
            return true;
        }
        return false;
    }

    @Override
    public List<GoodsWithBLOBs> findTop3Goods() {
        return goodsMapper.findTop3();
    }

    @Override
    public GoodsWithBLOBs findGoodsById(long goodsId) {
        return goodsMapper.selecyPrimaryKey(goodsId);
    }

//    @Override
//    public PageResult findPage(int pageNo, int pageSize) {
//        //设置分页参数
//        PageHelper.startPage(pageNo, pageSize);
//        //调用Mapper接口进行分页查询
//        Page<Goods> page = (Page<Goods>) goodsMapper.selecyExample(null);
//        //从page对象中获取查询到的数据封装一个自定的PageResult对象反馈给调用者
//        PageResult pageResult = new PageResult();
//        pageResult.setTotalItems(page.getTotal());
//        pageResult.setDataList(page.getResult());
//        pageResult.setPages(page.getPages());
//        return pageResult;
//    }

//    @Override
//    public List<GoodsWithBLOBs> findTop8GoodsByCategoryId(Integer categoryId) {
//        //调用mapper接口的方法
//        List<GoodsWithBLOBs> list = goodsMapper.findTop8GoodsByCategoryId(categoryId);
//        return list;
//    }

//    @Override
//    public PageResult findPageByCondition(Condition condition) {
//        //创建查询条件
//        GoodsExample GoodsExample = new GoodsExample();
//        GoodsExample.Criteria criteria = GoodsExample.createCriteria();
//        //判断
//        if (condition.getCategoryIdList() != null && condition.getCategoryIdList().size() > 0) {
//            criteria.andCategoryIdIn(condition.getCategoryIdList());
//        }
//        //设置价格范围
//        criteria.andPriceBetween(condition.getMinPrice(), condition.getMaxPrice());
//        //设置分页参数
//        PageHelper.startPage(condition.getPageNo(), condition.getPageSize());
//        //调用mapper接口进行查询
//        Page<GoodsWithBLOBs> page = (Page<GoodsWithBLOBs>) goodsMapper.selecyExampleWithBLOBs(GoodsExample);
//        //创建一个分页结果对象返回给调用者
//        PageResult pageResult = new PageResult();
//        pageResult.setTotalItems(page.getTotal());
//        pageResult.setDataList(page.getResult());
//        pageResult.setPages(page.getPages());
//        return pageResult;
//    }
}
