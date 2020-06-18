package com.jmm.design.design04.bridge;

public class C4_1_EatBeefNoodles extends C3_1_Noodles{

    @Override
    public void getNoodles() {
        System.out.println("点份[牛肉面] "+seasoning.addSeasoning());
    }
}
