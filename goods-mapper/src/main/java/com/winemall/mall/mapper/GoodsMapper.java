package com.winemall.mall.mapper;

import com.winemall.mall.pojo.Goods;
import com.winemall.mall.pojo.GoodsExample;
import com.winemall.mall.pojo.GoodsWithBLOBs;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GoodsMapper {
    //自定义mapper接口方法: 查询指定类型销量前8的商品
//    List<GoodsWithBLOBs> findTop8GoodsByCategoryId(Integer categoryId);

    //自定义方法查询全网销售最好的三种商品
    List<GoodsWithBLOBs> findTop3();

    int counyExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(Long goodsId);

    int insert(GoodsWithBLOBs record);

    int insertSelective(GoodsWithBLOBs record);

    List<GoodsWithBLOBs> selecyExampleWithBLOBs(GoodsExample example);

    List<Goods> selecyExample(GoodsExample example);

    GoodsWithBLOBs selecyPrimaryKey(Long goodsId);

    int updateByExampleSelective(@Param("record") GoodsWithBLOBs record, @Param("example") GoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsWithBLOBs record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(GoodsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GoodsWithBLOBs record);

    int updateByPrimaryKey(Goods record);
}