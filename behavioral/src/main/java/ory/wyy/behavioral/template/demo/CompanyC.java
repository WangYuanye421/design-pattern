package ory.wyy.behavioral.template.demo;

/**
 * @author Wang Yuanye
 * @version v1.0
 * @apiNote
 * @date : 2021/2/26 下午1:38
 **/
public class CompanyC extends DataChangeTemplate{
    @Override
    protected void beforeProcess(String data) {
        System.out.println("before"+data);
    }

    @Override
    protected void doProcess(String data) {
        System.out.println("do"+data);
    }

    @Override
    protected void afterProcess(String data) {
        System.out.println("after" + data);
    }
    // 不需要 后续处理

    @Override
    protected boolean needAfterProcess() {
        return false;
    }
}
