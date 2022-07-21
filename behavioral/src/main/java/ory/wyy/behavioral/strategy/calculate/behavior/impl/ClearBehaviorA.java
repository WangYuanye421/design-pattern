package ory.wyy.behavioral.strategy.calculate.behavior.impl;


import ory.wyy.behavioral.strategy.calculate.behavior.IClearDataBehavior;

/**
 * @description:清空重置算法A
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-21 15:48
 **/
public class ClearBehaviorA implements IClearDataBehavior {
    @Override
    public void clearAndReset() {
        System.out.println("清空逻辑A--清空所有已核算数据");
    }
}
