package com.jmm.design.design17.strategy;

/**
 * 具体策略类(ConcreteStrategy) : 欧洲人吃饭的工具
 */
public class B2_Europe implements A1_Eat {
    @Override
    public String eatTool() {
        return "欧洲人吃饭：善用刀叉";
    }
}
