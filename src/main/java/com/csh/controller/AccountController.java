package com.csh.controller;

import com.csh.bean.Account;
import com.csh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @version v1.0
 * @ProjectName: ssm
 * @ClassName: AccountController
 * @Description: TODO(一句话描述该类的功能)
 * @Author: CSH
 * @Date: 2020/7/12 11:39
 */
@Controller
@RequestMapping("/account")
public class AccountController {
@Autowired
private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Map<String,Object> map){
        List<Account> all = accountService.findAll();
        map.put("list", all);
        return "list";
    }

}
