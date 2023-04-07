package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 在注解里面 value 属性值可以省略不写
 * 默认值是类名称，首字母小写  比如：UserService---userService
 */
@Service(value = "userService")  //<bean id="userService" class=".."/>
public class UserService {

    //定义 dao 类型属性
    //不需要添加 set 方法
    //添加注入属性注解
//    @Autowired  //根据类型进行注入
//    @Qualifier(value = "userDaoImpl")  //根据名称进行注入
//    private UserDao userDao;

    //可以根据类型注入，可以根据名称注入
//    @Resource  //这是根据类型注入
    @Resource(name = "userDaoImpl")  //这是根据名称注入
    private UserDao userDao;

    @Value(value = "abc")
    private String name;
    public void add(){
        System.out.println("service add.......");
        userDao.add();
        System.out.println(name);
    }

}
