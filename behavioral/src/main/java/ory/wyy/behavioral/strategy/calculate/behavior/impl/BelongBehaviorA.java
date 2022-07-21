package ory.wyy.behavioral.strategy.calculate.behavior.impl;


import ory.wyy.behavioral.strategy.calculate.behavior.IBelongBehavior;

/**
 * @description:归属判断算法A
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-21 15:57
 **/
public class BelongBehaviorA implements IBelongBehavior {
    @Override
    public void belongTo() {
        System.out.println("判断归属于某人");
    }
}
