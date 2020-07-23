package com.jmm.design.design19.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaker(管理者):管理备忘录
 */
public class C1_Caretaker {

    private List<A1_Memento> mementoList;

    public C1_Caretaker(){
        mementoList = new ArrayList<>();
    }

    /**
     * 将备忘录保存起来
     */
    public void mementoSaveState(A1_Memento memento){
        this.mementoList.add(memento);
    }

    /**
     * 从备忘录中获取一个保存过的状态
     */
    public A1_Memento getStateByMemento(int index){
        return mementoList.get(index);
    }

}
