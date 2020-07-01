package com.jmm.design.design05.proxy;

public class B2_Client {

    public static void main(String[] args) {
        A1_IUserDao userDao = new A2_UserDao();
        userDao.save();

        System.out.println("==============");

        A1_IUserDao userDaoProxy = (A1_IUserDao) new B1_ProxyFactory(userDao).getProxyInstance();
        userDaoProxy.save();
    }
}
