package com.jmm.design.design04.bridge;

public class C4_2_EatChickenNoodles extends C3_1_Noodles{

    @Override
    public void getNoodles() {
        System.out.println("点份[鸡肉面] "+seasoning.addSeasoning());
    }


}
