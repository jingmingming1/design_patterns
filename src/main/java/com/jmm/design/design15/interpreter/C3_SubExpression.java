package com.jmm.design.design15.interpreter;

import java.util.HashMap;

/**
 * 减法解析器
 * interpreter方法处理减法运算
 */
public class C3_SubExpression extends C1_SymbolExpression{

    public C3_SubExpression(A1_Expression left, A1_Expression right) {
        super(left, right);
    }

    /**
     * 进行减法运算
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return left.interpreter(var) - right.interpreter(var);
    }
}
