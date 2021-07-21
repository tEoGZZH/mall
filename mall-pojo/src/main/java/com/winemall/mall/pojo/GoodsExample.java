package com.winemall.mall.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("GOODS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("GOODS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("GOODS_ID =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("GOODS_ID <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("GOODS_ID >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("GOODS_ID >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("GOODS_ID <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("GOODS_ID <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("GOODS_ID in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("GOODS_ID not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("GOODS_ID between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("GOODS_ID not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIsNull() {
            addCriterion("GOODS_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIsNotNull() {
            addCriterion("GOODS_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleEqualTo(String value) {
            addCriterion("GOODS_TITLE =", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotEqualTo(String value) {
            addCriterion("GOODS_TITLE <>", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleGreaterThan(String value) {
            addCriterion("GOODS_TITLE >", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_TITLE >=", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLessThan(String value) {
            addCriterion("GOODS_TITLE <", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLessThanOrEqualTo(String value) {
            addCriterion("GOODS_TITLE <=", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLike(String value) {
            addCriterion("GOODS_TITLE like", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotLike(String value) {
            addCriterion("GOODS_TITLE not like", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIn(List<String> values) {
            addCriterion("GOODS_TITLE in", values, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotIn(List<String> values) {
            addCriterion("GOODS_TITLE not in", values, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleBetween(String value1, String value2) {
            addCriterion("GOODS_TITLE between", value1, value2, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotBetween(String value1, String value2) {
            addCriterion("GOODS_TITLE not between", value1, value2, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Float value) {
            addCriterion("DISCOUNT =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Float value) {
            addCriterion("DISCOUNT <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Float value) {
            addCriterion("DISCOUNT >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("DISCOUNT >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Float value) {
            addCriterion("DISCOUNT <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Float value) {
            addCriterion("DISCOUNT <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Float> values) {
            addCriterion("DISCOUNT in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Float> values) {
            addCriterion("DISCOUNT not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Float value1, Float value2) {
            addCriterion("DISCOUNT between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Float value1, Float value2) {
            addCriterion("DISCOUNT not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("SIZE is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Integer value) {
            addCriterion("SIZE =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Integer value) {
            addCriterion("SIZE <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Integer value) {
            addCriterion("SIZE >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIZE >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Integer value) {
            addCriterion("SIZE <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Integer value) {
            addCriterion("SIZE <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Integer> values) {
            addCriterion("SIZE in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Integer> values) {
            addCriterion("SIZE not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Integer value1, Integer value2) {
            addCriterion("SIZE between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("SIZE not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andAlcoholIsNull() {
            addCriterion("ALCOHOL is null");
            return (Criteria) this;
        }

        public Criteria andAlcoholIsNotNull() {
            addCriterion("ALCOHOL is not null");
            return (Criteria) this;
        }

        public Criteria andAlcoholEqualTo(Float value) {
            addCriterion("ALCOHOL =", value, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholNotEqualTo(Float value) {
            addCriterion("ALCOHOL <>", value, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholGreaterThan(Float value) {
            addCriterion("ALCOHOL >", value, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholGreaterThanOrEqualTo(Float value) {
            addCriterion("ALCOHOL >=", value, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholLessThan(Float value) {
            addCriterion("ALCOHOL <", value, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholLessThanOrEqualTo(Float value) {
            addCriterion("ALCOHOL <=", value, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholIn(List<Float> values) {
            addCriterion("ALCOHOL in", values, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholNotIn(List<Float> values) {
            addCriterion("ALCOHOL not in", values, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholBetween(Float value1, Float value2) {
            addCriterion("ALCOHOL between", value1, value2, "alcohol");
            return (Criteria) this;
        }

        public Criteria andAlcoholNotBetween(Float value1, Float value2) {
            addCriterion("ALCOHOL not between", value1, value2, "alcohol");
            return (Criteria) this;
        }

        public Criteria andRatingsIsNull() {
            addCriterion("RATINGS is null");
            return (Criteria) this;
        }

        public Criteria andRatingsIsNotNull() {
            addCriterion("RATINGS is not null");
            return (Criteria) this;
        }

        public Criteria andRatingsEqualTo(Float value) {
            addCriterion("RATINGS =", value, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsNotEqualTo(Float value) {
            addCriterion("RATINGS <>", value, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsGreaterThan(Float value) {
            addCriterion("RATINGS >", value, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsGreaterThanOrEqualTo(Float value) {
            addCriterion("RATINGS >=", value, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsLessThan(Float value) {
            addCriterion("RATINGS <", value, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsLessThanOrEqualTo(Float value) {
            addCriterion("RATINGS <=", value, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsIn(List<Float> values) {
            addCriterion("RATINGS in", values, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsNotIn(List<Float> values) {
            addCriterion("RATINGS not in", values, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsBetween(Float value1, Float value2) {
            addCriterion("RATINGS between", value1, value2, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsNotBetween(Float value1, Float value2) {
            addCriterion("RATINGS not between", value1, value2, "ratings");
            return (Criteria) this;
        }

        public Criteria andAmmountIsNull() {
            addCriterion("AMMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmmountIsNotNull() {
            addCriterion("AMMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmmountEqualTo(Integer value) {
            addCriterion("AMMOUNT =", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountNotEqualTo(Integer value) {
            addCriterion("AMMOUNT <>", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountGreaterThan(Integer value) {
            addCriterion("AMMOUNT >", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("AMMOUNT >=", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountLessThan(Integer value) {
            addCriterion("AMMOUNT <", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountLessThanOrEqualTo(Integer value) {
            addCriterion("AMMOUNT <=", value, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountIn(List<Integer> values) {
            addCriterion("AMMOUNT in", values, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountNotIn(List<Integer> values) {
            addCriterion("AMMOUNT not in", values, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountBetween(Integer value1, Integer value2) {
            addCriterion("AMMOUNT between", value1, value2, "ammount");
            return (Criteria) this;
        }

        public Criteria andAmmountNotBetween(Integer value1, Integer value2) {
            addCriterion("AMMOUNT not between", value1, value2, "ammount");
            return (Criteria) this;
        }

        public Criteria andUpDateIsNull() {
            addCriterion("UP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpDateIsNotNull() {
            addCriterion("UP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpDateEqualTo(Date value) {
            addCriterion("UP_DATE =", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateNotEqualTo(Date value) {
            addCriterion("UP_DATE <>", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateGreaterThan(Date value) {
            addCriterion("UP_DATE >", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UP_DATE >=", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateLessThan(Date value) {
            addCriterion("UP_DATE <", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateLessThanOrEqualTo(Date value) {
            addCriterion("UP_DATE <=", value, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateIn(List<Date> values) {
            addCriterion("UP_DATE in", values, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateNotIn(List<Date> values) {
            addCriterion("UP_DATE not in", values, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateBetween(Date value1, Date value2) {
            addCriterion("UP_DATE between", value1, value2, "upDate");
            return (Criteria) this;
        }

        public Criteria andUpDateNotBetween(Date value1, Date value2) {
            addCriterion("UP_DATE not between", value1, value2, "upDate");
            return (Criteria) this;
        }

        public Criteria andDownDateIsNull() {
            addCriterion("DOWN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDownDateIsNotNull() {
            addCriterion("DOWN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDownDateEqualTo(Date value) {
            addCriterion("DOWN_DATE =", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateNotEqualTo(Date value) {
            addCriterion("DOWN_DATE <>", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateGreaterThan(Date value) {
            addCriterion("DOWN_DATE >", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DOWN_DATE >=", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateLessThan(Date value) {
            addCriterion("DOWN_DATE <", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateLessThanOrEqualTo(Date value) {
            addCriterion("DOWN_DATE <=", value, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateIn(List<Date> values) {
            addCriterion("DOWN_DATE in", values, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateNotIn(List<Date> values) {
            addCriterion("DOWN_DATE not in", values, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateBetween(Date value1, Date value2) {
            addCriterion("DOWN_DATE between", value1, value2, "downDate");
            return (Criteria) this;
        }

        public Criteria andDownDateNotBetween(Date value1, Date value2) {
            addCriterion("DOWN_DATE not between", value1, value2, "downDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}