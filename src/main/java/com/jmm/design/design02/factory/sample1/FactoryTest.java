package com.jmm.design.design02.factory.sample1;

import com.jmm.design.design02.factory.Sender;

public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
    }

}
