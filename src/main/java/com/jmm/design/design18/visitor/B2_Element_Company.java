package com.jmm.design.design18.visitor;

/**
 * 具体元素(ConcreteElement)-[东家]角色 : 这里指 公司
 */
public class B2_Element_Company extends A2_Element{
    @Override
    public void accept(A1_Visitor visitor) {
        visitor.putonShoe(this);
    }
}
