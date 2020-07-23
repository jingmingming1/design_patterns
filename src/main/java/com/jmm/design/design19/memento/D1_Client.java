package com.jmm.design.design19.memento;

/**
 * 客户端调用 场景再现
 */
public class D1_Client {

    public static void main(String[] args) {
        //声明一个发起人
        B1_Originator persion = new B1_Originator();
        //声明一个备忘录管理器
        C1_Caretaker mamager = new C1_Caretaker();
        persion.setState("我很生气：出门不给我买好吃的");
        mamager.mementoSaveState(persion.saveState2Mement());
        System.out.println("当前状态："+persion.getState() +" - 记录小本本");

        persion.setState("我不开心：出门没有给我买礼物");
        mamager.mementoSaveState(persion.saveState2Mement());
        System.out.println("当前状态："+persion.getState() +" - 记录小本本");

        persion.setState("我不高兴：周末也不带我出去玩");
        mamager.mementoSaveState(persion.saveState2Mement());
        System.out.println("当前状态："+persion.getState() +" - 记录小本本");

        System.out.println("拿出备忘录小本本：回忆一下历史");
        persion.setState(mamager.getStateByMemento(0).getState());
        System.out.println("曾经状态：那天"+persion.getState());
        persion.setState(mamager.getStateByMemento(1).getState());
        System.out.println("曾经状态：那天"+persion.getState());
        persion.setState(mamager.getStateByMemento(2).getState());
        System.out.println("曾经状态：那天"+persion.getState());

    }
}
