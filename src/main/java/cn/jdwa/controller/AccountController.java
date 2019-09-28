package cn.jdwa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by czz on 2019/9/28.
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("表现层:查询所有账户信息。。。 。。。");
        return "list";
    }
}
