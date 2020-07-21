package com.jmm.design.design15.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * Context——环境角色 对输入的表达式进行解析，并计算
 */
public class D1_Context {

    // 定义表达式，最后拿到是一个运算解析器，比如X+Y格式的，其中X可能又是由A+B的运算解析器组成
    // 只有最底层的解析器才是变量解析器，也就是终结符表达式
    // 此参数最终得到的肯定是非终结表达式
    private A1_Expression expression;

    /**
     * 分析用户输入的表达式
     */
    public void analyse(String expStr) {
        // 定义一个栈，安排运算的先后顺序
        Stack<A1_Expression> stack = new Stack<A1_Expression>();

        char[] charArray = expStr.toCharArray();

        A1_Expression left = null;
        A1_Expression right = null;
        for(int i=0; i<charArray.length; i++) {
            switch(charArray[i]) {
                case '+':
                    // 将加法运算加入到栈中
                    left = stack.pop();
                    right = new B1_VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new C2_AddExpression(left, right));
                    break;
                case '-':
                    // 将减法运算加入到栈中
                    left = stack.pop();
                    right = new B1_VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new C3_SubExpression(left, right));
                    break;
                default:
                    // 如果不是运算符，那么就是终结表达式
                    stack.push(new B1_VarExpression(String.valueOf(charArray[i])));
            }
        }
        // 把最终栈的顶层抛出，它即是最后封装的非终结表达式
        this.expression = stack.pop();
    }

    // 将键值对输入给表达式运算
    public int run(HashMap<String, Integer> var) {
        return expression.interpreter(var);
    }
}
