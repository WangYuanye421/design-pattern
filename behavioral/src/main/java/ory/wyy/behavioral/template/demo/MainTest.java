package ory.wyy.behavioral.template.demo;

/**
 * @author Wang Yuanye
 * @version v1.0
 * @apiNote
 * @date : 2021/2/25 下午9:17
 **/
public class MainTest {
    public static void main(String[] args) {
        DataChangeTemplate a = new CompanyA();
        DataChangeTemplate b = new CompanyB();

        System.out.println("======传入是A公司时======");
        a.dataChangeHandler("this is data");


        DataChangeTemplate c = new CompanyC();
        c.dataChangeHandler("haha");
    }
}
