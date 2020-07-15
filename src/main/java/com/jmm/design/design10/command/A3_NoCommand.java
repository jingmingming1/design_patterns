package com.jmm.design.design10.command;

/**
 * 命令的默认实现：空命令
 */
public class A3_NoCommand implements A2_Command {
    @Override
    public void execute() {
        System.out.println("空命令");
    }

    @Override
    public void undo() {
        System.out.println("撤销一个空命令");
    }
}
