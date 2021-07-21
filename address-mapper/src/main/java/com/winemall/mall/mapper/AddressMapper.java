package com.winemall.mall.mapper;

import com.winemall.mall.pojo.Address;
import com.winemall.mall.pojo.AddressExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AddressMapper {
    int countByExample(AddressExample example);

    int deleteByExample(AddressExample example);

    int deleteByPrimaryKey(Long addrId);

    int insert(Address record);

    int insertSelective(Address record);

    List<Address> selectByExampleWithBLOBs(AddressExample example);

    List<Address> selectByExample(AddressExample example);

    Address selectByPrimaryKey(Long addrId);

    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByExampleWithBLOBs(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKeyWithBLOBs(Address record);

    int updateByPrimaryKey(Address record);
}