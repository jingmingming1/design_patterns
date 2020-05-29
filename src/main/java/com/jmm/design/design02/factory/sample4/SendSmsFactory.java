package com.jmm.design.design02.factory.sample4;

import com.jmm.design.design02.factory.Sender;
import com.jmm.design.design02.factory.SmsSender;

public class SendSmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }

}
