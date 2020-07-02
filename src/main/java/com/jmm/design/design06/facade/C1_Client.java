package com.jmm.design.design06.facade;

public class C1_Client {

    public static void main(String[] args) {
        B1_Computer computer = new B1_Computer();
        computer.startUp();
        System.out.println("==============");
        computer.shutDown();
    }
}
