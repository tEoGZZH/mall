package com.winemall.mall.dto;

import java.io.Serializable;
import java.util.List;


public class Condition implements Serializable {
    //当前页码
    private int pageNo;
    //每页显示条数
    private int pageSize;
    //商品二级类型编号
    private Integer categoryId;
    //最低价格
    private double minPrice;
    //最高价格
    private double maxPrice;
    //搜索关键词
    private String searchString;

    //创建一个集合用于存放二级类型编号
    private List<Integer> categoryIdList;


    @Override
    public String toString() {
        return "Condition{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", categoryId=" + categoryId +
                ", minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                ", searchString='" + searchString + '\'' +
                '}';
    }

    public List<Integer> getCategoryIdList() {
        return categoryIdList;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setCategoryIdList(List<Integer> categoryIdList) {
        this.categoryIdList = categoryIdList;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

}
