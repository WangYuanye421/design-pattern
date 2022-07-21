package ory.wyy.behavioral.responsibilityofchain.demo1;

/**
 * @author: 546792341@qq.com
 * @version: v1.0
 * @date: 2020/9/21 11:08 下午
 **/
public class Client {
    public static void main (String[] args) {
        Request request = new Request();
        request.setMoney(800);

        Approve teacher = new Teacher();
        Approve xiZhuRen = new XiZhuRen();
        Approve yuanzhang = new YuanZhang();
        Approve fuXiaozhang = new FuXiaoZhang();
        Approve xiaozhang = new XiaoZhang();


        teacher.setApproval(xiZhuRen);
        xiZhuRen.setApproval(yuanzhang);
        yuanzhang.setApproval(fuXiaozhang);
        fuXiaozhang.setApproval(xiaozhang);
        // 环形责任链
        xiaozhang.setApproval(teacher);


        xiaozhang.approve(request);

    }
}
