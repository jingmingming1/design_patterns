package com.jmm.design.design16.observer;


/**
 * 具体观察者（Concrete Observer） : 班长
 */
public class C2_ObserverMonitor implements A2_Observer{

    //班长名称
    private String monitorName;

    private A1_Subject teacher;

    public C2_ObserverMonitor(A1_Subject teacher, String monitorName){
        this.monitorName = monitorName;
        this.teacher = teacher;
        //将自己注册到消息发布者 【老师那里】
        this.teacher.registerObserver(this);
    }

    @Override
    public void update(String work) {
        System.out.println("班长："+monitorName+" 收到家庭："+work);
        print(work);
    }

    //班长将家庭作业写到黑板上
    private void print(String work){
        System.out.println("班长："+monitorName+" 将作业写到黑板："+work);
    }
}
