package com.zzgs.service.impl;

import com.zzgs.dao.AccountDao;
import com.zzgs.domain.Account;
import com.zzgs.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:   Tang
 * Date:     2019/9/29 8:53
 * Description: service实现类
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        System.out.println("业务层，查询所有的账户信息.....");
        return accountDao.findAll();
    }


    public void saveAccount(Account account) {
        System.out.println("业务层保存账户信息.....");
        accountDao.saveAccount(account);
    }

    public void delAccount(Integer id) {
        accountDao.delAccount(id);
    }

    public Account findOneById(Integer id) {
        return accountDao.findOneById(id);
    }

    public void update(Account account) {
        accountDao.update(account);
    }
}
