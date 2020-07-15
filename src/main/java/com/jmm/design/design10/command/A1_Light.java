package com.jmm.design.design10.command;

/**
 * [接收者]
 * 灯本身：控制着灯的开启和关闭
 */
public class A1_Light {

    public void on() {
        System.out.println("打开灯...");
    }

    public void off() {
        System.out.println("关闭灯...");
    }
}
