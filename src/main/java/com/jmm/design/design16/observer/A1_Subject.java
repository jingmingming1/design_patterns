package com.jmm.design.design16.observer;

/**
 * 抽象主题（Subject）-（发布者、被观察者）: 老师
 */
public interface A1_Subject {
    /**
     * 注册观察者
     */
    void registerObserver(A2_Observer observer);

    /**
     * 移除观察者
     */
    void removeObserver(A2_Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();

}
