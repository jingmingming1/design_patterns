package com.jmm.design.design02.factory;


public class MailSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }

}
