package com.jmm.design.design03.decorator;

/**
 * 具体客户端调用类
 */
public class C5_1_Client {

    public static void main(String[] args) {
        C1_1_Drinks drinks = new C2_2_OrangeWater(); // 购买了橙汁
        drinks = new C4_1_AddIceCube(drinks); // 加冰
        drinks = new C4_2_AddSugar(drinks);//加糖
        System.out.println(drinks.getDescription() + " 价格：" +drinks.getPrice());
    }
}
