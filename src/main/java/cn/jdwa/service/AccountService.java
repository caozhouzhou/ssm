package cn.jdwa.service;

import cn.jdwa.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by czz on 2019/9/28.
 */
public interface AccountService {
    // 查询所有账户
    List<Account> findAll();

    // 保存帐户信息
    void saveAccount(Account account);
}
