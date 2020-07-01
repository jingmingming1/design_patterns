package com.jmm.design.design05.proxy;

public class A4_Client {

    public static void main(String[] args) {
        A1_IUserDao userDao = new A2_UserDao();
        A3_UserDaoProxy userDaoProxy = new A3_UserDaoProxy(userDao);
        userDaoProxy.save();
    }
}
