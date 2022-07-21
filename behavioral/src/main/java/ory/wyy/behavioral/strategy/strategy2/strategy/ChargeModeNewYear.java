package ory.wyy.behavioral.strategy.strategy2.strategy;

/**
 * @description:新年将至 收银策略
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-23 15:38
 **/
public class ChargeModeNewYear implements IChargeMode{

    @Override
    public void charge() {
        System.out.println("喜迎新年，年货8折");
    }
}
