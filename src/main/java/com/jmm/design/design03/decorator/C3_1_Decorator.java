package com.jmm.design.design03.decorator;

/**
 * 创建 饮料的 装饰类
 */
public class C3_1_Decorator implements C1_1_Drinks {


    @Override
    public String getDescription() {
        return "装饰类";
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
