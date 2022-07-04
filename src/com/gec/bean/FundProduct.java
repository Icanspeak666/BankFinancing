package com.gec.bean;

import java.math.BigDecimal;

public class FundProduct {
    private Integer id;

    private Integer type;

    private Integer code;

    private String funddesc;

    private BigDecimal dailygrowth;

    private BigDecimal leastmoney;

    private BigDecimal profit;

    private String investerm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getFunddesc() {
        return funddesc;
    }

    public void setFunddesc(String funddesc) {
        this.funddesc = funddesc == null ? null : funddesc.trim();
    }

    public BigDecimal getDailygrowth() {
        return dailygrowth;
    }

    public void setDailygrowth(BigDecimal dailygrowth) {
        this.dailygrowth = dailygrowth;
    }

    public BigDecimal getLeastmoney() {
        return leastmoney;
    }

    public void setLeastmoney(BigDecimal leastmoney) {
        this.leastmoney = leastmoney;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public String getInvesterm() {
        return investerm;
    }

    public void setInvesterm(String investerm) {
        this.investerm = investerm == null ? null : investerm.trim();
    }
}