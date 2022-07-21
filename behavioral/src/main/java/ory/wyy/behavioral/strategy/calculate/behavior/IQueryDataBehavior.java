package ory.wyy.behavioral.strategy.calculate.behavior;

/**
 * @description: 元数据查询策略，可以有多种实现，从而形成算法族
 * @author: Yuanye.Wong
 * @version: v1.0
 * @data: 2019-09-21 15:34
 **/
public interface IQueryDataBehavior {
    // 抽取核算数据
    void queryData ();
}
