package cn.jdwa.dao;

import cn.jdwa.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by czz on 2019/9/28.
 */
@Repository
public interface AccountDao {
    @Select("select * from account")
    List<Account> findAll();

    @Insert("INSERT INTO account (name,money) values (#{name},#{money})")
    void saveAccount(Account account);
}
