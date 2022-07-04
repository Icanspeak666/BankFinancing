package com.gec.service;

import com.gec.bean.Admin;

public interface AdminService {
    //管理员登录功能
    public Admin login(String name, String pass);
}
