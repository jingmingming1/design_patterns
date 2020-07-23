package com.jmm.design.design19.memento;

/**
 * Memento(备忘录)
 */
public class A1_Memento {

    //要保存的具体状态
    private String state;

    public A1_Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
