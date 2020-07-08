package com.jmm.design.design07.flyweight;

/**
 * 具体的享元角色
 */
public class A2_FlyweightRole extends A1_Flyweight {

    public A2_FlyweightRole(String employeeName){
        super(employeeName);
    }

    @Override
    public void operate() {
        System.out.println(this.getDepartment() +"-"+ this.getEmployeeName() +":优秀员工");
    }
}
