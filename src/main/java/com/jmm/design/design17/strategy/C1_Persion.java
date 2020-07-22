package com.jmm.design.design17.strategy;

/**
 * 环境类(Context):用来操作策略的上下文环境
 */
public class C1_Persion {

    private A1_Eat eat;

    /**
     * 开始吃饭
     */
    public void eatIng(){
        System.out.println("拿餐具准备开饭："+eat.eatTool());
    }

    public void setEat(A1_Eat eat) {
        this.eat = eat;
    }
}
