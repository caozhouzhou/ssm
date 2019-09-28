package cn.jdwa.service.impl;

import cn.jdwa.domain.Account;
import cn.jdwa.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by czz on 2019/9/28.
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
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
