package com.winemall.mall.mapper;

import com.winemall.mall.GoodsMapperApplication;
import com.winemall.mall.pojo.GoodsWithBLOBs;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = {GoodsMapperApplication.class})
@RunWith(SpringRunner.class)
public class GoodsMapperTest {
    @Autowired
    private GoodsMapper mapper;

//    @Test
//    void findTop8GoodsByCategoryId() {
//        for (GoodsWithBLOBs g : mapper.findTop8GoodsByCategoryId(5)) {
//            System.out.println(g);
//        }
//    }

    @Test
    void findTop3() {
        for (GoodsWithBLOBs g : mapper.findTop3()) {
            System.out.println(g);
        }
    }

}