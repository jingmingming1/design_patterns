package com.jmm.design.design05.proxy;

public class A2_UserDao implements A1_IUserDao {

    @Override
    public void save() {
        System.out.println("保存数据");
    }
}
