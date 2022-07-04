package com.gec.service;

import com.gec.bean.FundProduct;

import java.util.List;

public interface FundProductService {
    //理财产品新增功能
    public boolean insert(FundProduct fundProduct);

    //理财产品列表查询功能
    public List<FundProduct> query();

    //理财产品根据id查询功能
    public FundProduct queryId(int id);

    //理财产品根据id修改功能
    public boolean updateFundProduct(FundProduct fundProduct);

    //根据主键删除理财产品功能
    public boolean delete(int id);
}
