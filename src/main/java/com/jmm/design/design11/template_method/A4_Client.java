package com.jmm.design.design11.template_method;

public class A4_Client {

    public static void main(String[] args) {
        //我来做菜
        System.out.println("------我来炒菜-------");
        A2_My_Cook myCook = new A2_My_Cook();
        myCook.setPutVegetables(false);//我不喜欢放青菜
        myCook.cook();

        System.out.println("------五星大厨炒菜-------");
        //五星大厨做菜
        A3_Chef_Cook chefCook = new A3_Chef_Cook();
        chefCook.cook();
    }
}
