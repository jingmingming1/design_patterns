package com.jmm.design.design09.Iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 早餐迭代器
 */
public class A3_Breakfast_Iterator implements Iterator {

    private List<A1_Menu> menuItems;//早餐 才当容器

    private int position = 0;

    public A3_Breakfast_Iterator(List<A1_Menu> menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        A1_Menu menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
