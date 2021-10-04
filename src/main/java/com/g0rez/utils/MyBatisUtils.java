package com.g0rez.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {
    private static SqlSessionFactory factory=null;
    //SqlSessionFactory对象是重量级的 最好一个项目只创建一个 所以写在静态代码块中 避免重复创建
    static {
        //1.mybatis 主配置文件
        String config = "mybatis.xml";
        //2. 读取配置文件
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream(config);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //3. 创建 SqlSessionFactory 对象, , 目的是获取 Sql Session
        factory = new SqlSessionFactoryBuilder().build(in);
    }
    public static SqlSession getSqlSession() {
        SqlSession sqlSession =null;
        //4. 获取 SqlSession,SqlSession 能执行 sql 语句
        if (factory != null) {
             sqlSession = factory.openSession();
        }

        return sqlSession;
    }
}
