package ory.wyy.behavioral.strategy.strategy2;


import ory.wyy.behavioral.strategy.strategy2.context.CheckOut;
import ory.wyy.behavioral.strategy.strategy2.context.NewOpen;
import ory.wyy.behavioral.strategy.strategy2.strategy.ChargeMode618;

/**
 * @description:
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-23 15:43
 **/
public class MainTest {
    public static void main(String[] args) {
        CheckOut c = new NewOpen();
        c.printInfo();
        // 动态修改优惠策略
        c.setChargeMode(new ChargeMode618());
        c.printInfo();
    }
}
