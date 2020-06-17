package com.jmm.design.design03.decorator;

/**
 * 具体装饰类 ： 给饮料加糖
 */
public class C4_2_AddSugar extends C3_1_Decorator {

    private C1_1_Drinks drinks;

    public C4_2_AddSugar(C1_1_Drinks drinks){
        this.drinks = drinks;
    }

    @Override
    public String getDescription() {
        return drinks.getDescription() + "[加糖+3] ";
    }

    @Override
    public double getPrice() {
        return drinks.getPrice() + 3;//加糖需要添加2块钱
    }
}
