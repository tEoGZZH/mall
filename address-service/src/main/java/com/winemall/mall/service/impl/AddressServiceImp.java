package com.winemall.mall.service.impl;

import com.winemall.mall.mapper.AddressMapper;
import com.winemall.mall.pojo.Address;
import com.winemall.mall.pojo.AddressExample;
import com.winemall.mall.service.AddressService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

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
//        //将之前的默认值取消默认
//        //①: 创建一个地址样例对象
//        AddressExample example = new AddressExample();
//        //②: 设置修改条件,根据拥有者手机号将该用户的默认收货地址取消默认
//        example.createCriteria().andPhoneEqualTo(addr.getPhone())
//                .(true);
//        //③: 创建一个对象用于修改(只需要isDefault属性为false即可,其他属性不需要)
//        Address updateAddr = new Address();
//        updateAddr.setIsDefault();
//        //⑤: 根据条件修改
//        int i = receiveAddrMapper.updateByExampleSelective(updateAddr, example);
//        //将新的地址设置为默认值
//        //①: 将isDefault属性设置为true,将拥有者手机号设置为null(提高修改效率)
//        addr.setIsDefault();
//        addr.setPhone(null);
//        //②: 根据地址编号进行修改,设置新的默认地址
//        int j = receiveAddrMapper.updateByPrimaryKeySelective(addr);
//        if (i > 0 && j > 0) {
//            return true;
//        }
        return false;
    }

    @Override
    public Address findDefualtAddress(String phone) {
//        AddressExample example = new AddressExample();
//        example.createCriteria().andPhoneEqualTo(phone).(true);
//        List<Address> addrs = receiveAddrMapper.selectByExample(example);
//        //由于每个用户只有一个默认收货地址,所以取出0号下标的地址对象返回即可
//        return addrs.get(0);
        return new Address();
    }
}
