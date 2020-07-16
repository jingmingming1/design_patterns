package com.jmm.design.design12.mediator;

/**
 * 一个租客开始租房
 */
public class A7_Client {

    public static void main(String[] args) {
        System.out.println("有租客开始看房：");
        //初始化中介
        A6_HouseMediator mediator = new A6_HouseMediator();

        //初始化房屋信息
        A3_Colleague_A houseA = new A3_Colleague_A( );
        A4_Colleague_B houseB = new A4_Colleague_B( );
        A5_Colleague_C houseC = new A5_Colleague_C( );

        //中介获取房屋信息
        mediator.setA(houseA);
        mediator.setB(houseB);
        mediator.setC(houseC);

        //租客A需要一居室、提供看房
        mediator.Common("A");

        //租客B需要三居室、提供看房
        mediator.Common("B");

        //租客C需要四居室、暂无房源
        mediator.Common("D");
    }
}
