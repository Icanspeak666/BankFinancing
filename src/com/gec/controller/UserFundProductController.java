package com.gec.controller;

import com.gec.bean.*;
import com.gec.service.FundProductService;
import com.gec.service.UserFundProductService;
import com.gec.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserFundProductController {
    //获取业务层的操作对象
    @Autowired
    UserFundProductService userFundProductService;
    @Autowired
    UserService userService;
    @Autowired
    FundProductService fundProductService;

    //定义添加操作的请求方法
    @RequestMapping("/toInsertUserFundProduct")
    public String toInsertUserFundProduct(HttpServletRequest request) {
        //调用业务层查询所有的基金理财产品
        List<FundProduct> fundProducts = fundProductService.query();
        // 保存
        request.setAttribute("fundProducts", fundProducts);
        //调用业务层查询所有的用户
        List<User> users = userService.query();
        // 保存
        request.setAttribute("users", users);
        return "UserFundProductInsert";
    }

    //定义添加操作的请求方法
    @RequestMapping("/insertUserFundProduct")
    public String insertUserFundProduct(UserFundProduct userFundProduct, HttpServletRequest request) {
        //调用业务层进行添加
        boolean isok = userFundProductService.insert(userFundProduct);
        //作出响应
        if (isok) {
            return "redirect:/queryUserFundProduct";
        } else {
            //把信息保存在请求作用域中，目的给jsp页面获取并显示
            request.setAttribute("userFundProduct", userFundProduct);
            request.setAttribute("message", "添加失败，请重新操作！");
            return "BankCardInsert";
        }
    }

    //定义查询操作的请求方法
    @RequestMapping("/queryUserFundProduct")
    public String queryUserFundProduct(@RequestParam(required = false, defaultValue = "1") Integer pageNo, HttpServletRequest request) {
        //调用业务层进行查询，并且得到结果
        //开启分页操作   当页页码，每页显示记录条数
        PageHelper.startPage(pageNo, 3);
        List<UserFundProduct> list = userFundProductService.query();
        //生成page分页模型的信息
        PageInfo pageInfo = new PageInfo(list);
        //把信息保存在请求作用域中，目的给jsp页面获取并显示
        request.setAttribute("list", list);
        request.setAttribute("pageInfo", pageInfo);
        //跳转到jsp页面获取并显示
        return "UserFundProductList";
    }

    //定义查询操作的请求方法
    @RequestMapping("/queryUserFundProductUser")
    public String queryUserFundProductUser(Integer userId,@RequestParam(required = false, defaultValue = "1") Integer pageNo, HttpServletRequest request) {
        //调用业务层进行查询，并且得到结果
        //开启分页操作   当页页码，每页显示记录条数
        PageHelper.startPage(pageNo, 3);
        List<UserFundProduct> list = userFundProductService.queryUserId(userId);
        //生成page分页模型的信息
        PageInfo pageInfo = new PageInfo(list);
        //把信息保存在请求作用域中，目的给jsp页面获取并显示
        request.setAttribute("list", list);
        request.setAttribute("pageInfo", pageInfo);
        //跳转到jsp页面获取并显示
        return "UserFundProductList";
    }

    //定义修改查询操作的请求方法
    @RequestMapping("/toUpdateUserFundProduct")
    public String toUpdateUserFundProduct(Integer id, HttpServletRequest request) {
        //调用业务层进行查询，并且得到结果
        UserFundProduct updateUserFundProduct = userFundProductService.queryId(id);
        //调用业务层查询所有的理财产品
        List<FundProduct> fundProducts = fundProductService.query();
        // 保存
        request.setAttribute("fundProducts", fundProducts);
        //把信息保存在请求作用域中，目的给jsp页面获取并显示
        request.setAttribute("updateUserFundProduct", updateUserFundProduct);


        //跳转到jsp页面获取并显示
        return "UserFundProductUpdate";
    }

    //定义修改操作的请求方法
    @RequestMapping("/updateUserFundProduct")
    public String updateUserFundProduct(UserFundProduct userFundProduct, HttpServletRequest request) {
        //调用业务层进行添加
        boolean isok = userFundProductService.updateUserFundProduct(userFundProduct);
        //作出响应
        if (isok) {
            //修改成功则重新查询数据
            return "redirect:/queryUserFundProduct";
        } else {
            //把信息保存在请求作用域中，目的给jsp页面获取并显示
            request.setAttribute("updateUserFundProduct", userFundProduct);
            request.setAttribute("message", "修改失败，请重新操作！");
            return "UserFundProductUpdate";
        }
    }

    //定义删除操作的请求方法
    @RequestMapping("/deleteUserFundProduct")
    public String deleteUserFundProduct(int id) {
        //调用业务层进行添加
        userFundProductService.delete(id);
        //查询
        return "redirect:/queryUserFundProduct";
    }

}
