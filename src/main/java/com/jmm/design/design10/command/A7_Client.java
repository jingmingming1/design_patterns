package com.jmm.design.design10.command;

/**
 * 客户端调用
 * 相当于 拿遥控器的人
 */
public class A7_Client {

    public static void main(String[] args) {
        // 1、创建接收者
        A1_Light light = new A1_Light();

        // 2、创建命令对象
        A4_LightOnCommand lightOnCommand = new A4_LightOnCommand(light);
        A5_LightOffCommand lightOffCommand = new A5_LightOffCommand(light);

        // 3、创建一组开关并用命令对象装载它
        A6_RemoteInvoker invoker = new A6_RemoteInvoker(1);
        invoker.setCommond(0, lightOnCommand, lightOffCommand);

        // 4、测试
        invoker.onButton(0); //打开 灯
        invoker.offButton(0);//关闭 灯
        invoker.undoButton();//撤销操作
    }
}
