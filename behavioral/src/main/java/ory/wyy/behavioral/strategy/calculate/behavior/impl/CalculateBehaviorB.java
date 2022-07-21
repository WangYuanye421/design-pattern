package ory.wyy.behavioral.strategy.calculate.behavior.impl;


import ory.wyy.behavioral.strategy.calculate.behavior.ICalculateBehavior;

/**
 * @description:佣金核算算法B
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-21 15:51
 **/
public class CalculateBehaviorB implements ICalculateBehavior {
    @Override
    public void calculate() {
        System.out.println("核算逻辑B--18%提成");
    }
}
