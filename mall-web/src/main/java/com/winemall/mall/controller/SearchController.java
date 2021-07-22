package com.winemall.mall.controller;

import com.winemall.mall.dto.Condition;
import com.winemall.mall.dto.PageResult;
//import com.winemall.mall.service.GoodsService;
import com.winemall.mall.service.SearchService;
import javassist.expr.Instanceof;
import org.apache.dubbo.config.annotation.Reference;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.invoke.empty.Empty;


@RestController
@RequestMapping("/goods")
public class SearchController {
    //使用dubbo远程调度商品类型服务

    //远程调度商品服务

    //远程调度搜索服务
    @Reference
    private SearchService searchService;
    @RequestMapping("/search")
    public PageResult findPageByCondition(@RequestParam String keyword, @RequestParam int PageNo){
        if(keyword!="") {
            keyword = keyword.replace(" ", "");
        }
        else {
            keyword = "葡萄酒";
        }
        Condition condition = new Condition();
        condition.setSearchString(keyword);
        condition.setPageNo(PageNo);
        condition.setPageSize(10);
        //掉用方法查询
        PageResult pageResult = searchService.searchPage(condition);
        //分页查询: 此处是直接从数据库查询的数据进行分页
//        PageResult pageResult = goodsService.findPageByCondition(condition);
        System.out.println("~~~~~~~~~~~~搜索关键字是: " + condition.getSearchString() + "~~~~~~~~~~~~~");
//        System.out.println(pageResult.getPages());
//        System.out.println(pageResult.getTotalItems());
//        String str1=pageResult.getDataList().toString();
//        JSONObject jsonObj = new JSONObject(pageResult);
        return pageResult;
    }
    //多条件分页查询

//    public PageResult main(String[] args) {
//        PageResult page1=findPageByCondition("干红葡萄酒",1);
//        return page1;
//    }
}
