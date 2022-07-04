package com.gec.service;

import com.gec.bean.UserFundProduct;

import java.util.List;

public interface UserFundProductService {
    //用户投资基金新增功能
    public boolean insert(UserFundProduct userFundProduct);

    //用户投资基金列表查询功能
    public List<UserFundProduct> query();

    //用户投资基金根据id查询功能
    public UserFundProduct queryId(int id);

    //用户投资基金根据id查询功能
    public List<UserFundProduct> queryUserId(int userId);

    //用户投资基金根据id修改功能
    public boolean updateUserFundProduct(UserFundProduct userFundProduct);

    //根据主键删除用户投资基金功能
    public boolean delete(int id);
}
