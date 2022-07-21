package ory.wyy.behavioral.strategy.strategy2.context;


import ory.wyy.behavioral.strategy.strategy2.strategy.ChargeModeNewOpen;

/**
 * @description: 新开张的收银台
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-23 15:34
 **/
public class NewOpen extends CheckOut{
    public NewOpen() {
        this.chargeMode = new ChargeModeNewOpen();
    }

    @Override
    public void printInfo() {
        chargeMode.charge();
    }
}
