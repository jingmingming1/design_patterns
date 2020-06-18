package com.jmm.design.design04.bridge;

public class C5_Client {

    public static void main(String[] args) {
        C3_1_Noodles noodles = new C4_1_EatBeefNoodles();// 吃面-牛肉面
        noodles.setSeasoning(new C2_1_AddChili());// 加辣椒
        noodles.getNoodles();

        noodles = new C4_2_EatChickenNoodles();//吃面-鸡肉面
        noodles.setSeasoning(new C2_2_AddVinegar());// 加陈醋
        noodles.getNoodles();
    }
}
