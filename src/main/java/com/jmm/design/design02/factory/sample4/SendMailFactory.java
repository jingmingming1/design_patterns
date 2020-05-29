package com.jmm.design.design02.factory.sample4;

import com.jmm.design.design02.factory.MailSender;
import com.jmm.design.design02.factory.Sender;

public class SendMailFactory implements Provider {

    @Override
    public Sender produce(){
        return new MailSender();
    }

}
