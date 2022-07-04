package com.gec.service.impl;

import com.gec.bean.FundProduct;
import com.gec.bean.FundProductExample;
import com.gec.mapper.FundProductMapper;
import com.gec.service.FundProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundProductServiceImpl implements FundProductService {
    @Autowired
    FundProductMapper fundProductMapper;

    @Override
    public boolean insert(FundProduct fundProduct) {
        return fundProductMapper.insertSelective(fundProduct) > 0 ? true : false;
    }

    @Override
    public List<FundProduct> query() {
        return fundProductMapper.selectByExample(new FundProductExample());
    }

    @Override
    public FundProduct queryId(int id) {
        return fundProductMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateFundProduct(FundProduct fundProduct) {
        return fundProductMapper.updateByPrimaryKeySelective(fundProduct) > 0 ? true : false;
    }

    @Override
    public boolean delete(int id) {
        return fundProductMapper.deleteByPrimaryKey(id) > 0 ? true : false;
    }
}
