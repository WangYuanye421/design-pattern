package ory.wyy.behavioral.strategy.strategy2.strategy;

/**
 * @description: 新店开张收银策略
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-23 15:37
 **/
public class ChargeModeNewOpen implements IChargeMode{
    @Override
    public void charge() {
        System.out.println("新店开张，一律7折");
    }
}
