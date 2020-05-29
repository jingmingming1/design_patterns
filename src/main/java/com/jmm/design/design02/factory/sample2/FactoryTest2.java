package com.jmm.design.design02.factory.sample2;

import com.jmm.design.design02.factory.Sender;

public class FactoryTest2 {

    public static void main(String[] args) {
        SendFactory2 factory = new SendFactory2();
        Sender sender = factory.produceMail();
        sender.Send();

        sender = factory.produceSms();
        sender.Send();

    }

}
