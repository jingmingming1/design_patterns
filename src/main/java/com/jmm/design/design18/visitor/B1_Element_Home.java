package com.jmm.design.design18.visitor;

/**
 * 具体元素(ConcreteElement)-[东家]角色 : 这里指 家
 */
public class B1_Element_Home extends A2_Element{
    @Override
    public void accept(A1_Visitor visitor) {
        visitor.putonShoe(this);
    }
}
