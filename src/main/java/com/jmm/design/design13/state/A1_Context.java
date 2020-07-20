package com.jmm.design.design13.state;

/**
 * 环境角色Context
 *
 * 首先定义出电梯的所有状态，然后定义当前电梯状态，
 * 再定义四种状态对应的方法，如Openning状态是由open()方法产生的。
 * 至于这些方法中的逻辑，就用print来代替了。
 */
public class A1_Context {

    //定义出电梯的所有状态
    public final static B1_LiftState OPENNING_STATE = new C1_OpenningState();
    public final static B1_LiftState CLOSING_STATE = new C2_ClosingState();
    public final static B1_LiftState RUNNING_STATE = new C3_RunningState();
    public final static B1_LiftState STOPPING_STATE = new C4_StoppingState();

    //定义一个当前电梯状态
    private B1_LiftState liftState;

    public B1_LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(B1_LiftState liftState) {
        this.liftState = liftState;
        //通知到各个实现类中
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
