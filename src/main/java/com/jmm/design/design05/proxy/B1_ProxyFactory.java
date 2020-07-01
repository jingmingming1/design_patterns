package com.jmm.design.design05.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class B1_ProxyFactory {

    //维护目标对象
    private Object target;

    public B1_ProxyFactory (Object target){
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("[准备执行目标方法]");
                        Object result = method.invoke(target,args);
                        System.out.println("[准备执行目标结束]");
                        return result;
                    }
                });
    }
}