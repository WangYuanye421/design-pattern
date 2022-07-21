package ory.wyy.behavioral.strategy.strategy2.strategy;

/**
 * @description:618 收银策略
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-23 15:40
 **/
public class ChargeMode618 implements IChargeMode {
    @Override
    public void charge() {
        System.out.println("线上线下，一律满500减100");
    }
}
