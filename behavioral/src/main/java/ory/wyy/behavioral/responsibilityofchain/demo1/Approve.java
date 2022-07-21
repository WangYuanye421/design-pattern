package ory.wyy.behavioral.responsibilityofchain.demo1;

/**
 * 抽象审批接口
 *
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/9/21 10:51 下午
 **/
public interface Approve {

    /**
     * 设置下一个审批对象
     * @param approval
     */
    void setApproval(Approve approval);

    /**
     * 审批操作
     * @param request
     */
    void approve(Request request);
}
