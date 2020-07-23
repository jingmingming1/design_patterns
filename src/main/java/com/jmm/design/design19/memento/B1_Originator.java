package com.jmm.design.design19.memento;

/**
 * Originator(发起人)
 */
public class B1_Originator {

    //发起人自己的状态
    private String state;

    /**
     * 将自己的状态保存到备忘录
     */
    public A1_Memento saveState2Mement(){
        return new A1_Memento(state);
    }

    /**
     * 重置自己的状态 通过备忘录对象
     */
    public void resetStateByMement(A1_Memento menent){
        this.state = menent.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
