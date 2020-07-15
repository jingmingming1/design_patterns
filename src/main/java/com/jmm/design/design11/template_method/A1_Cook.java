package com.jmm.design.design11.template_method;

/**
 * 定义模板方法类：炒菜
 */
public abstract class A1_Cook {

    /**
     * 放入食用油
     *
     * 第一步：放油 [ 这个步骤是秘方-决定了口感-不能外泄（子类不能访问） ]
     */
    private void putOil(){
        System.out.println("食用油：加入适量");
    }

    /**
     * 第二步：放鸡蛋  子类可以自行决定放入几颗鸡蛋
     */
    public abstract void putEgg();

    /**
     * 第三步：放西红柿  子类可以自行决定放入多少西红柿
     */
    public abstract void putTomato();

    /**
     * 第四步：是否放青菜 [ 这个是可选项 - 有些客人不喜欢青菜 ] 子类可以自己定义
     */
    public boolean isPutVegetables(){
        return true;
    }

    /**
     * 如果需要放入青菜 - 则执行放入青菜的操作
     * 仅仅是空的实现而不是定义一个抽象方法，避免了对现有扩展类的修改，这个在模版方法模式的术语中被称为Hook钩子
     */
    public void putVegetables(){

    }

    /**
     * 第五步：开始烹饪料理
     *
     * 注意事项：为防止恶意操作，一般模板方法都加上 final 关键词。
     */
    final public void cook(){
        this.putOil();
        this.putEgg();
        this.putTomato();
        if(this.isPutVegetables()){
            this.putVegetables();
        }
    }
}
