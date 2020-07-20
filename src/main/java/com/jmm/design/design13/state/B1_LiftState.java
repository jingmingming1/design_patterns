package com.jmm.design.design13.state;

/**
 * 抽象电梯状态LiftState
 *
 * 这里我们定义并把Context这个环境角色聚合进来，并传递到子类。
 * 所以我们可以这样理解，Context环境角色的作用就是串联各个状态的过渡，
 * 也就是在4个具体的实现类中，各自根据自己的环境来决定如何进行状态的过渡。
 */
public abstract class B1_LiftState {

    /**
     * 持有环境角色Context
     */
    protected A1_Context context;

    public void setContext(A1_Context context) {
        this.context = context;
    }

    //电梯门开启动作
    public abstract void open();

    //电梯门关闭动作
    public abstract void close();

    //电梯运行
    public abstract void run();

    //电梯停止
    public abstract void stop();
}
