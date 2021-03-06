package com.example.seckill2.domain;

import java.util.Date;

/**
 * @author 28614
 * @date 2019/12/18 15:01
 */
public class SecKillGoods {
    private Long id; //秒杀商品id(自增长）
    private Long goodsId;//商品id
    private Integer stockCount;//秒杀库存
    private Date startDate;//秒杀开始时间
    private Date endDate;//秒杀结束时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
