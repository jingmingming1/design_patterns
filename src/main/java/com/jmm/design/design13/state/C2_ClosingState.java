package com.jmm.design.design13.state;

/**
 * 电梯闭门状态
 */
public class C2_ClosingState extends B1_LiftState {

    /**
     * 电梯门关了可以再开
     */
    @Override
    public void open() {
        //置为开门状态
        super.context.setLiftState(A1_Context.OPENNING_STATE);
        super.context.getLiftState().open();
    }

    /**
     * 执行电梯门关闭方法
     */
    @Override
    public void close() {
        System.out.println("电梯门关闭");
    }

    /**
     * 电梯门关了就可以运行
     */
    @Override
    public void run() {
        super.context.setLiftState(A1_Context.RUNNING_STATE);
        super.context.getLiftState().run();
    }

    /**
     * 电梯门关了但没有按楼层
     */
    @Override
    public void stop() {
        super.context.setLiftState(A1_Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
