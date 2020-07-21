package com.jmm.design.design14.chain_of_responsibility;

/**
 * 客户类（Client）角色
 */
public class D1_Client {

    public static void main(String[] args) {
        B1_Manager m1 = new C1_M1("经理");
        B1_Manager m2 = new C1_M2("总监");
        B1_Manager m3 = new C1_M3("CEO");
        m1.setSuperior(m2);
        m2.setSuperior(m3);

        A1_Request request1 = new A1_Request("张三",1);
        A1_Request request2 = new A1_Request("李四",9);
        A1_Request request3 = new A1_Request("王五",30);
        A1_Request request4 = new A1_Request("赵六",35);

        m1.examineApprove(request1);
        m1.examineApprove(request2);
        m1.examineApprove(request3);
        m1.examineApprove(request4);
    }
}
