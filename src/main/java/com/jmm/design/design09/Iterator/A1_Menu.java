package com.jmm.design.design09.Iterator;

/**
 * 具体的菜单类：包含菜品名称，菜品价格
 */
public class A1_Menu {

    /**
     * 菜品名称
     */
    private String foodName;

    /**
     * 菜品价格
     */
    private String foodPrice;

    public A1_Menu(String foodName,String foodPrice){
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }
}
