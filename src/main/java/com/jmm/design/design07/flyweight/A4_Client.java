package com.jmm.design.design07.flyweight;

/**
 * 客户端调用
 */
public class A4_Client {

    public static void main(String[] args) {
        A3_FlyweightFactory factory = new A3_FlyweightFactory();
        A2_FlyweightRole role1 = (A2_FlyweightRole)factory.getFlyweight("张三");
        A2_FlyweightRole role2 = (A2_FlyweightRole)factory.getFlyweight("张三");
        A2_FlyweightRole role3 = (A2_FlyweightRole)factory.getFlyweight("李四");
        role1.operate();
        role2.operate();
        role3.operate();
        int size = factory.getSize();
        System.out.println("size:"+size);
    }
}
