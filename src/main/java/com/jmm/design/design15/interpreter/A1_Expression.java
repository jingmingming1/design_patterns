package com.jmm.design.design15.interpreter;

import java.util.HashMap;

/**
 * 抽象解释器
 */
public abstract class A1_Expression {

    /**
     * 解析公式和数值，其中var中的key是公式的参数，value值是具体的数字 如：{"a",108}
     * 负责对传递进来的参数和值进行解析和匹配，其中[key是表达式 a+b+c 中的a、b、c] [value是运算时取得的值]
     */
    // 如果是[终结符]表达式，那么此方法将[获取参数的值]
    // 如果是[非终结符]表达式，那么此方法将[进行运算] - 比如加减
    public abstract int interpreter(HashMap<String, Integer> var);
}
