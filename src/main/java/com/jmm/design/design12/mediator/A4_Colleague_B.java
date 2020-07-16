package com.jmm.design.design12.mediator;

/**
 * 具体的同事类：房东B：二居室
 */
public class A4_Colleague_B extends A2_Colleague{

    @Override
    public void Handle() {
        System.out.println("房东B：展示两居室");
    }
}
