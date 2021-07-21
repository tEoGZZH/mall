package com.winemall.mall.controller;

import com.winemall.mall.dto.Condition;
import com.winemall.mall.dto.PageResult;
import com.winemall.mall.service.CategoryService;
import com.winemall.mall.service.GoodsService;
//import com.winemall.mall.service.SearchService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Stephen
 * @Edition: V1.0
 * @CreateDate: 2021/5/24 10:27
 * @Description:
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    //使用dubbo远程调度商品类型服务
    @Reference
    private CategoryService categoryService;
    //远程调度商品服务
    @Reference
    private GoodsService goodsService;

//    @RequestMapping("/home")
//    public

    //远程调度搜索服务
//    @Reference
//    private SearchService searchService;

//    //多条件分页查询
//    @RequestMapping("/findPageByCondition")
//    public PageResult findPageByCondition(@RequestBody Condition condition) {
//        //根据一级级类型编号,查询出所有的二级级类型编号
//        if (condition.getCategoryId() != 0) {
//            condition.setCategoryIdList(categoryService.findSecondCategoryIdList(condition.getCategoryId()));
//        }
//        //分页查询: 此处是直接从数据库查询的数据进行分页
////        PageResult pageResult = goodsService.findPageByCondition(condition);
//        System.out.println("~~~~~~~~~~~~搜索关键字是: " + condition.getSearchString() + "~~~~~~~~~~~~~");
//        //分页查询: 从solr索引库中查询
//        PageResult pageResult = searchService.searchPage(condition);
//        return pageResult;
//    }
}
