package com.jmm.design.design09.Iterator;

import java.util.Iterator;

/**
 * 晚餐 菜单 菜品集合
 */
public class A3_Dinner {

    private static final int MAX_ITEMS = 4;//菜单最大量
    private int index = 0;
    private A1_Menu[] menuItems;//存放所有菜品的容器

    public A3_Dinner() {
        menuItems = new A1_Menu[4];
        // 默认就放入菜单项
        addItem("浪漫套餐", "666元");
        addItem("小龙虾套餐", "520元");
        addItem("铁板鱿鱼", "66元");
        addItem("炭烤扇贝", "88元");
    }

    public void addItem(String name, String price) {
        A1_Menu menu = new A1_Menu(name, price);
        if (index >= MAX_ITEMS) {
            System.err.println("对不起, 菜单页满了");
        } else {
            menuItems[index] = menu;
            index++;
        }
    }

    /**
     * 创建迭代器：重点  重点  重点
     */
    public Iterator createIteraotr() {
        return new A4_Dinner_Iterator(menuItems);
    }
}
