package com.jmm.design.design08.composite;

/**
 * 客户端调用
 */
public class A4_Client {

    public static void main(String[] args) {
        // 定义多个Composite组合对象
        A1_Component root = new A2_Composite("服装");
        A1_Component c1 = new A2_Composite("男装");
        A1_Component c2 = new A2_Composite("女装");
        A1_Component c3 = new A2_Composite("母婴");

        // 定义多个Leaf叶子对象
        A1_Component leaf1 = new A3_Leaf("西服");
        A1_Component leaf2 = new A3_Leaf("夹克");
        A1_Component leaf3 = new A3_Leaf("衬衫");
        A1_Component leaf4 = new A3_Leaf("裙子");
        A1_Component leaf5 = new A3_Leaf("套装");
        A1_Component leaf6 = new A3_Leaf("鞋袜");
        A1_Component leaf7 = new A3_Leaf("孕妇装");
        A1_Component leaf8 = new A3_Leaf("婴儿装");

        // 组合成为树形的对象结构
        root.addChild(c1);
        root.addChild(c2);
        root.addChild(leaf6);
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c1.addChild(leaf3);
        c2.addChild(leaf4);
        c2.addChild(leaf5);
        c2.addChild(c3);
        c3.addChild(leaf7);
        c3.addChild(leaf8);

        // 调用根对象的输出功能输出整棵树
        root.operation("");
    }
}
