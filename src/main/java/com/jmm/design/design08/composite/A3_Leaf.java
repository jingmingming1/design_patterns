package com.jmm.design.design08.composite;

/**
 * 叶子节点
 */
public class A3_Leaf extends A1_Component {

    /**
     * 组件的名字
     */
    private String name = "";

    public A3_Leaf(String name){
        this.name = name;
    }

    /**
     * 此处用于输出组件的树形结构
     * @param preStr
     */
    @Override
    public void operation(String preStr) {
        System.out.println(preStr + "-" + name);
    }
}
