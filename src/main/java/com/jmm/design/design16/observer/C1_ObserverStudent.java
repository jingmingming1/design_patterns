package com.jmm.design.design16.observer;


/**
 * 具体观察者（Concrete Observer） : 学生
 */
public class C1_ObserverStudent implements A2_Observer{

    //学生名称
    private String studentName;

    private A1_Subject teacher;

    public C1_ObserverStudent(A1_Subject teacher,String studentName){
        this.studentName = studentName;
        this.teacher = teacher;
        //将自己注册到消息发布者 【老师那里】
        this.teacher.registerObserver(this);
    }

    @Override
    public void update(String work) {
        System.out.println("学生："+studentName+" 收到家庭："+work);
    }
}
