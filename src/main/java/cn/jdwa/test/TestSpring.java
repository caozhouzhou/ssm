package cn.jdwa.test;

import cn.jdwa.domain.Account;
import cn.jdwa.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by czz on 2019/9/28.
 */
public class TestSpring {

    @Test
    public void run1(){
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 获取对象
        AccountService as = (AccountService) ac.getBean("accountService");
        // 调用方法
        as.findAll();
        Account acc = new Account();
        acc.setName("admin");
        acc.setMoney(12.0);
        as.saveAccount(acc);
    }
}
