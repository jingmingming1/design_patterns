package com.jmm.design.design16.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题（Concrete Subject） : 具体的老师-数学老师
 */
public class B1_SubjectTeacher implements A1_Subject{

    //老师持有所有学生的引用：所有学生都是观察者
    protected List<A2_Observer> studentList ;

    //作业信息
    private String workMessage;

    public B1_SubjectTeacher(){
        studentList = new ArrayList<>();
    }

    @Override
    public void registerObserver(A2_Observer observer) {
        studentList.add(observer);
    }

    @Override
    public void removeObserver(A2_Observer observer) {
        studentList.remove(observer);
    }

    /**
     * 老师布置作业：通知全体同学
     */
    public void teacherHomeWork(String homeWork){
        this.setWorkMessage(homeWork);
        this.notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(A2_Observer observer : studentList){
            observer.update(workMessage);
        }
    }

    public void setWorkMessage(String workMessage) {
        this.workMessage = workMessage;
    }
}
