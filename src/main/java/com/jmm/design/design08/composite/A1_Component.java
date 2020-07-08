package com.jmm.design.design08.composite;

/**
 * 抽象的组件对象，为组合中的对象声明接口，实现接口的缺省行为
 */
public abstract class A1_Component {

    // 子组件对象有的功能方法
    public abstract void operation(String preStr);

    public void addChild(A1_Component child) {
        // 缺省的实现-抛出异常 : 因为叶子对象没有这个功能，或子类未实现这个功能
        throw new UnsupportedOperationException("对象不支持此功能");
    }

    public void removeChild(A1_Component child) {
        // 缺省的实现-抛出异常 : 因为叶子对象没有这个功能，或子类未实现这个功能
        throw new UnsupportedOperationException("对象不支持此功能");
    }

    public A1_Component getChildren(int index) {
        // 缺省的实现-抛出异常 : 因为叶子对象没有这个功能，或子类未实现这个功能
        throw new UnsupportedOperationException("对象不支持此功能");
    }
}
