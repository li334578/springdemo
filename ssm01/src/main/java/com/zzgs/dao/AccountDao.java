package com.zzgs.dao;

import com.zzgs.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author:   Tang
 * Date:     2019/9/29 8:49
 * Description: 账户dao接口
 */
@Repository
public interface AccountDao {
    //查询所有账户信息
    @Select("select * from account")
    public List<Account> findAll();
    //保存账户信息
    @Insert("insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);
    @Delete("delete from account where id = #{id}")
    public void delAccount(Integer id);
    @Select("select * from account where id = #{id} limit 1")
    public Account findOneById(Integer id);
    @Update("update account set name = #{name},money = #{money} where id = #{id}")
    public void update(Account account);
}
