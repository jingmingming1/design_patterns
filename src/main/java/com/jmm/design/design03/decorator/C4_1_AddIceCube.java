package com.jmm.design.design03.decorator;

/**
 * 具体装饰类 ： 给饮料加冰
 */
public class C4_1_AddIceCube extends C3_1_Decorator {

    private C1_1_Drinks drinks;

    public C4_1_AddIceCube(C1_1_Drinks drinks){
        this.drinks = drinks;
    }

    @Override
    public String getDescription() {
        return drinks.getDescription() + "[加冰+2] ";
    }

    @Override
    public double getPrice() {
        return drinks.getPrice() + 2;//加冰需要添加2块钱
    }
}
