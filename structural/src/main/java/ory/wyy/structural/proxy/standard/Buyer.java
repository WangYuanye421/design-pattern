package ory.wyy.structural.proxy.standard;

/**
 * @description: 实际购物类
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-26 09:58
 **/
public class Buyer implements Shopping{
    @Override
    public void goToMarket() {
        System.out.println("买家去商场");
    }

    @Override
    public void stroll() {
        System.out.println("买家在闲逛");
    }

    @Override
    public void choice() {
        System.out.println("买家挑选");
    }

    @Override
    public void pay() {
        System.out.println("买家付款");
    }

    @Override
    public void use() {
        System.out.println("买家使用");
    }
}
