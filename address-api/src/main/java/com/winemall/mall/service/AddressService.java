package com.winemall.mall.service;


import com.winemall.mall.pojo.Address;

import java.util.List;

public interface AddressService {
    //根据用户手机号查询该用户的收货地址
    List<Address> findAddressByPhone(String phone);

    //新增一个收货地址
    boolean insertAddress(Address addr);

    //根据地址编号查询收货地址
    Address findAddressById(Long addrId);

    //修改售后地址
    boolean updateAddress(Address addr);

    //删除收货地址
    boolean deleteAddressById(Long addrId);

    //设置默认收货地址
    boolean setDefautlAddress(Address addr);

    //查询指定用户的默认收货地址
    Address findDefualtAddress(String phone);
}
