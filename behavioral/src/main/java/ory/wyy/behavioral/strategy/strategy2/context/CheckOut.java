package ory.wyy.behavioral.strategy.strategy2.context;


import ory.wyy.behavioral.strategy.strategy2.strategy.IChargeMode;

/**
 * @description:收银基类 策略模式环境类
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-23 15:27
 **/
public abstract class CheckOut {
    public IChargeMode chargeMode;

    public abstract void printInfo();

    public IChargeMode getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(IChargeMode chargeMode) {
        this.chargeMode = chargeMode;
    }
}
