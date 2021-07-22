package com.winemall.mall.mapper;

import java.util.List;

import com.winemall.mall.pojo.AddressExample;
import com.winemall.mall.pojo.Address;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
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