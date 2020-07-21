package com.jmm.design.design14.chain_of_responsibility;

/**
 * 具体处理者:CEO审批
 */
public class C1_M3 extends B1_Manager {

    public C1_M3(String managerJob){
        super(managerJob);
    }

    @Override
    public boolean examineApprove(A1_Request request) {
        if(request.getRestDay()<=B1_Manager.DayUnit3){
            System.out.println(String.format("%s-请假[%s]天 ~ %s:审批通过",request.getPersonName(),request.getRestDay(),this.managerJob));
            return true;
        }else if(null!=this.superior){
            return this.superior.examineApprove(request);
        }
        System.out.println(String.format("%s-请假[%s]天 ~ 无人审批",request.getPersonName(),request.getRestDay()));
        return false;
    }
}
