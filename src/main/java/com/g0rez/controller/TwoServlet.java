package com.g0rez.controller;

import com.g0rez.dao.UserDao;
import com.g0rez.dao.impl.UserDaoImpl;
import com.g0rez.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TwoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        UserDao userDao = new UserDaoImpl();
        Integer num = userDao.insertUser(user);
        if(num!=null&&num==-2){
            //存在相同用户
            request.getRequestDispatcher("registerError.jsp").forward(request,response);
        }
        if(num!=null &&num>0){
            request.getRequestDispatcher("registerSuccess.jsp").forward(request,response);
        }
        request.getRequestDispatcher("registerError.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
