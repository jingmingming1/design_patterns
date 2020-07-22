package com.jmm.design.design16.observer;

/**
 * 客户端调用：场景开始
 */
public class D1_Client {

    public static void main(String[] args) {
        B1_SubjectTeacher teacher = new B1_SubjectTeacher();
        A2_Observer student1 = new C1_ObserverStudent(teacher,"张三");
        A2_Observer student2 = new C1_ObserverStudent(teacher,"李四");
        A2_Observer student3 = new C1_ObserverStudent(teacher,"王五");
        A2_Observer monitor = new C2_ObserverMonitor(teacher,"小红");
        teacher.teacherHomeWork("乘法口诀默写一遍");
    }
}
