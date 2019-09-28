package cn.jdwa.service.impl;

import cn.jdwa.domain.Account;

import java.util.List;

/**
 * Created by czz on 2019/9/28.
 */
public class AccountServiceImpl {
    // 查询所有账户
    public List<Account> findAll(){
        System.out.println("业务层：查询所有账户。。。");
        return null;
    }

    // 保存帐户信息
    public void saveAccount(Account account){
        System.out.println("业务层：保存账户。。。");
    }
}
