package com.jmm.design.design17.strategy;

/**
 * 开始调用
 */
public class D1_Client {

    /**
     * 策略模式 : 定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换
     */
    public static void main(String[] args) {
        C1_Persion persion = new C1_Persion();

        //中国人选餐具开始吃饭
        persion.setEat(new B1_China());
        persion.eatIng();

        //欧洲人人选餐具开始吃饭
        persion.setEat(new B2_Europe());
        persion.eatIng();

        //少数其他人选餐具开始吃饭
        persion.setEat(new B3_Other());
        persion.eatIng();
    }
}
