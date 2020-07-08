package com.jmm.design.design07.flyweight;

/**
 * 抽象享元角色
 */
public abstract class A1_Flyweight {
    //内部状态 部门
    private String department="公司总部";

    //外部状态 员工姓名  【定义成 final 类型的可以先思考下为什么】
    private final String employeeName;

    //要求享元角色必须接受外部状态
    public A1_Flyweight(String employeeName){
        this.employeeName = employeeName;
    }

    //内部状态的 getter/setter
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //定义业务操作
    public abstract void operate();

    public String getEmployeeName() {
        return employeeName;
    }
}
