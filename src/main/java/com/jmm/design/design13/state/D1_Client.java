package com.jmm.design.design13.state;

public class D1_Client {

    public static void main(String[] args) {
        A1_Context context = new A1_Context();

        //定义初始状态为关门（共四种初始值）
        context.setLiftState(new C4_StoppingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
