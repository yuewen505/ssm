package com.csh.service.impl;

import com.csh.bean.Account;
import com.csh.mapper.AccountMapper;
import com.csh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.List;

/**
 * @version v1.0
 * @ProjectName: ssm
 * @ClassName: AccountServiceImpl
 * @Description: TODO(一句话描述该类的功能)
 * @Author: CSH
 * @Date: 2020/7/12 17:32
 */
@Service
public class AccountServiceImpl implements AccountService {
@Autowired
private AccountMapper accountMapper;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户...");
        List<Account> all = accountMapper.findAll();
        return all;
    }
}
