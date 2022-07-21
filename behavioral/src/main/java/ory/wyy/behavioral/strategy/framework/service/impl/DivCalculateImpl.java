package ory.wyy.behavioral.strategy.framework.service.impl;


import ory.wyy.behavioral.strategy.framework.enums.CalculateTypeEnum;
import ory.wyy.behavioral.strategy.framework.service.CalculateStrategy;

/**
 * @author: mars
 * @version: v1.0
 * @data: 2020/6/5 5:40 下午
 **/
public class DivCalculateImpl implements CalculateStrategy {

    @Override
    public Integer execute(Integer p1, Integer p2) {
        return p1 / p2;
    }

    @Override
    public CalculateTypeEnum getStrategyType() {
        return CalculateTypeEnum.DIV;
    }
}
