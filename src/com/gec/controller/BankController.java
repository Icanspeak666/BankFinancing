package com.gec.controller;

import com.gec.bean.Bank;
import com.gec.bean.User;
import com.gec.mapper.BankMapper;
import com.gec.service.BankService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class BankController {
    @Autowired
    BankService bankService;

    //定义添加操作的请求方法
    @RequestMapping("/insertBank")
    public String insertBank(Bank bank, HttpServletRequest request) {
        //调用业务层进行添加
        boolean isok = bankService.insert(bank);
        //作出响应
        if (isok) {
            return "redirect:/queryBank";
        } else {
            //把信息保存在请求作用域中，目的给jsp页面获取并显示
            request.setAttribute("bank", bank);
            request.setAttribute("message", "添加失败，请重新操作！");
            return "BankInsert";
        }
    }

    //定义查询操作的请求方法
    @RequestMapping("/queryBank")
    public String queryBank(@RequestParam(required = false,defaultValue = "1") Integer pageNo, HttpServletRequest request) {
        //开启分页
        PageHelper.startPage(pageNo,3);
        //调用业务层进行查询，并且得到结果
        List<Bank> list = bankService.query();
        //生成page分页模型
        PageInfo pageInfo = new PageInfo(list);
        //把信息保存在请求作用域中，目的给jsp页面获取并显示
        request.setAttribute("list", list);
        request.setAttribute("pageInfo", pageInfo);
        //跳转到jsp页面获取并显示
        return "BankList";
    }

    //定义id查询操作的请求方法
    @RequestMapping("/toUpdateBank")
    public String toUpdateBank(Integer id, HttpServletRequest request) {
        //调用业务层进行查询，并且得到结果
        Bank updateBank = bankService.queryId(id);
        //把信息保存在请求作用域中，目的给jsp页面获取并显示
        request.setAttribute("updateBank", updateBank);
        //跳转到jsp页面获取并显示
        return "BankUpdate";
    }

    //定义修改操作的请求方法
    @RequestMapping("/updateBank")
    public String updateBank(Bank bank, HttpServletRequest request) {
        //调用业务层进行添加
        boolean isok = bankService.updateBank(bank);
        //作出响应
        if (isok) {
            //修改成功则重新查询数据
            return "redirect:/queryBank";
        } else {
            //把信息保存在请求作用域中，目的给jsp页面获取并显示
            request.setAttribute("updateBank", bank);
            request.setAttribute("message", "修改失败，请重新操作！");
            return "BankUpdate";
        }
    }

    //定义删除操作的请求方法
    @RequestMapping("/deleteBank")
    public String deleteBank(int id) {
        //调用业务层进行添加
        bankService.delete(id);
        //查询
        return "redirect:/queryBank";
    }
}
