package com.jmm.design.design05.proxy;

public class D3_Client {

    public static void main(String[] args) {
        //目标对象
        D1_UserDao dao = new D1_UserDao();
        //代理对象
        D1_UserDao proxy = (D1_UserDao) new D2_Cglib_ProxyFactory(dao).getProxyInstance();
        //执行代理对象方法
        proxy.save();
    }
}
