package com.jmm.design.design02.factory.sample2;

import com.jmm.design.design02.factory.Sender;

public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.Send();

        sender = factory.produceSms();
        sender.Send();

    }

}
