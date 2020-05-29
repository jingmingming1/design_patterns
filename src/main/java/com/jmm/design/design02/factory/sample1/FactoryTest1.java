package com.jmm.design.design02.factory.sample1;

import com.jmm.design.design02.factory.Sender;

public class FactoryTest1 {

    public static void main(String[] args) {
        SendFactory1 factory = new SendFactory1();
        Sender sender = factory.produce("sms");
        sender.Send();
    }

}
