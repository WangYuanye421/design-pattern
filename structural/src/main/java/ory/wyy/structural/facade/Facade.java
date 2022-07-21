package ory.wyy.structural.facade;


import ory.wyy.structural.facade.demo.*;

/**
 * @description: 外观类：市政大厅系统
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-29 15:39
 **/
public class Facade {
    private SubSysA sysA;
    private SubSysB sysB;
    private SubSysC sysC;
    private SubSysD sysD;
    private SubSysS sysS;

    public Facade() {
        sysA = new SubSysA();
        sysB = new SubSysB();
        sysC = new SubSysC();
         sysD = new SubSysD();
         sysS = new SubSysS();

    }
    // 客户端只需知道外观类有哪些方法，而不关心这些方法的实现细节
    // 身份证明
    public void IdServer(){
        System.out.println("身份证明服务：==============");
        sysA.systemFunction();
        sysD.systemFunction();
    }
    // 市政贷款
    public void getMoneyServer(){
        System.out.println("贷款服务：==============");
        sysA.systemFunction();
        sysB.systemFunction();
    }
    // 城市服务
    public void cityServer(){
        System.out.println("城市服务：==============");
        sysA.systemFunction();
        sysS.systemFunction();
        sysC.systemFunction();
    }
}
