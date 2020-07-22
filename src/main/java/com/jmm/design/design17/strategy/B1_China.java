package com.jmm.design.design17.strategy;

/**
 * 具体策略类(ConcreteStrategy) : 中国人吃饭的工具
 */
public class B1_China implements A1_Eat{
    @Override
    public String eatTool() {
        return "中国人吃饭：善用筷子";
    }
}
