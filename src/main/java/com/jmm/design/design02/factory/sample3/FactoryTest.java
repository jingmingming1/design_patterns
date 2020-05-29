package com.jmm.design.design02.factory.sample3;

import com.jmm.design.design02.factory.Sender;

public class FactoryTest {

    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.Send();

        sender = SendFactory.produceSms();
        sender.Send();
    }

}
