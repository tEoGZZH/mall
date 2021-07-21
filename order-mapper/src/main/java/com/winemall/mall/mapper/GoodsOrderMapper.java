package com.winemall.mall.mapper;

import com.winemall.mall.pojo.GoodsOrder;
import com.winemall.mall.pojo.GoodsOrderExample;
import com.winemall.mall.pojo.GoodsOrderKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GoodsOrderMapper {
    int countByExample(GoodsOrderExample example);

    int deleteByExample(GoodsOrderExample example);

    int deleteByPrimaryKey(GoodsOrderKey key);

    int insert(GoodsOrder record);

    int insertSelective(GoodsOrder record);

    List<GoodsOrder> selectByExample(GoodsOrderExample example);

    GoodsOrder selectByPrimaryKey(GoodsOrderKey key);

    int updateByExampleSelective(@Param("record") GoodsOrder record, @Param("example") GoodsOrderExample example);

    int updateByExample(@Param("record") GoodsOrder record, @Param("example") GoodsOrderExample example);

    int updateByPrimaryKeySelective(GoodsOrder record);

    int updateByPrimaryKey(GoodsOrder record);
}