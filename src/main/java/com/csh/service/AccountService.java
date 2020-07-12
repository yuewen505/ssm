package com.csh.service;

import com.csh.bean.Account;

import java.util.List;

/**
 * @version v1.0
 * @ProjectName: ssm
 * @ClassName: AccountService
 * @Description: TODO(一句话描述该类的功能)
 * @Author: CSH
 * @Date: 2020/7/12 17:29
 */
public interface AccountService {
    // 查询所有账户
    public List<Account> findAll();
}
