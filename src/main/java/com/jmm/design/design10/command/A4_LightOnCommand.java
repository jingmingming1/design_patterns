package com.jmm.design.design10.command;

/**
 * [具体命令]
 *
 * 开灯命令
 */
public class A4_LightOnCommand implements A2_Command {

    private A1_Light light;

    public A4_LightOnCommand(A1_Light light) {
        this.light = light;
    }

    //开灯命令
    @Override
    public void execute() {
        light.on();
    }

    //撤销开灯命令：关灯
    @Override
    public void undo() {
        light.off();
    }
}
