package com.g0rez.dao.impl;

import com.g0rez.dao.UserDao;
import com.g0rez.entity.User;
import com.g0rez.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;


public class UserDaoImpl  implements UserDao {


    @Override
    public User selectUser(String username) {
        SqlSession sqlsession = MyBatisUtils.getSqlSession();
        String sqlId="com.g0rez.dao.UserDao.selectUser";
        User user = sqlsession.selectOne(sqlId,username);
        sqlsession.close();
        return user;
    }

    @Override
    public Integer insertUser(User user) {
        SqlSession sqlsession = MyBatisUtils.getSqlSession();
        String sqlId="com.g0rez.dao.UserDao.insertUser";
        Integer num=0;
        UserDao userDao = new UserDaoImpl();
        if(userDao.selectUser(user.getUsername())!=null){
            System.out.println("用户已存在 添加失败！");
            num=-2; //num==-2代表存在该用户
        }else{
            num = sqlsession.insert(sqlId,user);
            if (num!=null & num>0){
                System.out.println("成功添加"+num+"条数据！");
                sqlsession.commit();
            }else{
                System.out.println("数据添加失败！");
            }
        }
        sqlsession.close();
        return num;
    }
}
