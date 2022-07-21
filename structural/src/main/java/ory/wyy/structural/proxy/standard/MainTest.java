package ory.wyy.structural.proxy.standard;

/**
 * @description:
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-26 10:37
 **/
public class MainTest {
    public static void main(String[] args) {
        Buyer real = new Buyer();
        Shopping proxy = new Proxy(real);
        proxy.goToMarket();
        proxy.stroll();
        proxy.choice();
        proxy.pay();
        proxy.use();
    }
}
