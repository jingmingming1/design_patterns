package com.jmm.design.design13.state;

/**
 * 电梯开门状态
 */
public class C1_OpenningState extends B1_LiftState {

    /**
     * 执行打开电梯门方法
     */
    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    /**
     * 打开后还可以关闭电梯门
     */
    @Override
    public void close() {
        //状态修改
        super.context.setLiftState(A1_Context.CLOSING_STATE);
        //动作委托为CLOSING_STATE执行
        super.context.getLiftState().close();
    }

    /**
     * 门开着不能运行
     */
    @Override
    public void run() {
        //什么都不做
    }

    /**
     * 门开着已经停止了(开门的时候门就是停止的)
     */
    @Override
    public void stop() {
        //什么都不做
    }
}
