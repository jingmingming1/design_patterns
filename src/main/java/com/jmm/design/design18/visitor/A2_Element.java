package com.jmm.design.design18.visitor;

/**
 * 抽象元素(Element)-[东家]角色 : 这里指公司、家
 */
public abstract class A2_Element {

    //声明接受哪一类访问者访问
    public abstract void accept(A1_Visitor visitor);
}
