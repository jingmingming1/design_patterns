package com.jmm.design.design09.Iterator;

import java.util.Iterator;

/**
 * 晚餐 菜单迭代器
 */
public class A4_Dinner_Iterator implements Iterator {

    private A1_Menu[] menuItems;//早餐 菜品集合
    private int position = 0;

    public A4_Dinner_Iterator(A1_Menu[] menuItems){
        this.menuItems = menuItems;
    }

    /**
     * 判断菜单中是否还有下一个菜品
     * @return
     */
    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        }
        return true;
    }

    /**
     * 取得 菜单中的下一个菜品
     * @return
     */
    @Override
    public Object next() {
        A1_Menu menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
