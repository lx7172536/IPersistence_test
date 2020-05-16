package com.lagou.test;

import com.lagou.io.Resources;
import com.lagou.sqlSession.SqlSession;
import com.lagou.sqlSession.SqlSessionFactory;
import com.lagou.sqlSession.SqlSessionFactoryBuilder;
import com.lagou.test.dao.IUserDAO;
import com.lagou.test.pojo.User;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @program: IPersistence
 * @description:
 * @author: lixin
 * @create: 2020-03-26 22:25
 **/
public class IPersistenceTest {

    @Test
    public void test(){
        try{
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();

            //调用
            User user = new User();
            user.setId(1);
            //user.setAge("\"十五\"");
            user.setUsername("张三");
            IUserDAO userDAO = sqlSession.getMapper(IUserDAO.class);
            /*List<User> all = userDAO.findAll();
            for (User user1:all) {
                System.out.println(user1.getId());
                System.out.println(user1.getUsername());
            }*/

            User user1 = userDAO.findByCondition(user);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
