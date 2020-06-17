package com.jmm.design.design03.decorator;

/**
 * 饮料2 橙汁儿
 */
public class C2_2_OrangeWater implements C1_1_Drinks {

    @Override
    public String getDescription() {
        return "橙汁儿+15 ";
    }

    @Override
    public double getPrice() {
        return 15;
    }
}
