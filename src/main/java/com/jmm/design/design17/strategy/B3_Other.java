package com.jmm.design.design17.strategy;

/**
 * 具体策略类(ConcreteStrategy) : 其他极少数人吃饭的工具
 */
public class B3_Other implements A1_Eat {
    @Override
    public String eatTool() {
        return "少数人吃饭：直接上手";
    }
}
