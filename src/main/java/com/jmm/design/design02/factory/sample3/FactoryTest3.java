package com.jmm.design.design02.factory.sample3;

import com.jmm.design.design02.factory.Sender;

public class FactoryTest3 {

    public static void main(String[] args) {
        Sender sender = SendFactory3.produceMail();
        sender.Send();

        sender = SendFactory3.produceSms();
        sender.Send();
    }

}
