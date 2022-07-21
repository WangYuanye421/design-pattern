package ory.wyy.behavioral.strategy.calculate.behavior.impl;


import ory.wyy.behavioral.strategy.calculate.behavior.IQueryDataBehavior;

/**
 * @description:数据抽取算法C
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-21 15:38
 **/
public class QueryDataBehaviorC implements IQueryDataBehavior {
    @Override
    public void queryData() {
        System.out.println("按照逻辑C抽取核算元数据");
    }
}
