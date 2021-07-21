package com.winemall.mall.pojo;

import java.io.Serializable;

public class GoodsOrderKey implements Serializable {
    private Long orderId;

    private Long goodsId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }
}