package com.lagou.test;

import com.lagou.io.Resources;
import com.lagou.sqlSession.SqlSession;
import com.lagou.sqlSession.SqlSessionFactory;
import com.lagou.sqlSession.SqlSessionFactoryBuilder;
import com.lagou.test.pojo.User;

import java.io.InputStream;

/**
 * @program: IPersistence
 * @description:
 * @author: lixin
 * @create: 2020-03-26 22:25
 **/
public class IPersistenceTest {
    public void test(){
        try{
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();

            //调用
            User user = new User();
            user.setId(1);
            user.setUsername("张三");
            //sqlSession.selectList("user.selectList",user);

            sqlSession.selectOne("user.selectOne",user);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
