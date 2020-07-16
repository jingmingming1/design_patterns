package com.jmm.design.design12.mediator;

/**
 * 具体的同事类：房东A：小开间
 */
public class A3_Colleague_A extends A2_Colleague{

    @Override
    public void Handle() {
        System.out.println("房东A：展示小开间");
    }
}
