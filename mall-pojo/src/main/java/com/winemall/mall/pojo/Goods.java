package com.winemall.mall.pojo;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.util.Date;

//goodsId=null, goodsTitle='null', price=null, discount=null, ammount=null
public class Goods implements Serializable {
    @Field("goods_id")
    private String goodsId;

    @Field("goods_title")
    private String goodsTitle;

    @Field("goods_price")
    private Float price;

    @Field("goods_discount")
    private Float discount;

    @Field("goods_ammount")
    private Integer ammount;


    @Field("goods_update_time")
    private Date updateDate;

    @Override
    public String toString() {
        return "Goods{" +
                ", price=" + price +
                ", discount=" + discount +
                ", ammount=" + ammount +
                '}';
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle == null ? null : goodsTitle.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }


    public Integer getAmmount() {
        return ammount;
    }

    public void setAmmount(Integer ammount) {
        this.ammount = ammount;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}