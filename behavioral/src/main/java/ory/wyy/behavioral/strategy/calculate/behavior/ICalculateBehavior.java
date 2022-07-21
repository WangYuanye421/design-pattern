package ory.wyy.behavioral.strategy.calculate.behavior;

/**
 * @description: 核算策略，可以有多种实现，从而形成算法族
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-21 15:43
 **/
public interface ICalculateBehavior {
    // 核算佣金
    void calculate ();
}
