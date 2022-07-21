package ory.wyy.structural.proxy.standard;

/**
 * @description: 代理类 持有real 对象的引用
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-26 10:22
 **/
public class Proxy implements Shopping{
    // 代理可以访问实体
    public Buyer real;

    public Proxy(Buyer buyer){
        this.real = buyer;
    }
    @Override
    public void goToMarket() {
        System.out.println("代理去商场");
    }

    @Override
    public void stroll() {
        System.out.println("代理在逛");
    }

    @Override
    public void choice() {
        real.choice();
    }

    @Override
    public void pay() {
        real.pay();
    }

    @Override
    public void use() {
        real.use();
    }
}
