package com.jmm.design.design18.visitor;

/**
 * 抽象访问者(Visitor)-[访客]角色
 */
public interface A1_Visitor {

    /**
     * 定义访客的行为：在家里穿的鞋子
     */
    void putonShoe(B1_Element_Home element);

    /**
     * 定义访客的行为：在公司穿的鞋子
     */
    void putonShoe(B2_Element_Company element);
}
