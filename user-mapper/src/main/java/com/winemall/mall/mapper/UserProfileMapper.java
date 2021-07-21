package com.winemall.mall.mapper;

import com.winemall.mall.pojo.UserProfile;
import com.winemall.mall.pojo.UserProfileExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserProfileMapper {
    int countByExample(UserProfileExample example);

    int deleteByExample(UserProfileExample example);

    int deleteByPrimaryKey(String phone);

    int insert(UserProfile record);

    int insertSelective(UserProfile record);

    List<UserProfile> selectByExampleWithBLOBs(UserProfileExample example);

    List<UserProfile> selectByExample(UserProfileExample example);

    UserProfile selectByPrimaryKey(String phone);

    int updateByExampleSelective(@Param("record") UserProfile record, @Param("example") UserProfileExample example);

    int updateByExampleWithBLOBs(@Param("record") UserProfile record, @Param("example") UserProfileExample example);

    int updateByExample(@Param("record") UserProfile record, @Param("example") UserProfileExample example);

    int updateByPrimaryKeySelective(UserProfile record);

    int updateByPrimaryKeyWithBLOBs(UserProfile record);

    int updateByPrimaryKey(UserProfile record);
}