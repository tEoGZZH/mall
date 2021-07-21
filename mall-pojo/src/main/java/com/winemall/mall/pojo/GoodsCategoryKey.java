package com.winemall.mall.pojo;

import java.io.Serializable;

public class GoodsCategoryKey implements Serializable {
    private Long goodsId;

    private Long categoryId;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}