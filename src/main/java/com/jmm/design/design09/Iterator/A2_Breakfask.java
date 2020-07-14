package com.jmm.design.design09.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 早餐 菜单 菜品集合
 */
public class A2_Breakfask {

    /**
     * 菜单列表
     */
    private List<A1_Menu> menuItems;

    public A2_Breakfask(){
        this.menuItems = new ArrayList<>();
        // 默认就放入菜单项
        addItem("可乐", "8元");
        addItem("汉堡", "15元");
        addItem("薯条", "13元");
        addItem("鸡翅", "12元");
    }

    public void addItem(String name, String price) {
        A1_Menu menu = new A1_Menu(name, price);
        menuItems.add(menu);
    }

    /**
     * 创建迭代器：重点  重点  重点
     */
    public Iterator createIterator() {
        return new A3_Breakfast_Iterator(menuItems);
    }
}
