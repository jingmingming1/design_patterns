package com.jmm.design.design04.bridge;

/**
 * 吃面
 */
public abstract class C3_1_Noodles {

    public C1_1_Seasoning seasoning;

    public void setSeasoning(C1_1_Seasoning seasoning) {
        this.seasoning = seasoning;
    }

    public abstract void getNoodles();

}
