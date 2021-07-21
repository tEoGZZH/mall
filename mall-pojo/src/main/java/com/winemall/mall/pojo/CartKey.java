package com.winemall.mall.pojo;

import java.io.Serializable;

public class CartKey implements Serializable {
    private Long goodsId;

    private String phone;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}