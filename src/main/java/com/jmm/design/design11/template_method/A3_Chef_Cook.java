package com.jmm.design.design11.template_method;

/**
 * 五星大厨 炒西红柿鸡蛋
 */
public class A3_Chef_Cook extends A1_Cook {

    @Override
    public void putEgg() {
        System.out.println("五星大厨：放入6个鸡蛋");
    }

    @Override
    public void putTomato() {
        System.out.println("五星大厨：放入2个西红柿");
    }

    @Override
    public void putVegetables() {
        System.out.println("五星大厨：放入3颗小白菜");
    }
}
