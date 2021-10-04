package com.g0rez.controller;

import com.g0rez.dao.UserDao;
import com.g0rez.dao.impl.UserDaoImpl;
import com.g0rez.entity.User;

import java.io.IOException;

public class OneServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserDao userDao = new UserDaoImpl();
        User user = userDao.selectUser(username);
        if(user!=null){
            if(user.getPassword().equals(password)){
                request.getRequestDispatcher("loginSuccess.jsp").forward(request,response);
            }
        }
        request.getRequestDispatcher("loginError.jsp").forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
