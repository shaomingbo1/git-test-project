package com.atguigu.service;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.UserDaoImpl;

public class UserService {
    private UserDao userDao = new UserDaoImpl();

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add .....");
        userDao.update();
    }
}
