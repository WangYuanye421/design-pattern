package ory.wyy.behavioral.strategy.framework.service;


import ory.wyy.behavioral.strategy.framework.enums.CalculateTypeEnum;
import ory.wyy.behavioral.strategy.framework.strategyframe.Strategy;

/**
 * 计算策略 接口
 *
 * @author: mars
 * @version: v1.0
 * @data: 2020/6/5 3:15 下午
 **/
public interface CalculateStrategy extends Strategy<CalculateTypeEnum> {
    /**
     * 执行
     * @param p1 算术因子1
     * @param p2 算术因子2
     * @return
     */
    Integer execute (Integer p1, Integer p2);

}
