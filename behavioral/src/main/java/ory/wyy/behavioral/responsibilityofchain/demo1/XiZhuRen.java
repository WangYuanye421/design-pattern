package ory.wyy.behavioral.responsibilityofchain.demo1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/9/21 11:05 下午
 **/
@Slf4j
public class XiZhuRen implements Approve {
    private Approve nextApprove;

    @Override
    public void setApproval (Approve approval) {
        this.nextApprove = approval;
    }

    @Override
    public void approve (Request request) {
        Integer money = request.getMoney();
        if (money < 1000) {
            log.info("金额为:{},系主任审批了",money);
        } else {
            nextApprove.approve(request);
        }
    }
}
