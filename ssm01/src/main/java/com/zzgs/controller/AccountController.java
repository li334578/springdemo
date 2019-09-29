package com.zzgs.controller;

import com.zzgs.domain.Account;
import com.zzgs.service.AccountService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Author:   Tang
 * Date:     2019/9/29 8:55
 * Description: 账户控制器
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层查询所有....");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        System.out.println("------> account = " + account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return ;
    }

    @RequestMapping("/del/{id}")
    public String delete(@PathVariable("id")Integer id){
         accountService.delAccount(id);
         return "success";
    }
    @RequestMapping("/findOne/{id}")
    public String findOneById(@PathVariable("id")Integer id,Model model){
        Account account = accountService.findOneById(id);
        System.out.println("account = " + account);
        model.addAttribute("account",account);
        return "update";
    }
    @RequestMapping("/update/{id}")
    public String update(@PathVariable("id")Integer id,
                         @RequestParam("name")String name,
                         @RequestParam("money")Double money){
        Account account = new Account();
        account.setId(id);
        account.setName(name);
        account.setMoney(money);
        System.out.println("account = " + account);
        accountService.update(account);
        return "success";
    }
}
