package com.jmm.design.design15.interpreter;

import java.util.HashMap;

/**
 * 变量解析器
 * [终结符表达式]
 */
public class B1_VarExpression extends A1_Expression {

    private String key;

    public B1_VarExpression(String key){
        this.key = key;
    }

    /**
     * [终结符]表达式，那么此方法将[获取参数的值]
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
