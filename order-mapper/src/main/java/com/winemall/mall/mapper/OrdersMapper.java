package com.winemall.mall.mapper;

import com.winemall.mall.pojo.Orders;
import com.winemall.mall.pojo.OrdersExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OrdersMapper {
    int countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExampleWithBLOBs(OrdersExample example);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExampleWithBLOBs(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKeyWithBLOBs(Orders record);

    int updateByPrimaryKey(Orders record);
}