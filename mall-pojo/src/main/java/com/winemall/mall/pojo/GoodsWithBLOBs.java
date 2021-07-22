package com.winemall.mall.pojo;
import org.apache.solr.client.solrj.beans.Field;

import java.util.Date;

public class GoodsWithBLOBs extends Goods {
    @Field("goods_description")
    private String description;

    @Field("goods_image_url")
    private String imageUrl;
    @Field("goods_id")
    private String goodsId;
    @Field("goods_title")
    private String goodsTitle;
    @Field("goods_price")
    private Float goodsPrice;
    @Field("goods_discount")
    private Float goodsDiscount;
    @Field("goods_ammount")
    private Integer goodsAmmount;
    @Field("goods_update_time")
    private Date updateDate;
    @Override
    public String toString() {
        return "GoodsWithBLOBs{" +
                "goodsTitle='" + goodsTitle + '\'' +
                ", goodsId='" + goodsId + '\'' +
                ",description='" + description + '\'' +
                ",imageUrl='" + imageUrl + '\'' +
                ",goodsPrice='" + goodsPrice + '\'' +
                ",goodsDiscount='" + goodsDiscount + '\'' +
                ",goodsAmmount='" + goodsAmmount + '\'' +
                "} ";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}