package com.jmm.design.design06.facade;

public class B1_Computer {

    private A1_CPU cpu;
    private A2_Memory memory;
    private A3_Disk disk;

    public B1_Computer(){
        this.cpu = new A1_CPU();
        this.memory = new A2_Memory();
        this.disk = new A3_Disk();
    }

    public void startUp(){
        this.cpu.startUp();
        this.memory.startUp();
        this.disk.startUp();
        System.out.println("....电脑启动....");
    }

    public void shutDown(){
        this.cpu.shutDown();
        this.memory.shutDown();
        this.disk.shutDown();
        System.out.println("....电脑停止....");
    }
}
