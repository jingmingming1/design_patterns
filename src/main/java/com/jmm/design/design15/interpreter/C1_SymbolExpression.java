package com.jmm.design.design15.interpreter;

/**
 * [抽象]运算符解析器
 * [非终结符表达式]
 */
public abstract class C1_SymbolExpression extends A1_Expression {

    // 每个运算符都有左右两个参数进行运算，因此抽象到父类中
    protected A1_Expression left;
    protected A1_Expression right;

    public C1_SymbolExpression(A1_Expression left,A1_Expression right){
        this.left = left;
        this.right = right;
    }

}
