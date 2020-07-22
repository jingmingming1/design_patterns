package com.jmm.design.design18.visitor;

/**
 * 具体访问者(ConcreteVisitor)-[访客]角色 : 这里指员工在家里、公司 的表现
 */
public class C1_Visitor_Staff implements A1_Visitor {
    @Override
    public void putonShoe(B1_Element_Home element) {
        System.out.println("员工在家里：开心的穿着拖鞋");
    }

    @Override
    public void putonShoe(B2_Element_Company element) {
        System.out.println("员工在单位：优雅的穿着皮鞋");
    }
}
