package com.jmm.design.design14.chain_of_responsibility;

/**
 * 被责任链处理的消息 承载对象
 */
public class A1_Request {

    /**
     * 请求者名称
     */
    private String personName;

    /**
     * 休息天数
     */
    private int restDay;

    public A1_Request(){}

    public A1_Request(String personName, int restDay) {
        this.personName = personName;
        this.restDay = restDay;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getRestDay() {
        return restDay;
    }

    public void setRestDay(int restDay) {
        this.restDay = restDay;
    }
}
