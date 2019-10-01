package cn.jdwa.controller;

import cn.jdwa.domain.Account;
import cn.jdwa.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by czz on 2019/9/28.
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层:查询所有账户信息。。。 。。。");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public void save(Account ac, HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println("表现层:查询所有账户信息。。。 。。。");
        accountService.saveAccount(ac);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }
}
