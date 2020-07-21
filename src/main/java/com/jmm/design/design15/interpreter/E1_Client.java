package com.jmm.design.design15.interpreter;

import java.util.HashMap;

/**
 * 客户端调用
 */
public class E1_Client {

    public static void main(String[] args) {
        String expStr = "a+b-c+d";
        HashMap<String, Integer> var = new HashMap<String, Integer>();
        var.put("a", 1);
        var.put("b", 2);
        var.put("c", 2);
        var.put("d", 4);

        D1_Context context = new D1_Context();
        // 先解析运算表达式
        context.analyse(expStr);
        // 进行运算
        System.out.println(context.run(var));
    }
}
