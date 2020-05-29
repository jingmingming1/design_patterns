package com.jmm.design.design02.factory.sample1;

import com.jmm.design.design02.factory.MailSender;
import com.jmm.design.design02.factory.Sender;
import com.jmm.design.design02.factory.SmsSender;

/**
 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 */
public class SendFactory1 {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }

}
