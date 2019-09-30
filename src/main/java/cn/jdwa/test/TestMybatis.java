package cn.jdwa.test;

import cn.jdwa.dao.AccountDao;
import cn.jdwa.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * Created by czz on 2019/9/29.
 */
public class TestMybatis {
    @Test
    public void run1() throws Exception{
        String path = "SqlConfigMap.xml";
        InputStream in  = Resources.getResourceAsStream(path);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        List<Account> list = dao.findAll();
        for (Account ac:list){
            System.out.println(ac);
        }
        sqlSession.close();
        in.close();
    }
}
