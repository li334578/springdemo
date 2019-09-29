package com.zzgs.service;

import com.zzgs.domain.Account;

import java.util.List;

/**
 * Author:   Tang
 * Date:     2019/9/29 8:53
 * Description: service接口
 */
public interface AccountService {

    //查询所有账户信息
    public List<Account> findAll();
    //保存账户信息
    public void saveAccount(Account account);
    //根据id删除用户信息
    public void delAccount(Integer id);
    //根据id查询一个用户的信息
    public Account findOneById(Integer id);
    //修改一个账户信息
    public void update(Account account);
}
