package com.jmm.design.design14.chain_of_responsibility;

/**
 * 抽象处理者（Handler）
 */
public abstract class B1_Manager {

    public static int DayUnit1 = 3;
    public static int DayUnit2 = 12;
    public static int DayUnit3 = 30;

    //管理者的职务
    protected String managerJob;

    //上级管理者
    protected B1_Manager superior;

    public B1_Manager(String managerJob) {
        this.managerJob = managerJob;
    }

    //审批操作
    public abstract boolean examineApprove(A1_Request request);


    public B1_Manager getSuperior() {
        return superior;
    }

    public void setSuperior(B1_Manager superior) {
        this.superior = superior;
    }
}
