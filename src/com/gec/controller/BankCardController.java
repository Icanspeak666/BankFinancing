package com.gec.controller;

import com.gec.bean.Bank;
import com.gec.bean.Bankcard;
import com.gec.service.BankCardService;
import com.gec.service.BankService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

//使用注解标识为控制层的代码
@Controller
public class BankCardController {

    //获取业务层的操作对象
    @Autowired
    BankCardService bankCardService;
    @Autowired
    BankService bankService;

    //定义添加操作的请求方法
    @RequestMapping("/toInsertBankCard")
    public String toInsertBankCard(HttpServletRequest request) {
        //调用业务层查询所有的银行
        List<Bank> banks = bankService.query();
        // 保存
        request.setAttribute("banks", banks);
        return "BankCardInsert";
    }

    //定义添加操作的请求方法
    @RequestMapping("/toInsertBankCardUser")
    public String toInsertBankCardUser(HttpServletRequest request) {
        //调用业务层查询所有的银行
        List<Bank> banks = bankService.query();
        // 保存
        request.setAttribute("banks", banks);
        return "BankCardInsert-User";
    }

    //定义添加操作的请求方法
    @RequestMapping("/insertBankCard")
    public String insertBank(Bankcard bankCard, HttpServletRequest request) {
        //调用业务层进行添加
        boolean isok = bankCardService.insert(bankCard);
        //作出响应
        if (isok) {
            return "redirect:/queryBankCard";
        } else {
            //把信息保存在请求作用域中，目的给jsp页面获取并显示
            request.setAttribute("bankCard", bankCard);
            request.setAttribute("message", "添加失败，请重新操作！");
            return "BankCardInsert";
        }
    }

    //定义查询操作的请求方法
    @RequestMapping("/queryBankCard")
    public String queryBankCard(@RequestParam(required = false, defaultValue = "1") Integer pageNo, HttpServletRequest request) {
        //调用业务层进行查询，并且得到结果
        //开启分页操作   当页页码，每页显示记录条数
        PageHelper.startPage(pageNo, 3);
        List<Bankcard> list = bankCardService.query();
        //生成page分页模型的信息
        PageInfo pageInfo = new PageInfo(list);
        //把信息保存在请求作用域中，目的给jsp页面获取并显示
        request.setAttribute("list", list);
        request.setAttribute("pageInfo", pageInfo);
        //跳转到jsp页面获取并显示
        return "BankCardList";
    }

    //定义查询操作的请求方法
    @RequestMapping("/queryBankCardUser")
    public String queryBankCardUser(Integer userId,@RequestParam(required = false, defaultValue = "1") Integer pageNo, HttpServletRequest request) {
        //调用业务层进行查询，并且得到结果
        //开启分页操作   当页页码，每页显示记录条数
        PageHelper.startPage(pageNo, 3);
        List<Bankcard> list = bankCardService.queryUserId(userId);
        //生成page分页模型的信息
        PageInfo pageInfo = new PageInfo(list);
        //把信息保存在请求作用域中，目的给jsp页面获取并显示
        request.setAttribute("list", list);
        request.setAttribute("pageInfo", pageInfo);
        //跳转到jsp页面获取并显示
        return "BankCardList";
    }

    //定义修改查询操作的请求方法
    @RequestMapping("/toUpdateBankCard")
    public String toUpdateBankCard(Integer id, HttpServletRequest request) {
        //调用业务层进行查询，并且得到结果
        Bankcard updateBankCard = bankCardService.queryId(id);
        //调用业务层查询所有的银行
        List<Bank> banks = bankService.query();
        // 保存
        request.setAttribute("banks", banks);
        //把信息保存在请求作用域中，目的给jsp页面获取并显示
        request.setAttribute("updateBankCard", updateBankCard);


        //跳转到jsp页面获取并显示
        return "BankCardUpdate";
    }

    //定义修改查询操作的请求方法
    @RequestMapping("/toUpdateBankCardUser")
    public String toUpdateBankCardUser(Integer id, HttpServletRequest request) {
        //调用业务层进行查询，并且得到结果
        Bankcard updateBankCard = bankCardService.queryId(id);
        //调用业务层查询所有的银行
        List<Bank> banks = bankService.query();
        // 保存
        request.setAttribute("banks", banks);
        //把信息保存在请求作用域中，目的给jsp页面获取并显示
        request.setAttribute("updateBankCard", updateBankCard);


        //跳转到jsp页面获取并显示
        return "BankCardUpdate-User";
    }

    //定义修改操作的请求方法
    @RequestMapping("/updateBankCard")
    public String updateBankCard(Bankcard bankcard, HttpServletRequest request) {
        //调用业务层进行添加
        boolean isok = bankCardService.updateBankcard(bankcard);
        //作出响应
        if (isok) {
            //修改成功则重新查询数据
            return "redirect:/queryBankCard";
        } else {
            //把信息保存在请求作用域中，目的给jsp页面获取并显示
            request.setAttribute("updateBankCard", bankcard);
            request.setAttribute("message", "修改失败，请重新操作！");
            return "BankCardUpdate";
        }
    }

    //定义删除操作的请求方法
    @RequestMapping("/deleteBankCard")
    public String deleteBankCard(int id) {
        //调用业务层进行添加
        bankCardService.delete(id);
        //查询
        return "redirect:/queryBankCard";
    }
}