package ory.wyy.behavioral.responsibilityofchain.demo1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/9/21 11:05 下午
 **/
@Slf4j
public class FuXiaoZhang implements Approve {
    private Approve nextApprove;

    @Override
    public void setApproval (Approve approval) {
        this.nextApprove = approval;
    }

    @Override
    public void approve (Request request) {
        Integer money = request.getMoney();
        if (money < 10000) {
            log.info("金额为:{},副校长审批了",money);
        } else {
            nextApprove.approve(request);
        }
    }
}
