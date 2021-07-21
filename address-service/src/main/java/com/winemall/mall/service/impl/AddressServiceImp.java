package com.winemall.mall.service.impl;

import com.winemall.mall.mapper.AddressMapper;
import com.winemall.mall.pojo.Address;
import com.winemall.mall.pojo.AddressExample;
import com.winemall.mall.service.AddressService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

@Service
public class AddressServiceImp implements AddressService {
    //自动装配一个mapper对象
    @Autowired
    private AddressMapper receiveAddrMapper;
    @Override
    public List<Address> findAddressByPhone(String phone) {
        //创建一个收货地址实体样例类对象
        AddressExample example = new AddressExample();
        //通过样例对象创建条件对象并设置查询条件
        example.createCriteria().andPhoneEqualTo(phone);
        //使用样例对象作为参数查询符合条件的收货地址
        return receiveAddrMapper.selectByExample(example);
    }

    @Override
    public boolean insertAddress(Address addr) {
        return receiveAddrMapper.insertSelective(addr) > 0;
    }

    @Override
    public Address findAddressById(Long addrId) {
        return receiveAddrMapper.selectByPrimaryKey(addrId);
    }

    @Override
    public boolean updateAddress(Address addr) {
        return receiveAddrMapper.updateByPrimaryKeySelective(addr) > 0;
    }

    @Override
    public boolean deleteAddressById(Long addrId) {
        return receiveAddrMapper.deleteByPrimaryKey(addrId) > 0;
    }

    @Override
    public boolean setDefautlAddress(Address addr) {
        // 根据 id 找到地址
        byte[] defalut = new byte[]{(byte) 1};

        if(Arrays.equals(addr.getIsDefault(), defalut)){
            // 如果已经是默认的了
            return true;
        }
        else{
            // 把其他任何有默认的设置为非默认
            String phone = addr.getPhone();
            AddressExample addressExample = new AddressExample();
            addressExample.createCriteria().andPhoneEqualTo(phone);
            List<Address> addresses = receiveAddrMapper.selectByExample(addressExample);
            // 循环设置
            for(Address address:addresses){
                address.setIsDefault(new byte[]{(byte) 0});
                receiveAddrMapper.updateByPrimaryKeySelective(address);
            }
            // 最后设置该地址为默认
            addr.setIsDefault(new byte[]{(byte) 1});
            int i = receiveAddrMapper.updateByPrimaryKeySelective(addr);
            return i > 0;
        }

    }

    @Override
    public Address findDefualtAddress(String phone) {
        byte[] defalut = new byte[]{(byte) 1};
        AddressExample example = new AddressExample();
        example.createCriteria().andPhoneEqualTo(phone);
        List<Address> addresses = receiveAddrMapper.selectByExample(example);
        // 找到默认地址
        for(Address address : addresses){
            if(Arrays.equals(address.getIsDefault(), defalut)){
                return address;
            }
        }
        return null;
    }
}
