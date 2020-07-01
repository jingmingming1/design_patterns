package com.jmm.design.design05.proxy;

/**
 * 静态代理
 */
public class A3_UserDaoProxy implements A1_IUserDao {

    //接收目标对象
    private A1_IUserDao target;

    public A3_UserDaoProxy(A1_IUserDao target){
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("准备保存数据");
        target.save();//执行目标对象的方法
        System.out.println("数据保存完毕");
    }
}
