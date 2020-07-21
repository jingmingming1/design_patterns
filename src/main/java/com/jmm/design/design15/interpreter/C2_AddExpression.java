package com.jmm.design.design15.interpreter;

import java.util.HashMap;

/**
 * 加法解析器
 * interpreter方法处理加法运算
 */
public class C2_AddExpression extends C1_SymbolExpression{

    public C2_AddExpression(A1_Expression left, A1_Expression right) {
        super(left, right);
    }

    /**
     * 进行加法运算
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return left.interpreter(var) + right.interpreter(var);
    }
}
