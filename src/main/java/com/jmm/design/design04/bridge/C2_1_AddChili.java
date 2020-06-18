package com.jmm.design.design04.bridge;

/**
 * 添加辣椒
 */
public class C2_1_AddChili implements C1_1_Seasoning {

    @Override
    public String addSeasoning() {
        return "[加辣椒]";
    }
}
