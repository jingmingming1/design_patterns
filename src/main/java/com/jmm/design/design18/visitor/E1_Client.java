package com.jmm.design.design18.visitor;

/**
 * 客户端调用
 */
public class E1_Client {
    public static void main(String[] args) {
        //对象结构(Object Structure)-[存放多个东家-可迭代(访客为入参)]角色
        D1_Structure structure = new D1_Structure();
        A2_Element home = new B1_Element_Home();
        A2_Element company = new B2_Element_Company();
        structure.elementPut(home);
        structure.elementPut(company);

        //具体访问者(ConcreteVisitor)-[访客]角色
        A1_Visitor visitor = new C1_Visitor_Staff();

        //将对数据的操作与数据结构进行分离
        structure.accept(visitor);
    }
}
