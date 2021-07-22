package com.mall.test;

import com.winemall.mall.SearchServiceApplication;
import com.winemall.mall.dto.Condition;
import com.winemall.mall.dto.PageResult;
import com.winemall.mall.service.SearchService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = {SearchServiceApplication.class})
@RunWith(SpringRunner.class)
public class SearchTestApp {
    //注入一个搜索服务接口类型的属性
    @Reference
    private SearchService searchService;
    @Test
    public void testSearch(){
        //创建一个查询条件
        Condition condition = new Condition();
        condition.setSearchString("LAFITE");
        condition.setPageNo(1);
        condition.setPageSize(10);
        //掉用方法查询
        PageResult pageResult = searchService.searchPage(condition);
        System.out.println(pageResult.getPages());
        System.out.println(pageResult.getTotalItems());
        System.out.println(pageResult.getDataList());
    }
}
