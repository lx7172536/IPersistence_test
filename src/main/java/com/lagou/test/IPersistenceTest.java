package com.lagou.test;

import com.lagou.io.Resources;
import com.lagou.sqlSession.SqlSessionFactory;
import com.lagou.sqlSession.SqlSessionFactoryBuilder;

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
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
