package ory.wyy.behavioral.strategy.calculate.behavior.impl;


import ory.wyy.behavioral.strategy.calculate.behavior.ICalculateBehavior;

/**
 * @description:佣金核算算法A
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-21 15:51
 **/
public class CalculateBehaviorA implements ICalculateBehavior {
    @Override
    public void calculate() {
        System.out.println("核算逻辑A--15%提成");
    }
}
