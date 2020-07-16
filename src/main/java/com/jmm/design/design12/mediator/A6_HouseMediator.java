package com.jmm.design.design12.mediator;

import java.io.Console;

/**
 * 房屋中介
 */
public class A6_HouseMediator extends A1_Mediator{

    /**
     * 中介有所有房东的房屋信息 A B C
     */
    private A3_Colleague_A a;
    private A4_Colleague_B b;
    private A5_Colleague_C c;

    @Override
    public void Common(String type) {
        switch (type){
            case "A":
                a.Handle();
                break;
            case "B":
                b.Handle();
                break;
            case "C":
                c.Handle();
                break;
            default:
                System.out.println("暂时没有这样的房源！");
                break;
        }
    }

    public void setA(A3_Colleague_A a) {
        this.a = a;
    }

    public void setB(A4_Colleague_B b) {
        this.b = b;
    }

    public void setC(A5_Colleague_C c) {
        this.c = c;
    }
}
