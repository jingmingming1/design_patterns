package com.jmm.design.design10.command;

/**
 * [具体命令]
 *
 * 关灯命令
 */
public class A5_LightOffCommand implements A2_Command {

    private A1_Light light;

    public A5_LightOffCommand(A1_Light light) {
        this.light = light;
    }

    //具体命令 关灯
    @Override
    public void execute() {
        light.off();
    }

    //撤销命令 开灯
    @Override
    public void undo() {
        light.on();
    }
}
