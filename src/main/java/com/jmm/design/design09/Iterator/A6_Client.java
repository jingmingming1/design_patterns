package com.jmm.design.design09.Iterator;

import java.util.Iterator;

public class A6_Client {

    public void print() {
        System.out.println("================== 早餐菜单 ======================");
        A2_Breakfask pancakeHouseShop = new A2_Breakfask();
        Iterator pancakeHouseMenuIterator = pancakeHouseShop.createIterator();
        printMenu(pancakeHouseMenuIterator);

        System.out.println("=================== 晚餐菜单 =====================");
        A3_Dinner dinnerShop = new A3_Dinner();
        Iterator dinnerMenuIterator = dinnerShop.createIteraotr();
        printMenu(dinnerMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            A1_Menu menu = (A1_Menu) iterator.next();
            System.out.println("名称: " + menu.getFoodName() + "======== 价格: " + menu.getFoodPrice());
        }
    }

    public static void main(String[] args) {
        A6_Client waiter = new A6_Client();
        waiter.print();
    }
}
