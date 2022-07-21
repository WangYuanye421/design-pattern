package ory.wyy.behavioral.template.demo;

/**
 * @author Wang Yuanye
 * @version v1.0
 * @apiNote
 * @date : 2021/2/25 下午8:16
 **/
public class CompanyB extends DataChangeTemplate{
    @Override
    public void beforeProcess(String data) {
        System.out.println("[B公司] 接收数据需要Base64解密");
    }

    @Override
    public void doProcess(String data) {
        System.out.println("[B公司] 业务数据处理");
    }

    @Override
    public void afterProcess(String data) {
        System.out.println("[B公司] 返回数据需要Base64加密");
    }
}
