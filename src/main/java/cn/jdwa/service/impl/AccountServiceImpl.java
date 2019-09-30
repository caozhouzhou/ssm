package cn.jdwa.service.impl;

import cn.jdwa.dao.AccountDao;
import cn.jdwa.domain.Account;
import cn.jdwa.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by czz on 2019/9/28.
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao dao;
    // 查询所有账户
    public List<Account> findAll(){
        System.out.println("业务层：查询所有账户。。。");
        List<Account> accounts = dao.findAll();
        for (Account ac:accounts){
            System.out.println("dao查询结果 --》"+ac);
        }
        return dao.findAll();
    }

    // 保存帐户信息
    public void saveAccount(Account account){
        System.out.println("业务层：保存账户。。。");
        dao.saveAccount(account);
    }
}
