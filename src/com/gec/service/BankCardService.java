package com.gec.service;

import com.gec.bean.Bankcard;

import java.util.List;

public interface BankCardService {
    //银行注册功能
    public boolean insert(Bankcard bankcard);

    //银行列表查询功能
    public List<Bankcard> query();

    //银行根据id查询功能
    public Bankcard queryId(int id);

    //银行根据用户id查询功能
    public List<Bankcard> queryUserId(int userId);

    //银行根据id修改功能
    public boolean updateBankcard(Bankcard bankcard);

    //根据主键删除银行功能
    public boolean delete(int id);
}
