package com.jmm.design.design07.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 */
public class A3_FlyweightFactory {

    //定义一个池容器
    private static Map<String,A1_Flyweight> poll = new HashMap<String,A1_Flyweight>();

    //享元工厂
    public static A1_Flyweight getFlyweight(String employeeName){
        A1_Flyweight result =  poll.get(employeeName);
        if(null!=result){
            return result;
        }
        //根据外部状态创建享元对象
        result = new A2_FlyweightRole(employeeName);
        //放置到池中
        poll.put(employeeName,result);
        return result;
    }

    /**
     * 获取 池容器 中对象数量
     */
    public static int getSize(){
        return poll.size();
    }
}
