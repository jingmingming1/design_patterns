package com.jmm.design.design02.factory.sample4;

import com.jmm.design.design02.factory.Sender;

public class FactoryTest {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }


}
