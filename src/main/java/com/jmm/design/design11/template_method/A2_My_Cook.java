package com.jmm.design.design11.template_method;

/**
 * 我来炒个西红柿鸡蛋
 */
public class A2_My_Cook extends A1_Cook {

    //是否放蔬菜
    private boolean putVegetables;

    @Override
    public void putEgg() {
        System.out.println("我来炒菜：放入10个鸡蛋");
    }

    @Override
    public void putTomato() {
        System.out.println("我来炒菜：放入1个西红柿");
    }

    @Override
    public boolean isPutVegetables() {
        return this.putVegetables;
    }

    public void setPutVegetables(boolean putVegetables) {
        this.putVegetables = putVegetables;
    }
}
