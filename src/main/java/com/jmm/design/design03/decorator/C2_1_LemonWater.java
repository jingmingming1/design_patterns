package com.jmm.design.design03.decorator;

/**
 * 饮料1 柠檬水
 */
public class C2_1_LemonWater implements C1_1_Drinks {

    @Override
    public String getDescription() {
        return "柠檬水+10 ";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
