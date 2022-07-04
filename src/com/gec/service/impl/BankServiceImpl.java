package com.gec.service.impl;

import com.gec.bean.Bank;
import com.gec.bean.BankExample;
import com.gec.mapper.BankMapper;
import com.gec.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {
    @Autowired
    BankMapper bankMapper;

    @Override
    public boolean insert(Bank bank) {
        return bankMapper.insertSelective(bank) > 0 ? true : false;
    }

    @Override
    public List<Bank> query() {
        return bankMapper.selectByExample(new BankExample());
    }

    @Override
    public Bank queryId(int id) {
        return bankMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateBank(Bank bank) {
        return bankMapper.updateByPrimaryKeySelective(bank) > 0 ? true : false;
    }

    @Override
    public boolean delete(int id) {
        return bankMapper.deleteByPrimaryKey(id) > 0 ? true : false;
    }
}
