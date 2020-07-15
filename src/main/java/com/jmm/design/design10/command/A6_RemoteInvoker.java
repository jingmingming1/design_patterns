package com.jmm.design.design10.command;

/**
 * [请求者]
 *
 * 构建请求者角色。 （相当于遥控器）
 *
 * 请求者持有一个命令对象，有一个行动方法。它会在某个时间点执行行动方法，但不关心是谁具体执行了这个动作。
 */
public class A6_RemoteInvoker {

    /**
     * 开关命令数组，模拟有很多对开关数组
     */
    private A2_Command[] onCommands;
    private A2_Command[] offCommands;

    /**
     * 撤销（回退）命令
     */
    private A2_Command undoCommand;

    public A6_RemoteInvoker(int length) {
        // 有几组开关，就设置多少数组
        onCommands = new A2_Command[length];
        offCommands = new A2_Command[length];

        // 把每个命令初始化成空命令，避免空指针异常
        A2_Command noCommand = new A3_NoCommand();
        undoCommand = noCommand;
        for (int i = 0; i < length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    /**
     * @Description 设置命令对象
     * @param slot 遥控器的位置
     * @param onCommand 开的命令
     * @param offCommand 关的命令
     */
    public void setCommond(int slot, A2_Command onCommand, A2_Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButton(int slot) {
        onCommands[slot].execute();
        //为撤销（回退）按钮记录动作
        undoCommand = onCommands[slot];
    }

    public void offButton(int slot) {
        offCommands[slot].execute();
        //为撤销（回退）按钮记录动作
        undoCommand = offCommands[slot];
    }

    public void undoButton() {
        undoCommand.undo();
    }
}
