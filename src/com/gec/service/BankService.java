package com.gec.service;

import com.gec.bean.Bank;
import java.util.List;

public interface BankService {
    //银行注册功能
    public boolean insert(Bank Bank);

    //银行列表查询功能
    public List<Bank> query();

    //银行根据id查询功能
    public Bank queryId(int id);

    //银行根据id修改功能
    public boolean updateBank(Bank Bank);

    //根据主键删除银行功能
    public boolean delete(int id);
}
