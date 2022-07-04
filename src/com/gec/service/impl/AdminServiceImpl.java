package com.gec.service.impl;

import com.gec.bean.Admin;
import com.gec.bean.AdminExample;
import com.gec.mapper.AdminMapper;
import com.gec.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin login(String name, String pass) {
        //创建模板对象
        AdminExample example = new AdminExample();
        //添加查询条件
        example.createCriteria().andUsernameEqualTo(name).andPasswordEqualTo(pass);
        //执行查询
        List<Admin> list = adminMapper.selectByExample(example);
        //集合不为空
        if (list != null && !list.isEmpty() && list.size() > 0) {
            return list.get(0);
        }
        //结果为空则返回null
        return null;
    }
}
