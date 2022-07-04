package com.gec.service.impl;

import com.gec.bean.BankcardExample;
import com.gec.bean.UserFundProduct;
import com.gec.bean.UserFundProductExample;
import com.gec.mapper.UserFundProductMapper;
import com.gec.service.UserFundProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFundProductServiceImpl implements UserFundProductService {
    @Autowired
    UserFundProductMapper userFundProductMapper;

    @Override
    public boolean insert(UserFundProduct userFundProduct) {
        return userFundProductMapper.insertSelective(userFundProduct) > 0 ? true : false;
    }

    @Override
    public List<UserFundProduct> query() {
        return userFundProductMapper.selectByExample(new UserFundProductExample());
    }

    @Override
    public UserFundProduct queryId(int id) {
        return userFundProductMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserFundProduct> queryUserId(int userId) {
        UserFundProductExample userFundProductExample = new UserFundProductExample();
        userFundProductExample.createCriteria().andUseridEqualTo(userId);
        return userFundProductMapper.selectByExample(userFundProductExample);
    }

    @Override
    public boolean updateUserFundProduct(UserFundProduct userFundProduct) {
        return userFundProductMapper.updateByPrimaryKeySelective(userFundProduct) > 0 ? true : false;
    }

    @Override
    public boolean delete(int id) {
        return userFundProductMapper.deleteByPrimaryKey(id) > 0 ? true : false;
    }
}
